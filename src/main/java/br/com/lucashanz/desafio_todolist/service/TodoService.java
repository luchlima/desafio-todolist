package br.com.lucashanz.desafio_todolist.service;

import br.com.lucashanz.desafio_todolist.entity.Todo;
import br.com.lucashanz.desafio_todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todo.setId(null);
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending()
        );
       return todoRepository.findAll(sort);
    }
    public List<Todo> update(Todo todo){
        if (todo.getId() == null || !todoRepository.existsById(todo.getId())){
            throw new IllegalArgumentException("Todo com id " + todo.getId() + " não existe!");
        }
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }
}
