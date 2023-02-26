package Transport;

public class Truck extends Transport {
    public Truck(String modelName, int wheelesCount) {
        super(modelName, wheelesCount);
    }

    @Override
    public void service() {
        super.service();
        this.checkEngine();
        this.checkTrailer();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
