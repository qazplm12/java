// 부모 클래스인 People 클래스를 상속받아 People 클래스가 가지고 있는 멤버인 필드 name, ssn을 Student 클래스에서 사용할 수 있음
public class People {
    public String name;
    public String ssn;

    // 부모 클래스인 People의 생성자
    // 자식 클래스의 생성자에서 super() 사용 시 호출되는 생성자

    public People(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
