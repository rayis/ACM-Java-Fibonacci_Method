import acm.program.*;

public class FibMethod extends ConsoleProgram {
	
	public void run() {
		int n = readInt("Enter Fibonacci number: ");
		println("The result is: " + fibonacci(n));
	 }
		public int fibonacci(int d){
			
			int f0 = 0;
			int f1 = 1;
			int total = f0 + f1;
			int x = 0;
				for (int i=3; i <= d; i++){
					x = total + f1;
					f1 = total;
					total = x;
				}
					return x;
		}
	} 

