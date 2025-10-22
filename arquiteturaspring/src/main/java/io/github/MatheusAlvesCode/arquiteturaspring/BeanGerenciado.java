package io.github.MatheusAlvesCode.arquiteturaspring;
import io.github.MatheusAlvesCode.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Lazy // Instanciar um Bean somente quando for pedido
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON) //Tipo do Scopo, //Singleton - Intancia unica que vai atender toda a aplicação.
public class BeanGerenciado {

    @Autowired
    private TodoValidator validator;


    // A forma de injetar mais recomendada é com o construtor.
    //Não é obrigatório, mas é a mais recomendada.
    @Autowired
    public BeanGerenciado(TodoValidator validator){
        this.validator = validator;
    }
}
