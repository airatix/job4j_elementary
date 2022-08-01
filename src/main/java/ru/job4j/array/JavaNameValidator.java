package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.codePointAt(0) > 122 ||  name.codePointAt(0) < 97) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            if ((name.codePointAt(i) != 36 && name.codePointAt(i) != 95)
                && (name.codePointAt(i) < 65 || name.codePointAt(i) > 90)
                && (name.codePointAt(i) < 48 ||  name.codePointAt(i) > 57)
                && (name.codePointAt(i) > 122 ||  name.codePointAt(i) < 97)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNameValid("wert_3455"));
    }
}
