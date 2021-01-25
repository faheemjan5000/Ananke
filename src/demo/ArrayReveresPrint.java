package demo;

public class ArrayReveresPrint {

	public void displayThePatteren() {
		int arr[];
		arr = new int[6];
		int num =1;
		int size=1;
		int t=5;
		
		initializingArray(arr, num);
		for(int i=0;i<6;i++) {
			
			printLeftSide(arr, size);
			t = printRightSide(arr, t);
			size++;
			System.out.println();
		}
	}
	private int printRightSide(int[] arr, int t) {
		for(int k=t;k>=0;k--) 
		{
		 System.out.print(arr[k]);
		}
		t--;
		return t;
	}
	private void printLeftSide(int[] arr, int size) {
		for(int j=0;j<size; j++) 
		{
			System.out.print(arr[j]);
		}
		System.out.print(" ");
	}
	private void initializingArray(int[] arr, int num) {
		for(int i=0;i<6; i++) {
			arr[i] = num;
			num++;
		}
	}

}
