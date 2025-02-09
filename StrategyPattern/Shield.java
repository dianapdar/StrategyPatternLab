package StrategyPattern;
public class Shield implements DefenseStrategy {
    public void defend() {
        System.out.println("Uses a Shield to defend!");
    }
}

class Dodge implements DefenseStrategy {
    public void defend() {
        System.out.println("Use a Dodge to defend!");
    }
}

class CreateMagicBarrier implements DefenseStrategy {
    public void defend() {
        System.out.println("Uses a magic barrier for defense!");
    }
}
