import java.util.*;
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Princiapl Amount:");
        int p,r,t;
        
        p=sc.nextInt();
        System.out.println("Enter the Rate of Interest:");
        r=sc.nextInt();
        System.out.println("Enter the Time Period in months:");
        t=sc.nextInt();
        sc.close();
        Simple(p, r, t);
    }
        static void Simple(int p, int r, int t) {
        int si = (p * r * t) / 100;
        System.out.println("Simple Interest is:" + si);
    }
        
    }

