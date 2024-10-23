import java.util.Scanner;
public class FindPrime {
    public static void main(String args[])
    {
        //creating object of Scanner class object
        Scanner s=new Scanner(System.in);
        //taking user input
        System.out.println("Enter Number to Check Prime or Not :");
        int num=s.nextInt();

        //flag veriable that indicates number is prime or not
        int flag=1;

        //logic implementation to find prime number
        for(int i=2;i<num;i++)
        {
            for(int j=1;j<=10;j++)
            {
                if(i*j==num)
                {
                    flag=0;
                }
            }
            
        }
        if(flag==1)
        {
            System.err.println(num+" Is Prime..");

        }else
        System.err.println(num+" Is not Prime..");
    }
    
}
