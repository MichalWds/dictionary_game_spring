package dictionary_game.repositories;

import dictionary_game.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {

    @Query("SELECT p FROM User p ORDER BY p.id")
    List<User> findAllSortById();

    //search by name
}