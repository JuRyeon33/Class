//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class Person {
    String name;
    int age;
    String MBTI;

    public void sayHello() {
        System.out.println("안녕하세요? 저는 " + name + "입니다. 제 나이는 " + age + "살 입니다.");
        System.out.println("제 MBTI는 " + MBTI + "입니다.");
    }

    public void work() {
        System.out.println("일 하는 중...");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "소주련";
        person.age = 26;
        person.MBTI = "ISFJ";

        person.sayHello();
        person.work();
    }
}