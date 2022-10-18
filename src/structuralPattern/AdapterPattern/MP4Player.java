package structuralPattern.AdapterPattern;

public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVIC(String mediaType, String fileName) {
    }

    @Override
    public void playMP4(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("MP4")) {
            System.out.println("play MP4 :" + fileName);
        } else {
            System.out.println("not support " + mediaType + " file");
        }
    }
}
