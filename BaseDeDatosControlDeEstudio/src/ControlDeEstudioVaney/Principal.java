/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlDeEstudioVaney;

/**
 *
 * @author pc
 */


public class Principal {
    
    public static void main(String[] args){
    
    int opc=0;
    Menu ventanaMenu = new Menu();
    ventanaMenu.setVisible(true);
    while(opc==0)
        opc=ventanaMenu.getOpcion();
    ventanaMenu.setVisible(false);
    
    switch(opc){
        case 1:  
            VentanaPrincipal ventana1 = new VentanaPrincipal();
            ventana1.setVisible(true);
        break;   
        case 2:
            VentanaSecundaria ventana2 = new VentanaSecundaria();
            ventana2.setVisible(true);
        break;
        case 3:
            VentanaTercera ventana3 = new VentanaTercera();
            ventana3.setVisible(true);
        case 4:
            VentanaCuarta ventana4 = new VentanaCuarta();
            ventana4.setVisible(true);
        default:
    }
    
    }
    
    
}
