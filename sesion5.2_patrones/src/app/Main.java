package app;

import factory.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese formato (pdf, excel, csv): ");
        String tipo = sc.nextLine().toLowerCase();

        ReporteFactory factory;

        switch (tipo) {
            case "pdf":
                factory = new PDFFactory();
                break;
            case "excel":
                factory = new ExcelFactory();
                break;
            case "csv":
                factory = new CSVFactory();
                break;
            default:
                System.out.println("Formato no válido");
                return;
        }

        // Datos de ejemplo
        List<String> datos = new ArrayList<>();
        datos.add("Venta 1 - S/100");
        datos.add("Venta 2 - S/200");
        datos.add("Venta 3 - S/300");

        // Generar reporte
        factory.generar(datos);
    }
}
