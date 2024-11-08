// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		System.out.println("enter a number 3 digits");
	    Integer number=Integer.parseInt(args[0]);
		Integer n=number;
		Integer hunreds=0;
		Integer tens=0;
		Integer ones=0;
		hunreds=number/100;
		number=n;
		tens=number/10%10;
		ones=number%100%10;
		System.out.println("digits of the number "+n+" are: "+hunreds+" hundreds, "+tens+" tens, "+ones+" ones");
		//if i would like to do this action for a number with more then 3 digits, i can use 'for'  to get it work
	}
}
