package com.vegan.mealplanner.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class MealPlan {
    String username;
    LocalDate date;
    List<Integer> mealsId;
}