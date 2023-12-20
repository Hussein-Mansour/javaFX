/*
Student Name:Hussein Mansour
Student Number:041058393
Course & Section #: 23S_CST8288_031
Declaration: This is my own original work and is free from Plagiarism.
*/

package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


/**
 * The ShannonsView class represents the view component of the Shannon's Theorem application in JavaFX.
 * It extends GridPane class and constructs the user interface layout by organizing labels, text fields, and a button.
 * 
 * It sets up the layout, positions the labels and input fields, and styles the user interface components
 * to create an organized visual representation of the Shannon's Theorem application.
 * 
 * @author hussein mansour
 * @version 1.0
 * @since 2023-11-25
 */
public class ShannonsView extends GridPane {

    // Labels
    Label bandwidthLbl = new Label("Bandwidth (in Hertz or Hz):");
    Label singlepowerLbl = new Label("Single Power (in watts):");
    Label noisepowerLbl = new Label("Noise Power (in watts):");
    Label maxDataRateLbl = new Label("Max Data Rate");
    // Fields
    TextField bandwidthFLD = new TextField();
    TextField singlepowerFLD = new TextField();
    TextField noisepowerFLD = new TextField();
    TextField maxDataRateFLD = new TextField();
    // Button
    Button calculateBtn = new Button("Calculate");

    /**
     * Constructs ShannonsView object and initializes the user interface layout.
     * Calls the layoutForm() method to set up the user interface components.
     */
    public ShannonsView() {
	layoutForm();
    } // end constructor

    /**
     * Sets up the layout of the user interface by organizing labels, text fields, and buttons in a grid arrangement.
     * Positions and styles the components to create the visual representation of the Shannon's Theorem application.
     */
    private void layoutForm() {
        //set the horizontal and vertical gaps in the layout. 
	this.setHgap(5); // horizontal gaps
	this.setVgap(10); // vertical gaps
        // set Labels
	this.add(bandwidthLbl, 1, 1); // Lable 1 set
	this.add(singlepowerLbl, 1, 2); // Lable 2 set
        this.add(noisepowerLbl, 1, 3); // Lable 3 set
        this.add(maxDataRateLbl, 1, 4); // Lable 4 set
        // set Fields
	this.add(bandwidthFLD, 2, 1); // Text Field 1 set
	this.add(singlepowerFLD, 2, 2); // Text Field 2 set
        this.add(noisepowerFLD, 2, 3); // Text Field 3 set
        this.add(maxDataRateFLD, 2, 4); // Text Field 4 set
        this.maxDataRateFLD.setEditable(false); // Set the TextField 4 as non-editable
        this.maxDataRateFLD.setStyle("-fx-background-color: lightgrey; -fx-opacity: 1;"); // Style TextField 4 to look like output
        // set Button
	VBox buttonBox = new VBox(calculateBtn); // vetical box
	calculateBtn.setMaxWidth(Double.MAX_VALUE); // set button max width
	this.add(buttonBox, 3, 4, 15, 3); // button set
    }// end method layoutform()

    /**
     * Updates the text displayed in the 'Max Data Rate' field of the user interface.
     *
     * @param text the text to be displayed in the 'Max Data Rate' field
     */
    public void setMaxDataRateText(String text) {
        maxDataRateFLD.setText(text);
    } // end method setMaxDataRateText()

} // end class ShannonsView :)
