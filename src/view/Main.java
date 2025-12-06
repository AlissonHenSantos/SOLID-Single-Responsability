package view;

import model.EmailNotificator;
import model.Invoice;
import model.InvoiceFormatter;
import model.Item;
import model.Notificator;

public class Main {
    public static void main(String[] args) {
        
        Invoice invoice = new Invoice("Emerson Carvalho");
        invoice.addItem(new Item("Produto A", 2, 50));
        invoice.addItem(new Item("Produto B", 3, 30));
        
        InvoiceFormatter iF = new InvoiceFormatter(invoice);
        Notificator notificator = new EmailNotificator();
        
        notificator.sendNotification("alisson.henriquedsn@gmail.com", iF);
        	
   
    }
}
