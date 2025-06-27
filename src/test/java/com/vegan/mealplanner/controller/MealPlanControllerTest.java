// MealPlanControllerTest.java
package com.vegan.mealplanner.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vegan.mealplanner.dto.MealPlanRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;

@WebMvcTest(MealPlanController.class)
@Import(com.vegan.mealplanner.config.SecurityConfig.class)
class MealPlanControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("POST /plans should succeed for authenticated user")
    @WithMockUser(username = "testuser", roles = {"USER"})
    void createMealPlan_shouldSucceed() throws Exception {
        MealPlanRequest request = new MealPlanRequest(LocalDate.now(), List.of(1, 2, 3));

        mockMvc.perform(post("/plans")
                        .with(csrf())
                        .contentType("application/json")
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk());
    }
}
