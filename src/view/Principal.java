package view;

import controller.StringInvertidaController;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        StringInvertidaController si = new StringInvertidaController();
        String string = JOptionPane.showInputDialog(null, "Insira uma String");

        String resultado = si.inverter(string, string.length());
        System.out.println(resultado);
    }
}
