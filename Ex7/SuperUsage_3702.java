class Fish5 {
    String species;
    Fish5(String species) {
        this.species = species;
    }
    void swim() {
        System.out.println(species + " swims");
    }
}
class Salmon5 extends Fish5 {
    String habitat;
    Salmon5(String species, String habitat) {
        super(species);
        this.habitat = habitat;
    }
    @Override
    void swim() {
        System.out.println(species + " swims in " + habitat);
    }
}
public class SuperUsage_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Salmon5 salmon = new Salmon5("Salmon", "freshwater");
        salmon.swim();
    }
}
