class StarDirector {
    private StarBuilder starBuilder;

    public StarDirector(StarBuilder starBuilder) {
        this.starBuilder = starBuilder;
    }

    public Star constructStar(String name, double luminosity, double temperature, double mass) {
        return starBuilder
                .setName(name)
                .setLuminosity(luminosity)
                .setTemperature(temperature)
                .setMass(mass)
                .build();
    }
}