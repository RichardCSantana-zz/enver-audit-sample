package com.richardcsantana.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by richardsantana on 24/03/16.
 */
@Entity
@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Audited
public class Dado implements Serializable {

    public Dado(String teste){
        this.teste = teste;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String teste;

}
