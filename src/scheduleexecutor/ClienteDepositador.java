package scheduleexecutor;

public class ClienteDepositador implements Runnable {
    private final Banco banco;
    private final int cantidad;

    public ClienteDepositador(Banco banco, int cantidad) {
        this.banco = banco;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        banco.depositarDinero(cantidad);
    }
}
