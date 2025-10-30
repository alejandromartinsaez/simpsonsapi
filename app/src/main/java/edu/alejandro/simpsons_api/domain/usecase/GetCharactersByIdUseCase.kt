package edu.alejandro.simpsons_api.domain.usecase

import edu.alejandro.simpsons_api.domain.repository.SimpsonsRepository

class GetCharactersByIdUseCase (private val repository: SimpsonsRepository) {
    suspend operator fun invoke(id: Int) = repository.getCharacterById(id)
}