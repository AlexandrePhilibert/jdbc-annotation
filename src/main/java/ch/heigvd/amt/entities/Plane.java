package ch.heigvd.amt.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Plane {
    @Id
    @GeneratedValue
    long id;
    
    @Column
    Date constructionDate;

    @OneToMany(mappedBy = "plane")
    List<Flight> flights;
}
