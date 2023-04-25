package abstractandinterface;

import java.util.*;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array element are: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}

	}

}
