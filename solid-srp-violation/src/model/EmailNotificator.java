package model;

public class EmailNotificator implements Notificator{
	
	  public void sendNotification(String email, InvoiceFormatter invoiceFormatter) {
	        System.out.println("Sending invoice to " + email + ":\n" + invoiceFormatter.formatInvoice());
	    }
	 
}
