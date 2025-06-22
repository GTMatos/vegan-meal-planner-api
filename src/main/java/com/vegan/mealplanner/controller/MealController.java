package com.vegan.mealplanner.controller;

import com.vegan.mealplanner.model.Meal;
import com.vegan.mealplanner.model.NutritionFacts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/meals")
public class MealController {

    private static final Logger logger = LoggerFactory.getLogger(MealController.class);

    @GetMapping
    public List<Meal> getMeals() {
        logger.info("GET /meals requested");

        return Arrays.asList(
                new Meal(
                        1,
                        "Vegan Buddha Bowl",
                        "Quinoa, chickpeas, spinach, avocado, tahini sauce",
                        Arrays.asList("Quinoa", "Chickpeas", "Spinach", "Avocado", "Tahini"),
                        new NutritionFacts(22.0, 15.0, 45.0)
                ),
                new Meal(
                        2,
                        "Vegan Tofu Stir-Fry",
                        "Tofu, bell peppers, broccoli, soy sauce",
                        Arrays.asList("Tofu", "Bell Peppers", "Broccoli", "Soy Sauce"),
                        new NutritionFacts(25.0, 12.0, 30.0)
                ),
                new Meal(
                        3,
                        "Lentil Shepherd's Pie",
                        "Lentils, mashed potatoes, carrots, peas",
                        Arrays.asList("Lentils", "Potatoes", "Carrots", "Peas"),
                        new NutritionFacts(18.0, 8.0, 40.0)
                )
        );
    }
}