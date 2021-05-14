import java.util.*;
public class copy_without_loops {
static Scanner ob=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       copy_without_loop();
//       add_without_plus_operator();
//		IPaddress();
//		palindromicString();
//		outputMaximumProduct();
		twodArraySort();
	}
	public static void copy_without_loop() {
		String s1=ob.next(),s2="";
		s2=s2.copyValueOf(s1.toCharArray());
		System.out.println(s2);
	}
	public static void add_without_plus_operator() {
		int n1=ob.nextInt(),n2=ob.nextInt();
		while(n2!=0) {
			int c=(n1&n2);
			n1=n1^n2;
			n2=c<<1;
		}
		System.out.println(n1);
	}
    public static void IPaddress() {
    	String n=ob.next();
    	String ip="";
    	int i=0;
    	for(i=0;i<n.length()-3;i+=3)
    	{
    		char sort[]=n.substring(i,i+3).toCharArray();
    		Arrays.sort(sort);
    		for(Character c:sort)
    		ip+=c;
    		ip+=".";
    	}
    	char sort[]=n.substring(i,n.length()).toCharArray();
		Arrays.sort(sort);
		for(Character c:sort)
		ip+=c;
    	
    	if(n.length()<12)
    	{
    		char ch1[]=ip.toCharArray();
    		char ch2=ch1[ch1.length-3],ch3=ch1[ch1.length-4];
    		ch1[ch1.length-3]=ch3;
    		ch1[ch1.length-4]=ch2;
    		for(Character c:ch1)
    			System.out.print(c);
    		System.out.println("\n"+ip);
    		return ;
    	}
    	System.out.println(ip);
    	
    }
    public static void palindromicString() {
    	String s=ob.next();
    	int res=0;
    	String subsetPrint="";
    	for(int i=0;i<s.length();i++) {
    		for(int j=i+1;j<s.length();j++) {
    			String sub1=s.substring(i,j+1);
    		    String sub2=new StringBuilder(s.substring(i,j+1)).reverse().toString();
    		   	
    		    if(sub1.equals(sub2))
    		   	{
    		    	subsetPrint+=sub1+"\n";
    		    	res++;
    		   	}
    		}
    	}
    	System.out.println(res+s.length());
    	System.out.println("Subsets are :\n"+subsetPrint);
    }
    public static void outputMaximumProduct() {
    	int n=ob.nextInt();
    	int a[]=new int[n];
    	for(int i=0;i<a.length;i++)
    		a[i]=ob.nextInt();
    	if(a.length==3)
    	{
    		System.out.println(a[0]*a[1]*a[2]);
    		return;
    	}
    	else {
    		Arrays.sort(a);
    		System.out.println(a[a.length-1]*a[a.length-2]*a[a.length-3]);
    	  return;
    	}
    }
    public static void  twodArraySort() {
    	int n=ob.nextInt(),m=ob.nextInt();
    	int a[][]=new int[n][m];
    	for(int i=0;i<a[0].length;i++)
    		for(int j=0;j<a.length;j++)
    			a[i][j]=ob.nextInt();
    	for(int i=0;i<a[0].length;i++)
    	{	for(int j=0;j<a.length;j++)
    		System.out.print(a[i][j]+" ");
    	  System.out.println();
    	}
    	System.out.println();
    	for(int i=0;i<a[0].length;i++)
    	{
    		int ele=0;
    		for(int l=0;l<a.length;l++) {
    			ele=a[i][l];
    		 for(int j=0;j<a[0].length;j++) 	
    			for(int k=0;k<a.length;k++)
    			{
    				if(a[i][l]<a[j][k])
    				{
    					int temp=a[i][l];
    					a[i][l]=a[j][k];
    					a[j][k]=temp;
    				}
    					
    			}
    		}
    	}
    	for(int i=0;i<a[0].length;i++)
    	{	for(int j=0;j<a.length;j++)
    		System.out.print(a[i][j]+" ");
    	  System.out.println();
    	}
    }
}
