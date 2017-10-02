package clhote.spring.controllers;

import clhote.spring.domain.Category;
import clhote.spring.domain.Recipe;
import clhote.spring.domain.UnitOfMeasure;
import clhote.spring.repositories.CategoryRepository;
import clhote.spring.repositories.UnitOfMeasureRepository;
import clhote.spring.services.RecipeService;
import org.hibernate.annotations.SourceType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by CLH3623 on 28/09/2017.
 */
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
