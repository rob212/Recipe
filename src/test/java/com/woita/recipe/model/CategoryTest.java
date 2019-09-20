package com.woita.recipe.model;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * @author mcbrydr on 20/09/19
 */
public class CategoryTest {

    private Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() {
        String description = "Chinese";
        category.setDescription(description);
        assertEquals(description, category.getDescription());
    }

    @Test
    public void getRecipes() {
        Recipe recipe = new Recipe();
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(recipe);
        category.setRecipes(recipes);

        Set<Recipe> actualRecipes = category.getRecipes();
        assertEquals(recipes, actualRecipes);
        assertEquals(1, actualRecipes.size());
        assertEquals(recipe, actualRecipes.iterator().next());
    }
}