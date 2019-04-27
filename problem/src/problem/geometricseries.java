
package problem;

public class geometricseries implements series
{

    @Override
    public void nthelement(int n)
    {
        double a=10,r=12;
        double result1;
        result1 = Math.pow((a*r),(n-1));
        System.out.println("this nth element of Geometricseries is: "+result1);
    }
    @Override
    public void sumof1stnthelement(int n)
    {
      double a=50,r=14;
      double result;
      double result2;
      result =Math.pow((a*1-r), (n));
      result2=result/1-r;
      System.out.println("sum of 1st nth element of Geometricseries is: "+result2);
    }
}
