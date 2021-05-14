import java.util.*;
public class DEC_TO_BIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max_1_or_0_at_middle();
	}
	public static void perfect_number() {
		 Scanner ob=new Scanner(System.in);
	       int k=ob.nextInt(),cnt=0;
	       for(int i=1;;i++){
	           int sum=0;
	           int t=i;
	           while(t!=0){
	            sum+=t%10;
	            t/=10;
	           }
	         
	           if(sum==10)
	           cnt++;
	           if(cnt==k)
	           {
	               System.out.println(i);
	               break;
	           }
	       }
	       ob.close();
	}
	public static void dec_to_bin() {
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		String s1="";
		if(t>=1&&t<=100)
		for(int i=1;i<=t;i++){
		int n=ob.nextInt();
		if(n>=0&&n<=99999) {
		String s="";
		
        while(n!=0)
        {
        	s+=n%2;
        	n/=2;
        }
        
        s1+=new StringBuilder(s).reverse()+"\n";
		}
		}
		System.out.println(s1);
		ob.close();
	}
	public static void even_odd() {
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=ob.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				for(int j=i;j<a.length;j++) {
					if(a[j]%2==0) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			
		}
		for(Integer i:a)
			System.out.print(i+" ");
	}
	public static void max_1_or_0_at_middle() {
		Scanner ob=new Scanner(System.in);
		String s=ob.next();
		char ch[]=s.toCharArray();
		int cnt=1,max=0;
		
		for(int i=1;i<ch.length-1;i++) {
			if(ch[i]==ch[i+1])
			{
				cnt++;
//				System.out.println(ch[i]+"  "+ch[i+1]+"  "+cnt);
			}
			else {
				
				if(max<cnt)
					max=cnt;
				cnt=1;
			}
		}
		System.out.println(max);
	}

}
