package Transport;

public class Car extends Transport{
    public Car(String modelName, int wheelesCount) {
        super(modelName, wheelesCount);
    }

    @Override
    public void service() {
        super.service();
        this.checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
