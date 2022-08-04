package me.rsilval.myrepository.domain

import kotlinx.coroutines.flow.Flow
import me.rsilval.myrepository.core.UseCase
import me.rsilval.myrepository.data.model.Repo
import me.rsilval.myrepository.data.repositories.RepoRepository

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}