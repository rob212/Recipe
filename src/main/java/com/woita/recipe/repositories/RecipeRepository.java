package com.woita.recipe.repositories;

import com.woita.recipe.model.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author mcbrydr on 16/09/19
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
