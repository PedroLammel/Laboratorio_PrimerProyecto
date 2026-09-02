import java.util.Random;

public class GorilaSalvaje implements Gorila {
    private int comidaTotal = 0;
    private final String tipoComida = "frutas, hojas y raíces";
    
    @Override
    public void buscarComida(){
        Random b = new Random();
        int comidaDia = b.nextInt(20) + 5;
        System.out.println("El gorila sale a buscar comida y encuentra " + comidaDia + " " + tipoComida);
    }

    public int getComidaTotal() {
        return comidaTotal;
    }

    public void setComidaTotal(int comidaTotal) {
        this.comidaTotal = comidaTotal;
    }

    public String getTipoComida() {
        return tipoComida;
    }
}
