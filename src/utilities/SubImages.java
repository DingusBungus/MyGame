package utilities;

import model.map.ImageLoader;

import java.awt.image.BufferedImage;

/**
 * Created by Doherty on 5/27/2015.
 */
public class SubImages {

    //Multiplying factor
    private static final int mult = 16;

    private static final BufferedImage SPRITE_SHEET = ImageLoader.load(ImagePaths.SPRITE_SHEET);

    //--All Subimages of the Sprite Sheet------------------------

    //Cliffs
    public static final BufferedImage CLIFF_192_224 =  SPRITE_SHEET.getSubimage(0, 0, mult * 192, mult * 224);
    public static final BufferedImage CLIFF_128_224 =  SPRITE_SHEET.getSubimage(192, 0, mult * 128, mult * 224);
    public static final BufferedImage CLIFF_128_160 =  SPRITE_SHEET.getSubimage(0, 224, mult * 128, mult * 160);
    public static final BufferedImage CLIFF_128_128 =  SPRITE_SHEET.getSubimage(0, 384, mult * 128, mult * 128);

    //Gravel
    public static final BufferedImage GRASSY_GRAVEL_32_64 =  SPRITE_SHEET.getSubimage(320, 96, mult * 32, mult * 64);
    public static final BufferedImage GRAVEL_32_96 = SPRITE_SHEET.getSubimage(320, 0, mult * 32, mult * 96);
    public static final BufferedImage GRASSY_GRAVEL_96_96 = SPRITE_SHEET.getSubimage(352, 0, mult * 96, mult * 96);
    public static final BufferedImage LIGHT_GRASSY_GRAVEL_64_64 = SPRITE_SHEET.getSubimage(448, 192, mult * 64, mult * 64);
    public static final BufferedImage DARK_GRASSY_GRAVEL_64_64 = SPRITE_SHEET.getSubimage(448, 256, mult * 64, mult * 64);

    //Other Blocks
    public static final BufferedImage GRAVEL_STONEBRICK_96_96 = SPRITE_SHEET.getSubimage(352, 96, mult * 96, mult * 96);
    public static final BufferedImage STONEBRICK_64_128 = SPRITE_SHEET.getSubimage(448, 0, mult * 64, mult * 128);
    public static final BufferedImage COBBLESTONE_64_64 = SPRITE_SHEET.getSubimage(224, 352, mult * 64, mult * 64);

    //Misc
    public static final BufferedImage FIRE_64_64 = SPRITE_SHEET.getSubimage(128, 224, mult * 64, mult * 64);

    //Grass
    public static final BufferedImage THIN_GRASS_32_96 = SPRITE_SHEET.getSubimage(320, 160, mult * 32, mult * 96);
    public static final BufferedImage GRASS_BLOCK_64_64 = SPRITE_SHEET.getSubimage(448, 128, mult * 64, mult * 64);
    public static final BufferedImage TALL_GRASS_64_64 = SPRITE_SHEET.getSubimage(192, 224, mult * 64, mult * 64);
    public static final BufferedImage TALL_GRASS_96_96 = SPRITE_SHEET.getSubimage(128, 288, mult * 96, mult * 96);

    //Trees
    public static final BufferedImage TREE_96_128 = SPRITE_SHEET.getSubimage(128, 384, mult * 96, mult * 128);
    public static final BufferedImage TREE_64_96 = SPRITE_SHEET.getSubimage(224, 416, mult * 64, mult * 96);
    public static final BufferedImage TREE_64_128 = SPRITE_SHEET.getSubimage(288, 384, mult * 64, mult * 128);

    //Bushes
    public static final BufferedImage PALM_BUSH_32_32 = SPRITE_SHEET.getSubimage(224, 288, mult * 32, mult * 32);
    public static final BufferedImage FLOWER_BUSH_32_32 = SPRITE_SHEET.getSubimage(224, 320, mult * 32, mult * 32);
    public static final BufferedImage GRASS_BUSH_32_32 = SPRITE_SHEET.getSubimage(256, 320, mult * 32, mult * 32);
}
