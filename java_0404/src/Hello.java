public class Hello {
//    메소드( 자바스크립트의 함수와 동일한 기능을 가지고 있음)
//    클래스의 멤버인 함수를 메소드라고 함
//    클래스의 멤버가 아닐 경우 함수라고 함

//    클래스 작성 규칙
//    1. 클래싀의 이름은 해당 클래스의 파일명
//    2. 하나의 파일에 하나의 클래스 작성
//    3. 클래스 이름은 첫글자는 대문자, 나머지는 소문자
//    4. 두개 이상의 단어로 이름을 정할경우 각 단어의 첫글자는 대문자, 나머지는 소문자
//    5. 파일명과 동일한 클래스에만 public을 선언 가능 public 선언 시 다른 클래스에서 접근 가능


//    식별자 이름 규칙
//    1. 영어사용
//    2. 대소문자 구분
//    3. 특수문자 사용불가( _ , $ 제외)
//    4. 숫자사용가능 (2번째 이후로 사용가능)
//    5. 자바 예약어 사용불가
//    6. 첫단어는 모두 소문자 두번째 이후는 첫글자 대문자, 나머지는 소문자(클래스는 첫글자 무조건 대문자)

    public static int sum(int n, int m) {
        return n + m;
    }

//    자바 프로그램의 시작점(main())

//    public static void로 선언
//    String[] args는 실행옵션
    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i,10);
        a = '?';


        //  모니터에 출력
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}
// 자바의데이터 타입
// 기본타입

// - 논리형 -
// boolean - 1bit (true, false)

// - 정수형 -
// (문자표현용)
// char - 2byte
// (숫자표현용)
// byte - 1byte
// short - 2byte
// int - 기본타입 4byte
// long - 8byte

// - 실수형- 소수점이 있는 숫자 데이터 타입, 음수, 양수
// float - 4byte, 선언시 값의 맨 뒤에 F 붙임
// double - 8byte

// 래퍼런스 타입 : 1개이며 용도는 3가지
// class
// interface
// array

// 기본타입(데이터 자체를 저장)
// 참조타입(데이터가 존재하는 메모리주소 저장)