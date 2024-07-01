public class ResourceManager {
    private static ResourceManager instance;

    private ResourceManager() {
        // Инициализация ресурсов
    }

    public static ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }

    public void loadTexture(String textureName) {
        // Загрузка текстуры с использованием AssetManager LibGDX
        // assetManager.load(textureName, Texture.class);
    }

    public void unloadTexture(String textureName) {
        // Выгрузка текстуры с использованием AssetManager LibGDX
        // assetManager.unload(textureName);
    }
}
