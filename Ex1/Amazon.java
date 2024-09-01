import java.util.Scanner;
class Amazon{
	public static void main(String arg[]){

		Scanner input =new Scanner(System.in);
		System.out.print("Enter no. of product:  ");
		int size=input.nextInt();
		int a[]=new int[size];
		String b[]=new String[size];

		for (int i=0;i<size;i++){
			input.nextLine();
			System.out.print("Enter name of product "+(i+1)+" : ");
			b[i]=input.nextLine();
			System.out.print("Enter the price of product "+(i+1)+" : ");
			a[i]=input.nextInt();
			
		}
		System.out.println();
		System.out.println("Final Product Details:");


		for (int i=0;i<size;i++){
			System.out.println((i+1)+". Product Name: "+b[i]+", Product Price: "+a[i]);

		}
	}
}
