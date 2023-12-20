/*
Student Name:Hussein Mansour
Student Number:041058393
Course & Section #: 23S_CST8288_031
Declaration: This is my own original work and is free from Plagiarism.
*/

package launch;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ShannonsTheorem;
import view.ShannonsView;
import view.ShannonsPresenter;
import javafx.scene.image.Image;


/**
 * The ShannonsLaunch class is the entry point for launching the Shannon's Theorem application in JavaFX.
 * It extends Application class and initializes the primary stage with model, view, and presenter components.
 *
 * The class sets up the main window, loads the model, view, and presenter instances 
 * and sets the scene, title, and icon for the application window.and displays the application 
 * window containing the visual elements defined in the view.
 * 
 * The main method launches the JavaFX application.
 *
 * @author hussein mansour
 * @version 1.0
 * @since 2023-11-25
 */
public class ShannonsLaunch extends Application {

    /**
     * Initializes the primary stage of the application with model, view, and presenter components.
     * Creates instances of the model, view, and presenter, sets up the scene, title, and icon 
     * for the application window, and displays the primary stage containing the 
     * visual elements defined in the view.
     *
     * @param primaryStage the primary stage of the application
     */
    @Override
    public void start(Stage primaryStage) {
        // Creating an instance of three classes
        ShannonsTheorem model = new ShannonsTheorem();
        ShannonsView view =  new ShannonsView();
        ShannonsPresenter presenter = new ShannonsPresenter(model, view); // passing 'view' and 'model' as arguments.
        // Create a scene and set it on the stage
        Scene scene = new Scene(view); //Scene instance created and 'view' is passed as an argument.
        primaryStage.setScene(scene); // scene obj is set
        // Load the image icon, load the Title and display.
        Image icon = new Image(getClass().getResourceAsStream("ShannonsTheorem.png")); // Image instance is created and '.png' is passed as an argument.
        primaryStage.getIcons().add(icon); // icon obj is set
        primaryStage.setTitle("Shannon's Theorem"); // title is set
	primaryStage.show(); // display ;)
    } // end method start()

    /**
     * The main entry point of the application.
     * Launches the JavaFX application by initializing the JavaFX RunTime.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    } // end main() method

} // end Class ShannonsLaunch :)
