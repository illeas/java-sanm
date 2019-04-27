
package problem;

public class arithmaticseries implements series
{
    @Override
    public void nthelement(int n)
    {
        double a=24,d=12;
        double result1;
        result1 = a+(n-1)*d;
        System.out.println("this nth element of Arithmaticseries is: "+result1);
    }
    @Override
    public void sumof1stnthelement(int n)
    {
        double a=26,d=30;
        double result2;
        result2=n/2*2*a+(n-1)*d;
        System.out.println("sum of 1st nth element of Arithmaticseries is: "+result2);
        
    }
}
