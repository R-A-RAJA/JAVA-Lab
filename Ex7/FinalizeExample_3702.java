class Fish9 {
    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Fish object is being finalized");
        } finally {
            super.finalize();
        }
    }
    void swim() {
        System.out.println("Fish swims");
    }
}
public class FinalizeExample_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Fish9 fish = new Fish9();
        fish.swim();
        fish = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of main method.");
    }
}
