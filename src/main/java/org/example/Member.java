package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

import javax.persistence.Id;
import java.util.Date;


@Entity
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name ="USERNAME")
    private String username;

    @ManyToOne
    @JoinColumn( name ="TEAM_ID")
    private Team team;
}



