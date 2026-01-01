class Arithmatic
{
    public int iNo1;
    public int iNo2;

    public Arithmatic()
    {
        this.iNo1=0;
        this.iNo2=0;
    }
    public Arithmatic(int A, int B)
    {
        
        this.iNo1=A;
        this.iNo2=B;
    }
    public int Addition()
    {
        int iAns=0;
        iAns=this.iNo1+this.iNo2;
        return iAns;
    }
    public int Subtraction()
    {
        int iAns=0;
        iAns=this.iNo1-this.iNo2;
        return iAns;
    }
}
class OOPX
{
    public static void main(String A[])
{
    Arithmatic Aobj1=new Arithmatic(11,10);
    int iRet=0;
    
    iRet=Aobj1.Addition();
   System.out.println("Addition is:"+iRet);

    iRet=Aobj1.Subtraction();
    System.out.println("Subtraction is:"+iRet);

    Aobj1=null;

}

}