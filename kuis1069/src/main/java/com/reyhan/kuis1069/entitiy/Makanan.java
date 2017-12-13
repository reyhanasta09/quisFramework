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
@Table(name = "cv_1069")
public class Makanan implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nim;
    @Column(length = 30, nullable = false, unique = true)
    private String nama;
    @Column(length = 30, nullable = true)
    private String prodi;
    @ManyToOne
    private Minuman minuman;
    

    public Long getNim() {
        return nim;
    }

    public void setNim(Long nim) {
        this.nim = nim;
    }

    /**
     * @return the name
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the name to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @param prodi the description to set
     */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    /**
     * @return the description
     */
    public String getProdi() {
        return prodi;
    }
    
     public void setMinuman(Minuman minuman) {
        this.minuman = minuman;
    }

    /**
     * @return the description
     */
    public Minuman getMinuman() {
        return minuman;
    }
}
