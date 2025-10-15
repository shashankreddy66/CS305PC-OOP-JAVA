import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int x,y;
        Scanner s = new Scanner(System.in);
        try{
        x= s.nextInt();
        y = s.nextInt();
        System.out.println(x/y);
        }
        catch(InputMismatchException ie){
            System.out.println(ie.getClass().getName());
        }
        catch(ArithmeticException ae) {
            System.out.println(ae.getClass().getName()+": " +ae.getMessage());
        }
    }
}

