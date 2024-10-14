public class CommandLineArgs {
    public static void main(String  args[])
    {
        //so, basically the java's main method take CLA from their String args[]
        // it takes input  in string by default, then after we can convert it into another data type if possible
        // these CLA are stored in String type array , so we have to access it index-wise.
        // we use java's wrapper class to convert these arguments into another type.
        // we are going to give this argument at the time of interpretation or we can say after compilation statement.

        //Addition of two numbers by taking input from command line arguments (CLA) :

        int a=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
        System.err.println("The Addition of "+args[0]+" and "+args[1]+"is :"+a);
    }
    
}
