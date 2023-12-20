/*
Student Name:Hussein Mansour
Student Number:041058393
Course & Section #: 23S_CST8288_031
Declaration: This is my own original work and is free from Plagiarism.
*/

package view;

import alert.AlertBox;
import model.ShannonsTheorem;
import view.ShannonsView;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.util.converter.NumberStringConverter;


/**
 * The ShannonsPresenter class serves as a mediator between the ShannonsTheorem model
 * and the ShannonsView view, handling user interactions and data binding.
 * 
 * It calculates the maximum data rate based on given 
 * bandwidth, signal power, and noise power.
 * 
 * This presenter class connects the model and view, updating the view 
 * based on calculations and user inputs.
 * 
 * @author hussein mansour
 * @version 1.0
 * @since 2023-11-25
 */
public class ShannonsPresenter {

    // Declaration of the ShannonsTheorem model and ShannonsView view instances.
    private final ShannonsTheorem model;
    private final ShannonsView view;
    // Representing the bandwidth, singlePower and noisePower value in the application, initialized as a SimpleDoubleProperty.
    // initialized as a SimpleDoubleProperty.
    private final DoubleProperty  bandWidth = new SimpleDoubleProperty();
    private final DoubleProperty singlePower= new SimpleDoubleProperty();
    private final DoubleProperty noisePower= new SimpleDoubleProperty();

    /**
     * Constructor for ShannonsPresenter.
     * 
     * @param model The ShannonsTheorem model to be used by the presenter.
     * @param view The ShannonsView associated with this presenter.
     */
    public ShannonsPresenter(ShannonsTheorem model, ShannonsView view) {
	this.model = model;
	this.view = view;
	bindToModel(); 
	attachViewEvents();
    } // end constructor

    /**
     * Binds initial model values to corresponding properties.
     */
    private void bindToModel() {
        Double modelBandWidth = model.getBandWidth();
        Double modelSignalPower = model.getSignalPower();
        Double modelNoisePower = model.getNoisePower();
        
        bandWidth.set(modelBandWidth);
        singlePower.set(modelSignalPower);
        noisePower.set(modelNoisePower);
    } // end bindToModel() method

    /**
     * Attaches event listeners to the view components.
     * Binds text properties bidirectionally with corresponding DoubleProperties.
     * Sets action event for the 'calculate' button.
     */
    private void attachViewEvents() {
        view.bandwidthFLD.textProperty().bindBidirectional(bandWidth, new NumberStringConverter());
        view.singlepowerFLD.textProperty().bindBidirectional(singlePower, new NumberStringConverter());
        view.noisepowerFLD.textProperty().bindBidirectional(noisePower, new NumberStringConverter());
	view.calculateBtn.setOnAction(e -> calcData()); 
    } // end attachViewEvents() method

     /**
     * Retrieves user-input text values for bandwidth, signal power, and noise power from the view fields,
     * validates and converts them to doubles, calculates the maximum data rate using ShannonsTheorem model,
     * and updates the view to display the calculated maxDataRate.
     */
    private void calcData() {
        // Retrieve text values from fields
        String bwText = view.bandwidthFLD.getText();
        String spText = view.singlepowerFLD.getText();
        String npText = view.noisepowerFLD.getText();
        
        // Validate inputs for conversion to doubles
        try {
            double bw = Double.parseDouble(bwText);
            double sp = Double.parseDouble(spText);
            double np = Double.parseDouble(npText);
            
            // Calculate maxDataRate
            double maxDataRate = model.maxDataRate(bw, sp, np);
            
            // Update the view to display maxDataRate
            view.setMaxDataRateText(maxDataRate + " bps");
        } catch (NumberFormatException e) {
            // user input is not a valid double 
            AlertBox alertBox = new AlertBox();
            alertBox.Error(bwText + "\n" + spText + "\n" + npText);
        } // end try and catch
    } // end calcData

} // end class ShannonsPresenter :)
