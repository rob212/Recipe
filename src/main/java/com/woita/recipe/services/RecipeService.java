package com.woita.recipe.services;

import com.woita.recipe.model.Recipe;

import java.util.Set;

/**
 * @author mcbrydr on 16/09/19
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
