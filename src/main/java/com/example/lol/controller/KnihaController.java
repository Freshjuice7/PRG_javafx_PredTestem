package com.example.lol.controller;

import com.example.lol.model.Kniha;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class KnihaController {

    @FXML private ListView<Kniha> knihaListView;

    public void initialize(){
        knihaListView.getItems().add(new Kniha("bruh","Pepa",1989));
        knihaListView.getItems().add( new Kniha("khan","Karel",2001));
    }

    @FXML  private Label titulLabel;
    @FXML  private Label autorLabel;
    @FXML  private Label rokLabel;
    @FXML  private TextField titulAdd;
    @FXML  private TextField autorAdd;
    @FXML  private TextField rokAdd;

    @FXML
   public void handleVyberKnihu(){

        titulLabel.setText(knihaListView.getSelectionModel().getSelectedItem().getTitul());
        autorLabel.setText(knihaListView.getSelectionModel().getSelectedItem().getAutor());
        rokLabel.setText(String.valueOf(knihaListView.getSelectionModel().getSelectedItem().getRokVydani()));
   }
   
    @FXML public void handlePridejKnihu(){
        String titul = titulAdd.getText();
        String autor = autorAdd.getText();
        int rokVydani = Integer.parseInt(rokAdd.getText());
       knihaListView.getItems().add( new Kniha(titul,autor,rokVydani));
       autorAdd.clear();
       rokAdd.clear();
       titulAdd.clear();
       titulLabel.setText(titul);
       autorLabel.setText(autor);
       rokLabel.setText(String.valueOf(rokVydani));

   }

}
