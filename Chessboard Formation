import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner ob = new Scanner(System.in);
	int tc = ob.nextInt();

	while(tc>0)
	{
		int n = ob.nextInt();
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = ob.nextInt();
			}
		}
		System.out.println(Chess(a));
		tc--;
	}
	}

	public static int Chess(int b[][])
	{
		int n = b.length, rowSum=0,colSum=0,rowSwap=0,colswap=0;
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<n;++j)
			{
				if((b[0][0] ^ b[i][0] ^ b[0][j] ^ b[i][j]) == 1)
				return -1;
			}
		}
		for(int i=0;i<n;i++)
		{
			rowSum+=b[0][i];
			colSum+=b[i][0];

			if(b[i][0]==i%2)
			rowSwap++;

			if(b[0][i]==i%2)
			colswap++;
		}

		if(rowSum!=n/2 && rowSum!=(n+1)/2)
		{
			return -1;

		}
		if(colSum !=n/2 && colSum!=(n+1)/2)
		{
			return -1;
		}

		if(n%2==1)
		{
			if(colswap%2==1)
			{
				colswap=n-colswap;
			}
			if(rowSwap%2==1)
			{
				rowSwap=n-rowSwap;
			}
		}
		else
		{
			colswap=Math.min(n-colswap,colswap);
			rowSwap = Math.min(n-rowSwap,rowSwap);
		}

		return (colswap+rowSwap)/2;
	}
}
