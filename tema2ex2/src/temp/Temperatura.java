package temp;
import java.util.Scanner;

public class Temperatura {
	public static Scanner x ; 
	public static void main (String[]args) {
		x=new Scanner (System.in);
		System.out.println("Numarul pacientilor");
		int n = x.nextInt();
		int i;
		double []v=new double[n];
		for (i=0;i<n;i++) {
		System.out.println("V["+i+"]");
		v[i]=x.nextDouble();
		}	
		System.out.print("Temperaturi normale:");
        for( i=0;i<n;i++)
        {
            if(v[i]<37)
                 System.out.print( "("+v[i] +"," +i + ")" + " , ");
        }
        System.out.println();
        System.out.print("Temperaturi anormale: ");

        for( i=0;i<n;i++)
        {
            if(v[i]>=37)
                 System.out.print( "("+v[i] +"," +i + ")" + " , ");
	}  
		   
}
}

