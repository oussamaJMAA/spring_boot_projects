package tn.esprit.firstproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numSkieur")
    private Long numSkieur;
    private String nomS ;
    private String prenomS;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance ;
    private String ville ;
    @OneToOne
    private Abonnement abonnement ;
    @OneToMany(mappedBy ="skieur")
    private Set<Inscription> inscription ;
    @ManyToMany
    @JsonIgnore
    private Set<Piste>piste;
}
