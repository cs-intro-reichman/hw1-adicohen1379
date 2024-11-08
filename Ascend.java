// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		//System.out.println("write the limit");
		Integer lim=Integer.parseInt(args[0]);
		Integer a= (int)(Math.random()*(lim+1));
		Integer b= (int)(Math.random()*(lim+1));
		Integer c= (int)(Math.random()*(lim+1));
		//System.out.println("the numbers are "+a+","+b+" "+c);;//to see the random numbers
		Integer max=Math.max(a,b);
		Integer maxCheck=Math.max(max, c);
		Integer min=Math.min(a,b);
		Integer minCheck=Math.min(min, c);
		Integer middle=a;
			for(int i=0;i<3&&(middle==maxCheck||middle==minCheck);i++)
			//if a is the middle number it won't get in to this for
			//if a isnt the middle we are cheking by to for if the middle is b or c
			{
				middle=b;
				for(int j=0;j<3&&(middle==maxCheck||middle==minCheck);j++)
				{
						middle=c;
				}
			}
			System.out.println("the numbers in ascend order are "+minCheck+","+middle+" "+maxCheck);
	}
}
