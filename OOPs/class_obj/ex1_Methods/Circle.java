
public class Circle {

    private int radius;

    public void setRadius(int r) {
        radius = r;
    }

    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area iof Circle is :" + area);
    }

    public void calculateCircum() {
        double circum = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle is :" + circum);
    }
}
