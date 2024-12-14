/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.semana6.service;



import com.example.semana6.model.Reservas;
import com.example.semana6.repository.ReservasRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LAB_P03
 */
@Service
public class ReservasService {
    @Autowired
    private ReservasRepository reservaRepository;

    public List<Reservas> listarReservas() {
        return reservaRepository.findAll();
    }

    public Reservas guardarReserva(Reservas reserva) {
        return reservaRepository.save(reserva);
    }

    public Reservas obtenerReservaPorId(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    public void eliminarReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}