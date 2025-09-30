public class VarArgs{
static int add(int... numbers) {
int sum = 0;
for (int n : numbers)
{
sum = sum+n;
}
return sum;
}

public static void main(String args[]) {
System.out.println("Sum of 2 numbers: " + add(10, 20));
System.out.println("Sum of 3 numbers: " + add(5, 15, 25));
System.out.println("Sum of 5 numbers: " + add(1, 2, 3, 4, 5));
System.out.println("Sum with no numbers: " + add());
}
}