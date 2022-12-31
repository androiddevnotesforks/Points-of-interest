package com.grishko188.pointofinterest.features.poi.view.vm

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.grishko188.domain.features.poi.interactor.*
import com.grishko188.domain.features.poi.models.PoiCommentPayload
import com.grishko188.pointofinterest.features.poi.view.models.PoiDetailListItem
import com.grishko188.pointofinterest.features.poi.view.models.toUIModelWithComments
import com.grishko188.pointofinterest.navigation.Screen
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewPoiVm @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val getDetailedPoiUseCase: GetDetailedPoiUseCase,
    private val deletePoiUseCase: DeletePoiUseCase,
    private val getCommentsUseCase: GetCommentsUseCase,
    private val addCommentUseCase: AddCommentUseCase,
    private val deleteCommentUseCase: DeleteCommentUseCase
) : ViewModel() {

    private val _idState = MutableStateFlow("")
    val idState = _idState.asStateFlow()

    private val _finishScreenState = MutableStateFlow(false)
    val finishScreenState = _finishScreenState.asStateFlow()

    private val _uiState = MutableStateFlow<List<PoiDetailListItem>>(emptyList())
    val uiState = _uiState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    private val mainState = savedStateHandle.getStateFlow(Screen.ViewPoiDetailed.ARG_POI_ID, "")
        .filter { it.isNotEmpty() }
        .onEach { id -> _idState.value = id }
        .map { getDetailedPoiUseCase(GetDetailedPoiUseCase.Params(it)) }
        .flatMapLatest { poi ->
            getCommentsUseCase(GetCommentsUseCase.Params(poi.id))
                .onEach { comments -> _uiState.value = poi.toUIModelWithComments(comments) }
                .catch { error -> Log.e(ViewPoiVm::class.java.simpleName, error.message, error) }
        }

    init {
        mainState.launchIn(viewModelScope)
    }

    fun onAddComment(message: String) {
        viewModelScope.launch {
            val payload = PoiCommentPayload(message)
            addCommentUseCase(AddCommentUseCase.Params(idState.value, payload))
        }
    }

    fun onDeleteComment(id: String) {
        viewModelScope.launch {
            deleteCommentUseCase(DeleteCommentUseCase.Params(id))
        }
    }

    fun onDeletePoi() {
        viewModelScope.launch {
            val id = _idState.value
            deletePoiUseCase(DeletePoiUseCase.Params(id))
            _finishScreenState.update { true }
        }
    }
}