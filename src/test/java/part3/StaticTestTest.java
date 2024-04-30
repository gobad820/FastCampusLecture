package part3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class StaticTestTest {

    @Test
    @DisplayName("스태틱 메소드 테스트")
    void myMethod() {
        int hap = StaticTest.hap(1, 5);
        assertThat(hap)
                .isEqualTo(6);
    }
}