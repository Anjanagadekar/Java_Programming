class Demo
{
    public int i;
    public static int j;

    public Demo()
    {
        
        System.out.println("inside default");
        this.i=11;

    }
    static 
    {
        j=21;
    }
    public Demo(int a)
    {
        this();
        System.out.println("inside parameterised");
    }
    public void Display()
    {
        System.out.println("inside display "+this.i);
    }
}
class ThisDemo
{
    public static void main(String A[])
    {
        Demo dobj=new Demo(51);
        dobj.Display();
    }
}