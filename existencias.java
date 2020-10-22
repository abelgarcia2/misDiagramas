import java.util.Scanner;

public class existencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double altura;
		double base;
		double area;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce la altura: ");
		altura=sc.nextDouble();
		System.out.println("Introduce la base: ");
		base=sc.nextDouble();
		
		area=(base*altura)/2;
		
		System.out.println("El area del triángulo es: "+area);
		sc.close();
	}

}
