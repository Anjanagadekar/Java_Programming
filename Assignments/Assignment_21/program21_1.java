class Logic
{
     void productOfDigits(int num)
    {
        int iDigit=0, product=1;

        while(num != 0)
        {
            iDigit = num % 10;
            product = product * iDigit;
            num = num / 10;
            
        }
        System.out.println("The product of the Digits is: "+product);
    }
}

class program21_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}