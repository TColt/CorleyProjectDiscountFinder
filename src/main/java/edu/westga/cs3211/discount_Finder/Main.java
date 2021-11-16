package edu.westga.cs3211.discount_Finder;

import java.io.IOException;

import edu.westga.cs3211.discount_Finder.model.DiscountFinder;
import edu.westga.cs3211.discount_Finder.model.Item;
import javafx.application.Application;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * Entry point for the program
 *
 * @author	CS 3211
 * @version Fall 2021
 */
public class Main extends Application {
	public static final String WINDOW_TITLE = "DiscountFinder";
	public static final String GUI_RESOURCE = "view/codebehind/MainWindow.fxml";

	@FXML
    private Button addFilterButton;

    @FXML
    private Button clearFiltersList;

    @FXML
    private TextField filterItemBy;

    @FXML
    private ListView<Item> itemsListView;

	private DiscountFinder finder;

	/**
	 * JavaFX entry point.
	 *
	 * @precondition none
	 * @postcondition none
	 *
	 * @throws IOException
	 */
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource(Main.GUI_RESOURCE));
		Scene scene = new Scene(parent);
		primaryStage.setTitle(WINDOW_TITLE);
		primaryStage.setScene(scene);
		primaryStage.show();

		this.finder = new DiscountFinder();
		this.populateList();
		this.bindListView();
	}

	private void bindListView() {
		this.itemsListView.itemsProperty().bind(new SimpleListProperty<Item>(FXCollections.observableArrayList(this.finder.getItems())));
	}

	private void populateList() {
		Item item1 = new Item("Fruit", "Publix", "Biolife", 5, true);
        Item item2 = new Item("Cereal", "TJ Maxx", "Generic", 25, false);
        Item item3 = new Item("Beans", "Wawa", "Premium", 6, true);
		Item item4 = new Item("Water", "Kroger", "Aquafina", 3, false);
        Item item5 = new Item("Bucket", "Walmart", "WholeBulk", 2, true);
        Item item6 = new Item("Mop", "Dicks", "John Deer", 7, true);

		this.finder.addItem(item1);
		this.finder.addItem(item2);
		this.finder.addItem(item3);
		this.finder.addItem(item4);
		this.finder.addItem(item5);
		this.finder.addItem(item6);
	}

	@FXML
    void handleAddButton(ActionEvent event) {
		ObservableList<Item> filtered = new SimpleListProperty<Item>(FXCollections.observableArrayList(this.finder.findDiscountsForItem(this.filterItemBy.getText())));
		this.itemsListView.itemsProperty().setValue(filtered);
    }

	@FXML
    void handleClearButton(ActionEvent event) {
		this.itemsListView.itemsProperty().setValue(new SimpleListProperty<Item>(FXCollections.observableArrayList(this.finder.getItems())));
    }

	/**
	 * Primary Java entry point.
	 *
	 * @precondition none
	 * @postcondition none
	 *
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {
		Main.launch(args);
	}

}
