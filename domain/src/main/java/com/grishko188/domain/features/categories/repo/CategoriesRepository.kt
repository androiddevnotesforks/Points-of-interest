package com.grishko188.domain.features.categories.repo

import com.grishko188.domain.features.categories.models.Category
import com.grishko188.domain.features.categories.models.CreateCategoryPayload
import com.grishko188.domain.features.categories.models.CategoryType
import kotlinx.coroutines.flow.Flow

interface CategoriesRepository {

    suspend fun sync()

    fun getCategories(): Flow<List<Category>>

    fun getCategories(type: CategoryType): Flow<List<Category>>

    fun getCategory(id: String): Flow<Category>

    suspend fun addCategory(payload: CreateCategoryPayload)

    suspend fun updateCategory(category: Category)

    suspend fun deleteCategory(categoryId: String)
}