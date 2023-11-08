package org.example.example2;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity(name = "ITEM")
@Data
public class Item {

    @Id @GeneratedValue
    @Column(name="ITEM_ID")
    private String id;

    @Column(name="PRICE")
    private int price;

    @Column(name="STOCKQUANTITY")
    private int stockQuantity;
}
