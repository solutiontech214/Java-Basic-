public class Arithmetic {
    int add(int a,int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    int div(int a,int b)
    {
        return a/b;

    }
    int mod(int a,int b)
    {
        return a%b;
    }
    public static void main(String args[])
    {
        System.out.println("\n \n \n-------------------- Arithmetic Operation --------------------");
        Arithmetic a=new Arithmetic();

        System.out.println("Addition is : "+a.add(10,20));

        System.out.println("Substraction is : "+a.sub(10,20));

        System.out.println("Multiplication is : "+a.mul(10,20));

        System.out.println("Division is : "+a.div(10,20));

        System.out.println("Modulos is : "+a.mod(10,20));


    }
}
