package org.example.baseproject.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="saloon")
public class Saloon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int saloonId;
    private String saloonName;

    @ManyToOne
    @JoinColumn(name = "city_id")
    @JsonIgnore
    private City city;

}
