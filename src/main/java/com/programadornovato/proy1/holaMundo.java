/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;


import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Esta es nuestra clase principal a donde se accede al programa
 * @author eugenio
 * @version 1.0
 */
public class holaMundo {
    /**
     * Este es el metodo principal
     * @param args the command line arguments
     */
    public static void main(String[] args) throws HeadlessException, InterruptedException{
        Ventana v=new Ventana();
        v.setVisible(true);
    }
    public static String getPID(){
        return java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
    }
}
