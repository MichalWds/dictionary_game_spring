package dictionary_game.model;

public class User {

    private Integer numberOfPoints;

    public User(){   //nowy user
        numberOfPoints=0;
    }

    public User(Integer numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public void addPoint(){
        numberOfPoints++;

    }

    public Integer getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(Integer numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }
}




