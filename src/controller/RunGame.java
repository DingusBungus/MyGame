package controller;

import javax.swing.*;

/**
 * Created by Doherty on 5/5/2015.
 */
public class RunGame {

    private static Controller currentController;
    private static JFrame frame;

    /* The game itself */
    public static void main(String[] args) {
        Controller controller = new MainScreenController();
        RunGame.initialize(currentController);
    }

    public RunGame(Controller controller) {
        this.currentController = controller;
        frame = new JFrame();
        frame.add(controller.getViewport());
    }

    public static void initialize(Controller controller) {
        if (currentController != null) {
            frame.remove(currentController.getViewport());
        }
        currentController = controller;
        frame.add(controller.getViewport());
        frame.paint(frame.getGraphics());
    }


}
