class UnitConverter {
    public static double convertKmToMiles(double km) { return km * 0.621371; }
    public static double convertMilesToKm(double miles) { return miles * 1.60934; }
    public static double convertMetersToFeet(double m) { return m * 3.28084; }
    public static double convertFeetToMeters(double f) { return f * 0.3048; }
    public static double convertYardsToFeet(double y) { return y * 3; }
    public static double convertFeetToYards(double f) { return f * 0.333333; }
    public static double convertMetersToInches(double m) { return m * 39.3701; }
    public static double convertInchesToMeters(double i) { return i * 0.0254; }
    public static double convertInchesToCm(double i) { return i * 2.54; }
    public static double convertFarhenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public static double convertCelsiusToFarhenheit(double c) { return (c * 9 / 5) + 32; }
    public static double convertPoundsToKilograms(double p) { return p * 0.453592; }
    public static double convertKilogramsToPounds(double k) { return k * 2.20462; }
    public static double convertGallonsToLiters(double g) { return g * 3.78541; }
    public static double convertLitersToGallons(double l) { return l * 0.264172; }
}

public class UnitConverterProgram {
    public static void main(String[] args) {
        System.out.println(UnitConverter.convertKmToMiles(10));
        System.out.println(UnitConverter.convertMilesToKm(6.2));
    }
}
