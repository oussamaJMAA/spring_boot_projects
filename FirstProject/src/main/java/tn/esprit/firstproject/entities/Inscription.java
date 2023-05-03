package tn.esprit.firstproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numInscription")
    private long numInscription ;
    private int numSemaine ;
    @ManyToOne
    @JsonIgnore
    private Skieur skieur;
    @ManyToOne
    @JsonIgnore
    private Cours cours ;
}
