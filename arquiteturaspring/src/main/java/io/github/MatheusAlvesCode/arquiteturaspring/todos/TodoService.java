package io.github.MatheusAlvesCode.arquiteturaspring.todos;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    public TodoService(TodoRepository todoRepository,
                       TodoValidator validator,
                       MailSender mailSender) {
        this.repository = todoRepository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    // Se  o todo nao tem um ID, o spring entende que é um todo novo e faz um insert
    public TodoEntity salvar(TodoEntity novoTodo){
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }

    // Aqui
    public void atualizarStatus(TodoEntity todo){
        repository.save(todo);
        String  status = todo.getConcluido()== Boolean.TRUE ? "Concluído":"Não Concluído";
        mailSender.enviar("Todo de código" + todo.getDescricao() + " esse TODO foi atualizado para: " + status);
    }

    public TodoEntity buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }
}
