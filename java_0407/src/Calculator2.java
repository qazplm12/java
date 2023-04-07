public class Calculator2 {
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        // plus()메소드는 동일한 클래스의 멤버이므로 이름으로만 호출이 가능
        // 자동 타입 변환에 의해서 plus() 메소드의 반환값이 double 타입의 변수 sum에 저장됨
        double result = sum / 2;
        // 큰 데이터 타입과 작은 데이터 타입을 연산 시 큰 데이터 타입으로 자동 타입 변환이 발생함
        return result;
    }

    void execute() {
        // avg() 메소드를 직접 호출해서 사용
        // 동일한 클래스의 멤버이므로 메소드의 이름으로만 호출이 가능
        double result = avg(7, 10);
        println("실행결과 :" + result);
    }

    void println(String message) {
        System.out.println(message);
    }
}
