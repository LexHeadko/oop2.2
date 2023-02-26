package Transport;

public abstract class Transport {
    private final int wheelsCount;
    private final String modelName;

    public Transport(String modelName, int wheelesCount) {
        this.wheelsCount = wheelesCount;
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void service() {
        System.out.println("Обслуживаем " + this.modelName);
        for (int i = 0; i < this.wheelsCount; i++) {
            this.updateTyre();
        }
    }
}