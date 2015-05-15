package controller;

import view.Viewport;

/**
 * Created by Doherty on 5/4/2015.
 */
public abstract class Controller {

    protected Viewport viewport;

    public Controller() { this.viewport = null; }
    public Controller(Viewport viewport) {
        this.viewport = viewport;
    }

    public void initialize(Controller controller) {
        RunGame.initialize(controller);
    }

    public Viewport getViewport() {
        return viewport;
    }
}
