package com.vegan.mealplanner.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NutritionFacts {
    private double protein; // grams
    private double fat;     // grams
    private double carbs;   // grams
}