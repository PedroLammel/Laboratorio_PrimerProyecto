import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
public class PruebaScheduler {
    public static void main(String[] args) {
        // Crear una instancia de TareaMonitoreo
        TareaMonitoreo tareaMonitoreo = new TareaMonitoreo();

        ScheduledExecutorService scheduler = java.util.concurrent.Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(tareaMonitoreo, 1, 3, TimeUnit.SECONDS);

        try {
            // Mantener el programa en ejecución durante un tiempo para observar la tarea programada
            Thread.sleep(20000); // 20 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            scheduler.shutdown();
        }
    }
}
