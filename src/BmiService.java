public class BmiService {
    public int calculate(double heightInMeters, int weightInKilograms) {
        double bmi;
        bmi = weightInKilograms / Math.pow(heightInMeters, 2);
        return (int) bmi;
    }
}
