package tn.esprit.revision.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")
    private Integer idEquipe; // Clé primaire
    private String nomEuipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @ManyToMany(mappedBy = "equipe")
    private Set<Etudiant> etudiant  ;
    @OneToOne(mappedBy = "equipe")
    private DetailEquipe detailEquipe ;
}
