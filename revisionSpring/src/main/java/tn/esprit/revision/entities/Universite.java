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
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
    private Integer idUniv; // Clé primaire
    private String nomUniv;
    @OneToMany
    private Set<Departement> departement ;
}
