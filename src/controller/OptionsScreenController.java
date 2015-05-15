package controller;

import view.OptionsScreenViewport;
import view.Viewport;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Doherty on 5/11/2015.
 */
public class OptionsScreenController extends Controller {

    private ArrayList<ActionListener> actionListeners;

    public OptionsScreenController() {
        super();
        Viewport viewport = new OptionsScreenViewport(actionListeners);
        this.viewport = viewport;
    }

    public OptionsScreenController(Viewport viewport) {
        super(viewport);
    }

    //TODO - Create a means for rebinding keys. Should be after a method of mapping keys to actions is made ...
    private class upButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //rebind up key
        }
    }

    private class leftButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //rebind up key
        }
    }

    private class downButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //rebind up key
        }
    }

    private class rightButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //rebind up key
        }
    }

    private class interactButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //rebind up key
        }
    }

    private class meleeButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //rebind up key
        }
    }

    private class itemButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //rebind up key
        }
    }

    private class mountButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //rebind up key
        }
    }

    private class ability1ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //rebind up key
        }
    }

    private class ability2ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //rebind up key
        }
    }

    private class ability3ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //rebind up key
        }
    }

    private class saveButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //rebind up key
        }
    }

    private class pauseButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //rebind up key
        }
    }
}
