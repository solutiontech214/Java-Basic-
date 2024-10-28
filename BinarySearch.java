import java.util.Scanner;
public class BinarySearch {
    public static void main(String args[])
    {
        int arr[]={10,15,20,25,30,35,40};
        int mid=arr.length/2;
        int front=0,rear=arr.length-1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Key :");
        int key=s.nextInt();
        int count=0;

        
        while(count!=arr.length+1)
        {
            if(key==arr[mid])
            {
                System.out.println("Element found..");
                mid=-1;
                break;
            }
            else if(key>arr[mid])
            {
                front=mid;
                mid=front+rear/2;

            }
            else if(key<arr[mid])
            {
                rear=mid;
                mid=front+rear/2;
            }
        }
    if(mid!=-1)
    {
        System.err.println("Element not found..");

    }
    }
}
