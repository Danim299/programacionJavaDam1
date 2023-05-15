package Ejercicio3OO;

public class Alumno {
    
    private Asignatura si = new Asignatura(1,0);
    private Asignatura bbdd = new Asignatura(2,0);
    private Asignatura prog = new Asignatura(3,0);

    public Alumno( Asignatura a, Asignatura b, Asignatura c) {
        si=a;
        bbdd=b;
        prog=c;
    }

    public void setSi(Asignatura si) {
        this.si = si;
    }

    public void setBbdd(Asignatura bbdd) {
        this.bbdd = bbdd;
    }

    public void setProg(Asignatura prog) {
        this.prog = prog;
    }
    
    public Asignatura getSi() {
        return si;
    }

    public Asignatura getBbdd() {
        return bbdd;
    }

    public Asignatura getProg() {
        return prog;
    }
    
}
