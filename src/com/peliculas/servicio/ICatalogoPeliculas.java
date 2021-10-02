/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliculas.servicio;

/**
 *
 * @author Kevin Cerón
 */
public interface ICatalogoPeliculas {
    String NOMBRE_RECURSO = "peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPeliculas(String buscar);
    
    void iniciarCatalogoPeliculas();
}
