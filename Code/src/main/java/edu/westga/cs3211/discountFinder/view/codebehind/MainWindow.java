package edu.westga.cs3211.discountFinder.view.codebehind;

import edu.westga.cs3211.discountFinder.model.Category;
import edu.westga.cs3211.discountFinder.model.DiscountFinder;
import edu.westga.cs3211.discountFinder.model.Item;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/*

*/
public class MainWindow {
	@FXML
    private Button addItemFilterButton;

    @FXML
    private Button clearFiltersList;

    @FXML
    private TextField filterItemByTextField;

    @FXML
    private ListView<Item> itemsListView;

    @FXML
    private Button favoriteSellerButton;

    @FXML
    private Button addDisplayFilterButton;

    @FXML
    private TextField filterBySellerTextField;

    @FXML
    private TextField filterByDistanceTextField;

    @FXML
    private Button addDistanceFilterButton;

    @FXML
    private ComboBox<Category> categoriesCombobox;
	
	private DiscountFinder finder;


    private void initializeListView() {
		// this.itemsListView.itemsProperty().bind(new SimpleListProperty<Item>(FXCollections.observableArrayList(this.finder.getItems())));
		ObservableList<Item> filtered = new SimpleListProperty<Item>(FXCollections.observableArrayList(this.finder.getItems()));
		this.itemsListView.itemsProperty().setValue(filtered);
	}

	private void populateList() {
	}

	@FXML
    void handleFindItemButton(ActionEvent event) {
		// if (this.filterItemByTextField.getText().isEmpty()) {
		// 	this.initializeListView();
		// } else {
		// 	ObservableList<Item> filtered = new SimpleListProperty<Item>(FXCollections.observableArrayList(this.finder.findDiscountsForItem(this.filterItemByTextField.getText())));
		// 	this.itemsListView.itemsProperty().setValue(filtered);
		// }
    }

	@FXML
    void handleClearButton(ActionEvent event) {
		this.itemsListView.itemsProperty().setValue(new SimpleListProperty<Item>(FXCollections.observableArrayList(this.finder.getItems())));
    }

	@FXML
    void onFavoriteSeller(ActionEvent event) {

    }

    @FXML
    void handleDisplaySellerButton(ActionEvent event) {

    }

    @FXML
    void handleDistanceFilterButton(ActionEvent event) {
		
    }

	private void populateComboBox() {
		this.categoriesCombobox.getItems().add(Category.APPLIANCES);
		this.categoriesCombobox.getItems().add(Category.CLOTHING);
		this.categoriesCombobox.getItems().add(Category.ELECTRONICS);
		this.categoriesCombobox.getItems().add(Category.FOOD);
		this.categoriesCombobox.getItems().add(Category.OTHER);
	}
    /*
    */
    @FXML
	public void initialize() {
		this.finder = new DiscountFinder();
		this.populateList();
		this.initializeListView();
		this.populateComboBox();
	}

}
