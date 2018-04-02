import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1Challenge {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int j;
        double e;
        String t;

        j = scan.nextInt();
        e = scan.nextDouble();
        t = scan.next() + scan.nextLine();


        System.out.println(i + j);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + e);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + t);

        scan.close();
    }
}
