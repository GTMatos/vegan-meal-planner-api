package com.vegan.mealplanner.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Meal {
    private int id;
    private String name;
    private String description;
    private List<String> ingredients;
    private NutritionFacts nutrition;
}