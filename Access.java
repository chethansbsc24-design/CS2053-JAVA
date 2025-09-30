class DemoAccess {
    public int pub = 10;
    protected int prot = 20;
    int def = 30;          // default access
    private int priv = 40;

    public void display() {
        System.out.println("Public: " + pub);
        System.out.println("Protected: " + prot);
        System.out.println("Default: " + def);
        System.out.println("Private: " + priv);
    }
}

public class Access {
    public static void main(String[] args) {
        DemoAccess obj = new DemoAccess();
        obj.display();

        System.out.println("Public: " + obj.pub);
        //System.out.println("Protected: " + prot);
        //System.out.println("Default: " + def);
        //System.out.println("Private: " + priv);
        
    }
}
