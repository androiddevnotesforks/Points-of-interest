package com.grishko188.pointofinterest.core.utils

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.res.stringResource
import com.grishko188.pointofinterest.features.categories.ui.models.CategoryUiModel

@Composable
@ReadOnlyComposable
fun stringFromResource(@StringRes res: Int?): String? = if (res != null) stringResource(id = res) else null

fun List<CategoryUiModel>.containsId(id: String) = this.any { it.id == id }