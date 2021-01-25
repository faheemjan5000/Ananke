package demo;

public class Fibonaci {
	
	private int firstNumber;
	private int secondNumber;
	private int size; // size of the fibonacci series
	
	public Fibonaci(int firstNumber, int secondNumber, int size) {
		this.firstNumber=firstNumber;
		this.secondNumber=secondNumber;
		this.size = size;
	}
	
	public void displayFibonaciSeries()  
	{    
	 int sumOfPreviousTwoNumbers,startingIndex;
	 System.out.print(firstNumber+" "+secondNumber);  
	 for(startingIndex=2;startingIndex<size;++startingIndex)    
	 {    
	  sumOfPreviousTwoNumbers=firstNumber+secondNumber;    
	  System.out.print(" "+sumOfPreviousTwoNumbers);    
	  firstNumber=secondNumber;    
	  secondNumber=sumOfPreviousTwoNumbers;    
	 }    
	}
	public void displayFibonaciInScala()
	{
		 int n1 = 0;
		 int n2 =1;
		 int count = 10;
		 int fibonaciSeries[];
		 fibonaciSeries = new int[100];
		 fibonaciSeries[0]=n1;
		 fibonaciSeries[1]=n2;    int j=2;
		  System.out.println(fibonaciSeries[0]);
		  System.out.println(fibonaciSeries[0] + " " + fibonaciSeries[1]);
		 calculatingFibonaci(n1, n2, count, fibonaciSeries, j);
		 //printFinalSeries(count, arr);
	}
	private void printFinalSeries(int count, int[] arr) {
		for(int b =0; b<count; b++) {
			 System.out.print(arr[b] + " ");
		 }
	}
	private void calculatingFibonaci(int n1, int n2, int count, int[] arr, int j) {
		int n3;
		for(int i =2; i<count; i++)
		 {
		  	n3 = n1 + n2;
		  	n1 = n2;
		  	n2 = n3;
		  	arr[j] = n3;
		  	j++;
		  	 printFinalSeries(j, arr);
		  	 System.out.println();
		 }
	}

}
