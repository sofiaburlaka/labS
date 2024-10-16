package LabFive;


public class CalcCostBase {


    public double calcCost(Product product) {
        return product.getQuota() * product.price;
    }
}
