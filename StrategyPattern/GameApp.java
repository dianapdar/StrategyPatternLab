package StrategyPattern;
public class GameApp {
    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.attack();
        knight.setDefenseStrategy(new Shield());
        knight.defend();
        knight.setDefenseStrategy(new Dodge());
        knight.defend();
        knight.setDefenseStrategy(new CreateMagicBarrier());
        knight.defend();

        Wizard wizard = new Wizard();
        wizard.attack();
        wizard.defend();

        Archer archer = new Archer();
        archer.attack();
        archer.defend();
    }
}
