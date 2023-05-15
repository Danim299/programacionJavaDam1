package EjercicioHerencia;

public class quad extends individuales{
    private boolean guardabarros;
    
    public quad(boolean guardabarros, int numRuedas, String matricula, String modelo) {
        super(numRuedas, matricula, modelo);
        this.guardabarros=guardabarros;
    }

    public boolean isGuardabarros() {
        return guardabarros;
    }

    public void setGuardabarros(boolean guardabarros) {
        this.guardabarros = guardabarros;
    }

    @Override
    public String toString() {
        return "quad{" + "guardabarros=" + guardabarros + '}';
    }
    
}
