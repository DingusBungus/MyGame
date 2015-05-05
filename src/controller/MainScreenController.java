package controller;

import view.MainScreenViewport;
import view.Viewport;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Doherty on 5/5/2015.
 */
public class MainScreenController extends Controller {

    public MainScreenController() {
        super(null);
        Viewport viewport = new MainScreenViewport(new StartButtonListener(),
                                                   new OptionsButtonListener(),
                                                   new LoadButtonListener(),
                                                   new ExitButtonListener());
        this.viewport = viewport;
    }

    private class StartButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //initialize(new NewGameScreenController());
            System.out.println("Start Button Pressed");
        }
    }

    private class OptionsButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //initialize(new OptionsScreenController());
            System.out.println("Options Button Pressed");
        }
    }

    private class LoadButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //initialize(new LoadScreenController());
            System.out.println("Load Button Pressed");
        }
    }

    private class ExitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }



}
