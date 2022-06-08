import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner ob = new Scanner(System.in);
	int tc = ob.nextInt();
	for(int i=0;i<tc;i++)
	{
		int N= ob.nextInt();
		int k = ob.nextInt();
		System.out.println(safe(N,k));

	}
	// 1 2 3 4 5
	} 
	public static int safe(int n,int k)
	{
		if(n==1)
		return 1;
		else
		{
			return (safe(n-1,k)+k-1)%n+1;
		}
	}
}
