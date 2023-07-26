package InMemoryModel;

public class ModelStore implements lModelChanger, lModelChangedObserver{
    public PoligonalModel Models;
    public Scene Scenes;
    public Flash Flashes;
    public Camera Cameras;
    private lModelChangedObserver changedObservers;

    public Scene getScenes(int a) {
        return Scene;
    }

    @Override
    public void NotifyChange(lModelChanger sendor) {

    }
}
