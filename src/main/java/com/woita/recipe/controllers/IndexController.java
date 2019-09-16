package com.woita.recipe.controllers;

import com.woita.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mcbrydr on 03/09/19
 */
@Controller
public class IndexController {

    final private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", this.recipeService.getRecipes());
        return "index";
    }

}

