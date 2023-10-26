package pl.javastart.sales;

public class Offer {

    private boolean valid;
    private double value;
    private double percentage;

    protected void setValid(boolean valid) {
        this.valid = valid;
    }

    protected void setValue(double value) {
        this.value = value;
    }

    protected void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public boolean isValid() {
        return valid;
    }

    public double getValue() {
        return value;
    }

    public double getPercentage() {
        return percentage;
    }


}
