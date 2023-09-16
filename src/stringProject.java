public class stringProject {

    static void Q1() {
        String string_1 = "PHP exercises and ";
        String string_2 = "Python exercises.";
        System.out.println("1. String 1: " + string_1);
        System.out.println("String 2: " + string_2);
        System.out.println(string_1 + string_2);
    }

    static void Q2() {
        String wholeString = "PHP exercises and Python exercises";
        String and = "and";
        System.out.println("2. " + wholeString.contains(and) + ", wholeString contains " + and);
    }

    static void Q3() {
        System.out.print("3. ");
        String oldString = "£30 is not equal to £20\n";
        System.out.println(oldString + oldString.replaceAll("[^a-zA-Z0-9] ", " "));
    }

    static void Q4() {
        System.out.print("4. ");
        String firstString = "Python Exercises";
        String secondString = "Python Exercise";
        String ending = "se";
        System.out.println("Does firstString end with ending? " + firstString.endsWith(ending));
        System.out.println("Does secondString end with ending? " + secondString.endsWith(ending));
    }

    static void Q5() {
        System.out.print("5. ");
        //First comparison
        String string1 = "Stephen Edwin King";
        String string2 = "Walter Winchell";
        System.out.println("Does " + string1 + " equal " + string2 + " " + string1.equalsIgnoreCase(string2));
        //Second comparison
        String string3 = "stephen edwin king";
        System.out.println("Does " + string1 + " equal " + string3 + " "+ string1.equalsIgnoreCase(string3));
    }

    static void Q6() {
        System.out.print("6. ");
        String allCharacters = "Jer3em335y22453 G43ur545ja4r532524";
        System.out.println(allCharacters.replaceAll("[^0-9]", ""));
    }

    static void Q7() {
        System.out.print("7. ");
        String string = "example";
        int length = string.length();
        System.out.println("Length of " + string + " = " + length);
    }

    static void Q8() {
        System.out.print("8. ");
        String string1 = "Orange";
        String string2 = "Apple";
        String start = "Or";
        System.out.println(string1 + " starts with " + start + "? " + string1.startsWith(start));
        System.out.println(string2 + " starts with " + start + "? " + string2.startsWith(start));
    }

    static void Q9() {
        System.out.print("9. ");
        String string = "The quick brown fox jumps over the lazy dog";
        String substring = string.substring(10,25);
        System.out.println(string);
        System.out.println(substring);
    }

    static void Q10() {
        String string = "Jeremy Gurjar";
        String replacedString = string.replaceAll("r","x");
        System.out.println("10. " + string);
        System.out.println(replacedString);
    }

    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
        Q6();
        Q7();
        Q8();
        Q9();
        Q10();
    }
}
