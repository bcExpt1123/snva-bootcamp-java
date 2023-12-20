package mediaplayer.v1;

public class Video implements Media {
    // Implementation specific to video files

    public void play() {
        // Play video logic
        System.out.println("Play Video.");
    }

    public void pause() {
        // Pause video logic
        System.out.println("Pause Video.");
    }

    public void stop() {
        // Stop video logic
        System.out.println("Stop Video.");
    }
}