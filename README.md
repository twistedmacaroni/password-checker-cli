# CLI Password Strength Checker (Java)

A small command-line tool written in Java that checks how strong a
password is and suggests ways to improve it.

I built this while learning Java to practice working with strings,
loops, conditionals, and basic object-oriented design.

The program analyzes a password based on a few simple rules like length
and character variety, then prints a strength rating along with
suggestions if something is missing.

------------------------------------------------------------------------

## How it Works

The program checks whether the password contains:

-   at least 8 characters
-   an uppercase letter
-   a lowercase letter
-   a digit
-   a special character

Each satisfied condition increases the password's score.

Final classification:

-   **0--2** → Weak\
-   **3--4** → Moderate\
-   **5** → Strong

If the password is missing something (for example no uppercase letters
or no digits), the program prints suggestions to improve it.

------------------------------------------------------------------------

## Example

Enter password: hello123

Suggestions: - Add an uppercase character - Add a special character
-------------- Final Verdict: Password Strength: Moderate

------------------------------------------------------------------------

## Project Structure

PasswordChecker/ ├── Password.java └── Main.java

**Password.java**

Handles the actual password analysis: - scans characters - tracks
password properties - calculates score - prints suggestions and verdict

**Main.java**

Handles user input and runs the checker.

------------------------------------------------------------------------

## Why I Made This

I wanted a small project to practice writing a complete Java program
instead of just solving isolated exercises.

This project helped me practice:

-   working with strings and characters
-   using loops and conditionals
-   basic object-oriented design
-   structuring a small CLI program

------------------------------------------------------------------------

## Running the Program

Compile:

javac PasswordChecker/\*.java

Run:

java PasswordChecker.Main

Then enter a password when prompted.

------------------------------------------------------------------------

## Possible Improvements

Some ideas I might explore later:

-   estimating password entropy
-   adding a password generator
-   building a simple GUI version
