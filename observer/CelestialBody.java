package observer;

class CelestialBody {
    private String name;
    private String currentLocation;

    public CelestialBody(String name, String currentLocation) {
        this.name = name;
        this.currentLocation = currentLocation;
    }

    public String getName() {
        return name;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
}
