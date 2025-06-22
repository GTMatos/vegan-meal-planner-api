package com.vegan.mealplanner.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MealController.class)
class MealControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser(username = "user", roles = {"USER"})
    void shouldReturnListOfMealsWhenAuthenticated() throws Exception {
        mockMvc.perform(get("/meals"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(3))
                .andExpect(jsonPath("$[0].name").value("Vegan Buddha Bowl"));
    }

    @Test
    void shouldReturnUnauthorizedWhenNotAuthenticated() throws Exception {
        mockMvc.perform(get("/meals"))
                .andExpect(status().isUnauthorized());
    }
}