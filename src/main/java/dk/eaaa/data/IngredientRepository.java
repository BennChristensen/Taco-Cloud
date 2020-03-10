package dk.eaaa.data;

import org.springframework.data.repository.CrudRepository;

import dk.eaaa.model.Ingredient;

public interface IngredientRepository 
extends CrudRepository<Ingredient, String> {

}
