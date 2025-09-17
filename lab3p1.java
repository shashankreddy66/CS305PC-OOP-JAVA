import java.util.*;

class lab3p1
{
    public static void main(String[] args) {
    	System.out.println("enter the number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i= 2;
        while (i<n) {
            int j = 2,count  = 0;
            if(i == 2) 
            	count++;
            while (j<i) {
                if (i%j==0)  break; 
                else count++;
                 j++;
           }
            if(count>0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}

