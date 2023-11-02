package org.example.example2;

import lombok.Data;

import javax.persistence.*;

@Entity(name="ORDER_ITEM")
@Data
public class OrderItem {

    @Id @GeneratedValue
    @Column(name="ORDER_ITEM_ID")
    private long id;

    @ManyToOne
    @JoinColumn(name="ORDER_ID")
    private Order order;

    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    private Item item;

    @Column(name="ORDERPRICE")
    private int orderPrice;

    @Column(name="COUNT")
    private int count;

}
