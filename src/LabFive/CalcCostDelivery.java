package LabFive;

public class CalcCostDelivery {

    // Вартість доставки
    private final static double deliveryPrice = 50;



    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice()
                + deliveryPrice;
    }
}
