package ch.heigvd.amt.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Flight {
    @Id
    @GeneratedValue
    long id;

    @Column
    String departureFrom;

    @Column
    String arrivalTo;

    @Column
    Instant departureAt;

    @Column
    Instant arrivalAt;

    @ManyToOne
    @JoinColumn(name = "plane_id")
    Plane plane;
}
