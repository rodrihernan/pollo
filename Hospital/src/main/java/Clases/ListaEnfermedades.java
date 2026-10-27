    package Clases;

public class ListaEnfermedades {

    public NodoEnfermedad cab = null;
    public int n = 0;

    public void insertarEnfermedad(Enfermedad e) {
        NodoEnfermedad nuevo = new NodoEnfermedad(e, null);
        if (cab == null) {
            cab = nuevo;
        } else {
            NodoEnfermedad actual = cab;
            while (actual.sgte != null) {
                actual = actual.sgte;
            }
            actual.sgte = nuevo;
        }
        n++;
    }

    public void listarEnfermedades() {
        NodoEnfermedad aux = cab;
        int i = 1;
        while (aux != null) {
            System.out.println(i + ". " + aux.e);
            aux = aux.sgte;
            i++;
        }
    }

    public void buscarEnfermedad(String nom) {
        NodoEnfermedad aux = cab;
        while (aux != null) {
            if (aux.e.nombre.equalsIgnoreCase(nom)) {
                System.out.println(aux.e);
                return;
            }
            aux = aux.sgte;
        }
        System.out.println("Enfermedad no encontrada");
    }

    public Enfermedad seleccionarEnfermedad() {
        int op = Basicas.LeerEntero("Elegir enfermedad:", 1, n);
        NodoEnfermedad aux = cab;
        for (int i = 1; i < op; i++) {
            aux = aux.sgte;
        }
        return aux.e;
    }
}
        
