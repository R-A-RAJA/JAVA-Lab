class CheckedException1 extends Exception {
    public CheckedException1(String message) {
        super(message);
    }
}
class ExceptionHandling {
    public void exceptionMethod(int value) throws CheckedException1 {
        if (value < 0) {
            throw new CheckedException1("Checked Exception: Value cannot be negative.");
        }
        System.out.println("Checked exception method executed with value: " + value);
    }
    public void exceptionMethod(String input) {
        if (input == null) {
            throw new NullPointerException("Unchecked Exception: Input cannot be null.");
        }
        System.out.println("Unchecked exception method executed with input: " + input);
    }
}
public class Method_Overloading_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        ExceptionHandling obj = new ExceptionHandling();
        try {
            obj.exceptionMethod(-5);
        } catch (CheckedException1 e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
        try {
            obj.exceptionMethod(null);
        } catch (NullPointerException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}