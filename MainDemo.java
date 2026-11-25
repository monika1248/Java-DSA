class Demo {
    int num;

    Demo() {
        this(100);
        System.out.println("Default constructor");
    }

    Demo(int n) {
        num = n;
        System.out.println("Parameterized constructor");
    }
}

public class MainDemo {
    public static void main(String args[]) {
        Demo obj = new Demo();
    }
}