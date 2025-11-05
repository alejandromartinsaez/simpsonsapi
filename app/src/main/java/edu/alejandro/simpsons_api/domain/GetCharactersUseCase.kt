package edu.alejandro.simpsons_api.domain

class GetCharactersUseCase (private val repository: SimpsonsRepository) {
    suspend operator fun invoke() {
        return repository.getCharacters()
    }
}