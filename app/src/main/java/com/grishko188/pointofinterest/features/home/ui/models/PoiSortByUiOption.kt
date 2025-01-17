package com.grishko188.pointofinterest.features.home.ui.models

import com.grishko188.domain.features.poi.models.PoiSortOption
import com.grishko188.pointofinterest.R

enum class PoiSortByUiOption {
    DATE, SEVERITY, TITLE
}

fun PoiSortByUiOption.toTitle() = when (this) {
    PoiSortByUiOption.SEVERITY -> R.string.title_sort_by_severity
    PoiSortByUiOption.DATE -> R.string.title_sort_by_date
    PoiSortByUiOption.TITLE -> R.string.title_sort_by_title
}

fun PoiSortByUiOption.toSubTitle() = when (this) {
    PoiSortByUiOption.SEVERITY -> R.string.subtitle_sort_by_severity
    PoiSortByUiOption.DATE -> R.string.subtitle_sort_by_date
    PoiSortByUiOption.TITLE -> R.string.subtitle_sort_by_title
}

fun PoiSortByUiOption.toDomain() = when (this) {
    PoiSortByUiOption.SEVERITY -> PoiSortOption.SEVERITY
    PoiSortByUiOption.TITLE -> PoiSortOption.TITLE
    else -> PoiSortOption.DATE
}