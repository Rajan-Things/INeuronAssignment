package Assignment_2;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();		
		}
		
		for(int i=0; i<n-1; i++) {
			int smallest = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[smallest]) {
					smallest = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
