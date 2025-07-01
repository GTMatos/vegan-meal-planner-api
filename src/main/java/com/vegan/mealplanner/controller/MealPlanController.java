// MealPlanController.java
package com.vegan.mealplanner.controller;

import com.vegan.mealplanner.dto.MealPlanRequest;
import com.vegan.mealplanner.dto.MealPlanResponse;
import com.vegan.mealplanner.model.MealPlan;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.security.Principal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/plans")
public class MealPlanController {

    private final Map<String, Map<LocalDate, MealPlan>> mealPlans = new HashMap<>();

    @GetMapping
    @PreAuthorize("hasRole('USER')")
    public MealPlanResponse getMealPlan(@RequestParam LocalDate date, Principal principal) {
        String username = principal.getName();
        Map<LocalDate, MealPlan> userPlans = mealPlans.get(username);

        if (userPlans == null || !userPlans.containsKey(date)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Meal plan not found for given date.");
        }

        MealPlan plan = userPlans.get(date);
        return new MealPlanResponse(plan.getDate(), plan.getMealsId());
    }

    @PostMapping
    @PreAuthorize("hasRole('USER')")
    public MealPlanResponse createMealPlan(@RequestBody MealPlanRequest request, Principal principal) {
        String username = principal.getName();
        MealPlan plan = new MealPlan(username, request.date(), request.mealIds());

        mealPlans.computeIfAbsent(username, k -> new HashMap<>()).put(plan.getDate(), plan);

        return new MealPlanResponse(plan.getDate(), plan.getMealsId());
    }
}
