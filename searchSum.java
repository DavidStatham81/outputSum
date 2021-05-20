package outputSum;

public class searchSum {
	
	public static void main(String[] args) {
		// declaring variable values
		int n = 63; 
		int x = 1;
		int sum = 0;
		
		// calculating the variable sum
		while (x < n) {
			if (x % 2 == 0) x = x + 1;
			else {
				sum = sum + x;
				x = x + 1;
			}
		}
		// output the variable sum
		
		System.out.println("variable sum equal " + sum);
	}

}
