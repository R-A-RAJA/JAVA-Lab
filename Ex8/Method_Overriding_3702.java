class BaseClass {
    public void uncheckedMethod() {
        throw new ArithmeticException("Base class: Unchecked exception (ArithmeticException)");
    }
    public void checkedMethod() throws Exception {
        throw new Exception("Base class: Checked exception (Exception)");
    }
}
class DerivedClass extends BaseClass {
    @Override
    public void uncheckedMethod() {
        throw new ArithmeticException("Derived class: Unchecked exception (ArithmeticException)");
    }
    @Override
    public void checkedMethod() throws Exception {
        throw new Exception("Derived class: Checked exception (Exception)");
    }
}
public class Method_Overriding_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        BaseClass base = new DerivedClass();
        try {
            base.uncheckedMethod();
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
        try {
            base.checkedMethod();
        } catch (Exception e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
    }
}
