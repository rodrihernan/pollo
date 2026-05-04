package factory;

import model.Reporte;
import model.ReportePDF;

public class PDFFactory extends ReporteFactory {

    @Override
    public Reporte crearReporte() {
        return new ReportePDF();
    }
}
