package com.vegan.mealplanner.dto;

import java.time.LocalDate;
import java.util.List;

public record MealPlanResponse(LocalDate date, List<Integer> mealIds) {}
