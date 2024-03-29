import java.util.Arrays;
import java.util.Scanner;

public class Array {
	int[] arr = new int[10];
	int count = -1;



	public void push(int item) {
		count += 1;
		arr[count] = item;
	}


	void pop() {
		System.out.println(arr[count]);
		arr[count] = 0;
		count--;
	}

	void peek(int a) {
		System.out.println(arr[a]);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Array a = new Array();
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);
		System.out.println(Arrays.toString(a.arr));

		a.pop();
		a.pop();
		a.pop();
		System.out.println(Arrays.toString(a.arr));
		System.out.println("enter an index position to get its value:");
		int n = s.nextInt();
		a.peek(n);

	}

}