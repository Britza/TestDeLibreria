package com.HelloWorld;

import Libreria.Consola;
import Libreria.MisMetodos;
import Libreria.Ventana;

public class Main {

    public static void main(String[] args) {


        Consola consola =new Consola("Hola");
        consola.visualizar();

        Ventana ventana = new Ventana("Adios");
        ventana.visualizar();


    }
}
