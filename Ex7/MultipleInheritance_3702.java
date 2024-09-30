interface Fish3 {
    void swim();
}
interface Predator {
    void hunt();
}
class Shark1 implements Fish3, Predator {
    public void swim() {
        System.out.println("Shark swims");
    }
    public void hunt() {
        System.out.println("Shark hunts");
    }
}
public class MultipleInheritance_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Shark1 shark = new Shark1();
        shark.swim();
        shark.hunt();
    }
}
