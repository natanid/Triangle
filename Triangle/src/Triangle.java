
public class Triangle{ 

int side1;
int side2;
int side3;

public Triangle(int x, int y, int z)

{
side1 = x;
side2 = y;
side3 = z;
}
public int getSide1()
{
    return side1;
}
public int getSide2()
{
    return side2;
}

public int getSide3()
{
    return side3;
}
public int getPerimeter()
{
    return side1 + side2 + side3;
}
//Method to test for a scalene triangle.
public boolean is_scalene () {
   if ((side1 != side2) && (side1 != side3) && (side2 != side3))
      return true;
   else
      return false;
}

// Method to test for an isosceles triangle.
public boolean is_isosceles () {
   if (((side1 == side2) && (side1 != side3)) ||
       ((side1 == side3) && (side1 != side2)) ||
       ((side2 == side3) && (side2 != side1)))
      return true;
   else
      return false;
}

// Method to test for an equilateral triangle.
public boolean is_equilateral () {
   if ((side1 == side2) && (side1 == side3))
      return true;
   else
      return false;
}
}