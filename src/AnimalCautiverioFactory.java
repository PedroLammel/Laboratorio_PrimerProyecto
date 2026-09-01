public class AnimalCautiverioFactory implements AnimalFactory {

    @Override
    public Loro createLoro() {
        return new LoroCautiverio();
    }


    @Override
    public Delfin createDelfin() {
        return new DelfinCautiverio();
    }

    @Override
    public Gorila createGorila() {
        return new GorilaCautiverio();
    }

}
