
public class stringbufferexample {

    public static void main(String[] args) {

        String customer = "Parth Sawant";
        String paymentMethod = "UPI";
        String transactionId = "TXN1025";
        double amount = 1500.00;

        StringBuffer receipt = new StringBuffer();

        receipt.append("PAYMENT RECEIPT\n");
        receipt.append("------------------------\n");
        receipt.append("Customer: ");
        receipt.append(customer);
        receipt.append("\n");

        receipt.append("Method: ");
        receipt.append(paymentMethod);
        receipt.append("\n");

        receipt.append("Transaction ID: ");
        receipt.append(transactionId);
        receipt.append("\n");

        receipt.append("Amount: Rs. ");
        receipt.append(amount);
        receipt.append("\n");

        receipt.append("Status: SUCCESS\n");
        receipt.append("------------------------");

        System.out.println(receipt);
    }
}
