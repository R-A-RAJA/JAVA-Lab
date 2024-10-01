package Try_Catch;

import java.security.spec.RSAOtherPrimeInfo;

public class Try_Catch_b_3702 {
    public static void main(String args[]){
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
