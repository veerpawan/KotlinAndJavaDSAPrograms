package arrays;

public class Sample {

    private static Sample sample;

    private Sample() {

    }

    public static Sample getInstancee() {
        if (sample == null) {
            sample = new Sample();
        }
        return sample;

    }
}
