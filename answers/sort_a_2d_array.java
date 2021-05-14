import java.util.*;
public class sort_a_2d_array {
static Scanner ob=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=ob.nextInt(),m=ob.nextInt();
    	int a[][]=new int[n][m];
    	
    	for(int i=0;i<a[0].length;i++)
    		for(int j=0;j<a.length;j++)
    			a[i][j]=ob.nextInt();
    	char ans=' ';
        do {
        	System.out.println("In which order do u want to sort ?");
        	System.out.println("1. Ascending \n2. Decending");
            char ch=ob.next().charAt(0);
        switch(ch) {
        case '1':
    	twodArraySort(a);
    	break;
        case '2':
        	twodArrayDecendingSort(a);
        	break;
        default:
        	System.out.println("Please select a valid option");
        }
         System.out.println("Do u want to continue ?(y/n)");
         ans=ob.next().charAt(0);
        }while(ans=='y'||ans=='Y');
	}
	public static void  twodArraySort(int a[][]) {
    	
    	for(int i=0;i<a[0].length;i++)
    	{	for(int j=0;j<a.length;j++)
    		System.out.print(a[i][j]+" ");
    	  System.out.println();
    	}
    	System.out.println();
    	for(int i=0;i<a[0].length;i++)
    		for(int l=0;l<a.length;l++) 
    		 for(int j=0;j<a[0].length;j++) 	
    			for(int k=0;k<a.length;k++)
    				if(a[i][l]<a[j][k])
    				{
    					int temp=a[i][l];
    					a[i][l]=a[j][k];
    					a[j][k]=temp;
    				}
    					
    	System.out.println("Ascending order sorting");
    	for(int i=0;i<a[0].length;i++)
    	{	for(int j=0;j<a.length;j++)
    		System.out.print(a[i][j]+" ");
    	  System.out.println();
    	}
    }
	public static void twodArrayDecendingSort(int a[][]) {

    	for(int i=0;i<a[0].length;i++)
    	{	for(int j=0;j<a.length;j++)
    		System.out.print(a[i][j]+" ");
    	  System.out.println();
    	}
    	System.out.println();
    	for(int i=0;i<a[0].length;i++)
    		for(int l=0;l<a.length;l++) 
    		 for(int j=0;j<a[0].length;j++) 	
    			for(int k=0;k<a.length;k++)
    				if(a[i][l]>a[j][k])
    				{
    					int temp=a[i][l];
    					a[i][l]=a[j][k];
    					a[j][k]=temp;
    				}
    					
    	System.out.println("Decending order Sorting");
    	for(int i=0;i<a[0].length;i++)
    	{	for(int j=0;j<a.length;j++)
    		System.out.print(a[i][j]+" ");
    	  System.out.println();
    	}
		
	}
}
