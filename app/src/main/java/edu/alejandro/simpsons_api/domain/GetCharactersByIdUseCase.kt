package edu.alejandro.simpsons_api.domain

class GetCharactersByIdUseCase (private val repository: SimpsonsRepository) {
    suspend operator fun invoke(id: Int){
        return repository.getCharacterById(id)
    }
}