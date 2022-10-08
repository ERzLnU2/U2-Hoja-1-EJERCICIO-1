package com.solomongo.cajaahorro;
/*

👉 1.- Suponemos una clase CajaAhorro que permite mantener el registro de 
depósitos y giros de una cuenta..

✅ atributos:
        
• private int saldo
• private int transacciones (El número de transacciones serán el número de 
                            depósitos y giros realizados)
✅ métodos:
        
• depositar (int cantidad): permite depositar el valor de la cantidad a la cuenta.
• girar (int cantidad): permite registrar un giro por el valor de cantidad
• obtenerSaldo(): retorna el saldo de la cuenta (valor int)
• obtenerTransacciones(): retorna la cantidad total de transacciones (giros y
                          depósitos) que se han hecho sobre la cuenta (valor int)
👉🏻 acciones:
        
✅ a) Define un constructor sin parámetros que inicialice el saldo y las 
      transacciones a 0.

✅ b) Define un constructor que recibe el saldo inicial de la cuenta e 
      inicialice las transacciones a 1.
        
✅ c) Crea un programa principal que cree un objeto de tipo CajaAhorro con el 
      constructor sin parámetros y realice un depósito de dinero, nos muestre el 
      saldo, realice un giro, vuelve a consultar el saldo, y por último nosdice 
      cuántas transacciones hemos hecho.
        
✅ d) Crea un objeto en el programa principal que cree un objeto de tipo 
      CajaAhorro con un saldo inicial de 200. Muestra el saldo y el número de
      transacciones..*/

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CajaAhorro {
    public static void main(String[] args) {  
        // atributos
        double totalCuenta;
        double totalGiro;
        double saldoInicial;
        double totalDeposito;
        
        /////// constructores //////
        Cuenta Cuenta= new Cuenta();
        Cuenta.setSaldoInicial(1);
        Cuenta.setSaldo(0);
        Cuenta.setTransacciones(0);
        
        System.out.print("\n\n\tSALDO INICIAL: ");        
        System.out.print(saldoInicial=Cuenta.getSaldoInicial()); //llama al objeto que contiene el valor! (double..)
        System.out.println("$\n-------------------------------------\n");
              
/////////////////// Depositos //////////////////
String depositarCuenta; 
double depositoCuenta; 
depositarCuenta =JOptionPane.showInputDialog(">>> CANTIDAD DEPOSITO >>>"); 
depositoCuenta = Double.parseDouble(depositarCuenta);
totalDeposito=saldoInicial+depositoCuenta;
System.out.print(" (+) Deposito: "+totalDeposito+"$\t= Saldo Actual: ");
System.out.print(totalDeposito);
System.out.println("$\n\n>>>>---------------------------\n");      
double totalCuenta2;
totalCuenta2=totalDeposito;

/////////////////// Giros //////////////////
String girarCuenta; 
double giroCuenta; 
girarCuenta =JOptionPane.showInputDialog(">>> CANTIDAD A GIRAR >>> "); 
giroCuenta = Double.parseDouble(girarCuenta);
totalGiro=totalCuenta2-giroCuenta;
System.out.print(" (-) Giro: "+girarCuenta+"$\t= Saldo Total: ");
double totalCuenta3;
totalCuenta3=totalGiro;
totalCuenta=(totalCuenta3-totalGiro);
System.out.print(totalCuenta3); 
System.out.println("$\n\n>>>>---------------------------\n");
System.out.print("\t TOTAL CUENTA: "+totalCuenta3+"$\n");

/////////////////// Transacciones //////////////////
        System.out.print("\t* total transacciones: ");
        System.out.print(Cuenta.getTransacciones());  
       DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("\n\t yyyy/MMMM/dd HH:mm:ss");
       System.out.println("\t"+dtf3.format(LocalDateTime.now()));
        System.out.print("\n---------------------------\n");        
        System.out.println("\tGRACIAS POR SU VISITA..\n\n");
    }
}
    

