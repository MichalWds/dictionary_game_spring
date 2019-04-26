package dictionary_game.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Component
@Entity
public class User {

    private Integer numberOfPoints;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @NotNull(message= "nie moze byc puste")    //imie nie moze byc nullem, message jesli chcemy dac swoj komunikat
    @Size(min=2, max=30, message = "Minimum 3 znaki")

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(Integer numberOfPoints,
    @NotNull(message = "nie moze byc puste")
    @Size(min = 2, max = 30, message = "Minimum 3 znaki") String name) {
    this.numberOfPoints = numberOfPoints;
    this.name = name;
    }

    public User() {
        numberOfPoints = 0;
    }

    public User(Integer numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public int addPoint() {
        return numberOfPoints++;

    }

    public int substractPoints() {
      return numberOfPoints--;

    }

    public Integer getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(Integer numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }
}




