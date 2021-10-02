/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliculas.datos;

import com.peliculas.domain.Pelicula;
import com.peliculas.excepciones.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Kevin Cerón
 */
public class AccesoDatosImpl implements IAccesoDatos{

    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatosEx {
        File archivo = new File(nombre);
        List<Pelicula> pelicula = new ArrayList<>(); 
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al listar peliculas: " + ex.getMessage());
        }
        return pelicula;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        
    }

    @Override
    public void borrar(String nombreRecutso) throws AccesoDatosEx {
        
    }
}
