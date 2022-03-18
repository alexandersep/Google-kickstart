import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = input.nextInt(); // number of cases
        for (int i = 1; i <= t; i++) {
            int m = input.nextInt(); // positive case 
            input.nextLine();
            String[] list1 = new String[m];
            String[] list2 = new String[m];
            for (int j = 0; j < m; j++) {
                String[] name = input.nextLine().split(" ");
                list1[j] = name[0]; 
                list2[j] = name[1];
            }
            boolean matched = false;
            for (int j = 0; j < list1.length; j++) {
                for (int k = 0; k < list2.length; k++) {
                    if (list1[j].compareTo(list2[k]) == 0) {
                       matched = true; 
                       break;
                    }
                }
                if (matched) {
                    break;
                }
            }
            String answer = "";
            if (matched) {
                answer = "No";
            }
            else {
                answer = "Yes";
            }
            System.out.printf("Case #%d: %s\n", i, answer);
        }
    }
}
