package practicesession2024;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String  S = "Sathishkumar";
		
		int len = S.length();
		
		String rev = " ";
		
		for (int i=len-1;i>=0;i--)
		{
			
			rev =rev+S.charAt(i);
		}
		System.out.println(rev);

	}

}
