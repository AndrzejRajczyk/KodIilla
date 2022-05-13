
package com.kodilla.good.patterns.challenges.food;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 class Purchaserunner {
    GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
    HealthyShop healthyShop = new HealthyShop();
    ExtraFoodShop extraFoodShop = new ExtraFoodShop();
    Supplier suplierGlutenfree = new Supplier("glutenFreeShop");
    Supplier supplierHealthy = new Supplier("healthyShop");
    Supplier supplierExtraFood = new Supplier("ExtraFoodShop");


    void purchaserunner(Order order) {


        order.getFullorder().entrySet().stream()
                .filter(o -> (o.getKey().getSupplier().equals("glutenFreeShop")))
                .map(o->o.getValue())
                .forEach(epurchase->glutenFreeShop.process(epurchase));


        order.getFullorder().entrySet().stream()
                .filter(o -> (o.getKey().getSupplier().equals("healthyShop")))
                .map(o->o.getValue())
                .forEach(epurchase->healthyShop.process(epurchase));


       order.getFullorder().entrySet().stream()
                .filter(o -> (o.getKey().getSupplier().equals("ExtraFoodShop")))
               .map(o->(o.getValue()))
               .forEach(epurchase->extraFoodShop.process(epurchase));


    }


    public static void main(String[] args) {
         Purchaserunner purchaserunner1 = new Purchaserunner();


        Buyer buyer1 = new Buyer("Lock", "JLock");
        Buyer buyer2 = new Buyer("Sawer", "JSawer");
        Product product1 = new Product("Cake", 100, purchaserunner1.suplierGlutenfree);
        Product product2 = new Product("Butter", 5, purchaserunner1.supplierHealthy);
        Product product3 = new Product("Potatos", 4, purchaserunner1.supplierExtraFood);
        Purchase purchase1 = new Purchase(product1, 1, buyer1);
        Purchase purchase2 = new Purchase(product2, 3, buyer1);
        Purchase purchase3 = new Purchase(product3, 2, buyer2);
        Order fullOrder1 = new Order();
        fullOrder1.add(purchaserunner1.suplierGlutenfree, purchase1);
        fullOrder1.add(purchaserunner1.supplierHealthy, purchase2);
        Order fullOrder2 =  new Order();
        fullOrder2.add(purchaserunner1.supplierHealthy, purchase3);

        purchaserunner1.purchaserunner(fullOrder1);
        purchaserunner1.purchaserunner(fullOrder2);


    }
}
