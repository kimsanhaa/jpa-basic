package org.example.example3;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String city;
    private String street;
    private String zipCode;

    @OneToMany(mappedBy = "ORDER")
    private List<Order> orders;
}
