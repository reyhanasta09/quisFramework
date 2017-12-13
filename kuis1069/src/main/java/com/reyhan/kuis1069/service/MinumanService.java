/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reyhan.kuis1069.service;

import com.reyhan.kuis1069.entitiy.Minuman;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.reyhan.kuis1069.repo.MinumanRepo;

/**
 *
 * @author Hendro Steven
 */
@Service("productService")
@Transactional
public class MinumanService {

    @Autowired
    private MinumanRepo repo;

    public Minuman insertOrUpdate(Minuman product) {
        return repo.save(product);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Minuman> findAll() {
        return repo.findAllProduct();
    }

    public List<Minuman> findByCategory(Long categoryId) {
        return repo.findByCategory(categoryId);
    }

    public List<Minuman> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }

}
