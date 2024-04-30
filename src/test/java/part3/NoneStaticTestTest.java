package part3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoneStaticTestTest {
    @Test
    public void myMethodTest() {
        NoneStaticTest.myMethod(5, 4);
    }
}