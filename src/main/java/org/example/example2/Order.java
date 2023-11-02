package org.example.example2;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name="ORDERS")
@Data
public class Order {
    @Id
    @Column(name="MEMBER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name ="MEMBER_ID")
    private Member member;

    @Column(name="ORDERDATE")
    private LocalDate orderDate;

    @Column(name="STATUS")
    private String status;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

}
