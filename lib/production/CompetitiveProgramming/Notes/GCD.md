# GCD OF A Number / HCF
If we subtract smaller number from the greater number, the GCD
of the number doesn't change. Hence this is the concept of the 
basic euclidean algorithm
````
static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        // base case
        if (a == b)
            return a;
      
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
````

##Extended Euclidean Algorithm 
Now instead of subtraction, we find the mod of the number and stop
when the number/remainder becomes 0.

``` Euclidiean Algorithm
//Euclidiean algorithm
 static long gcd(long a, long b){

        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
```