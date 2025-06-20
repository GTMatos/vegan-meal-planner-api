# Contributing Guide

Welcome to the Vegan Meal Planner API project!  
This guide documents conventions and good practices used in this repository.

---

## 📂 Branch Naming Convention

Please use the following branch prefixes:

| Type      | Example                        |
|-----------|--------------------------------|
| feature   | `feature/meal-controller`      |
| fix       | `fix/mealplan-date-bug`        |
| chore     | `chore/branch-protection`      |
| docs      | `docs/security-md`             |
| refactor  | `refactor/user-service-cleanup`|
| test      | `test/meal-controller-tests`   |

---

## ✏️ Commit Message Format

We follow **Conventional Commits**:

### Common types:

| Type     | Purpose                      |
|----------|------------------------------|
| feat     | New feature                   |
| fix      | Bug fix                       |
| docs     | Documentation only changes    |
| chore    | Changes to build or tooling   |
| refactor | Code change (no behavior change) |
| test     | Adding tests                  |
| style    | Formatting, whitespace        |

**Examples:**

feat: add MealController with GET /meals

fix: correct date parsing in MealPlanService

docs: update README with new endpoints

chore: enable branch protection

---

## 🚀 Pull Request Process

- Create a branch per feature/bugfix
- Follow branch naming convention
- Use clear, descriptive PR titles
- Link PRs to related issues (ex: `Closes #9`)
- Complete PR template checklist
- Squash commits before merge if needed

---

## 🛡️ Security and Best Practices

- Never commit secrets or credentials
- Keep `/docs/security.md` updated as project evolves
- Enable Dependabot alerts
- Use protected main branch with PRs required

---

## 📚 Documentation Standards

- Main project info → in `README.md`
- Security practices → in `docs/security.md`
- Architecture notes → in `docs/architecture.md` (planned)
- Contributing standards → in `docs/CONTRIBUTING.md`

---

Thank you for contributing and helping maintain a clean, professional project!