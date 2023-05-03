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
public class Departement implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Integer idDepart; // Clé primaire
    private String nomDepart;
    @OneToMany(mappedBy = "departement")
    private Set<Etudiant> etudiant ;



}
