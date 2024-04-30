package part3;

public class NoneStaticTest {
    public static void myMethod(int a, int b) {
        NoneStaticTest noneStaticTest = new NoneStaticTest();
        int sum = noneStaticTest.hap(a, b);
        System.out.println("sum = " + sum);
    }

    public int hap(int a, int b) {
        return a + b;
    }
}
