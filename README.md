# U2-Hoja-1-EJERCICIO-1
POO con constructores en JAVA para sacar saldo, transacciones o giros bancarios a una clase Cuenta..

1.- Suponemos una clase CajaAhorro que permite mantener el registro de depósitos y giros de una cuenta.

    ✅ atributos:      
       • private int saldo.
       • private int transacciones (El número de transacciones serán el número de depósitos y giros realizados).
       
    ✅ métodos:      
       • depositar (int cantidad): permite depositar el valor de la cantidad a la cuenta.
       • girar (int cantidad): permite registrar un giro por el valor de cantidad.
       • obtenerSaldo(): retorna el saldo de la cuenta (valor int).
       • obtenerTransacciones(): retorna la cantidad total de transacciones,
         (giros y depósitos) que se han hecho sobre la cuenta (valor int).
         
    👉🏻 acciones:
        
    ✅ a) Define un constructor sin parámetros que inicialice el saldo y las transacciones a 0.

    ✅ b) Define un constructor que recibe el saldo inicial de la cuenta e inicialice las transacciones a 1.
        
    ✅ c) Crea un programa principal que cree un objeto de tipo CajaAhorro con el 
      constructor sin parámetros y realice un depósito de dinero, nos muestre el 
      saldo, realice un giro, vuelve a consultar el saldo, y por último nosdice 
      cuántas transacciones hemos hecho.
        
    ✅ d) Crea un objeto en el programa principal que cree un objeto de tipo 
      CajaAhorro con un saldo inicial de 200. Muestra el saldo y el número de
      transacciones..
      
      
 ![1](https://user-images.githubusercontent.com/80227002/194704459-ed05ec1e-bd18-4b78-84ab-c50d737a2218.png)


```java    
import javax.swing.JOptionPane;
public class CajaAhorro {
    public static void main(String[] args) {  
          double totalCuenta;
          double totalGiro;
          double saldoInicial;
          double totalDeposito;
              Cuenta Cuenta= new Cuenta();
              Cuenta.setSaldoInicial(1);
              Cuenta.setSaldo(0);
              Cuenta.setTransacciones(0);     
          System.out.print("\n\n\tSALDO INICIAL: ");        
          System.out.print(saldoInicial=Cuenta.getSaldoInicial());     
        String depositarCuenta; 
          double depositoCuenta; 
          depositarCuenta =JOptionPane.showInputDialog(">>> CANTIDAD DEPOSITO >>>"); 
          depositoCuenta = Double.parseDouble(depositarCuenta);
          totalDeposito=saldoInicial+depositoCuenta;
            System.out.print(" (+) Deposito: "+totalDeposito+"$\t= Saldo Actual: ");
            System.out.print(totalDeposito);     
          double totalCuenta2;
          totalCuenta2=totalDeposito;          
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
            System.out.print("\t TOTAL CUENTA: "+totalCuenta3+"$\n");
            System.out.print("\t* total transacciones: ");
            System.out.print(Cuenta.getTransacciones());    
    }
}
```

![2](https://user-images.githubusercontent.com/80227002/194704469-cdf92684-5b87-4319-8c3b-8b93e6e323d3.png)


```java
public class Cuenta {
    private double saldoInicial;
    private double saldo;   
    private double transacciones;
    private double depositoCuenta; 
    private double giroCuenta;
    double saldoIni; 
    double sal; 
    double trans;
    public Cuenta(){
    }
    public Cuenta(double saldo, double saldoInicial, double transacciones, double depositoCuenta, double giroCuenta){                   
    this.saldoInicial=saldoIni;
    this.saldo=sal;                                 
    this.transacciones=trans; 
    }              
     public double getDepositoCuenta() {
     return depositoCuenta; }   
     public double getGiroCuenta() {
     return giroCuenta; } 
     public double getSaldoInicial() {
     return saldoInicial; } 
     public double getSaldo() {
     return saldo; }
     public double getTransacciones() {
     return transacciones; 
     }
     public void setSaldoInicial(double sal)  {
     this.saldoInicial=saldoIni; transacciones++;    }
     public void setDepositoCuenta(double deposito)  {
     this.depositoCuenta=deposito; transacciones++;   }
     public void setGiroCuenta(double giro)  {
     this.giroCuenta=giro;  transacciones++;  }
     public void setSaldo(double sal) {
     this.saldo=sal;transacciones++;  
     } 
     public void setTransacciones(double trans) {
     this.transacciones=trans; transacciones++;}
}
```


![3](https://user-images.githubusercontent.com/80227002/194704473-6740530b-3e6e-4264-8bce-e535cf903595.png)

