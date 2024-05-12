package observer;

class SpaceAgency implements Observer {
    private String name;

    public SpaceAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(CelestialBody celestialBody) {
        System.out.println("Agência espacial " + name + " recebeu atualização: " +
                           celestialBody.getName() + " está agora em " + celestialBody.getCurrentLocation());
    }
}
