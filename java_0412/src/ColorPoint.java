public class ColorPoint extends Point {

    public String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    void setPoint(int x, int y) {

    }

    void setColor(String color) {
        this.color = color;
    }

    void show() {
        System.out.println(color + "색으로" + "(" + x +"," + y + ")");
    }
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setPoint(10, 20);
        cp.setColor("GREEN");
        cp.show();
    }
}
