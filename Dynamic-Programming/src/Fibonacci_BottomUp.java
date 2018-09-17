
public class Fibonacci_BottomUp {
	static int f[];
	
	
	public static void main(String[] args) {
		int n =8;
		f = new int[n];
		System.out.println(new Fibonacci_BottomUp().bottomUpFib(n));
		for(int i : f)
			System.out.println(i);
	}
	public int bottomUpFib(int n) {
		if(n == 1 || n == 2)
			return 1;
		f[0] = 0;
		f[1] = 1;
		for(int i = 2; i<n; i++)
			f[i] = f[i-1]+f[i-2];
		return f[n-1];
	}
}
