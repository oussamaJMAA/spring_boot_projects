package tn.esprit.revision.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Integer idContrat; // Clé primaire
    private Integer MontantContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat ;
    @Temporal(TemporalType.DATE)
    private Date dateFinContrat ;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private Boolean archive ;
    @ManyToOne
    private Etudiant etudiant ;

}
