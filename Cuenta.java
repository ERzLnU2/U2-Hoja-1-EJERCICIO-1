package com.solomongo.cajaahorro;
public class Cuenta {

    //atributos de clase Cuenta:
    private double saldoInicial;
    private double saldo;   
    private double transacciones;
    private double depositoCuenta; 
    private double giroCuenta;
    double saldoIni; 
    double sal; 
    double trans;
    public Cuenta() // constructor sin param, 
    {
    }
    
    public Cuenta(double saldo, double saldoInicial, double transacciones,
                  double depositoCuenta, double giroCuenta ) // constructor con param: atributos de la clase: 
    {                                  
        
    //con this se ASIGNA valor de sal AL atributo saldo:
    this.saldoInicial=saldoIni;
    this.saldo=sal;                   // (se iguala al parametro del constructor).                    
    this.transacciones=trans; // idem: LO QUE CONTENGA trans --> se almacena en el atributo (this.transacciones)
    }             // con este constructor con pareamteros SE DAN valores sin GET NI SET.
       
     // metodos get retorna: asi que public y hacen falta dos: con sus tipos.
     public double getDepositoCuenta() {
     return depositoCuenta; }
   
     public double getGiroCuenta() {
     return giroCuenta; }
       
     public double getSaldoInicial() {
     return saldoInicial; }
     
     public double getSaldo() {
     return saldo; }
    
     public double getTransacciones() {
     return transacciones;  }
    
     //metodos sets, no retornan: meten los datos 
     public void setSaldoInicial(double sal)  {
     this.saldoInicial=saldoIni; transacciones++;    }
     
     public void setDepositoCuenta(double deposito)  {
     this.depositoCuenta=deposito; transacciones++;   }
      
     public void setGiroCuenta(double giro)  {
     this.giroCuenta=giro;  transacciones++;  }
      
     public void setSaldo(double sal) {
     this.saldo=sal;transacciones++;  } //dice que el atributo sal --> se almacena en el primero: saldo.
    
     public void setTransacciones(double trans) {
     this.transacciones=trans; transacciones++;}
 
    
}
