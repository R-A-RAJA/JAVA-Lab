class Fish1 {
    void swim() {
        System.out.println("Fish swims");
    }
}
class FreshwaterFish extends Fish1 {
    void type() {
        System.out.println("Freshwater Fish");
    }
}
class Salmon1 extends FreshwaterFish {
    void leap() {
        System.out.println("Salmon leaps");
    }
}
public class MultilevelInheritance_3702{
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Salmon1 salmon = new Salmon1();
        salmon.swim();
        salmon.type();
        salmon.leap();
    }
}