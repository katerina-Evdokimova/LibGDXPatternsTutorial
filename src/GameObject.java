import com.badlogic.gdx.graphics.g2d.SpriteBatch;

abstract class GameObject {
    public abstract void render(SpriteBatch batch);
    public abstract void update(float deltaTime);
}

class SimpleObject extends GameObject {
    @Override
    public void render(SpriteBatch batch) {
        // Рендеринг простого объекта
    }

    @Override
    public void update(float deltaTime) {
        // Обновление состояния простого объекта
    }
}

class CompositeObject extends GameObject {
    private ArrayList<GameObject> children = new ArrayList<>();

    public void add(GameObject obj) {
        children.add(obj);
    }

    public void remove(GameObject obj) {
        children.remove(obj);
    }

    @Override
    public void render(SpriteBatch batch) {
        for (GameObject obj : children) {
            obj.render(batch);
        }
    }

    @Override
    public void update(float deltaTime) {
        for (GameObject obj : children) {
            obj.update(deltaTime);
        }
    }
}
