class Logic
{
     void findLargestDigit(int num)
    {
        int iDigit=0, largestdigit=0;

        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit > largestdigit)
            {
                largestdigit = iDigit;
            }
            num = num / 10;
            
        }
        System.out.println("The largest Digit is:"+largestdigit);
    }
}

class program20_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}