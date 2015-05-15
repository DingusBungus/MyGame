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
        //Initialize the game with the Main Screen
        RunGame runGame = new RunGame(new MainScreenController());
    }

    public RunGame(Controller controller) {
        frame = new JFrame();
        initialize(controller);
    }

    public static void initialize(Controller controller) {
        //Make sure to swap out the controller/viewport if one is already there
        if (currentController != null) {
            frame.remove(currentController.getViewport());
        }
        currentController = controller;

        //Create the frame and show it
        frame.add(controller.getViewport());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
