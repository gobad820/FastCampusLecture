package part3;

// NOTE: 객체 = 상태정보 + 행위정보
// NOTE: 객체는 4바이트에 할당된다!
public class Person {
    public String name;
    public int age;
    public String phone;

    public String play() {
        return "운동을 한다!";
    }

    public String eat() {
        return "음식을 먹다";
    }

    public String walk() {
        return "걷다!";
    }
}
