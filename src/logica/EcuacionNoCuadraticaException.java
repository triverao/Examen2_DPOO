package logica;

public class EcuacionNoCuadraticaException extends Exception {

    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        return "a no puede ser 0: la ecuación no sería de segundo grado.";
    }
}