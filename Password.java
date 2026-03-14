package PasswordChecker;

public class Password {
    private String name;
    private boolean hasLower;
    private boolean hasUpper;
    private boolean hasSpecial;
    private boolean hasInt;
    private int score;

    public Password(String pw) {
        this.name = pw;
        this.hasInt = false;
        this.hasLower = false;
        this.hasSpecial = false;
        this.hasUpper = false;
        this.score = 0;
    }

    public void checker() {
        for (char c : name.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasInt = true;
            } else {
                hasSpecial = true;
            }
        }
    }

    public void printScore() {
        System.out.println("Suggestions:");
        boolean hasSuggestions = false;

        if (name.length() >= 8) {
            score++;
        } else {
            System.out.println("- Increase password length");
            hasSuggestions = true;
        }

        if (hasUpper) {
            score++;
        } else {
            System.out.println("- Add an uppercase character");
            hasSuggestions = true;
        }

        if (hasLower) {
            score++;
        } else {
            System.out.println("- Add a lowercase character");
            hasSuggestions = true;
        }

        if (hasInt) {
            score++;
        } else {
            System.out.println("- Add a number");
            hasSuggestions = true;
        }

        if (hasSpecial) {
            score++;
        } else {
            System.out.println("- Add a special character");
            hasSuggestions = true;
        }

        if (!hasSuggestions) {
            System.out.println("- None");
        }

        System.out.println("--------------");
        System.out.println("Final Verdict:");

        if (score <= 2) {
            System.out.println("Password Strength: Weak");
        } else if (score <= 4) {
            System.out.println("Password Strength: Moderate");
        } else {
            System.out.println("Password Strength: Strong");
        }

        System.out.println("Password Score: " + score + "/5");
    }

    public boolean getLower() {
        return hasLower;
    }

    public boolean getUpper() {
        return hasUpper;
    }

    public boolean getSpecial() {
        return hasSpecial;
    }

    public boolean getInt() {
        return hasInt;
    }
}
