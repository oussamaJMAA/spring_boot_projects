package tn.esprit.firstproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numMoniteur")
    private long numMoniteur ;
    private String nomM ;
    private String prenomM;
    @Temporal(TemporalType.DATE)
    private Date dateRecru ;
    @OneToMany
    private Set<Cours> cours;
}
