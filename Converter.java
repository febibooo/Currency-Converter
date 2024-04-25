public class Converter {
    private double amount;

    public Converter(double amount) {
        this.amount = amount;
    }

    public double convertToUSD() {
        return amount * 0.000062;
    }

    public double convertToSGD() {
        return amount * 0.000084;
    }

    public double convertToJPY() {
        return amount * 0.0096;
    }
}
