package co.edu.uniquindio.poo.model2;

public abstract class envio {
 private final String codigo;
 private final String destinatario;
 private final float peso;

 public envio(String codigo, String destinatario, float peso) {
     this.codigo = codigo;
     this.destinatario = destinatario;
     this.peso = peso;
 }
 public String getCodigo() {return codigo;}
 public String getDestinatario() {return destinatario;}
 public double getPeso() {return peso;}
 public abstract double obtenerCostoEnvio();

}
