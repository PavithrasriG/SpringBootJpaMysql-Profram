package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.Alian;


@Repository                                      //<T ,Id>
public interface AlianRepo extends JpaRepository<Alian,Integer>{

}                                      //T->Entity class Name--->Alian 
                                       //ID->Data type--->Integer
