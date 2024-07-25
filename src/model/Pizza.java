package model;

import java.util.ArrayList;
import java.util.List;

public final class Pizza {
    private final String cheese;
    private final List<String> toppings;
    private final CrustType crustType;
    private final SizeType size;

    private Pizza(String cheese, List<String> toppings, CrustType crustType, SizeType size) {
        this.cheese = cheese;
        this.toppings = toppings;
        this.crustType = crustType;
        this.size = size;
    }
    public static class Builder {
        private String cheese;
        private List<String> toppings;
        private CrustType crustType;
        private SizeType size;

        public Builder(){
            this.cheese = "mussarela";
            this.toppings = new ArrayList<>();
            this.crustType = CrustType.THIN;
            this.size = SizeType.DEFAULT;
        }
        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }
        public Builder crust(CrustType crustType) {
            this.crustType = crustType;
            return this;
        }
        public Builder size(SizeType size) {
            this.size = size;
            return this;
        }
        public Pizza build() {
            return new Pizza(this.cheese, this.toppings, this.crustType, this.size);
        }

        public Builder addTopping(String topping) {
            if (topping == null) {
                this.toppings = new ArrayList<>();
            }
            this.toppings.add(topping);
            return this;
        }
    }


    public String getCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public CrustType getCrustType() {
        return crustType;
    }

    public SizeType getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "PIZZA:"
                + "\nCheese: " + cheese
                + "\nToppings: " + toppings
                + "\nCrustType: " + crustType
                + "\nSize: " + size;
    }
}
