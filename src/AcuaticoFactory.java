public class AcuaticoFactory implements AnimalFactory {
    @Override
    public Animal crearAnimal() {
        return new Delfin();
    }
    
}
