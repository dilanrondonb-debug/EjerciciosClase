package co.edu.uniquindio.poo.app2;

import co.edu.uniquindio.poo.model2.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<envio> envios = new ArrayList<>();
        envios.add(new envioNacional("N1", "Ana", 2f, "Pereira", true));
        envios.add(new envioInternacional("I1", "Luis", 2f, "España", true));
        envios.add(new envioExpres("E1", "Sara", 2f, "Cali", true, 24));

        for (envio e : envios) {
            System.out.println(e.getCodigo() + ": " + e.obtenerCostoEnvio());
        }
    }
}
