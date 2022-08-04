package me.rsilval.myrepository.data.repositories

import kotlinx.coroutines.flow.Flow
import me.rsilval.myrepository.data.model.Repo

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}