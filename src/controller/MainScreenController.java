package controller;

import view.MainScreenViewport;
import view.Viewport;
import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Doherty on 5/5/2015.
 */
public class MainScreenController extends Controller {

    public MainScreenController() {
        super(null);
        Viewport viewport = new MainScreenViewport(new NewGameButtonListener(),
                                                   new OptionsButtonListener(),
                                                   new LoadButtonListener(),
                                                   new ExitButtonListener());
        this.viewport = viewport;
    }

    private class NewGameButtonListener extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            initialize(new NewGameScreenController());
            //System.out.println("Start Button Pressed");
        }
    }

    private class OptionsButtonListener extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            //initialize(new OptionsScreenController());
            System.out.println("Options Button Pressed");
        }
    }

    private class LoadButtonListener extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            //initialize(new LoadScreenController());
            System.out.println("Load Button Pressed");
        }
    }

    private class ExitButtonListener extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

}
