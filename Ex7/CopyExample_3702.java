class Species {
    String type;
    Species(String type) {
        this.type = type;
    }
}
class Fish7 {
    Species species;
    Fish7(String type) {
        this.species = new Species(type);
    }
    Fish7 shallowCopy() {
        return this;
    }
    Fish7 deepCopy() {
        return new Fish7(new String(this.species.type));
    }
}
public class CopyExample_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Fish7 original = new Fish7("Salmon");
        Fish7 shallowCopy = original.shallowCopy();
        Fish7 deepCopy = original.deepCopy();
        original.species.type = "Shark";
        System.out.println("Original: " + original.species.type);
        System.out.println("Shallow Copy: " + shallowCopy.species.type);
        System.out.println("Deep Copy: " + deepCopy.species.type);
    }
}