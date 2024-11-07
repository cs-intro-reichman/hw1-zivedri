import javax.imageio.ImageTranscoder;

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random()*lim);
		int b = (int) (Math.random()*lim);
		int c = (int) (Math.random()*lim);
		int maxVal = Math.max(a,Math.max(b,c));
		int minVal = Math.min(a,Math.min(b,c));
		int midVal= (a+b+c)- maxVal-minVal;
		System.out.println((int) a+" "+(int) b+" "+(int) c);
		System.out.println(minVal+" "+midVal+" "+maxVal);
	}
}
