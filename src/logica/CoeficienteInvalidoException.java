package logica;

public class CoeficienteInvalidoException extends Exception {

    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        return "Los coeficientes no son válidos o son demasiado grandes.";
    }
}