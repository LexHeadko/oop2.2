package Transport;

public class Truck extends Car {
    public Truck(String modelName, int wheelesCount) {
        super(modelName, wheelesCount);
    }

    @Override
    public void service() {
        super.service();
        this.checkTrailer();
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
