package br.com.gustavoocz.repository;

import br.com.gustavoocz.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
