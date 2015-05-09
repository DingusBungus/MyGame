package controller;

import view.NewGameScreenViewport;
import view.Viewport;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Doherty on 5/6/2015.
 */
public class NewGameScreenController extends Controller {

    public NewGameScreenController() {
        super(null);
        Viewport viewport = new NewGameScreenViewport(new Class1ButtonListener());
        this.viewport = viewport;
    }

    //Temporary names until class names are set
    private class Class1ButtonListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse clicked");
        }

        //Not needed
        @Override
        public void mousePressed(MouseEvent e) { }
        @Override
        public void mouseReleased(MouseEvent e) { }
        @Override
        public void mouseEntered(MouseEvent e) { }
        @Override
        public void mouseExited(MouseEvent e) { }
    }

    private class Class2ButtonListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse clicked");
        }

        //Not needed
        @Override
        public void mousePressed(MouseEvent e) { }
        @Override
        public void mouseReleased(MouseEvent e) { }
        @Override
        public void mouseEntered(MouseEvent e) { }
        @Override
        public void mouseExited(MouseEvent e) { }
    }
}
