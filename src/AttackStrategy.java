interface AttackStrategy {
    void attack();
}

class MeleeAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Performing melee attack!");
    }
}

class RangedAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Performing ranged attack!");
    }
}

class Enemy {
    private AttackStrategy attackStrategy;

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }
}

public class Game {
    public static void main(String[] args) {
        Enemy enemy = new Enemy();

        enemy.setAttackStrategy(new MeleeAttack());
        enemy.performAttack(); // Performing melee attack!

        enemy.setAttackStrategy(new RangedAttack());
        enemy.performAttack(); // Performing ranged attack!
    }
}
