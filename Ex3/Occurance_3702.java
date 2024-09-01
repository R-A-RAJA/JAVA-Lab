package Lab.Ex3;
import java.util.Scanner;

class Find{
    int count(int[]a,int n){
        int c=0;
        for(int i=0;i< a.length;i++){
            if (n==a[i]){
                c=c+1;
            }
        }
        return c;
    }
    void occ(int[]b,int[]a){
        for(int i=0;i< a.length;i++){
            System.out.println("Count of "+b[i]+" is: "+count(a,b[i]));
        }
    }
}

public class Occurance_3702 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Name: ATHITHRAJA. R");
        System.out.println("Regno: 2022503702");
        System.out.print("Enter the size of array: ");
        int s=in.nextInt();
        int[] a=new int[s];
        int[] b=new int[s];
        for(int i=0;i<s;i++){
            System.out.print("Enter the "+(i+1)+" element of A: ");
            a[i]=in.nextInt();
            System.out.print("Enter the "+(i+1)+" element of B: ");
            b[i]=in.nextInt();
        }
        Find occurance=new Find();
        //System.out.println("Occurance of element B in B: ");
        //occurance.occ(b,b);
        System.out.println("Occurance of element B in A: ");
        occurance.occ(b,a);
    }
}
