package mediaplayer;

public class Audio implements Media {
    // Implementation specific to audio files

    @Override
    public void play() {
        // Play audio logic
        System.out.println("Play audio.");
    }

    @Override
    public void pause() {
        // Pause audio logic
        System.out.println("Pause Audio.");
    }

    @Override
    public void stop() {
        // Stop audio logic
        System.out.println("Stop Audio.");
    }

    @Override
    public void seek(int position) {
        // Seek audio logic
        System.out.println("Seek Audio " + position);
    }
}