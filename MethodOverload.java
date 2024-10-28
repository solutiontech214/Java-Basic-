public class MethodOverload {
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String a[])
    {
        MethodOverload mo=new MethodOverload();
        System.out.println("Addition of 2 numbers : "+mo.add(10,20));
        System.out.println("Addition of 3 numbers : "+mo.add(10,20,30));
    }
}
