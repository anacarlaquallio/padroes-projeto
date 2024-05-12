class Star {
    private String name;
    private double luminosity;
    private double temperature;
    private double mass;

    public Star(String name, double luminosity, double temperature, double mass) {
        this.name = name;
        this.luminosity = luminosity;
        this.temperature = temperature;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", luminosity=" + luminosity +
                ", temperature=" + temperature +
                ", mass=" + mass +
                '}';
    }
}