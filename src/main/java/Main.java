public class Main {
    public static void main(String[] args) {
        System.out.println(CompasIon.rotate(Compass.Point.NORTH, Compass.Direction.RIGHT));
        WordAnalyser wa = new WordAnalyser();
        wa.calculateLetterFrequency(" sr sg srg  ");
        wa.calculateLetterFrequency("Implement the logic to calculate the frequency of each letter in the given text");
    }
}
