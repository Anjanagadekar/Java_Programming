class Logic
{
     void displayGrade(int marks)
    {
       if(marks > 80 && marks < 100)
       {
        System.out.println("A");
       }
       else if(marks > 60 && marks < 80)
       {
        System.out.println("B");
       }
       else if(marks > 40 && marks < 60)
       {
        System.out.println("c");
       }
        else
        {
            System.out.println("result is failed");
        }
    }
}

class program19_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}