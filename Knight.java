class Knight {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Knight() {
        attackStrategy = new SwingSword();
        defenseStrategy = new Shield();
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefense() {
        defenseStrategy.defend();
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }
}

class Wizard {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Wizard() {
        attackStrategy = new CastSpell();
        defenseStrategy = new CreateMagicBarrier();
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefense() {
        defenseStrategy.defend();
    }
}

class Archer {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Archer() {
        attackStrategy = new ShootArrow();
        defenseStrategy = new Dodge();
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefense() {
        defenseStrategy.defend();
    }
}
