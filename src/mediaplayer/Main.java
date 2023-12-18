package mediaplayer;

/**
 * You are building a media player application
 * that supports various types of media,
 * such as audio and video files.
 * Explain how you would use polymorphism
 * and interfaces to create a flexible
 * and extensible system for handling different media types.
 */

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        Media audio = new Audio();
        mediaPlayer.playMedia(audio);    // Play audio

        Media video = new Video();
        mediaPlayer.playMedia(video);    // Play video

        mediaPlayer.pauseMedia(audio);   // Pause audio

        mediaPlayer.stopMedia(video);    // Stop video
    }
}
