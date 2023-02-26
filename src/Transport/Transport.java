package Transport;

public abstract class Transport {
    private final int wheelsCount;
    private final String modelName;

    public Transport(int wheelesCount, String modelName) {
        this.wheelsCount = wheelesCount;
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }
}
