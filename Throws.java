import java.io.*;
class Throws {

    public static int div(int a,int b) throws IOException
    {
        return a/b;
    }
    public static void main(String args[])
    {
        Throws t=new Throws();
        try{
            div(10,0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
