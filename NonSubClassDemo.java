// Non-Subclass in Different Package
package pack2;

import pack1.Base;

public class NonSubClassDemo {
    public static void main(String[] args) {
        Base b = new Base();
        System.out.println(b.pub);   // ✅ public
        // System.out.println(b.prot);  // ❌ protected (not subclass)
        // System.out.println(b.def);   // ❌ default (different package)
        // System.out.println(b.priv);  // ❌ private
    }
}