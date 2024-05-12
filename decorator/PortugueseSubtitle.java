package decorator;

public class PortugueseSubtitle extends SubtitleDecorator {
    public PortugueseSubtitle(Episode decoratedEpisode) {
        super(decoratedEpisode);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Legendas em português disponíveis.");
    }
}