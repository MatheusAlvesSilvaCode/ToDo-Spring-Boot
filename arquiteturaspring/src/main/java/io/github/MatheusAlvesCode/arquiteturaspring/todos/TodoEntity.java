package io.github.MatheusAlvesCode.arquiteturaspring.todos;
import jakarta.persistence.*;

@Entity // Dizemos ao Spring para tratar essa classe como uma tabela no banco de dados
@Table(name = "tb_todo") // Esse será o nome da nossa tabela: tb_todo
public class TodoEntity {

    @Id // Precisa quando for usar o JPA, usar o @Id do Jakarta, aqui definimos qual coluna será sobre id, o registro unico do que for colocado.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estamos dizendo que o id será a cargo do banco criar
    @Column(name = "id_todo") //O nome da coluna no banco será: id_todo, aqui está sendo "Criado" uma coluna no banco com esse nome, abaixo a mesma coisa
    private Integer id;

    @Column(name = "descricao")
    private  String descricao;

    @Column(name = "fl_concluido")
    private Boolean concluido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }
}
