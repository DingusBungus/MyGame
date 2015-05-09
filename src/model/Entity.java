package model;

/**
 * Created by Doherty on 5/8/2015.
 */
public abstract class Entity {
    private Statistics statistics;
    private Position position;

    public Entity(Statistics statistics, Position position) {
        this.statistics = statistics;
        this.position = position;
    }

    public Statistics getStatistics() { return statistics; }
    public Position getPosition() { return position; }

    public void setStatistics(Statistics statistics) { this.statistics = statistics; }
    public void setPosition(Position position) { this.position = position; }

    public void move(Direction direction) {
        position.setX(position.getX() + direction.getX());
        position.setY(position.getY() + direction.getY());
    }

    public void changeHealth(int amt) {
        statistics.changeHealth(amt);
    }

}
