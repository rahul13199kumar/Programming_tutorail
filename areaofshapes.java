package AssignementAera;

import java.util.*;


public class areaofshapes 
{

  public static void main(String[] args)
  {
     CalculateArea ob = new CalculateArea();
	   ob.area(4);
	   ob.area(10,12);
	   ob.area(5,12,3);
  }
}
class CalculateArea
{
  void area(float x)
  {
      System.out.println("The area of the square is "+Math.pow(x, 2)+" sq units");
  }
  void area(float x, float y)
  {
      System.out.println("The area of the rectangle is "+x*y+" sq units");
  }
  void area(int x, int y, int i)
  {
      System.out.println("The area of the traingle is "+x*y/ 2+" sq units");
  }
}