//1. Identify the base Case for both of these functions. 
//2. Trace through the functions where n is 11. 



private static int factorial(int n)
{
     if (n == 0)
          return 1;
     else
          return n * factorial(n - 1);
}


//1. Identify the base Case for both of these functions. 
//2. Trace through the functions where 
	//x is 6 and y is 3
	//x is 10 and y is 2
	
//Use:to check answer: http://www.alcula.com/calculators/math/gcd/#gsc.tab=0

public static int gcd(int x, int y)
{
     if (x % y == 0)
        return y;
     else
        return gcd(y, x % y);
}
