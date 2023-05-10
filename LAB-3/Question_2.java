interface Testable {
    void display();
}

class Test implements Testable {
    public void display() {
        System.out.println("Displaying Test");
    }
}

abstract class AbsTest implements Testable {
     
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();  
    }
}
