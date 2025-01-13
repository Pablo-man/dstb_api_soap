package com.example.calculator;

public class SOAPCalculatorClient {
    public static void main(String[] args) {
        try {
            // Crear una instancia del servicio
            Calculator service = new Calculator();
            
            // Obtener el puerto del servicio
            CalculatorSoap port = service.getCalculatorSoap();
            
            // Realizar operaciones básicas
            int a = 10;
            int b = 5;
            
            // Llamar a los métodos del servicio
            int suma = port.add(a, b);
            int resta = port.subtract(a, b);
            int multiplicacion = port.multiply(a, b);
            int division = port.divide(a, b);
            
            // Imprimir los resultados
            System.out.println("Operaciones básicas:");
            System.out.println(a + " + " + b + " = " + suma);
            System.out.println(a + " - " + b + " = " + resta);
            System.out.println(a + " * " + b + " = " + multiplicacion);
            System.out.println(a + " / " + b + " = " + division);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
