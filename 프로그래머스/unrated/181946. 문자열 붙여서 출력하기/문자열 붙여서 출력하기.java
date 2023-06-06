import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        StringBuffer sb = new StringBuffer();
        sb.append(a);
        sb.append(b);
        System.out.println(sb.toString());
    }
}