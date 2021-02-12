package com.HelloWorld;

import Libreria.MisMetodos;
public class Main {

    public static void main(String[] args) {
        //System.out.println(MisMetodos.saludo("Hola"));
        String aux = MisMetodos.saludo("Hola");
        System.out.println(aux);
        String ad = MisMetodos.adios("chau");
        System.out.println(ad);


    }
}
