public class Car3Ex {
    public static void main(String[] args) {
        // 컴파일러가 자동으로 기본 생성자를 생성하기 때문에 기본 생성자를 이용하여 객체를 생성
        Car3 c1 = new Car3();
        System.out.println(c1.company);
        System.out.println(c1.type);
        System.out.println(c1.model);
        System.out.println(c1.price);


        // 매개변수가 있는 생성자, 사용자가 직접 만들어야 함
        // 객체 생성 시 매개변수로 받은 데이터를 기반으로 필드를 초기화 함
        Car3 c2 = new Car3("르노자동차", "세단", "SM6", "밝은 회색", 2850);
        System.out.println(c2.company);
        System.out.println(c2.type);
        System.out.println(c2.model);
        System.out.println(c2.color);
        System.out.println(c2.price);
    }
}
