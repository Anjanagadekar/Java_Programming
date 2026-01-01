import java.util.Scanner;

class SwitchDemo
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int iStd=0;
        System.out.println("Enter your standard:");
        iStd=sobj.nextInt();

        switch(iStd)
        {
            case 1:
                    System.out.println("exam at 9am");
                    break;

            case 2:
                    System.out.println("exam at 10am");
                    break;

            case 3:
                    System.out.println("exam at 11am");
                    break;

            case 4:
                    System.out.println("exam at 12am");
                    break;

            default:
                    System.out.println("Invalid Standard");

        }
    }
}