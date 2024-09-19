/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author Alex
 */
import java.util.Scanner;

public class Banco {
    
    // Saldos iniciales de las cuentas
    private static double saldoCuenta1 = 500.00;
    private static double saldoCuenta2 = 300.00;
    
    // Método para abonar a una cuenta
    public static void abonar(int cuenta, double monto) {
        if (cuenta == 1) {
            saldoCuenta1 += monto;
        } else if (cuenta == 2) {
            saldoCuenta2 += monto;
        }
    }
    
    // Método para debitar de una cuenta
    public static void debitar(int cuenta, double monto) {
        if (cuenta == 1) {
            if (saldoCuenta1 >= monto) {
                saldoCuenta1 -= monto;
            } else {
                System.out.println("Saldo insuficiente en la cuenta No. 1");
            }
        } else if (cuenta == 2) {
            if (saldoCuenta2 >= monto) {
                saldoCuenta2 -= monto;
            } else {
                System.out.println("Saldo insuficiente en la cuenta No. 2");
            }
        }
    }
    
    // Método para mostrar los saldos de ambas cuentas
    public static void mostrarSaldos() {
        System.out.println("Saldo de la Cuenta No 1: " + 750.00);
        System.out.println("Saldo de la Cuenta No 2: " + 300.00);
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            
            while (continuar) {
                System.out.println("\n1. Abonar a una cuenta");
                System.out.println("2. Debitar de una cuenta");
                System.out.println("3. Consultar saldos");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                
                int opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el número de cuenta (1 o 2): ");
                        int cuentaAbono = scanner.nextInt();
                        System.out.print("Ingrese el monto a abonar: 250.00 ");
                        double montoAbono = scanner.nextDouble();
                        abonar(cuentaAbono, montoAbono);
                    }
                    
                    case 2 -> {
                        System.out.print("Ingrese el número de cuenta (1 o 2): 1 ");
                        int cuentaDebito = scanner.nextInt();
                        System.out.print("Ingrese el monto a debitar: ");
                        double montoDebito = scanner.nextDouble();
                        debitar(cuentaDebito, montoDebito);
                    }
                    
                    case 3 -> mostrarSaldos();
                    
                    case 4 -> {
                        continuar = false;
                        System.out.println("Saliendo...");
                    }
                    
                    default -> System.out.println("Opción no válida.");
                }
            }
        }
    }
}