package Try_Catch;

public class Try_Catch_c_3702 {
    public static void main(String args[]){
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("Error: "+e+"\n");
        }
        finally {
            System.out.println("Execute Finally!");
        }
    }
}
