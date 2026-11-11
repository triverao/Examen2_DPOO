package logica;

public class RaicesComplejasException extends Exception {

    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        return "Las raíces son complejas (discriminante negativo).";
    }
}