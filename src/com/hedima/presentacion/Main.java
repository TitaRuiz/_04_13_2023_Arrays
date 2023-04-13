package com.hedima.presentacion;

public class Main {
    public static void main(String[] args) {

        //Crear un bloque de código que pinte las vocales y solo las vocales que existen en un array de caracteres.
        // El programa debe de ir comprobando, con un bucle, para determinar si cada carácter del array es o no una vocal.
        char[] palabras = {'f', 'a', 'b', 'e', 't'};
        for (int t = 0; t < palabras.length; t++) {
            if (palabras[t] == 'a' || palabras[t] == 'e' || palabras[t] == 'o' || palabras[t] == 'i' || palabras[t] == 'u') {
                System.out.println(palabras[t]);
            }
        }
        char[] vocales = {'a', 'b', 'i', 'o', 'u', 'r', 'j', 'e', 't', 's', 'p', 'k', 'x'};
        for (int i = 0; i < vocales.length; i++) {
            if (vocales[i] == 'a' || vocales[i] == 'e' || vocales[i] == 'i' || vocales[i] == 'o' || vocales[i] == 'u'){
                System.out.println(vocales[i] + " : Es una vocal");
            }else {
                System.out.println(vocales[i] + " : Es una consonante");

            }

        }
    }
}