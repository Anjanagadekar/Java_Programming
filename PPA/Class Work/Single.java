class Base
{
    public int i,j;

    public void fun()
    {
        System.out.println("inside base fun");

    }
}
class Derived extends Base
{
    public int x;

    public void gun()
    {
        System.out.println("inside derived gun");
    }
}
class Single
{
    public static void main(String A[])
    {
        Base bobj=new Base();
        Derived dobj=new Derived();

        bobj.fun();
        dobj.fun();
        dobj.gun();
    }
}