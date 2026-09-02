package scheduleexecutor;

public class ClienteExtractor implements Runnable {
    private final Banco banco;
    private final int cantidad;

    public ClienteExtractor(Banco banco, int cantidad) {
        this.banco = banco;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        if (banco.prestarDinero(cantidad)) {
            int tiempoespera = (int) (Math.random() * 10000);
            try {
                Thread.sleep(tiempoespera);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                banco.devolverPrestamo(cantidad);
            }
        } else {
            System.out.printf(Thread.currentThread().getName() + " retiro rechazado | cantidad:"+cantidad+" | disponible:"+ banco.getDineroDisponible() + "\n");
        }
    }
}
