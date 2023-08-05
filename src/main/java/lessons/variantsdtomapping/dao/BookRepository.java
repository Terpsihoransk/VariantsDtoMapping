package lessons.variantsdtomapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM BOOK WHERE name = ?")
    void saveBookByGenreId(Long id);
}
