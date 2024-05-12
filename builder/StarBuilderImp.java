class StarBuilderImpl implements StarBuilder {
    private String name;
    private double luminosity;
    private double temperature;
    private double mass;

    @Override
    public StarBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StarBuilder setLuminosity(double luminosity) {
        this.luminosity = luminosity;
        return this;
    }

    @Override
    public StarBuilder setTemperature(double temperature) {
        this.temperature = temperature;
        return this;
    }

    @Override
    public StarBuilder setMass(double mass) {
        this.mass = mass;
        return this;
    }

    @Override
    public Star build() {
        return new Star(name, luminosity, temperature, mass);
    }
}