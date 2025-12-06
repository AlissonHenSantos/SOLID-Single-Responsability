package model;

public interface Notificator {
	public void sendNotification(String  invoiceFormated, InvoiceFormatter invoiceFormatter);
}
