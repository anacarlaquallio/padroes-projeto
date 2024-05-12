package decorator;

public class Main {
    public static void main(String[] args) {
        // Episódio original
        Episode cosmosEpisode = new CosmosEpisode("The Shores of the Cosmic Ocean");

        // Adicionando legendas em português
        Episode portugueseSubtitledEpisode = new PortugueseSubtitle(cosmosEpisode);
        portugueseSubtitledEpisode.play();

        System.out.println();

        // Adicionando legendas em espanhol
        Episode spanishSubtitledEpisode = new SpanishSubtitle(cosmosEpisode);
        spanishSubtitledEpisode.play();
    }
}
