package edu.alejandro.simpsons_api.domain

class GetCharactersUseCase (private val repository: SimpsonsRepository) {
    suspend operator fun invoke(): Result<List<SimpsonsCharacter>> {
        return repository.getCharacters()
    }
}