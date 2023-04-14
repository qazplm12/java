// 인터페이스는 다중 상속을 지원함
// implements 뒤에 여러개의 인터페이스를 추가하여 다중 상속 받을 수 있음
// 다중 상속 시 상속 받은 모든 추상 메소드를 오버라이딩을 통해서 구현해야 함
public class SmartTelevisionEx {
    public static void main(String[] args) {
        // 인터페이스 RemoteControl, Searchable를 다중 상속 받은 클래스
        // SmartTelevisio 타입의 변수 stv를 선언과 동시에 객체를 생성

        SmartTelevision stv = new SmartTelevision();

        // RemoteControl의 멤버와 Searchable의 멤버를 모두 사용할 수 있음
        stv.turnOn();
        stv.setVolume(50);
        stv.setVolume(5);
        stv.setMute(true);
        stv.setMute(false);
        stv.search("ps vr2");
        stv.turnOff();

        RemoteControl irc = null;
        Searchable is = null;

        irc = stv;
        irc.turnOn();
        irc.setVolume(-100);
        irc.setMute(true);
        // irc는 RemoteControl 인터페이스의 타입의 변수이므로 RemoteControl의 멤버만 사용할 수 있음
//        irc.search("ps vr2"); // 오류 발생
        irc.turnOff();

        is = stv;
        is.search("ps vr2");
        // is는 Searchable 인터페이스 타입의 변수이므로 인터페이스 Searchable의 멤버만 사용할 수 있음
//        is.turnOn();
    }
}
