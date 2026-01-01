
interface A
{
    int no=11;
    void fun(); 

    default void gun()      //this feature from java8+
    {
        System.out.println("inside gun ");
        Display();
    } 

    private void Display()          //helper function
    {
        System.out.println("Inside private display");
    }
    
}


class Demo implements A         //multiple inheritance
{
    public void fun()
    {
       System.out.println("inside fun ");    
    }
   
}
class InterfaceDemo9
{
    public static void main(String A[])
    {
        Demo dobj=new Demo();
        dobj.fun();
        dobj.gun();
        //dobj.Display();           //error
        
    }
}