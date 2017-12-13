/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reyhan.kuis1069.entitiy;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "nilai_1069")
public class Minuman implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nilai;
    @Column(length = 150, nullable = false)
    private String nilai;
    @Column(length = 255, nullable = true)
    private String grade;


    /**
     * @return the id
     */
    public Long getId_Nilai() {
        return id_nilai;
    }

    /**
     * @param id the id to set
     */
    public void setId_Nilai(Long id_nilai) {
        this.id_nilai = id_nilai;
    }

    /**
     * @return the name
     */
    public String getNilai() {
        return nilai;
    }

    /**
     * @param name the name to set
     */
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    /**
     * @return the price
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param price the price to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }
//
//    /**
//     * @return the description
//     */
//    public String getDescription() {
//        return description;
//    }
//
//    /**
//     * @param description the description to set
//     */
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    /**
//     * @return the category
//     */
//    public Makanan getCategory() {
//        return category;
//    }
//
//    /**
//     * @param category the category to set
//     */
//    public void setCategory(Makanan category) {
//        this.category = category;
//    }
//    
    
}
