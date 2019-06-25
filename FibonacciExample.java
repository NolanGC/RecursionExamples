public class Recursion {
	public static void main(String[] args){
		System.out.println(fib(8));
	}
	static int fib(int n){
		//finds the nth term of the fibonacci sequence
		//0,1,1,2,3,5,8,13
		if(n == 0 || n == 1){
			return n;
		}
		else{
			return fib(n - 1) + fib(n - 2);
		}
	}
}