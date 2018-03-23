package lab7;

public class TestProblem10_3 {
	public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(15);
        System.out.println("The value of myInteger is " + myInteger.getValue());
        System.out.println("myInteger is even: " + myInteger.isEven());
        System.out.println("myInteger is odd: " + myInteger.isOdd());
        System.out.println("myInteger is prime: " + myInteger.isPrime());

        System.out.println("Does 15 = 15: " + myInteger.equals(15));
        System.out.println("Does 15 = 5: " + myInteger.equals(new MyInteger(14)));

        System.out.println("Parse int string with value 157: "
                + MyInteger.parseInt("157"));
        System.out.println("Parse int char array with value 379: "
                + MyInteger.parseInt(new char[]{'3', '7', '9'}));
    }
}
