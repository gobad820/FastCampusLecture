package part3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person();
    @Test
    void play() {
        assertThat(person.play())
                .isEqualTo("운동을 한다!");
    }

    @Test
    void eat() {
        assertThat(person.eat())
                .isEqualTo("음식을 먹다");
    }

    @Test
    void walk() {
        assertThat(person.walk())
                .isEqualTo("걷다!");
    }
}