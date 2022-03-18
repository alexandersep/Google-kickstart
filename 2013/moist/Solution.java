import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int myInput = input.nextInt(); 
        for (int i = 1; i <= myInput; i++) {
            int n = input.nextInt();
            String[] cards = new String[n];
            input.nextLine(); // put cursor to the next line 
            for (int j = 0; j < n; j++) {
                String name = input.nextLine(); // name can have middle name 
                cards[j] = name;
            }
            int ans = 0;
            for (int j = 0; j < n-1; j++) {
                if (cards[j].compareTo(cards[j+1]) > 0) { // 0 ==, 1 s1 > s2, -1 s1 < s2
                    String temp = cards[j+1];
                    cards[j+1] = cards[j];
                    cards[j] = temp;
                    ans++;
                }
            }
            System.out.println("Case #" + i + ": " + ans);
        }
    }
}
