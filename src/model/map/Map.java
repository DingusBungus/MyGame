package model.map;

import model.Position;
import utilities.SubImages;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Doherty on 5/20/2015.
 */
public class Map {

    //2D ArrayList of tiles to represent the map
    private ArrayList<ArrayList<Maptile>> map;
    private static HashMap<Character, BufferedImage> charToImageMap;

    public Map(ArrayList<ArrayList<Maptile>> map) {
        this.map = map;
        populateHashMap();
    }

    public ArrayList<ArrayList<Maptile>> getMap() {
        return map;
    }

    public void setMap(ArrayList<ArrayList<Maptile>> map) {
        this.map = map;
    }

    public Maptile getMaptileAtPosition(Position position) {
        return map.get(position.getX()).get(position.getY());
    }

    //Can return null so test for it first!
    public static Map parseMapFromFile(String fileName) {
        ArrayList<ArrayList<Maptile>> map = new ArrayList<ArrayList<Maptile>>();
        try {
            //Prep the file for reading
            FileReader fileReader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fileReader);

            //Create the map from file
            int i = 0;
            String str;
            BufferedImage img = null;
            while ((str = br.readLine()) != null) {
                for (int j = 0; j < str.length(); ++j) {
                    img = charToImageMap.get(str.charAt(j));
                    map.get(i).add(new Maptile(new Position(i, j), img));
                }
                ++i;
            }

            //Close the reader
            br.close();

            return new Map(map);
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to open file " + fileName);
        } catch(IOException ex) {
            System.out.println("Error reading file " + fileName);
        }
        return null;
    }

    private void populateHashMap() {
        //Not really any real order, tried to be alphabetical
        charToImageMap.put('1', SubImages.CLIFF_128_128);
        charToImageMap.put('2', SubImages.CLIFF_128_160);
        charToImageMap.put('3', SubImages.CLIFF_128_224);
        charToImageMap.put('4', SubImages.CLIFF_192_224);

        charToImageMap.put('c', SubImages.COBBLESTONE_64_64);
        charToImageMap.put('d', SubImages.DARK_GRASSY_GRAVEL_64_64);
        charToImageMap.put('f', SubImages.FIRE_64_64);
        charToImageMap.put('b', SubImages.FLOWER_BUSH_32_32);

        charToImageMap.put('g', SubImages.GRASS_BLOCK_64_64);
        charToImageMap.put('r', SubImages.GRASS_BUSH_32_32);
        charToImageMap.put('i', SubImages.GRASSY_GRAVEL_32_64);
        charToImageMap.put('j', SubImages.GRASSY_GRAVEL_96_96);

        charToImageMap.put('v', SubImages.GRAVEL_32_96);
        charToImageMap.put('s', SubImages.GRAVEL_STONEBRICK_96_96);
        charToImageMap.put('l', SubImages.LIGHT_GRASSY_GRAVEL_64_64);
        charToImageMap.put('p', SubImages.PALM_BUSH_32_32);

        charToImageMap.put('s', SubImages.STONEBRICK_64_128);
        charToImageMap.put('t', SubImages.TALL_GRASS_64_64);
        charToImageMap.put('u', SubImages.TALL_GRASS_96_96);
        charToImageMap.put('h', SubImages.THIN_GRASS_32_96);

        charToImageMap.put('5', SubImages.TREE_64_128);
        charToImageMap.put('6', SubImages.TREE_64_96);
        charToImageMap.put('7', SubImages.TREE_96_128);
    }
}
