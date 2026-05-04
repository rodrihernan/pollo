package factory;

import model.Reporte;
import model.ReporteCSV;

public class CSVFactory extends ReporteFactory {

    @Override
    public Reporte crearReporte() {
        return new ReporteCSV();
    }
}
