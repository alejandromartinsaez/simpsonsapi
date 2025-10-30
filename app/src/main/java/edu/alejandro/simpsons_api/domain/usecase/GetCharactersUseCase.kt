package edu.alejandro.simpsons_api.domain.usecase

import edu.alejandro.simpsons_api.domain.repository.SimpsonsRepository

class GetCharactersUseCase (private val repository: SimpsonsRepository) {
    suspend operator fun invoke() = repository.getCharacters()
}