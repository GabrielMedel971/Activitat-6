package com.company;
import java.util.Scanner; //importo la llibreria que em permet la entrada del teclat

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclat = new Scanner(System.in); //anomeno una variable per l'escaner i initzalitzo el mateix
        System.out.println("Per calcular el perimetre i el area d'un cuadrat introdueix el valor d'un dels costats del cuadrat:");
        int valorCostat  = teclat.nextInt(); //demano el valor del costat
        int perimetre = valorCostat *4;
        int area = valorCostat * valorCostat;
        System.out.println("El perimetre del cuadrat es: " + perimetre + " i el area del cuadrat es: " + area);

    }
}
