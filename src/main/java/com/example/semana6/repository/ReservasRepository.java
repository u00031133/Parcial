/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.semana6.repository;

import com.example.semana6.model.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author LAB_P03
 */
public interface ReservasRepository extends JpaRepository<Reservas, Long> {
    
}
