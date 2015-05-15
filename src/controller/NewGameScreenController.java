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
        super();
        Viewport viewport = new NewGameScreenViewport(new Occupation1ButtonListener(),
                                                      new Occupation2ButtonListener(),
                                                      new Occupation3ButtonListener(),
                                                      new Occupation4ButtonListener());
        this.viewport = viewport;
    }

    public NewGameScreenController(Viewport viewport) {
        super(viewport);
    }

    //Temporary names until class names are set
    private class Occupation1ButtonListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse clicked 1");
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

    private class Occupation2ButtonListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse clicked 2");
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

    private class Occupation3ButtonListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse clicked 3");
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

    private class Occupation4ButtonListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse clicked 4");
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
