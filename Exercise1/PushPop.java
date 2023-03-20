package packing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author pavithra
 *  Pushpop class to implement fixedstack and dynamicstack
 *
 */
public class PushPop {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size:");
		int num = Integer.parseInt(in.readLine());
		System.out.println("Stack operations\n 1.fixed stack \n 2.dynamic stack");
		int input = Integer.parseInt(in.readLine());
		boolean bool = true;
		if (input == 1) {
			FixedStack obj = new FixedStack(num);

			while (bool != false) {
				System.out.println("1.push\n2.pop\n3.exit");
				int y = Integer.parseInt(in.readLine());
				switch (y) {

				case 1:
					System.out.println("Enter value");
					int value = Integer.parseInt(in.readLine());
					obj.push(value);
					break;
				case 2:
					obj.pop();
					break;
				case 3:
					bool = false;
					break;
				}
			}
		}
		if (input == 2) {
			DynamicStack obj1 = new DynamicStack(num);

			while (bool != false) {
				System.out.println("1.push\n2.pop\n3.exit");
				int y = Integer.parseInt(in.readLine());
				switch (y) {

				case 1:
					System.out.println("Enter value");
					int value = Integer.parseInt(in.readLine());
					obj1.push(value);
					break;
				case 2:
					obj1.pop();
					break;
				case 3:
					bool = false;
					break;
				}
			}

		}
	}
}

/**
 * 
 * @author pavithra interface Stack that has two methods push and pop
 *
 */

interface stack {
	void push(int value);

	void pop();
}

/**
 * 
 * @author pavithra FixedStack class that implements stack and does the push and
 *         pop operation
 *
 */
class FixedStack implements stack {
	final int size;
	int[] stack;
	int top = -1;

	public FixedStack(int size) {
		this.size = size;
		this.stack = new int[size];
	}

	@Override
	public void push(int value) {
		if (top == size - 1) {
			System.out.println("Stack overflow");
		} else {
			stack[++top] = value;
		}
	}

	@Override
	public void pop() {
		if (top == -1) {
			System.out.println("Stack underflow");
		} else {
			int value = stack[top--];
			System.out.println("Popped element: " + value);
			System.out.println("Array Elements");
			for (int i = 0; i <= top; i++) {
				System.out.println(stack[i]);
			}
		}
	}

}

/**
 * 
 * @author pavithra
 *  DynamicStack class that implements two methods
 *
 */

class DynamicStack implements stack {
	int[] arr;
	int top = -1;
	int size;

	public DynamicStack(int size) {
		this.size = size;
		this.arr = new int[size];
	}

	@Override
	public void push(int value) {
		if (top == size - 1) {
			int[] newArr = new int[2 * size];
			System.arraycopy(arr, 0, newArr, 0, size);
			arr = newArr;
		}
		arr[++top] = value;
	}

	@Override
	public void pop() {
		if (top == -1) {
			System.out.println("Underflow");
			return;
		}
		int value = arr[top--];
		System.out.println("Popped element: " + value);
		System.out.println("Array Elements");
		for (int i = 0; i <= top; i++) {
			System.out.println(arr[i]);
		}
	}
}
