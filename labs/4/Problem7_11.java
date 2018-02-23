import java.util.Scanner;

public class Problem7_11 {

	public static void main(String[] args) {
		System.out.print("Enter ten numbers:");
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
			 
			for (int i = 0; i < numbers.length; i++) {
			   numbers[i] = input.nextDouble();
			  }
			 
			  System.out.println("The mean is " + mean(numbers));
			  System.out.println("The standard deviation is " + deviation(numbers));
			 
			 }
			 
			  //Compute the standard deviation 
			 public static double deviation(double[] dev) {
			  double mean = mean(dev);
			  double sumSq = 0;
			  for (int i = 0; i < dev.length; i++) {
			   sumSq += Math.pow((dev[i] - mean), 2);
			  }
			 
			  return Math.sqrt(sumSq / (dev.length - 1));
			 
			 }
			 
			 //Compute the mean of an array of double values
			 public static double mean(double[] mean) {
			  double sum = 0;
			  double total = 0;
			  for (int i = 0; i < mean.length; i++) {
			   sum += mean[i];
			   total =  total + sum / mean.length;
			   
			  }
			 return total; 
			 
			 }
			 
	}

