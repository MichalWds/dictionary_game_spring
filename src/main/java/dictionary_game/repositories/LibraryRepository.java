package dictionary_game.repositories;


import dictionary_game.Library;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibraryRepository extends CrudRepository<Library, Integer> {

    @Query("SELECT l FROM Library l where l.polishWord=?1")
    List<Library> findByPolishWord(String polishWord);

    @Query("SELECT l FROM Library l where l.englishWord=?1")
    List<Library> findByEnglishWord(String englishWord);
}
