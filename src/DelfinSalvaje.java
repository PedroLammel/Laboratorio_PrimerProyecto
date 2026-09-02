import java.util.Random;


public class DelfinSalvaje implements Delfin {
    private int kmRecorridos = 0;

    @Override
    public void nadar(){
        int kmDia;
        Random nado = new Random();
        kmDia = nado.nextInt(100);
        System.out.println("El delfín recorrió " + kmDia + " km en el dia");
        kmRecorridos += kmDia;
    }

    
    public int getKmRecorridos() {
        return kmRecorridos;
    }
    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}
