package part3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class PersonTest {
    Person p = new Person("Kim", 20, "Busan");
    //NOTE: p는 Person을 가리키는 참조 변수!
    //NOTE: 객체(인스턴스)는 Heap Memory에 저장된다.
    @Test
    void play() {
        assertThat(p.play())
                .isEqualTo("운동을 한다!");
    }

    @Test
    void eat() {
        assertThat(p.eat())
                .isEqualTo("음식을 먹다");
    }

    @Test
    void walk() {
        assertThat(p.walk())
                .isEqualTo("걷다!");
    }

    @Test
    void nameTest() {
        assertThat(p.name).isEqualTo("Kim");
    }

    @Test
    void ageTest() {
        assertThat(p.age).isEqualTo(20);
    }

    @Test
    void addrTest() {
        assertThat(p.phone).isEqualTo("Busan");
    }
}