class Demo extends Thread
{
    public void run()
    {
        System.out.println("inside run method");
    }
}


class ThreadUserDefined
{
    public static void main(String A[])
    {
        Demo dobj1=new Demo();
        dobj1.start();

    }
}
