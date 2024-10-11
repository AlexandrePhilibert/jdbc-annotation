package ch.heigvd.amt.entities;

import jakarta.persistence.*;

@Entity
public class Flight {
    @Id
    @GeneratedValue
    long id;

    @ManyToOne
    @JoinColumn(name = "plane_id")
    Plane plane;
}
