package model;

public class InvoiceFormatter {
	private Invoice invoice;
	
	 public InvoiceFormatter(Invoice invoice) {
		this.invoice = invoice;
	 }
	
	 public String formatInvoice() {
		
		 
	        StringBuilder formattedInvoice = new StringBuilder("Invoice for " + invoice.getCustomer() + "\n");
	        
	        for (Item item : invoice.getItems()) {
	            formattedInvoice.append(item.getName())
	                            .append(": ")
	                            .append(item.getQuantity())
	                            .append(" x ")
	                            .append(item.getPrice())
	                            .append(" = ")
	                            .append(item.getQuantity() * item.getPrice())
	                            .append("\n");
	        }
	        
	        formattedInvoice.append("Total: ").append(invoice.calculateTotal());
	        
	        return formattedInvoice.toString();
	    }
}
