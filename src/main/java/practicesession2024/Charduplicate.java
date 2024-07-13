package practicesession2024;

public class Charduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "sathish";
		
		int len = S.length();
		
		char ch [] = S.toCharArray();
		for (int i=0;i<len;i++)
			
		{
			for (int j=i+1;j<len;j++)
			{
				if (ch[i]==ch[j])
				{
					System.out.println(ch[j]);
				}
			}
		}

		
	}

}
