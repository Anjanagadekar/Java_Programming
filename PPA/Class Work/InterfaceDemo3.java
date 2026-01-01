
interface Demo
{
    int no=11;               //public static and final
    void Display();         //public and abstract
}

class Hello implements Demo
{
    public void Display()
    {
        System.out.println("inside display");
    }
    
}
class InterfaceDemo3
{
    public static void main(String A[])
    {
        System.out.println(Demo.no);        //no is public and static
        //Demo.no=12;                       //no is final

        Hello hobj=new Hello();
           
        hobj.Display();

    }
}