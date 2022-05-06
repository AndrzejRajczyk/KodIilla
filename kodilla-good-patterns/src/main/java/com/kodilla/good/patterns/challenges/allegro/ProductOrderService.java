package com.kodilla.good.patterns.challenges.allegro;

public class ProductOrderService {
    private InformationService informationService;
    private PurchaseService purchaseService;
    private OrderChecker orderChecker;

    public ProductOrderService(InformationService informationService, PurchaseService purchaseService, OrderChecker orderChecker) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.orderChecker = orderChecker;

    }
     OrderSummary process(PurchaseRequesion purchaseRequesion) {
         boolean isOrder = purchaseService.purchase(purchaseRequesion.getBuyer(), purchaseRequesion.getProducts());

         if (isOrder = true) {
             informationService.inform(purchaseRequesion.getBuyer(),purchaseRequesion.getProducts());
             orderChecker.order(purchaseRequesion.getBuyer(), purchaseRequesion.getProducts());
             return new OrderSummary(purchaseRequesion.getBuyer(), true);
         }
         else {return new OrderSummary(purchaseRequesion.getBuyer(), false);
         }
     }
    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("John", "Silver", "Jsil", "jhnsilver@o2.pl");
        Buyer buyer2 = new Buyer("Jan", "Niezbędny", "Worek", "jann@gmail.com");

        Product product1 = new Product("lamp", 8888);
        Product product2 = new Product("rubber", 2222);
        Product product3 = new Product("laptop",1111);

        PurchaseService purchaseServiceimlements = new PurchaseServiceImplements();
        InformationService email = new Email();
        OrderChecker purchaseRepsitory = new PurchaseRepsitory();

        ProductOrderService service = new ProductOrderService(email,purchaseServiceimlements,purchaseRepsitory) ;
        PurchaseRequesion purchase1 = new PurchaseRequesion();
        purchase1.setBuyer(buyer1);
        purchase1.add(product1, 11);
        service.process (purchase1);
        System.out.println(purchase1);

        PurchaseRequesion purchase2 = new PurchaseRequesion();
        purchase2.setBuyer(buyer2);
        purchase2.add(product2, 5);
        service.process (purchase2);
        System.out.println(purchase2);
    }

}


