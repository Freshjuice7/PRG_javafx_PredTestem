package com.example.lol.controller;

import com.example.lol.model.Kniha;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class KnihaController2 {

    @FXML
    private ListView<Kniha> knihaListView;
    @FXML
    private ObservableList<Kniha> knihy = FXCollections.observableArrayList();

    public void initialize() {
        knihy.add(new Kniha("bruh", "Pepa", 1989));
        knihy.add(new Kniha("khan", "Karel", 2001));
        knihaListView.setItems(knihy);
    }

    @FXML
    private Label titulLabel;
    @FXML
    private Label autorLabel;
    @FXML
    private Label rokLabel;
    @FXML
    private TextField titulAdd;
    @FXML
    private TextField autorAdd;
    @FXML
    private TextField rokAdd;
    @FXML
    private Label error;
    @FXML
    private TextField vyhledavani;

    @FXML
    public void handleVyberKnihu() {
        titulLabel.setText(knihaListView.getSelectionModel().getSelectedItem().getTitul());
        autorLabel.setText(knihaListView.getSelectionModel().getSelectedItem().getAutor());
        rokLabel.setText(String.valueOf(knihaListView.getSelectionModel().getSelectedItem().getRokVydani()));
        titulAdd.setText(knihaListView.getSelectionModel().getSelectedItem().getTitul());
        autorAdd.setText(knihaListView.getSelectionModel().getSelectedItem().getAutor());
        rokAdd.setText(String.valueOf(knihaListView.getSelectionModel().getSelectedItem().getRokVydani()));
    }

    @FXML
    public void handlePridejKnihu() {
        String titul = titulAdd.getText();
        String autor = autorAdd.getText();
        int rokVydani = Integer.parseInt(rokAdd.getText());
        knihaListView.getItems().add(new Kniha(titul, autor, rokVydani));
        autorAdd.clear();
        rokAdd.clear();
        titulAdd.clear();
        titulLabel.setText(titul);
        autorLabel.setText(autor);
        rokLabel.setText(String.valueOf(rokVydani));

    }

    @FXML
    public void handleSmazKnihu() {
        if (knihaListView.getSelectionModel().getSelectedItem() == null) {
            System.err.println("Musíš něco vybrat!");
        } else {
            knihy.remove(knihaListView.getSelectionModel().getSelectedItem());
        }
    }


    @FXML
    public void handleUpravaKnihu() {
        boolean errorrr = false;
        if (knihaListView.getSelectionModel().getSelectedItem() == null) {
            System.err.println("Musí být něco vybráno");
        } else {
            try {
                handleSmazKnihu();
                handlePridejKnihu();
            } catch (Exception e) {
                error.setText("CHYBA V ROKU!!!!! Nastaveno 0 na rok");
                errorrr = true;
            }
        }
        if (errorrr = true) {
            rokAdd.setText(String.valueOf(0));
            handlePridejKnihu();
        } else {
            handleSmazKnihu();
            error.setText("");
        }
    }

    @FXML
    public void handleNajdiKnihu() {
        String hledac = vyhledavani.getText();

        for (Kniha k : knihy) {
            if (k.getTitul().equals(hledac)) {
                knihaListView.getSelectionModel().select(k);
                handleVyberKnihu();
            }
        }

    }


}
