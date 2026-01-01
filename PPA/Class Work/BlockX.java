
class Demo
{
    public int i;                   //instance variable
    static public int j=21;         //class variable

    static
    {
        System.out.println("inside satic block");
        j=21;
    }

    {
        System.out.println("Inside initializer block");
    }

    public Demo()
    {
        System.out.println("inside constructor");
        this.i=11;

    }

    public Demo(int a)
    {
        System.out.println("inside parameterised constructor");
        this.i=a;

    }

    public void fun()           //Instance method
    {
        System.out.println("fun i:"+this.i);
        System.out.println("fun j:"+Demo.j);
    }

    static public void gun()           //class method
    {
        //System.out.println("gun i:"+this.i);      not allowed
        System.out.println("gun j:"+Demo.j);
    }

}
class BlockX
{
    public static void main(String A[])
    {
        System.out.println("inside main");
        Demo dobj1=new Demo();
        Demo dobj2=new Demo();
        Demo dobj3=new Demo();
        Demo dobj4=new Demo(11);
    }
}