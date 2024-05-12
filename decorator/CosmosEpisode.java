package decorator;

public class CosmosEpisode implements Episode {
    private String title;

    public CosmosEpisode(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo episódio: " + title);
    }
}
