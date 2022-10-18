package structuralPattern.AdapterPattern;

public class VICPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVIC(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("VIC")) {
            System.out.println("play VIC :" + fileName);
        } else {
            System.out.println("not support " + mediaType + " file");
        }
    }

    @Override
    public void playMP4(String mediaType, String fileName) {

    }
}
