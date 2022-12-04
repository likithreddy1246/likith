import java.util.Scanner;
public class Array{
	
	public static void main(String args[]) {
		int i,size,oddsum=0;
		System.out.println("enter the integer");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter size"+size+"of array");
		for(i=0;i<size;i++) {
			a[i]=sc.nextInt();
			
		}
		for(i=0;i<size;i++) {
			if (a[i]%2!=0) {
			oddsum=oddsum+a[i];	
			}
		}
		System.out.println(oddsum);
		
		
	}
				
		
		
		
		
		
		
	}    