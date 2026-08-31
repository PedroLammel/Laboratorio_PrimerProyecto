public class TerrestreFactory implements AnimalFactory {
    @Override
    public Animal crearAnimal() {
        return new Gorila();
    }
    
}
