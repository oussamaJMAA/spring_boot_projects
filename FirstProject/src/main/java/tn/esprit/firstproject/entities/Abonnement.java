package tn.esprit.firstproject.entities;

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
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numAbon")
    private long numAbon ;
    @Temporal(TemporalType.DATE)
    private Date dateDebut ;
    @Temporal(TemporalType.DATE)
    private Date dateFin ;
    private float prixAbon ;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;
}
