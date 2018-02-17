
public class Problem6_9 {

	public static void main(String[] args) {
		System.out.printf("%-10s%10s   |   %-10s%10s\n","Feet","Meters","Feet","Meters");
		System.out.println("_________________________________________________");
		for (double foot = 1.0, meter = 20.0; foot <= 10.0; foot += 1.0, meter += 5.0) {
			System.out.printf("%-10.1f%10.3f   |   %-10.1f%10.3f\n", foot, footToMeter(foot), meter, meterToFoot(meter));
			
		}

	}
	
	public static double footToMeter(double foot) {
		double meter = .305 * foot;
		return meter;
			
	}
	
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}
	
}
