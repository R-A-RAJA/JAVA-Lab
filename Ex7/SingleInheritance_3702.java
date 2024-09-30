class Fish {
    void swim() {
        System.out.println("Fish swims");
    }
}

class Salmon extends Fish {
    void leap() {
        System.out.println("Salmon leaps");
    }
}

public class SingleInheritance_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Salmon salmon = new Salmon();
        salmon.swim();
        salmon.leap();
    }
}