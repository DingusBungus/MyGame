package model.map;

import model.Position;

import java.awt.image.BufferedImage;

/**
 * Created by Doherty on 5/20/2015.
 */
public class Maptile {

    private Position position;
    private BufferedImage img;

    public Maptile(Position position, BufferedImage img) {
        this.position = position;
        this.img = img;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setImage(BufferedImage img) {
        this.img = img;
    }

    public BufferedImage getImage() {
        return img;
    }
}
