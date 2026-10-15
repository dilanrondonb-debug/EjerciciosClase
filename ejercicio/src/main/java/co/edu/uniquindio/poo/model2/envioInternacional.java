package co.edu.uniquindio.poo.model2;

public class envioInternacional extends envio{
    private final double costoFijo=15000;
    private final String paisDestino;
    private final boolean necesitaSeguro;
    public envioInternacional(String codigo, String destinatario, float peso,
                              String paisDestino, boolean necesitaSeguro) {
        super(codigo, destinatario, peso);
        this.paisDestino=paisDestino;
        this.necesitaSeguro=necesitaSeguro;
    }
    @Override
    public double obtenerCostoEnvio(){
        double costo=costoFijo+9000*getPeso();
        if (necesitaSeguro) costo=costo+20000;
        return costo;
    }
}
