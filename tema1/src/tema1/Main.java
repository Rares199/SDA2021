package tema1;
import java.util.*;
public class Main {
	public static Scanner x;
	public static void main (String[]args) {
		int m , n ;
		x=new Scanner (System.in);
		System.out.println("Primul nr:");
	    m=x.nextInt();
	    System.out.println("Al doilea nr:");
	    n=x.nextInt();
	    int sum ; 
	    int dif;
	    int max ; 
	    int min ;
	    sum = m+n;
	    dif = m-n;
	    System.out.println("Suma este:" + sum);
	    System.out.println("Diferenta este:"+dif);
		int distance ;
		if (m>n) {
			distance = m-n;
			max = m;
			min = n;
			
		}
		else {
			distance = n-m ;
			max = n;
			min = m;
		}
			
		System.out.println("Distanta este:"+distance);
		System.out.println("Maximul este:"+max);
		System.out.println("Minimul este:"+min);
		
	   double average ; 
	   average = (double)(n+m)/2;
	   System.out.println("Media este:"+average);
	   
		
		
	}

	}


