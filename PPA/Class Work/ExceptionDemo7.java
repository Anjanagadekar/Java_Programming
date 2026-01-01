import java.util.*;

class ExceptionDemo7
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int iNo1=0, iNo2=0, iAns=0;

        System.out.println("Enter First Number:");
        iNo1=sobj.nextInt();

        System.out.println("Enter Second Number:");
        iNo2=sobj.nextInt();

        try
        {
            System.out.println("inside try block");
            iAns=iNo1/iNo2;  
        }

        System.out.println("hello");    //Error

        catch(ArithmeticException aobj)             //specific catch
        {
            System.out.println("inside catch block");
            System.out.println(aobj);
        }   
        catch(Exception eobj)                       //generic catch
        {
            System.out.println("inside generic catch ");
        }
        finally
        {
            System.out.println("inside finally block");
        }

        System.out.println("Division is :"+iAns);       
    }
}