package org.example.example5;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "parent" , cascade = CascadeType.ALL)
    private List<Child> childList = new ArrayList<>();
    public void addChild(Child child){
        childList.add(child);
        child.setParent(this);
    }
}
