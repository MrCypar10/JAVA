
interface shape{
    double area();
    String name();

}

class circle implements shape{
    private int radius;

    public circle(int radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }

    public String name (){
        return "Circle";

    }
}

class Rectangle implements shape{
    private int l,b;

    public Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }

    public double area(){
        return l*b;
    }

    public String name(){
        return "Rectangle";
    }
}
public class UseShape{
    public static void main(String[] args) {
        shape s;
        s = new circle(5);
        System.out.println("Shape is : "+s.name());
        System.out.println("Area is : "+s.area());


        s = new Rectangle(5, 3);
        System.out.println("Shape is : "+s.name());
        System.out.println("Area is : "+s.area());


    }
}