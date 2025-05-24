package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "participante")
public class Participante {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    @OneToMany(mappedBy = "participante")
    private List<Inscricao> inscricoes;
}
