class Logic
{
     void checkSign(int num)
    {
         if(num > 0)
         {
            System.out.println(num+" is positive number");
         }
         else if(num < 0)
         {
            System.out.println(num+" is negative number");
         }
         else
         {
            System.out.println(num+" is zero");
         }
    }
}

class program18_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}