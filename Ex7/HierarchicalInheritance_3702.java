class Fish2 {
    void swim() {
        System.out.println("Fish swims");
    }
}
class Salmon2 extends Fish {
    void leap() {
        System.out.println("Salmon leaps");
    }
}
class Shark extends Fish {
    void hunt() {
        System.out.println("Shark hunts");
    }
}
public class HierarchicalInheritance_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Salmon2 salmon = new Salmon2();
        salmon.swim();
        salmon.leap();
        Shark shark = new Shark();
        shark.swim();
        shark.hunt();
    }
}
