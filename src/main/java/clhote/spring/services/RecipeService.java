package clhote.spring.services;

import clhote.spring.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by CLH3623 on 29/09/2017.
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
