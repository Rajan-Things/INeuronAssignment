package iNeuronJavaPrograms.Assignment_1;

// 1.Write a program(WAP) to print INEURON using pattern programming logic.

public class PatternINeuron{
	public static void main(String[] args) {
		int n = 10;
		for(int i=0; i<n; i++) {
//			For i pattern
			for(int j=0; j<n; j++) {
				if(i == 0 || j == (n-1)/2 || i == (n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			
//			Pattern for N
			
			for(int j=0; j<n; j++) {
				if(j == 0 || i == j || j == (n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("    ");
//			Pattern for E
			for(int j=0; j<n; j++) {
				if(i == 0 || i == (n-1)/2 || j == 0 || i == (n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("    ");
			
//			Pattern for U
			for(int j=0; j<n; j++) {
				if(j == 0 && i <= 3*n/4 || j == (n-1) && i<=3*n/4 || i == n-1 && j >= n/4 && j <= 3*n/4 || i == (n-2) && j == 1 || i == (n-2) && j == (n-2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("    ");
//			Pattern for R
			for(int j=0; j<n; j++) {
				if(j == 0 || i == 0 && j < n/2 || i == (n-1)/2 && j < n/2 || i == 1 && j == n/2 || i == n/4 && j == (n/2)+1  || i != n/4 && j == n/2 && i > 0 && i < (n-1)/2 || i > (n-1)/2 && i-j == (n-4)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
//			Pattern for O
			for(int j=0; j<n; j++) {
				if(i == 0 && j >= n/4 && j <= (3*n)/4 || i == 1 && j == 1 || j == 0 && i >= n/4 &&  i <= (3*n)/4 || i == (n-2) && j == 1 || j == (n-1) && i >= n/4 &&  i <= (3*n)/4 || i == 1 && j == (n-2) || i == (n-1) && j >= n/4 && j <= (3*n)/4 || i == (n-2) && j == (n-2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("    ");
//			Pattern for N
			for(int j=0; j<n; j++) {
				if(j == 0 || i == j || j == (n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}
