package model;

import java.util.List;

public class ReporteCSV implements Reporte {

    @Override
    public void exportar(List<String> datos) {
        System.out.println("Exportando reporte en formato CSV");
        System.out.println("Datos:");
        for (String d : datos) {
            System.out.println(d);
        }
    }
}
