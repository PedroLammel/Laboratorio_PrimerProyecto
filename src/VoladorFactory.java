public class VoladorFactory implements AnimalFactory {
    @Override
    public Animal crearAnimal() {
        return new Loro();
    }
    
}
