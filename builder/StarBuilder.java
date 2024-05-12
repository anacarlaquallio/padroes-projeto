interface StarBuilder {
    StarBuilder setName(String name);
    StarBuilder setLuminosity(double luminosity);
    StarBuilder setTemperature(double temperature);
    StarBuilder setMass(double mass);
    Star build();
}