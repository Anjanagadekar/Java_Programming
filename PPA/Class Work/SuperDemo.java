class Hello
{
    public int i;

    public Hello(int no)
    {
        System.out.println("inside hello constructor");
        this.i=no+1;
    }
    public void Display()
    {
        System.out.println("inside hello display");
    }
}
class Demo extends Hello
{
    public int i;

    public Demo(int a)
    {
        super(a);
        System.out.println("inside demo constructor");
        this .i=a;
    }
    public void Display()
    {
        int i=0;
        System.out.println("inside display "+i);
        System.out.println("inside display "+this.i);
        System.out.println("inside display "+super.i);

        super.Display();
    }
}
class SuperDemo
{
    public static void main(String A[])
    {
        Demo  dobj=new Demo(51);
        dobj.Display();
    }
}