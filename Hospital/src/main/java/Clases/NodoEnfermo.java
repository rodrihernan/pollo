package Clases;

public class NodoEnfermo {

    public Enfermo e;
    public NodoEnfermo sgte;

    public NodoEnfermo(Enfermo e, NodoEnfermo sgte) {
        this.e = e;
        this.sgte = sgte;
    }

}
