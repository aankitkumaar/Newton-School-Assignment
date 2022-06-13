import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static boolean sumOfTwoCubes(long n)
{
    long l = 1, r = (long)Math.cbrt(n);
     while (l <= r) {
        long curr = (l * l * l + r * r * r);
        if (curr == n)
            return true;
        if (curr < n)
            l++;
        else
        
            r--;
    }
    return false;
}
public static void main (String[] args)
{
   Scanner ob = new Scanner(System.in);
   long N = ob.nextLong(); 
    if (sumOfTwoCubes(N)) {
        System.out.println("YES");
    }
    else {
        System.out.println("NO");
    }
 
}
}
