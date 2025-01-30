class Test{
    static int x=10;
    static void show(){
        System.out.println("static method");
        System.out.println("x="+x);
    }
}
public class Demo
{
    public static void main(String[]args)
    {
        Test.show();
    }
}