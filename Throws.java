    class Throws {

     int div(int a,int b) throws Exception
    {
        return a/b;
    }
    public static void main(String args[])
    {
        Throws t=new Throws();
        try{
        t.div(10,0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
