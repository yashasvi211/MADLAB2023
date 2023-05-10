import java.util.*;
public class Main {
    public static void main(String[] args)
    {
         Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number:");
         int n = scn.nextInt();
         
         int temp=1;
         while(temp!=11)
         {
                 System.out.println(temp+"*"+n+"="+temp*n);
            temp++;
         }
    }
}