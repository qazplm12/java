public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1; // 상수 static > 객체 만들지 않고 클래스명으로 접근
    public static final int SUPERSONIC = 2; // 상수

    public int flyMode = NORMAL; // 필드

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행 합니다.");
        } else {
            // 부모(객체)의 메소드 실행
            super.fly();
        }
    }
}
