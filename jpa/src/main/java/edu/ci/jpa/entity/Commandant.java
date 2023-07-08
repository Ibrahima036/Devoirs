package edu.ci.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @création 23/06/2023
 * @projet jpa
 * @auteur tsyta.diallo
 * @package edu.ci.jpa.entity
 */

@Table(name = "commandants")
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commandant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_bateau")
    @JsonIgnoreProperties("commandant")
    private Bateau bateau;
}
