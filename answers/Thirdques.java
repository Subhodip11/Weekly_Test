
import java.util.*;
class Thirdques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
	

	   while(ob.hasNext()){
	       
		String s="";
		int m=0,cnt=0,i=0;
			int n=ob.nextInt();
		     
		   for(i=m;;i++)
		   {
			   int sum=0;
			   String k=i+"";
			   for(int j=0;j<k.length();j++)
				   sum+=Integer.parseInt(k.charAt(j)+"")%10;
				   
			   
			   if(sum==10)
			   {
				   s+=i;
				   m=i+1;
				   cnt++;
			   }
			   if(cnt==n)
				   break;
			   
		   }
		   System.out.println(s);
	   }
		
	}
}
