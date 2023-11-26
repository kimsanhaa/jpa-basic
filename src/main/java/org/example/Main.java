package org.example;

import org.example.example5.Child;
import org.example.example5.Parent;
import org.example.example6.Address;
import org.example.example6.Member;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sanha");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
    try {

        Member member1 = new Member();
        member1.setUsername("member1");
        member1.setHomeAddress(new Address("city1","street","10000"));

        member1.getFavoriteFoods().add("치킨");
        member1.getFavoriteFoods().add("족발");
        member1.getFavoriteFoods().add("피자");

        member1.getAddressHistory().add(new Address("city2","street2","10002"));
        member1.getAddressHistory().add(new Address("city3","street3","10003"));
        member1.getAddressHistory().add(new Address("city4","street4","10004"));

        em.persist(member1);







        tx.commit();
    }catch (Exception e){
        tx.rollback();
        e.printStackTrace();
    } finally {
        em.close();
        emf.close();
    }
    }
}