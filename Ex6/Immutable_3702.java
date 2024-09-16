final class Immutable_class{
    final String name;
    final int age;
    Immutable_class(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private static class SingletonHelper {
        public static final Immutable_class INSTANCE = new Immutable_class("ATHITHRAJA.R", 20);
    }
    public static Immutable_class getInstance() {
        return SingletonHelper.INSTANCE;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

final class Immutable_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA.R\nRegno: 2022503702");
        Immutable_class person = Immutable_class.getInstance();
        System.out.println("\nName: " + person.getName());
        System.out.println("Age: " + person.getAge());
        //person.age = 21;
    }
}