// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		System.out.println("After " + n + " years, a $" + currentValue + " saved at " + rate + "% will yield $" + (int) (currentValue*Math.pow((1+(rate/100)),n)));
	}
}