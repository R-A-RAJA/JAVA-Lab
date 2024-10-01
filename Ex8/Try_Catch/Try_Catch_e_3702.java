package Try_Catch;

public class Try_Catch_e_3702 {
    public static void main(String args[]){
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        try{
            try{
                Object a[] = new Integer[10];
                a[0] = 2.3;
            }
            catch (ArithmeticException e){
                System.out.println("Inner catch- Error: "+e);
            }
        }
        catch(Exception e){
            System.out.println("Outer catch- Error: "+e);
        }
    }
}
