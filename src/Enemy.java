abstract class Enemy {
    public abstract void attack();
}

class Goblin extends Enemy {
    @Override
    public void attack() {
        System.out.println("Goblin attacks!");
    }
}

class Troll extends Enemy {
    @Override
    public void attack() {
        System.out.println("Troll attacks!");
    }
}

abstract class EnemyFactory {
    public abstract Enemy createEnemy();
}

class GoblinFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Goblin();
    }
}

class TrollFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Troll();
    }
}
