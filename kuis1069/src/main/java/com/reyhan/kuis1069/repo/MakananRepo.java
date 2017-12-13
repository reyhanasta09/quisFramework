/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reyhan.kuis1069.repo;

import com.reyhan.kuis1069.entitiy.Makanan;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface MakananRepo extends CrudRepository<Makanan, Long> {

    @Query("select c from Category c")
    public List<Makanan> findAllCategory();
}
