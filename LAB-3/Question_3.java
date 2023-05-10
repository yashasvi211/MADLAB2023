interface SwimBehavior {
    void swim();
}

interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}

class Swim implements SwimBehavior {
    public void swim() {
        System.out.println("I am swimming");
    }
}

class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}

class RubberDuck {
    private SwimBehavior swimBehavior;
    private QuackBehavior quackBehavior;

    public RubberDuck() {
        swimBehavior = () -> System.out.println("I am swimming");
        quackBehavior = () -> System.out.println("Quack! Quack!");
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}

class WoodenDuck {
    private SwimBehavior swimBehavior;

    public WoodenDuck() {
        swimBehavior = () -> System.out.println("I am swimming");
    }

    public void performSwim() {
        swimBehavior.swim();
    }
}

class RedHeadDuck {
    private SwimBehavior swimBehavior;
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public RedHeadDuck() {
        swimBehavior = () -> System.out.println("I am swimming");
        flyBehavior = () -> System.out.println("I am flying");
        quackBehavior = () -> System.out.println("Quack! Quack!");
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}

class LakeDuck {
    private SwimBehavior swimBehavior;
    private QuackBehavior quackBehavior;

    public LakeDuck() {
        swimBehavior = () -> System.out.println("I am swimming");
        quackBehavior = () -> System.out.println("Quack! Quack!");
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}

public class Main {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.performSwim();
        rubberDuck.performQuack();

        WoodenDuck woodenDuck = new WoodenDuck();
        woodenDuck.performSwim();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.performSwim();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        LakeDuck lakeDuck = new LakeDuck();
        lakeDuck.performSwim();
        lakeDuck.performQuack();
    }
}
