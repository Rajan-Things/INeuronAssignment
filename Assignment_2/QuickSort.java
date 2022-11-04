package Assignment_2;

import java.util.Scanner;

public class QuickSort {
	int partition(int[] arr, int l, int h) {
		int pivot = arr[h];
		int i = l-1;
		for(int j=l; j<h; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[h] = temp;
		return i;
	}
	
	void quickSorts(int[] arr, int l, int h) {
		if(l < h) {
			int pivotIndex = partition(arr, l, h);
			quickSorts(arr, l, pivotIndex-1);
			quickSorts(arr, pivotIndex+1, h);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();		
		}
		
		QuickSort qs = new QuickSort();
		qs.quickSorts(arr, 0, arr.length-1);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}

}
