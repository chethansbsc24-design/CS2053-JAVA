package P1;

public class A {
    public int pub=10;
    int def = 30; 
    protected int prot = 20;
    private int priv = 40;

    public void show() {
        System.out.println("Public: " + pub);
        System.out.println("Default: " + def);
        System.out.println("Protected: " + prot);
        System.out.println("Private: " + priv);
        System.out.println("Class A inside package P1");
     
    }
} 