package part3;

public class StaticTest {
    public static void myMethod() {
        int a = 5;
        int b = 4;
        int hap = hap(a, b);
        System.out.println("hap = " + hap);
    }

    public static int hap(int a, int b) {
        return a + b;
    }
}
