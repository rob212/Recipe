package com.woita.recipe.controllers;

import com.woita.recipe.model.Category;
import com.woita.recipe.model.UnitOfMeasure;
import com.woita.recipe.repositories.CategoryRepository;
import com.woita.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author mcbrydr on 03/09/19
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("Quick");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category Id is " + categoryOptional.get().getId());
        System.out.println("Unit of Measure Id is " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}

