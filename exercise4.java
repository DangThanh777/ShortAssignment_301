package ShortAssignment_301;

public class exercise4 {

	public static void main(String[] args) {
		int[] myIntArray = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };
		System.out.print("Original Array: ");
		for(int i = 0; i < myIntArray.length; i++) {
			System.out.print(myIntArray[i] + " ");
		}
		
		for(int i = 0; i < myIntArray.length /2; i ++) {
			int temp = myIntArray[i];
			myIntArray[i] = myIntArray[10 - 1 - i];
			myIntArray[10 - 1 - i] = temp;
		}
		System.out.println();
		System.out.print("Reversed array: ");
		for(int i = 0; i < myIntArray.length;i++) {
			System.out.print(myIntArray[i] + " ");
		}
	}

}
