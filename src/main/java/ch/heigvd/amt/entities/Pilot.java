package ch.heigvd.amt.entities;

import jakarta.persistence.*;

@Entity
public class Pilot {
    @Id
    @GeneratedValue
    long id;

    @Column
    String name;

    @ManyToOne
    @JoinColumn(name = "plane_id")
    Plane plane;
}
