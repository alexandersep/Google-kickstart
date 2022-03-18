import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t= input.nextInt(); // test cases
        for (int i = 0; i < t; i++) {
            double v = input.nextDouble(); // velocity m/s
            double d = input.nextDouble(); // distance m
            System.out.printf("Case #%d: %.7f\n", (i+1), angle(v, d));
            input.nextLine();
        }
    }
    public static double angle(double v, double d) {
        return Math.toDegrees( ( Math.asin( (d/(v*v)) * 9.8 ) / 2 ) );
    }
}
