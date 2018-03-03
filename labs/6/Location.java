package lab6;

	public class Location {
		// the data fields row, column and maxValue
		int row;         	
		int column;			
		double maxValue;	
		//the method location that finds the largest element in the 2d array
	Location(double[][] a) {
		maxValue = a[0][0];
		row = 0;
		column = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
	}
}
