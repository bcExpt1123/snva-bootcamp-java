package mediaplayer;

public class Video implements Media {
    // Implementation specific to video files

    @Override
    public void play() {
        // Play video logic
        System.out.println("Pause Video.");
    }

    @Override
    public void pause() {
        // Pause video logic
        System.out.println("Pause Video.");
    }

    @Override
    public void stop() {
        // Stop video logic
        System.out.println("Stop Video.");
    }

    @Override
    public void seek(int position) {
        // Seek video logic
        System.out.println("Seek Video.");
    }
}