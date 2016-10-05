package dk.rudz.quixote;

import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;

import dk.rudz.quixote.appstates.ConfigAppState;

/**
 * 
 * @author normenhansen
 */
public class Quixote extends SimpleApplication {

    public static void main(String[] args) {
        Quixote app = new Quixote();
        app.start();
    }

    public Quixote() {
        super(new ConfigAppState());
    }

    @Override
    public void simpleInitApp() {
        cam.setLocation(new Vector3f(0f, 40f, -30f));
        cam.lookAt(Vector3f.ZERO, Vector3f.UNIT_Y);
        rootNode.attachChild(assetManager.loadModel("Scenes/SceneQuixota.j3o"));
    }

}
