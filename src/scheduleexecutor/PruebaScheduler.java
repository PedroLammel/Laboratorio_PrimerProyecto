package scheduleexecutor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PruebaScheduler {
    public static void main(String[] args) {
        Banco banco = new Banco();
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("=== Inicio Prueba ===");
        System.out.println("Depositos cada 5 s | retiros cada 7 s | duracion: 60 s");
        System.out.println();
        executor.scheduleAtFixedRate(new ClienteDepositador(banco, 1500), 0, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(new ClienteExtractor(banco, 3000), 0, 7, TimeUnit.SECONDS);

        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            executor.shutdown();
            try {
                if (!executor.awaitTermination(2, TimeUnit.SECONDS)) {
                    executor.shutdownNow();
                }
            } catch (InterruptedException e) {
                executor.shutdownNow();
                Thread.currentThread().interrupt();
            }
            System.out.println("\n=== Prueba finalizada ===");
        }
    }
}
