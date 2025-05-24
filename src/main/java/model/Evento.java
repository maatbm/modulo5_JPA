package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String data;
    private String local;

    @OneToMany(mappedBy = "evento")
    private List<Inscricao> inscricoes;
}
