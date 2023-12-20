package mediaplayer.v1;

public class MediaPlayer {
    public void playMedia(Media media) {
        media.play();
    }

    public void pauseMedia(Media media) {
        media.pause();
    }

    public void stopMedia(Media media) {
        media.stop();
    }
}