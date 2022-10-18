package structuralPattern.AdapterPattern;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String file = null;
        String fileName = null;
        String audioType = null;
        AudoiPlayer audoiPlayer = new AudoiPlayer();
        while (in.hasNext()) {
            file = in.nextLine();
            if (!file.equalsIgnoreCase("end")) {
                fileName = file.substring(0, file.lastIndexOf("."));
                audioType = file.substring(file.lastIndexOf(".") + 1);
                audoiPlayer.play(audioType, fileName);
            } else {
                break;
            }
        }
    }
}
