// Same Package (Non-Subclass)
package pack1;

public class SamePackageDemo {
    public static void main(String[] args) {
        Base b = new Base();
        b.show();
        System.out.println(b.pub);   // ✅ public
        System.out.println(b.prot);  // ✅ protected
        System.out.println(b.def);   // ✅ default
        //System.out.println(b.priv); // ❌ private (not accessible)
    }
}