/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) 
	{
	int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int max = Math.max(x,y);
        int min = Math.min(x,y);
        int num1 = (int)(Math.random()*(max - min) + min);
        int num2 = (int)(Math.random()*(max - min) + min);
        int minimum = Math.min(num1,num2);
        int num3 = (int)(Math.random()*(max - min) + min);
        minimum = Math.min(minimum,num3);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println("the minimal generates number was"+minimum);	
	}
}
