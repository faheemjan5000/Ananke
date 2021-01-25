package demo;

public class Cartella {
		private int[][] cartella = new int[3][9];
	//getting correct column
	public int getCorrectColumnForTheNumber(int number) {
		if(number >=1 && number <=9) {  //col =0
			  if(getNoOfOccupiedCellsInColumn(0)<2)
				  return 0;
			  else 
				  return 100;
			}
		else if (number >=10 && number<=19) {
			  if(getNoOfOccupiedCellsInColumn(1)<2)
				  return 1;
			  else 
				  return 100;
		}
		else if (number >=20 && number<=29) {
			  if(getNoOfOccupiedCellsInColumn(2)<2)
				  return 2;
			  else 
				  return 100;
		}
	
		else if (number >=30 && number<=39) {
			  if(getNoOfOccupiedCellsInColumn(3)<2) 
				  return 3; 
			  else 
				  return 100;
		}
		else if (number >=40 && number<=49) {
			  if(getNoOfOccupiedCellsInColumn(4)<2)
				  return 4;
			  else 
				  return 100;
		}
		else if (number >=50 && number<=59) {
			  if(getNoOfOccupiedCellsInColumn(5)<2)
				  return 5;
			  else 
				  return 100;
		}
		else if (number >=60 && number<=69) {
			  if(getNoOfOccupiedCellsInColumn(6)<2) 
				  return 6;
			  else 
				  return 100;
		}
		else if (number >=70 && number<=79) {
			  if(getNoOfOccupiedCellsInColumn(7)<2)
				  return 7;
			  else 
				  return 100;
		}
		else if (number >=80 && number<=90) {
			
			  if(getNoOfOccupiedCellsInColumn(8)<2)
				  return 8;
			  else 
				  return 100;
		}
		else
		return 100;
	}
	private int getNoOfOccupiedCellsInColumn(int col) {
		int count =0;
		for(int row=0; row<3; row++) {
			 if(this.cartella[row][col]!=0)
				 count++;
		}
		
		return count;
	}
	public int getNumberOfNonZeroElementsInRow(int row) {
		int count =0; 
		for(int col=0; col<9; col++) {
			 if(this.cartella[row][col]!=0)
				 count++;
		 }
		return count;
	}
		public int getNumberOfnonZeroElementsInCartella(){
			int count=0;   
			for(int row=0; row<3; row++) {
				   for(int col=0; col<9; col++) {
					   if(this.cartella[row][col]!=0)
						   count++;
				   }
			   }
			return count;
		}
		
	
	public int getCorrectRowForTheNumber(int col, int number) {
		if(col!=100) {
		for(int row=0; row<3; row++ ) {
			    if(this.cartella[row][col]==0 && getNumberOfNonZeroElementsInRow(row) < 5) {
			        	      if(row==0) {
			        	    	  if(number < this.cartella[1][col] && this.cartella[1][col]!=0)
			        	    	  return 0; 
			        	    	  else if(number < this.cartella[2][0] && this.cartella[2][col]!=0)
			        	    		  return 0;
else if( (number >= this.cartella[1][col] && this.cartella[1][col]!=0 ) || number >=this.cartella[2][col]&& this.cartella[2][col]!=0 )
			        	    		  return 100;
			        	    	  else
			        	    		  return 0;
			        	      }
			        	      else if(row==1) {
			        	    	    if(number > this.cartella[0][col] && this.cartella[0][col]!=0 ) { 
			        	    	    	return 1; 
			        	    	    }
			        	    	    else if(number < this.cartella[2][col] && this.cartella[2][col]!=0 )
			        	    	    	return 1;
			        	    	    else if(this.cartella[0][col]==0 && this.cartella[2][col]==0)
			        	    	    	return 1;
			        	    	    else
			        	    	    	return 100;
			        	      }
			        	      else if(row==2){
			        	    	  if(this.cartella[0][col]==0 && this.cartella[1][col]==0)
			        	    		  return 2;
			        	      else if(number > this.cartella[1][col] && this.cartella[1][col]!=0) { 
			        	    	    	return 2; 
			        	    	    }
			        	    	  else if(number > this.cartella[0][col] && this.cartella[0][col]!=0) { 
			        	    	    	return 2; 
			        	    	    }
			        	    	  else 
			        	    		  return 100;
			        	      }
			    }
		}
		
		return 100;
		}
		else
			return 100;
	}
	
	public void displayCartella() {
		for(int row=0; row<3; row++) {
			for(int col=0;col<9; col++) {
				System.out.print(this.cartella[row][col] + "     ");
			}
			System.out.println();
		}
	}
	 public boolean isNumberAlreadyExistInCartella(int number) {
		 for(int row=0;row<3; row++) {
			 for(int col=0; col<9; col++) {
				 if(this.cartella[row][col]==number)
					 return true;
			 }
		 }
		 
		 return false;
	 }
	public void insertElementInCartella(int number) {
		
		int row=100;
		int col = this.getCorrectColumnForTheNumber(number);
		 if(col!=100) { 
			 row = this.getCorrectRowForTheNumber(col,number); 
			 }
		 if(row!=100) { 
			 this.cartella[row][col]=number; 
			 }
	}
	
}
