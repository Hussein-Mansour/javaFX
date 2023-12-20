/*
Student Name:Hussein Mansour
Student Number:041058393
Course & Section #: 23S_CST8288_031
Declaration: This is my own original work and is free from Plagiarism.
*/

package alert;

import javafx.scene.control.Alert;
import javafx.scene.control.Dialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 * The AlertBox class provides a utility for displaying error alerts with specific messages.
 * It creates an alert dialog to inform users about invalid inputs or errors.
 * 
 * This class encapsulates an 'Error' method to display an error message in an alert dialog.
 * 
 * @author hussein mansour
 * @version 1.0
 * @since 2023-11-25
 */
public class AlertBox {

    /**
     * Displays an error message in an alert dialog.
     * 
     * @param invalidInput The message to be displayed in the alert dialog, indicating invalid input.
     */
    public void Error(String invalidInput) {
        Alert alert = new Alert(Alert.AlertType.ERROR); // Create a new Alert instance with the type set to ERROR
        alert.setTitle("Input Error"); // Set the title of the alert dialog
        alert.setHeaderText("Please enter valid numbers and not:"); // Set the header text of the alert dialog
        alert.setContentText("" + invalidInput); // Set the content text of the alert dialog to the provided invalidInput message
        alert.showAndWait(); // Display the alert dialog and wait for user interaction before continuing ;)
    } // end Error() method

} // end class AlertBox :)
