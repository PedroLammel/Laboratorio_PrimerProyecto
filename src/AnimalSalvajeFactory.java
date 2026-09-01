public class AnimalSalvajeFactory implements AnimalFactory {

    @Override
    public Loro createLoro() {
        return new LoroSalvaje();
    }

    @Override
    public Delfin createDelfin() {
        return new DelfinSalvaje();
    }

    @Override
    public Gorila createGorila() {
        return new GorilaSalvaje();
    }

}
