package decorator;

public class SpanishSubtitle extends SubtitleDecorator {
    public SpanishSubtitle(Episode decoratedEpisode) {
        super(decoratedEpisode);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Subtítulos en español disponibles.");
    }
}

