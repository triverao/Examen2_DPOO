package logica;

public class Parcial {

    public String calcularRaices(double a, double b, double c)
            throws EcuacionNoCuadraticaException, RaicesComplejasException {

        if (a == 0) {
            throw new EcuacionNoCuadraticaException();
        }

        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            throw new RaicesComplejasException();
        }

        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        return "x=" + x1 + ", x=" + x2;
    }
}
