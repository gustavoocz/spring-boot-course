package br.com.gustavoocz.repository;

import br.com.gustavoocz.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
