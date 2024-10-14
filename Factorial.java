import java.util.Scanner;
public class Factorial {
    public static void main(String  args[])
    {
        //creating the object of scanner class to take input from user:
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Digit :");
        //taking integer input from user
        int num=s.nextInt(),sum=1;
        //logic for finding factorial
        while(num>0)
        {
            sum=sum*num;
            --num;
        }
        //printing the factorial of given number
        System.out.println("Factorial is :"+sum);
    }
    
}
