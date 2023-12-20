package mediaplayer.v1;

public class Audio implements Media {
    // Implementation specific to audio files

    public void play() {
        // Play audio logic
        System.out.println("Play audio.");
    }

    public void pause() {
        // Pause audio logic
        System.out.println("Pause Audio.");
    }

    public void stop() {
        // Stop audio logic
        System.out.println("Stop Audio.");
    }

    public void seek(int position) {
        // Seek audio logic
        System.out.println("Seek Audio " + position);
    }
}