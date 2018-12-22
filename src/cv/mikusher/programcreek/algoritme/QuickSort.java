package cv.mikusher.programcreek.algoritme;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
	static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pivot_pos = partition(arr, start, end);
			quickSort(arr, start, pivot_pos - 1);
			quickSort(arr, pivot_pos + 1, end);
		}
	}

	static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start, j = end - 1;
		while (i <= j) {
			if (arr[j] <= pivot && arr[i] > pivot) {
				swap(arr, i, j);
			}
			if (arr[i] <= pivot) {
				i++;
			}
			if (arr[j] > pivot) {
				j--;
			}
		}
		swap(arr, i, end);
		return i;
	}

	static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	static int[] generateArray(int arraySize) {
		Random r = new Random();
		int[] integersArray = new int[arraySize];
		for (int i = 0; i < integersArray.length; i++) {
			integersArray[i] = (r.nextInt(100) + 1);
		}
		return integersArray;
	};

	public static void main(String[] args) {
            //int[] arr = { 9, 7, 5, 11, 12, 2, 14, 3, 10, 4, 6 };
            Scanner input = new Scanner(System.in);
            System.out.print("Indica o tamanho do array: ");
            int arraylength = input.nextInt();
            int[] arr = generateArray(arraylength);
            
            System.out.println("");
            System.out.print("Before: ");
            print(arr);
            quickSort(arr, 0, arr.length - 1);
            System.out.print("After: ");
            print(arr);
	}
}