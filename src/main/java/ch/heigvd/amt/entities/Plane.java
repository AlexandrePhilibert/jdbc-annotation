package ch.heigvd.amt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Plane {
    @Id
    @GeneratedValue
    long id;


}
