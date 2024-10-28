public class FindingLargest {
    public static void main(String args[])
    {
        int a=20,b=45,c=89;
        System.out.println("Finding Largest Number :");
        if(a>b && a>c)
        {
            System.out.println(a+" is larger");
        }else if(b>a && b>c)
        {
            System.out.println(b+" is larger");
        }
        else{
            System.out.println(c+" is larger");
        }
    }
}
