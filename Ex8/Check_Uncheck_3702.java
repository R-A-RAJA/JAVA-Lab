class CheckedException extends Exception {
    public CheckedException(String message) {
        super(message);
    }
}
class ExceptionPropagation {
    public void checkedExceptionMethod() throws CheckedException {
        throw new CheckedException("This is a custom checked exception!");
    }
    public void uncheckedExceptionMethod() {
        throw new ArithmeticException("This is an unchecked ArithmeticException!");
    }
    public void propagateCheckedException() throws CheckedException {
        checkedExceptionMethod();
    }
    public void propagateUncheckedException() {
        uncheckedExceptionMethod();
    }
}
public class Check_Uncheck_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        ExceptionPropagation obj = new ExceptionPropagation();
        try {
            obj.propagateCheckedException();
        } catch (CheckedException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
        try {
            obj.propagateUncheckedException();
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}