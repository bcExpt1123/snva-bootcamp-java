package mediaplayer;

public interface Media {
    void play();
    void pause();
    void stop();
    void seek(int position);
}