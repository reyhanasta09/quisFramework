/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reyhan.kuis1069.repo;

import com.reyhan.kuis1069.entitiy.Minuman;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface MinumanRepo extends CrudRepository<Minuman, Long>{
    
    @Query("select p from Product p")
    public List<Minuman> findAllProduct();
    
    @Query("select p from Product p where p.category.id= :id")
    public List<Minuman> findByCategory(@Param("id") Long id);
    
    @Query("select p from Product p where LOWER(p.name) LIKE LOWER(:name)")
    public List<Minuman> findByName(@Param("name") String name);
}
