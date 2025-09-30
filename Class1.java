class Class1 {
    Class1() {
        System.out.println("Object created");
    }

    protected void finalize() {
        System.out.println("finalize() method called before object is destroyed");
    }
}

public class FinalizeDemo {
    static int add(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum = sum + n;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Finalize demo
        Class1 obj = new Class1();
        obj = null;
        System.gc(); // Suggest garbage collection to call finalize()

        // VarArgs demo
        System.out.println("Sum of 2 numbers: " + add(10, 0));
        System.out.println("Sum of 3 numbers: " + add(5, 15, 25));
        System.out.println("Sum of 5 numbers: " + add(1, 2, 3, 4, 5));
        System.out.println("Sum with no numbers: " + add());
    }
}
