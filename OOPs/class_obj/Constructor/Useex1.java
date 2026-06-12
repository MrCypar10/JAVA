
class ex1 {

    public ex1() {
        System.out.println("Constructor Called....");
    }
}

class Useex1 {

    public static void main(String[] args) {
        ex1 s1 = new ex1();
        ex1 s2 = new ex1();
        ex1 s3 = new ex1();
    }
}


// Default Constructor Works Without Actually Calling it.
