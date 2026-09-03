import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        AnimalFactory fabrica;
        Scanner in = new Scanner(System.in);
        int opcion;
        boolean correcto = false;
        while (!correcto){
            System.out.println("Elija que tipo de animales desea crear." +
            "1: Salvajes. 2: En Cautiverio" );
            opcion = in.nextInt();
            if (opcion == 1 ){
                fabrica = new AnimalSalvajeFactory();
                correcto = true;
            }
            else if (opcion == 2){
                fabrica = new AnimalCautiverioFactory();
                correcto = true;
            }
            else {
                System.out.println("Opcion invalida");
            }
        }
    

        
        

    }
}
