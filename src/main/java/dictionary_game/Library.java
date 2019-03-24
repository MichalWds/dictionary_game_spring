package dictionary_game;

import dictionary_game.controller.DictionaryController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Entity
public class Library {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String englishWord;
    @NotNull
    private String polishWord;

    Random random = new Random();

    public Library() {
    }

    public Library(@NotNull String englishWord, @NotNull String polishWord) {
        this.englishWord = englishWord;
        this.polishWord = polishWord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnglishWord() {
        return this.englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getPolishWord() {
        return polishWord;
    }

    public void setPolishWord(String polishWord) {
        this.polishWord = polishWord;
    }


    @Override
    public String toString() {
        return englishWord + polishWord;

    }

}