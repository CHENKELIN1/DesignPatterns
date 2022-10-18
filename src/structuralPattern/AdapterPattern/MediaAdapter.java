package structuralPattern.AdapterPattern;

public class MediaAdapter {
    private AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("MP4")) {
            advancedPlayer = new MP4Player();
        } else if (mediaType.equalsIgnoreCase("vic")) {
            advancedPlayer = new VICPlayer();
        }
    }

    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("MP4")) {
            advancedPlayer.playMP4(mediaType, fileName);
        } else if (mediaType.equalsIgnoreCase("VIC")) {
            advancedPlayer.playVIC(mediaType, fileName);
        }
    }
}
