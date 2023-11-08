package org.example.example4;

import lombok.Data;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Item {
    @Id
    @GeneratedValue
    @Column(name="ITEM_ID")
    private long id;
    private String name;
    private int price;
}
