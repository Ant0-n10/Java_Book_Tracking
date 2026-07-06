package Ant0_n10.biblioteca.repositorys;

import Ant0_n10.biblioteca.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
