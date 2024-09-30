class Fish6 {
    Fish6() {
        System.out.println("Fish constructor");
    }
}
class Salmon6 extends Fish6 {
    Salmon6() {
        super();
        System.out.println("Salmon constructor");
    }
}
public class ConstructorInheritance_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Salmon6 salmon = new Salmon6();
    }
}
