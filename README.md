# CLI Password Strength Checker (Java)

A small command-line tool that checks how strong a password is and suggests ways to improve it.

Built while learning Java — good practice for strings, loops, conditionals, and basic OOP.

---

## How It Works

The program checks your password against five criteria:

- At least 8 characters
- Contains an uppercase letter
- Contains a lowercase letter
- Contains a digit
- Contains a special character

Each condition met adds to the score. Final rating:

| Score | Strength |
|-------|----------|
| 0 – 2 | Weak     |
| 3 – 4 | Moderate |
| 5     | Strong   |

If something's missing, the program tells you exactly what to fix.

---

## Example

```
Enter password: hello123

Suggestions:
  - Add an uppercase letter
  - Add a special character

Password Strength: Moderate
```

---

## Project Structure

```
PasswordChecker/
├── Password.java   # Password analysis — scoring, suggestions, verdict
└── Main.java       # User input and program entry point
```

---

## Running It

**Compile:**
```bash
javac PasswordChecker/*.java
```

**Run:**
```bash
java PasswordChecker.Main
```

Then type a password when prompted.

---

## Why I Built This

I wanted a complete, end-to-end Java project rather than just isolated exercises. Working through this helped solidify:

- String and character manipulation
- Loops and conditionals in a real context
- Basic object-oriented design
- Structuring a small CLI program cleanly

---

## Possible Improvements

Things I might explore later:

- Entropy estimation
- A password generator
- A simple GUI version
