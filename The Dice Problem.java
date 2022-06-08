import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner ob= new Scanner(System.in);
	int tc= ob.nextInt();
	for(int i=0;i<tc;i++)
	{
		int temp = ob.nextInt();
		System.out.println(7-temp);
	}
	}
}
