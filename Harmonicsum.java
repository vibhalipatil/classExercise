public class Harmoicsum {

	public static void main(String[] args) {
		 int n = 50000;
	        double sumLtoR = 0.0, sumRtoL = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sumLtoR += (double) 1 / i;

	        }
	        System.out.println("The sum from left to right=" + sumLtoR);
	        for (int i = 5000; i > 0; i--) {
	            sumRtoL += (double) 1 / i;

	        }
	        System.out.println("The sum from right to left=" + sumRtoL);

	    }
}
