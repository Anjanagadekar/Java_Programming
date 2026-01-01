import java.util.Scanner;

class SelectionDemo2
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int iStd=0;
        System.out.println("Enter your standard:");
        iStd=sobj.nextInt();

        if(iStd==1)
        {
            System.out.println("exam at 9am");
        }
        else if(iStd==2)
        {
            System.out.println("exam at 10am");
        }
        else if(iStd==3)
        {
            System.out.println("exam at 11am");
        }
        else if(iStd==4)
        {
            System.out.println("exam at 12 noon");
        }
        else
        {
            System.out.println("Invalid Standard");
        }
    }
}