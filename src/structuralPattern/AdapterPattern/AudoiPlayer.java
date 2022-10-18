package structuralPattern.AdapterPattern;

public class AudoiPlayer {
    private MediaAdapter mediaAdapter = null;

    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("MP3")) {
            System.out.println("play MP3 :" + fileName);
        } else if (mediaType.equalsIgnoreCase("MP4") || mediaType.equalsIgnoreCase("vic")) {
            mediaAdapter = new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType, fileName);
        } else {
            System.out.println("not support " + mediaType + " file");
        }
    }
}
