class Fish4 {
    void swim() {
        System.out.println("Fish swims");
    }
}
class Salmon3 extends Fish4 {
    @Override
    void swim() {
        System.out.println("Salmon swims upstream");
    }
}
class Shark3 extends Fish4 {
    @Override
    void swim() {
        System.out.println("Shark swims fast");
    }
}
public class Polymorphism_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Fish4 fish1 = new Salmon3();
        Fish4 fish2 = new Shark3();
        fish1.swim();
        fish2.swim();
    }
}