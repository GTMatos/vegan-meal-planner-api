# Architecture

## Purpose

**Vegan Meal Planner API** — provides a secured backend for planning vegan meals and tracking nutrition.\
The API supports user meal planning based on an admin-defined meal catalog.

## Domain Concept

- **Meal Catalog** → defined and managed by Admins
- **Users** → can select meals to plan their week (MealPlan)
- **Future:** API will suggest weekly plans based on user preferences

---

## Architecture Layers

```
Controller → Service → Repository → Model
                                ↘  DTOs (request/response)
```

### Package Structure

```
com.vegan.mealplanner
 └── controller
 └── service
 └── repository
 └── model
 └── dto
 └── security
 └── config
 └── docs
```

---

## Domain Entities

| Entity               | Description                                                         |
| -------------------- | ------------------------------------------------------------------- |
| **User**             | login, password, role (USER / ADMIN), preferences                   |
| **Meal**             | id, name, description, ingredients, nutrition facts (Admin-managed) |
| **MealPlan**         | userId, date, list of Meal references                               |
| **MealLog**          | (future) — what was eaten                                           |
| **NutritionSummary** | computed, not persisted                                             |

---

## Security

- **Authentication:** JWT (Release 2)
- **Roles:**
    - `ROLE_USER` → can plan meals
    - `ROLE_ADMIN` → can manage meal catalog
- **Public endpoints:** `/auth/login`
- **Protected endpoints:** `/meals`, `/plans`, `/users/me`

---

## Roadmap

| Release    | Features                                          |
| ---------- | ------------------------------------------------- |
| **v0.1.0** | `MealController` (hardcoded), Basic Auth          |
| **v0.2.0** | JWT, DB, `MealPlanController`, Admin Meal CRUD    |
| **v0.3.0** | Meal logging, Nutrition summaries                 |
| **v1.0.0** | Weekly meal plan suggestions based on preferences |

---

## Planned Endpoints

### Public

```http
POST /auth/login  → returns JWT
```

### Protected (ROLE\_USER)

```http
GET  /meals
GET  /plans?date=YYYY-MM-DD
POST /plans  → submit meal plan for a date
GET  /users/me
```

### Protected (ROLE\_ADMIN)

```http
POST   /meals           → create meal
PUT    /meals/{id}      → update meal
DELETE /meals/{id}      → delete meal
```

---

## Release 2 - Planned Issues

- Implement JWT-based SecurityConfig
- Implement `User` model (simple: id, username, password, roles)
- Implement `MealPlanController` + Service + Repo
- Implement Admin CRUD for Meal
- Add DTOs for request/response (separate domain and API models)
- Add integration tests for secured endpoints
- Add basic DB support (H2 for dev, PostgreSQL for prod)
- Add user preferences model (Release 3 prep)

---

## Labels

- `feature`
- `security`
- `release-2`
- `test`
- `documentation`
- `refactor`

---

## Notes

The project evolves in clean, versioned releases following a professional branching and PR workflow.\
This file will evolve as Release 2+ is implemented.

---

