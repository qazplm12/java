public class NamedCircle extends Circle{

    String circle;

    public NamedCircle(int radius, String circle) {
        super(radius);
        this.circle = circle;

    }
    void show() {
        System.out.println(circle + ", 반지름 = " + getRadius());
    }

}



