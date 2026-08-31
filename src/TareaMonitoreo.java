import java.time.LocalDateTime;
public class TareaMonitoreo implements Runnable {
    private int contador = 0;
    @Override
    public void run() {
        contador++;
        int tiempoEspera;
        LocalDateTime inicio = LocalDateTime.now();
        System.out.println("Tarea de monitoreo ejecutada " + contador + " veces. Fecha y hora actual: " + inicio);
        
        try {
            if(contador % 3 ==0){
                tiempoEspera = 6000; // 5 segundos
            }else{
                tiempoEspera = 500; // 1 segundo
            }
            Thread.sleep(tiempoEspera);
            LocalDateTime fin = LocalDateTime.now();
            System.out.println("Tarea de monitoreo "+ contador + " finalizada. Fecha y hora de finalización: " + fin + "\n Duró " + tiempoEspera + " milisegundos.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Tarea de monitoreo interrumpida.");
        }
    }
}
