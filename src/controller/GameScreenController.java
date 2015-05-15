package controller;

import model.Avatar;
import view.GameScreenViewport;
import view.Viewport;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Doherty on 5/11/2015.
 */
public class GameScreenController extends Controller {

    ArrayList<AbstractAction> listeners;

    public GameScreenController(Avatar avatar) {
        super();
        Viewport viewport = new GameScreenViewport(listeners);
    }

    public GameScreenController(Viewport viewport) {
        super(viewport);
    }
}
