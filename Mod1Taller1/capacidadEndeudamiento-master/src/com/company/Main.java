package com.company;

import clases.CapacidadEndedudamiento;
import javafx.scene.input.KeyCode;

import java.util.Scanner;

public class Main {
    //Recuerda que aca empieza todo
    public static void main(String[] args) {
        //Con este objeto de la clase Scanner puedes capturar informacion por consola cada ves que lo uses
        // recuerda cerrar el flujo de consulta cada ves lo uses sobre para que los uses in.close()
        final String SALIDA = "--- Para terminar escriba la palabra Salir.";
        final String INGRESOS =  "Por favor digite los Ingresos totales: ";
        final String GASTOS_FIJOS =  "Por favor digite los Gastos fijos: ";
        final String GASTOS_VARIABLES =  "Por favor digite los Gastos variables: ";
        final String UILICE_VALORES_NUMERICOS = "Utilice valores numéricos";

        int ingresosMensuales;
        int gastosFijos;
        int gastosVariables;

        Scanner in = new Scanner(System.in);
        CapacidadEndedudamiento clase = new CapacidadEndedudamiento();

        while (true) {
            System.out.println(SALIDA);
            System.out.println(INGRESOS);
            String val1 = in.nextLine();
            if (isNumeric(val1)) {
                ingresosMensuales = Integer.parseInt(val1);
                clase.setIngresosTotales(ingresosMensuales);
            } else if (val1.equalsIgnoreCase("Salir")) {
                break;
            } else {
                System.out.println(UILICE_VALORES_NUMERICOS);
                continue;
            }
            System.out.println(GASTOS_FIJOS);
            val1 = in.nextLine();
            if (isNumeric(val1)) {
                gastosFijos = Integer.parseInt(val1);
                clase.setGastosFijos(gastosFijos);
            } else if (val1.equalsIgnoreCase("Salir")) {
                break;
            } else {
                System.out.println(UILICE_VALORES_NUMERICOS);
                continue;
            }

            System.out.println(GASTOS_VARIABLES);
            val1 = in.nextLine();
            if (isNumeric(val1)) {
                gastosVariables = Integer.parseInt(val1);
                clase.setGastoVaribales(gastosVariables);
            } else if (val1.equalsIgnoreCase("Salir")) {
                break;
            } else {
                System.out.println(UILICE_VALORES_NUMERICOS);
                continue;
            }

            System.out.println(clase.getProperties());
            System.out.println("Capacidad de Endeudamiento: " + clase.getCapacidadEndeudamiento());

            //Esto te dara la primera entrada al proceso de solicitar los datos para instancir nuestro objeto
            // CapacidadEndedudamiento()
            //Valida las entradas de los usuarios que no vayas a convertir una "A" numero y el calculo no te funcione
            //Utiliza el metodo is numeric para vada entrada de ser necesarios
        }
    }

    public static boolean isNumeric(String value) {
        // implementa un bloque try catch aca
        boolean resultado = true;
        try{
            Double valor = Double.parseDouble(value);
         }catch (NumberFormatException ex){
            resultado = false;
        }
        return resultado;
    }
}
