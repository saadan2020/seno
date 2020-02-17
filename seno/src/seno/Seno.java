/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seno;

import controlador.Controlador;
import java.util.Scanner;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Saadan Cordoba
 */
public class Seno {

    /**
     * este programa da como resultado el seno de un numero utilizando la serie
     * de taylor
     */
    public static void main(String[] args) {
        Modelo objModelo = new Modelo();
        Vista objVista = new Vista();
        Controlador controlador = new Controlador(objVista, objModelo);
        controlador.iniciarVista();
        objVista.setVisible(true);
    }
}
