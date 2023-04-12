public class Car {
    String model;
    int speed;

    public Car(String model) {
        this.model = model;
    }

    public void SetSpeed(int speed) {
        this.speed = speed;
    }

    public void run() {
        for (int i = 10; i <= 50; i += 10) {
            this.SetSpeed(i);
            System.out.println(this.model + "가 달립니다.( 시속 : " + this.speed + "km)/h" );
        }
    }
}
