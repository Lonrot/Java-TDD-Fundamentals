public class Main {
    public static void main(String[] args) {
        System.out.println(CompasIon.rotate(Compass.Point.NORTH, Compass.Direction.RIGHT));

        WordAnalyser analyser = new WordAnalyser();
        System.out.println(analyser.findLongestWords("angel ION"));
    }
}
