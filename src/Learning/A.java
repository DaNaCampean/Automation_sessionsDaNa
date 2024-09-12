package Learning;

// ClassA.java
public class A {


    public static void main(String[] args) {
       // A classA = new A();
       // classA.useClassB();
        System.out.println("MAIN A");
        B classB = new B();
        classB.printMessage();


    }

    public void useClassB() {
        B classB = new B();
        classB.printMessage();
        System.out.println("You are in ClassA");
    }


}



