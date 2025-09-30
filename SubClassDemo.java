// Subclass in Different Package

package pack2;

import pack1.Base;

public class SubClassDemo extends Base {
    public static void main(String[] args) {
        SubClassDemo obj = new SubClassDemo();
        System.out.println(obj.pub);   // ✅ public
        System.out.println(obj.prot);  // ✅ protected (through inheritance)
        // System.out.println(obj.def);   // ❌ default (different package)
        // System.out.println(obj.priv);  // ❌ private
    }
}
