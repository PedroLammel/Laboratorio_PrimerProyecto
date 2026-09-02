import java.util.Random;

public class DelfinCautiverio implements Delfin{
    private int saltosHechos = 0;

    @Override
    public void nadar(){
        int saltos;
        Random s = new Random();
        saltos = s.nextInt(15);
        System.out.println("Mientras nadaba en el delfinário, el delfin saltó " + saltos + " veces");
    }
    public int getSaltosHechos() {
        return saltosHechos;
    }
    public void setSaltosHechos(int saltosHechos) {
        this.saltosHechos = saltosHechos;
    }

}
