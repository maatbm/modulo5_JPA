package model;

import javax.persistence.*;

@Entity
@Table(name = "inscricao")
public class Inscricao {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;
    private String dataInscricao;
    private boolean confirmada;

    @ManyToOne
    private Evento evento;

    @ManyToOne
    private Participante participante;
}
