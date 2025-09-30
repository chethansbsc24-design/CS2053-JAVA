package pack1;

public class Base {
    public int pub = 1;
    protected int prot = 2;
    int def = 3;              // default
    private int priv = 4;

    // Within Same Class (all ✅)
    public void show() {
        System.out.println("Inside Base class:"); // ✅
        System.out.println("Public: " + pub);     // ✅
        System.out.println("Protected: " + prot); // ✅
        System.out.println("Default: " + def);    // ✅
        System.out.println("Private: " + priv);   // ✅
    }
}