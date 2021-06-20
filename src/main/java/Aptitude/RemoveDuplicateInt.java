package Aptitude;

public class RemoveDuplicateInt {

	public static int removeDuplicateElements(int arr[], int n) {
		
		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0;// for next element
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				
				arr[j++] = arr[i];
				System.out.println("j -->" + j); 
			}
		}
		//System.out.println("j++ -->" + j++); //4
		System.out.println(  n - 1); //7
		arr[j++] = arr[n - 1];
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50, 20 };
		int length = arr.length;
		System.out.println("length -->" + length); //8
		length = removeDuplicateElements(arr, length);
		// printing array elements
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");

	}

}
