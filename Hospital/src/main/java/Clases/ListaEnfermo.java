package Clases;

public class ListaEnfermo {

    public NodoEnfermo cab;
    public int nEnfermos;

    public ListaEnfermo() {
        cab = null;
        nEnfermos = 0;
    }

    // Insertar nuevo enfermo
    public void insertarEnfermo(Enfermo e) {
        NodoEnfermo nuevo = new NodoEnfermo(e, null);
        if (cab == null) {
            cab = nuevo;
        } else {
            NodoEnfermo actual = cab;
            while (actual.sgte != null) {
                actual = actual.sgte;
            }
            actual.sgte = nuevo;
        }
        nEnfermos++;
    }

    // Buscar enfermo por DNI
    public void buscarEnfermo(String dni) {
        NodoEnfermo actual = cab;
        boolean sw = false;
        while (actual != null) {
            if (actual.e.dni.equalsIgnoreCase(dni)) {
                System.out.println(actual.e);
                sw = true;
                break;
            }
            actual = actual.sgte;
        }
        if (!sw) {
            System.out.println("No se encontró el enfermo con ese DNI.");
        }
    }

    // Listar todos los enfermos
    public void listarEnfermos() {
        NodoEnfermo actual = cab;
        while (actual != null) {
            System.out.println(actual.e.toString()); // Asegúrate que Enfermo tenga toString()
            actual = actual.sgte;
        }
    }

    // Lista de enfermos numerada
    public void listaDeEnfermos() {
        NodoEnfermo actual = cab;
        int x = 1;
        while (actual != null) {
            System.out.println(x + ". " + actual.e.nombres); // Asegúrate que haya getNombre()
            actual = actual.sgte;
            x++;
        }
    }

    // Buscar enfermos por nombre de enfermedad
    public void buscarPorEnfermedad(String enfermedadBuscada) {
        NodoEnfermo actual = cab;
        boolean encontrado = false;
        while (actual != null) {
            if (actual.e.nombres.equalsIgnoreCase(enfermedadBuscada)) {
                System.out.println(actual.e);
                encontrado = true;
            }
            actual = actual.sgte;
        }
        if (!encontrado) {
            System.out.println("No se encontraron enfermos con esa enfermedad.");
        }
    }
}
