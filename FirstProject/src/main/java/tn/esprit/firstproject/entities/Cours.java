package tn.esprit.firstproject.entities;

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
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numCours")
    private long numCours;
    private int niveau ;
    @Enumerated(EnumType.STRING)
    private TypeCours typecours ;
    @Enumerated(EnumType.STRING)
    private Support support ;
    private float prix ;
    private int creneau ;
    @OneToMany(mappedBy = "cours")
    private Set<Inscription> inscription ;

}
