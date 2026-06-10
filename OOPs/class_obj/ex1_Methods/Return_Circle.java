//ENTITY CLASS

//========================
public class Return_Circle {

    private int radius;

    public void setRadius(int r) {
        radius = r;
    }

    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double calculateCircum() {
        double circum = 2 * Math.PI * radius;
        return circum;
    }
}
