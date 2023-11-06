package org.example.example3;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String city;
    private String street;
    private String zipCode;

    @Enumerated(EnumType.STRING)
    private Status status;
}
