package dictionary_game.model;

import org.springframework.stereotype.Component;

@Component
public class User {

    private Integer numberOfPoints;

    public User() {
        numberOfPoints = 0;
    }

    public User(Integer numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public void addPoint() {
        numberOfPoints++;

    }

    public void substractPoints() {
        numberOfPoints--;

    }

    public Integer getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(Integer numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }
}




