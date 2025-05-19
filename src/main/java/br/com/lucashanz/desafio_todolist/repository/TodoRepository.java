package br.com.lucashanz.desafio_todolist.repository;

import br.com.lucashanz.desafio_todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
