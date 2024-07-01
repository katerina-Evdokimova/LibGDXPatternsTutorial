abstract class GameComponent {
    public abstract void render(SpriteBatch batch);
    public abstract void update(float deltaTime);
}

class BasicGameObject extends GameComponent {
    @Override
    public void render(SpriteBatch batch) {
        // Рендеринг базового игрового объекта
    }

    @Override
    public void update(float deltaTime) {
        // Обновление состояния базового игрового объекта
    }
}

abstract class GameObjectDecorator extends GameComponent {
    protected GameComponent decoratedObject;

    public GameObjectDecorator(GameComponent decoratedObject) {
        this.decoratedObject = decoratedObject;
    }

    @Override
    public void render(SpriteBatch batch) {
        decoratedObject.render(batch);
    }

    @Override
    public void update(float deltaTime) {
        decoratedObject.update(deltaTime);
    }
}

class HealthDecorator extends GameObjectDecorator {
    private int health;

    public HealthDecorator(GameComponent decoratedObject, int health) {
        super(decoratedObject);
        this.health = health;
    }

    @Override
    public void render(SpriteBatch batch) {
        super.render(batch);
        // Рендеринг состояния здоровья
    }

    @Override
    public void update(float deltaTime) {
        super.update(deltaTime);
        // Обновление состояния здоровья
    }
}

class ArmorDecorator extends GameObjectDecorator {
    private int armor;

    public ArmorDecorator(GameComponent decoratedObject, int armor) {
        super(decoratedObject);
        this.armor = armor;
    }

    @Override
    public void render(SpriteBatch batch) {
        super.render(batch);
        // Рендеринг состояния брони
    }

    @Override
    public void update(float deltaTime) {
        super.update(deltaTime);
        // Обновление состояния брони
    }
}
