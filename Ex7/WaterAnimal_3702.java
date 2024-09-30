interface Swim {
    void swim();
}
interface Walk {
    void walk();
}
interface Sound {
    void makeSound();
}
class Duck implements Swim, Walk, Sound {
    @Override
    public void swim() {
        System.out.println("The duck is swimming.");
    }
    @Override
    public void walk() {
        System.out.println("The duck is walking.");
    }
    @Override
    public void makeSound() {
        System.out.println("The duck quacks.");
    }
}
class Fish10 implements Swim, Sound {
    @Override
    public void swim() {
        System.out.println("The fish is swimming.");
    }
    @Override
    public void makeSound() {
        System.out.println("The fish makes a bubbling sound.");
    }
}
public class WaterAnimal_3702 {
    public static void main(String[] args) {
        System.out.println("Name: Athithraja. R\nReg.no : 2022503702\n");
        Duck duck = new Duck();
        System.out.println("Duck:");
        duck.swim();
        duck.walk();
        duck.makeSound();
        Fish10 fish = new Fish10();
        System.out.println("\nFish:");
        fish.swim();
        fish.makeSound();
    }
}