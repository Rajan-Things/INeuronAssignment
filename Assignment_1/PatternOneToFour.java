package iNeuronJavaPrograms.Assignment_1;

// Write a program to print
// 1 1 1 1
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4

public class PatternOneToFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=1; i<n; i++) {
			for(int j=1; j<n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
