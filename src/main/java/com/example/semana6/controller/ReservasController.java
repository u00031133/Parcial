/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.semana6.controller;

import com.example.semana6.model.Reservas;
import com.example.semana6.service.ReservasService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author LAB_P03
 */

@Controller
@RequestMapping("/reservas")
public class ReservasController {

   
  private final ReservasService reservasService;

    // Constructor para inyectar el servicio
    public ReservasController(ReservasService reservaService) {
        this.reservasService = reservaService;
      
    }

    
    @GetMapping
    public String listarReservas(Model model) {
        model.addAttribute("reservas", reservasService.listarReservas());
        return "reservas"; 
    }

     @GetMapping("/nuevo")
    public String mostrarFormularioReserva(Model model) {
        model.addAttribute("reserva", new Reservas());
        return "formularioReservas";
    }

    @PostMapping
    public String guardarReserva(@ModelAttribute Reservas reserva) {
        reservasService.guardarReserva(reserva);
        return "redirect:/reservas";
    }

    @GetMapping("/editar/{id}")
    public String editarReserva(@PathVariable Long id, Model model) {
        Reservas reserva = reservasService.obtenerReservaPorId(id);
        model.addAttribute("reserva", reserva);
        return "formularioReservas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarReserva(@PathVariable Long id) {
        reservasService.eliminarReserva(id);
        return "redirect:/reservas";
    }
  }
