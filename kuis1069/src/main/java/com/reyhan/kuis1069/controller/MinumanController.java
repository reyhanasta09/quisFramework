/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reyhan.kuis1069.controller;

import com.reyhan.kuis1069.entitiy.Minuman;
import com.reyhan.kuis1069.service.MinumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.reyhan.kuis1069.repo.MinumanRepo;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/product")
public class MinumanController {
    
    @Autowired
    private MinumanService productService;
    
    @RequestMapping(method = RequestMethod.POST)
    public Minuman insertOrUpdate(@RequestBody Minuman product){
        return productService.insertOrUpdate(product);
    }
  
}
