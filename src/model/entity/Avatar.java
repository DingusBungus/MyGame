package model.entity;

import model.occupation.Occupation;
import model.utils.Position;

/**
 * Created by Doherty on 5/8/2015.
 */
public class Avatar extends Entity {

    //TODO - startingPosition will be different for each level so this is just a placeholder
    private static final Position startingPosition = new Position(0, 0);

    private Occupation occupation;

    public Avatar(Occupation occupation) {
        super(occupation.getDefaultStats(), startingPosition);
        this.occupation = occupation;
    }

    public Occupation getOccupation() {
        return occupation;
    }
}
