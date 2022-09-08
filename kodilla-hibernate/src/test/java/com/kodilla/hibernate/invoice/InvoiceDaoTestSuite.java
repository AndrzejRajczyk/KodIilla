
package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public final class InvoiceDaoTestSuite {
@Autowired
    InvoiceDao invoiceDao ;


private final static String number ="100";


    @Test
  void  testInvoiceDaoSave(){
        Invoice invoice= new Invoice(number);

        Product product1 = new Product("Pencil");

        Product product2 = new Product("Rubber");

        Item item1= new Item(new BigDecimal(10), 100, new BigDecimal(1000));

        Item item2 = new Item(new BigDecimal (10), 2000,new BigDecimal (20000));

        item1.setProduct(product1);

        item2.setProduct(product2);

        List<Item> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        invoice.setItems(itemsList);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);




//when
        invoiceDao.save(invoice);
        int id = invoice.getId();


//then

System.out.println(invoice);
        assertNotEquals(0, id);
        assertEquals(2, invoice.getItems().size());
       invoiceDao.deleteById(id);
    }
}

