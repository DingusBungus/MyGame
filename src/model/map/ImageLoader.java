package model.map;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Doherty on 5/27/2015.
 */
public class ImageLoader {

    public static BufferedImage load(String path) {
        BufferedImage bi = null;
        try {
            bi = ImageIO.read(new File(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return bi;
    }
}
