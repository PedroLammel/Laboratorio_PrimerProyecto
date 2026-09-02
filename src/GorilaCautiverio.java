
public class GorilaCautiverio  implements Gorila {
    private int comidaTotal = 0;
    private final int comidaCautiverio = 15;
    private final String tipoComida = "Frutas";

    @Override
    public void buscarComida(){
        System.out.println("El gorila busca la comida en el punto de entrega y consigue "+
        comidaCautiverio + " " +tipoComida);
        comidaTotal += comidaCautiverio;
    }

    public int getComidaTotal() {
        return comidaTotal;
    }

    public void setComidaTotal(int comidaTotal) {
        this.comidaTotal = comidaTotal;
    }

    public int getComidaCautiverio() {
        return comidaCautiverio;
    }

    public String getTipoComida() {
        return tipoComida;
    }
}
