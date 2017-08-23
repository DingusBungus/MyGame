package controller;

import model.entity.Avatar;
import model.map.Map;
import view.GameScreenViewport;
import view.Viewport;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Doherty on 5/11/2015.
 */
public class GameScreenController extends Controller {

    private ArrayList<MouseListener> mouseListeners;
    private ArrayList<KeyListener> keyListeners;
    private HashMap<Integer, String> controlConfiguration;
    private Avatar avatar;
    private Map map;

    public GameScreenController(Avatar avatar, Map map) {
        super();
        Viewport viewport = new GameScreenViewport(mouseListeners, keyListeners);
        initializeGameControlConfiguration();
        this.avatar = avatar;
        this.map = map;
    }

    public GameScreenController(Viewport viewport) {
        super(viewport);
        setKeyListeners();
    }

    public void setKeyListeners() {

        keyListeners.add(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if (controlConfiguration.containsKey(e.getKeyCode())) {
                    switch (controlConfiguration.get(e.getKeyCode())) {
                        case "move_north":
                        case "move_west":
                        case "move_south":
                        case "move_east":
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }

    private void initializeGameControlConfiguration() {
        controlConfiguration.put(KeyEvent.VK_W, "move_north");
        controlConfiguration.put(KeyEvent.VK_A, "move_west");
        controlConfiguration.put(KeyEvent.VK_S, "move_south");
        controlConfiguration.put(KeyEvent.VK_D, "move_east");
    }

    public HashMap<Integer, String> getControlConfiguration() {
        return controlConfiguration;
    }
}
