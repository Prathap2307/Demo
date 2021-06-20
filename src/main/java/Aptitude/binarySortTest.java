package Aptitude;

public class binarySortTest {

	public static int binSort(int arr[], int n) {

		int j = -1;
		for (int i = 0; i < n; i++) {

			// if number is smaller than 1
			// then swap it with j-th number
			if (arr[i] > 0) {
				
			/*	j++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;*/
				
				
				j++;
				int temp = arr[j];
				
				arr[j] = arr[i];
				arr[i] = temp;
				
				//backup
				//replace
				//temp replace
				
				
				
				
				
				
				
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
			
		
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 1, 0 };
		int length = arr.length;
		System.out.println("length -->" + length); // 8
		 binSort(arr, length);

	}

}
