//Inheritance is a core feature of java programming or OOP's concept .
//Inheritance is nothing but accessing the properties of parent class into child class while child class contains some more features that are not in parent class..
//parent class can't access the propertie's of child class. where, child class has ability of accessing properties of self as well as properties of parent class
//to show relationship between two classes the 'extends' keyword is used 

//Syntax : class class_name extends parent_class_name

//this is parent class called keyphone
class KeyPhone
{
 void phoneCall()
 {
    System.out.println("Feature of normal calling..");
 }

}
//In single inheritance only one child class and only one child class is present 
//smart phone  is child class of keyphone
class SmartPhone extends KeyPhone
{
 void videoCall()
 {
    System.out.println("Feature of video calling...");
 }
}
public class SingleInheritance {
    public static void main(String args[])
    {   //creating object of child class
        SmartPhone sp=new SmartPhone();
        //creating object of parent class
        KeyPhone kp=new KeyPhone();

        //child class is able to access the properties(data member / variables)  as well as behaviours (member function/ methods) of parent class

        sp.phoneCall();
        sp.videoCall();

        //parent class has priviledge of accessing the properties of self class
        //it cant access the properties of child class 
        kp.phoneCall();
       
       // kp.videoCall(); this statement will throw an error
    }
}
