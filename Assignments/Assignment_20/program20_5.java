class Logic
{
     void findSmallestDigit(int num)
    {
        int iDigit=0, smallestdigit=9;

        while(num != 0)
        {
            iDigit = num % 10;
            if( iDigit < smallestdigit )
            {
                smallestdigit = iDigit;
            }
            num = num / 10;
            
        }
        System.out.println("The smallest Digit is:"+smallestdigit);
    }
}

class program20_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}