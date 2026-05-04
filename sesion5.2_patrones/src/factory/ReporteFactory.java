package factory;

import java.util.List;
import model.Reporte;

public abstract class ReporteFactory {

    public abstract Reporte crearReporte();

    public void generar(List<String> datos) {
        Reporte reporte = crearReporte();
        reporte.exportar(datos);
    }
}
