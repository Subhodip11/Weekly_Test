import java.util.*;
public class EightQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		ArrayList<Integer> b=new ArrayList<Integer>();
		
		for(int i=2;;i++)
		{
			
			int cnt=0;
			for(int j=2;j<=Math.sqrt(i);j++)
				if(i%j==0) {
					cnt++;
					break;
				}
			if(cnt==0)
				{
				b.add(i);
				}
			if(b.size()==100000)
				break;
			
		}

		String s="";
	    int t=ob.nextInt();
	    while(t-->0)
	    {
	    	int n=ob.nextInt();
	    	System.out.println(b.get(n-1));
	    }
	}

}
