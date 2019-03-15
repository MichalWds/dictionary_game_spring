package dictionary_game.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Random;


@Entity
public class LibraryForEnglish {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;  // zeby nadawac id w mysql

        @NotNull
        private String englishWord;
        @NotNull
        private String polishWord;

        Random random = new Random();


        public LibraryForEnglish() {
        }  //zeby dzialal hibernate, pusta klasa

        public LibraryForEnglish(@NotNull String englishWord, @NotNull String polishWord) {
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
            return  polishWord;
            // to co nam zwraca z library w wywolaniu
        }// lepiej wrzucic kolejnego to stringa do innej klasy zeby byla czystosc, klodu ( w momencie gdy robimy polishword

    }


