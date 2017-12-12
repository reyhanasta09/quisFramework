/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reyhan.kuis1069.controller;

import com.reyhan.kuis1069.entitiy.Makanan;
import com.reyhan.kuis1069.service.MakananService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/category")
public class MakananController {

    @Autowired
    private MakananService categoryService;

    @RequestMapping(method = RequestMethod.POST)
    public Makanan insert(@RequestBody Makanan category) {
        return categoryService.insert(category);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Makanan update(@RequestBody Makanan category) {
        return categoryService.update(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{nim}")
    public boolean delete(@PathVariable("nim") Long id) {
        return categoryService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{nim}")
    public Makanan getById(@PathVariable("nim") Long id){
        return categoryService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Makanan> getAll(){
        return categoryService.getAll();
    }
}
