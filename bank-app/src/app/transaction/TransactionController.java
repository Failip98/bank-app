package app.transaction;


import app.Entities.Transaction;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.List;

public class TransactionController {

    @FXML Label amount;
    @FXML Label date;
    @FXML Label to;
    @FXML Label from;

    @FXML
    private void initialize(){
        System.out.println("initialize transaction");

    }

    public void setTransaction(Transaction transaction) {
        date.setText(transaction.getDateAsString());
        to.setText(transaction.getTo());
        amount.setText(transaction.getAmount());
        from.setText(transaction.getFrom());
    }
}
