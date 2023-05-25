package model.data;

import java.util.List;

public class CurrencyData {
    private String date;
    private List<Currency> currencies;

    public String getDate() {
        return date;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public static class Currency {
        private String code;
        private int quantity;
        private String rateFormated;
        private String diffFormated;
        private double rate;
        private String name;
        private double diff;
        private String date;
        private String validFromDate;

        public String getCode() {
            return code;
        }

        public int getQuantity() {
            return quantity;
        }

        public String getRateFormated() {
            return rateFormated;
        }

        public String getDiffFormated() {
            return diffFormated;
        }

        public double getRate() {
            return rate;
        }

        public String getName() {
            return name;
        }

        public double getDiff() {
            return diff;
        }

        public String getDate() {
            return date;
        }

        public String getValidFromDate() {
            return validFromDate;
        }

        @Override
        public String toString() {
            return "(" + code + ") " +
                    quantity + " - " +
                    name + " " +
                    rate + " GEL. " +
                    "Different: " + roundTo(diff, 3);
        }

        private Double roundTo(double value, int digits) {
            double d = Math.pow(10, digits);
            return Math.round(value * d) / d;
        }
    }
}