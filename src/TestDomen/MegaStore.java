package TestDomen;

public class MegaStore {

    public enum DiscountType {
        Standard,
        Seasonal,
        Weight;
    }

    public static double getDiscountedPrice(double cartWeight,
                                            double totalPrice,
                                            DiscountType discountType) {


        switch (discountType) {
            case Standard:
                // 6 % discont
                return totalPrice * 0.94;
            case Seasonal:
                //12 % discount
                return totalPrice * 0.88;
            case Weight:
                // If cart weight <= 10kg, apply 6% discount, else apply 18% discount
                if (cartWeight <= 10) {
                    return totalPrice * 0.94;  // Apply 6% discount
                } else {
                    return totalPrice * 0.82;  // Apply 18% discount
                }
            default:
                return totalPrice;
        }
    }

    public static void main(String[] args) {
        System.out.println(getDiscountedPrice(12, 100, DiscountType.Weight));
    }
}