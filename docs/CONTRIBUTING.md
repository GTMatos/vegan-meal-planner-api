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

## 🌱 Branch Lifecycle

- Always create branches from `main` (do not branch off other feature branches unless needed)
- Use a descriptive branch name (see naming convention above)
- One branch = one logical change (linked to an Issue)
- Once a branch is merged:
    - Do not reuse the branch
    - You may delete the branch after merge (recommended for keeping repo clean)
- For follow-up changes, create a new branch from `main`

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

# 📋 PR Review Checklist

## General

- [ ] PR title follows conventional commit style or clear feature name
- [ ] PR is linked to issue (Closes #X)
- [ ] PR is linked to milestone (if applicable)
- [ ] PR has correct labels (feature, fix, test, etc)
- [ ] Branch name follows convention
- [ ] PR scope matches issue — no unrelated changes

## Code Quality

- [ ] Code builds successfully (`./gradlew build`)
- [ ] No obvious bugs or errors
- [ ] Logging is present where appropriate
- [ ] No sensitive data or secrets committed
- [ ] Code follows architecture and style conventions

## Tests

- [ ] New functionality is covered by tests
- [ ] Tests pass (`./gradlew test`)
- [ ] Tests cover positive and negative cases (where applicable)

## Docs

- [ ] Documentation updated (README, CONTRIBUTING.md, etc — if needed)

## Security

- [ ] No security regressions
- [ ] Protected endpoints still require authentication (if applicable)

---

**Ready to merge?**

✅ All checklist items reviewed and complete

---

Thank you for contributing and helping maintain a clean, professional project!