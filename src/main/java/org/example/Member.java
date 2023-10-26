package org.example;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

import javax.persistence.Id;
import java.util.Date;


@Entity

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String username;

}



