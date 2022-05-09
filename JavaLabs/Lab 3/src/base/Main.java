package base;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        // Make an if statement that triggers a print or println statement
        int x = -1;
        if (x<1) {
            System.out.println("It's a negative number");
        }
        // Make an if, else statement where the else statement triggers a print or println statement
        int y = 5;
        if (y<1) {
            System.out.println("It's a negative number");
        } else {
            System.out.println("It's a positive number");
        }
        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        int z = 0;
        if (z<1) {
            System.out.println("It's a negative number");
        } else if (z>1) {
            System.out.println("It's a positive number");
        } else {
            System.out.println("The number is 0");
        }
        // Make 2 variables and use them in an if else conditional print from one of the sections
        int a = 20;
        int b = 15;
        if (a > b) {
            System.out.println("20 is greater than 15");
        } else {
            System.out.prinln("This is not a true statement");
        }
        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        int c = 10;
        if (c < 5 && c <= 9) {
            System.out.println("C is not greater than 10");
        }
        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        int d = 8;
        if (d < 7 || d > 9) {
            System.out.println("D must be 8");
        }
    }
}
