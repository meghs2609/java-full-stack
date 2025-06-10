import java.util.Scanner;

public class Alphabet {
	String series(int n)
	{
		String s = "abcdefghijklmnopqrstuvwxyz";
		String res = "";
		while(n>0)
		{
			n--;
			int c =(n % 26);
			char r = (s.charAt(c));
			res = res + r;
			n=n/26;
			
		}
		return res;
	}
	public static void main(String args[])
	{
		Alphabet a = new Alphabet();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value:");
		int n = sc.nextInt();
		String result = a.series(n);
		int m=result.length();
		for(int i=m-1;i>=0;i--)
		{
			System.out.print(result.charAt(i));
		}

	}
}