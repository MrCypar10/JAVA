
class Child extends Parent {

    public static void show() {
        System.out.println(" Child's Show :");
    }

    public void display() {
        System.out.println("Child's Display :");
    }
}

class UseChild {

    public static void main(String[] args) {

        Parent p1;

        p1 = new Parent();
        p1.show();
        p1.display();

        p1 = new Child();
        p1.show();
        p1.display();
    }
}
