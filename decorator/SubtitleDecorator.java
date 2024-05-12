package decorator;

public abstract class SubtitleDecorator implements Episode {
    protected Episode decoratedEpisode;

    public SubtitleDecorator(Episode decoratedEpisode) {
        this.decoratedEpisode = decoratedEpisode;
    }

    @Override
    public void play() {
        decoratedEpisode.play();
    }
}
