package com.woita.recipe.controllers;

import com.woita.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mcbrydr on 03/09/19
 */
@Slf4j
@Controller
public class IndexController {

    final private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Index page endpoint has been hit");
        model.addAttribute("recipes", this.recipeService.getRecipes());
        return "index";
    }

}

