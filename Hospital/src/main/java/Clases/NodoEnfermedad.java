package Clases;

public class NodoEnfermedad {

    public Enfermedad e;
    public NodoEnfermedad sgte;

    public NodoEnfermedad(Enfermedad e, NodoEnfermedad sgte) {
        this.e = e;
        this.sgte = sgte;
    }

}
