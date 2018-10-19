package calculateMediaSize;

import java.text.MessageFormat;

public class Solution {

    public String solution(String input){
        String[] innputArray = input.split("\n");

        Size sizeClass = new Size();

        for (int i = 0; i < innputArray.length; i++){
            fetchSize(innputArray[i],sizeClass);
        }

        String output = "music "+sizeClass.musicSize+"b\n" +
                "images "+ sizeClass.imageSize +"b\n" +
                "movies "+ sizeClass.movieSize +"b\n" +
                "other "+ sizeClass.otherSize +"b";

        return output;
    }

    public void fetchSize(String input,Size sizeClass){

        String[] tmp = input.split(" ");
        String fileName = tmp[0];
        String size = tmp[1].substring(0,tmp[1].length()-1);
        int sizeL = Integer.valueOf(size);

        String[] innputArray = fileName.split("\\.");
        String ext = innputArray[innputArray.length-1];
        switch (ext.toLowerCase()){
            case "mp3": case "acc": case "flac":
                sizeClass.musicSize+=sizeL; break;
            case "jpg": case "bmp": case "gif":
                sizeClass.imageSize+=sizeL; break;
            case "mp4": case "avi": case "mkv":
                sizeClass.movieSize+=sizeL; break;
            default:
                sizeClass.otherSize+=sizeL; break;
        }
    }


    public static void main(String[] args) {
        String input = "my.song.mp3 11b\n" +
                "greatSong.flac 1000b\n" +
                "not3.txt 5b\n" +
                "video.mp4 200b\n" +
                "game.exe 100b\n" +
                "mov!e.mkv 10000b";
        Solution solution = new Solution();
        System.out.println(solution.solution(input));
    }

    class Size{
        int musicSize = 0;
        int imageSize = 0;
        int movieSize = 0;
        int otherSize = 0;
    }
}
