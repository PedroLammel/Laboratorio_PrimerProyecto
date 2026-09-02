import java.util.Random;

public class LoroSalvaje implements Loro {
    private boolean haMigrado = false;
    
    @Override
    public void volar(){
        Random v = new Random();
        if (v.nextInt(20000)>10000){
            haMigrado = true;
        }
        else {
            System.out.println("El loro voló por su casa");
        }
    }

    public boolean isHaMigrado() {
        return haMigrado;
    }

    public void setHaMigrado(boolean haMigrado) {
        this.haMigrado = haMigrado;
    }
}
