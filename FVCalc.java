public class FVCalc {
	public static void main(String[] args){
		//System.out.println("write the cureent value in this account");
		Integer currentValue=Integer.parseInt(args[0]);
		//System.out.println("write the rate precentege");
		Double ratePrecent=Double.parseDouble(args[1]);
		Double rateNum=ratePrecent/100;
		//System.out.println("write the number of years of the saving account");
		Integer num=Integer.parseInt(args[2]);
		Double pow=Math.pow((rateNum+1),num);
		Double futeureValue=currentValue*pow;
		System.out.println("After "+ num+" years, a "+"$"+currentValue+" saved at "+ratePrecent+"% will yield "+"$"+(int)Math.floor(futeureValue));
	}
}