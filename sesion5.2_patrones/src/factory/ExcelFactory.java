package factory;

import model.Reporte;
import model.ReporteExcel;

public class ExcelFactory extends ReporteFactory {

    @Override
    public Reporte crearReporte() {
        return new ReporteExcel();
    }
}
