# StrategyLabAssignmnent
### Problem scenario:

Suppose we have three types of characters in a GameApp:

1. Knight: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
2. Wizard: Casts spells; uses magic barrier to defend
3. Archer: Shoots arrows; uses dodge to to defend

Implement two types of Strategy:
     
A. DefenseStrategy
1. Shield
2. Dodge
3. CreateMagic
   
B. AttackStrategy
1. CastSpell
2. ShootArrow
3. SwingSword

Refactor the existing codes and provide the UML Diagram:
<pre lang="markdown"> ```java
	
public class Character {
    private String type;

    public Character(String type) {
        this.type = type;
    }

    public void attack() {
        if (type.equals("Knight")) {
            System.out.println("Knight attacks with a sword!");
        } else if (type.equals("Wizard")) {
            System.out.println("Wizard casts a spell!");
        } else if (type.equals("Archer")) {
            System.out.println("Archer shoots an arrow!");
        }
    }

    public void defend() {
        if (type.equals("Knight")) {
            System.out.println("Using a shield to defend!");
	System.out.println("Dodgin to avoid attack!");
            System.out.println("Creating a magic barrier for defense!"");		

        } else if (type.equals("Wizard")) {
            System.out.println("Creating a magic barrier for defense!"");
        } else if (type.equals("Archer")) {
            System.out.println("Using a shield to defend!"");
        }
    }
}
	``` </pre>

### UML Class Diagram

![Screenshot 2025-05-26 082459](https://github.com/user-attachments/assets/053ac27c-442e-42b0-be51-e673c5b948f9)
