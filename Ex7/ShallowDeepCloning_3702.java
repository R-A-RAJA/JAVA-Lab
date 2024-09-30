class Fish8 implements Cloneable {
    String species;
    Habitat habitat;
    Fish8(String species, String waterType) {
        this.species = species;
        this.habitat = new Habitat(waterType);
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    protected Fish8 deepClone() throws CloneNotSupportedException {
        Fish8 clonedFish = (Fish8) super.clone();
        clonedFish.habitat = new Habitat(this.habitat.waterType);
        return clonedFish;
    }
    void showDetails() {
        System.out.println("Species: " + species + ", Habitat: " + habitat.waterType);
    }
}
class Habitat {
    String waterType;
    Habitat(String waterType) {
        this.waterType = waterType;
    }
}
public class ShallowDeepCloning_3702 {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Fish8 fish1 = new Fish8("Salmon", "Freshwater");
        Fish8 shallowClone = (Fish8) fish1.clone();
        Fish8 deepClone = fish1.deepClone();
        System.out.println("\nBefore modification:");
        fish1.showDetails();
        shallowClone.showDetails();
        deepClone.showDetails();
        fish1.habitat.waterType = "Saltwater";
        System.out.println("\nAfter modification:");
        fish1.showDetails();
        shallowClone.showDetails();
        deepClone.showDetails();
    }
}
