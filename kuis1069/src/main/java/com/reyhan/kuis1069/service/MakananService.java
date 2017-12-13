/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reyhan.kuis1069.service;

import com.reyhan.kuis1069.entitiy.Makanan;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.reyhan.kuis1069.repo.MakananRepo;

/**
 *
 * @author Hendro Steven
 */
@Service("categoryService")
@Transactional
public class MakananService {

    @Autowired
    private MakananRepo repo;

    public Makanan insert(Makanan category) {
        return repo.save(category);
    }
    
    public Makanan update(Makanan category) {
        return repo.save(category);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Makanan getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Makanan> getAll(){
        return repo.findAllCategory();
    }
}
