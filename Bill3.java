// Splits a restaurant bill evenly among three diners.
public class Bill3
 {
	public static void main(String[] args)
	 {
		//System.out.println("write the 3 names of the dinners");
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		//System.out.println("write the price 0f the dinner");
		Double price = Double.parseDouble(args[3]);
		double eachOne=(price/3);
		System.out.println(name3+", "+name2+", and, "+name1+": "+"pay "+ Math.ceil(eachOne)+" Shekels each ");
	}
	
}
