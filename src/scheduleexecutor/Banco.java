package scheduleexecutor;

public class Banco {
    private int dineroTotal = 10000;
    private int dineroPrestado;

    public Banco() {
    }

    public synchronized int getDineroTotal() {
        return dineroTotal;
    }

    public synchronized int getDineroPrestado() {
        return dineroPrestado;
    }

    public synchronized int getDineroDisponible() {
        return dineroTotal - dineroPrestado;
    }

    public synchronized boolean prestarDinero(int cantidad) {
        boolean aprobado = false;
        if (!(cantidad <= 0 || cantidad > getDineroDisponible())) {
            dineroPrestado += cantidad;
            mostrarEstado("retiro aprobado", cantidad);
            aprobado = true;
        }
        return aprobado;
    }

    public synchronized void depositarDinero(int cantidad) {
        if (cantidad > 0) {
            dineroTotal += cantidad;
            mostrarEstado("deposito recibido", cantidad);
        }
    }

    public synchronized void devolverPrestamo(int cantidad) {
        if (!(cantidad <= 0 || cantidad > dineroPrestado)) {
            dineroPrestado -= cantidad;
            mostrarEstado("prestamo devuelto", cantidad);
        }
    }

    private void mostrarEstado(String operacion, int cantidad) {
        System.out.printf( Thread.currentThread().getName() + ": " + operacion + " | cantidad: " + cantidad + " | disponible: " + getDineroDisponible() + " | prestado: " + dineroPrestado + "\n");
    }
}
