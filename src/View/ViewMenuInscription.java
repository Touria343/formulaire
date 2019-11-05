package View;


import Controller.ControllerMenu;
import Model.Menu;
import javafx.scene.Group;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import Tools.Path;
import javafx.stage.Stage;


public class ViewMenuInscription {
    private  Menu model;
    private Text titre;
    private Label MotDePasse;
    private PasswordField passwordFielMotDePasse;
    private Label Nom;
    private TextField textFieldNom;
    private Label Prenom;
    private TextField textFieldPrenom;
    private Label Adresse;
    private TextField textFieldAdresse;
    private Label CodePostal;
    private TextField textFieldCodePostal;
    private Label Ville;
    private TextField textFieldVille;
    private Label Email;
    private TextField textFieldEmail;
    private Group root;
    private Button btn2;
    private Stage stage;
    private MediaView viewer;



    ViewMenuInscription(Menu model, Group root) {
        this.root = root;
        this.model = model;


        setVueCompleteMenu();
    }

    private void initTitre() {
        titre = new Text();
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontMadame),80);
        titre.setFont(policeTitre);

    }


    private void initMotDePasse() {
        Label MotDePasse = new Label("Mot de Passe");
        final PasswordField passwordFielMotDePass = new PasswordField();
        this.MotDePasse = MotDePasse;


    }

    private void initNom() {
        Label Nom = new Label("Nom");
        final TextField textFieldNom = new TextField();
        this.Nom = Nom;

    }

    private void initPrenom() {
        Label Prenom = new Label("Prénom");
        final TextField textFieldPrenom = new TextField();
        this.Prenom = Prenom;
    }

    private void initAdresse() {
        Label Adresse = new Label("Adresse");
        final TextField textFieldAdresse = new TextField();
        this.Adresse = Adresse;

    }


    private void initCodePostal() {
        Label CodePostal = new Label("Code Postal");
        final TextField textFieldCodePostal = new TextField();
        this.CodePostal = CodePostal;
    }


    private void initVille() {
        Label Ville = new Label("Ville");
        final TextField textFieldVille = new TextField();
        this.Ville = Ville;
    }


    private void initEmail() {
        Label Email = new Label("Email");
        final TextField textFieldEmail = new TextField();
        this.Email = Email;
    }

    private  void initbtn2() {
        Button btn2 = new Button("Envoyer");
        this.btn2 = btn2;

        }

     private void setVueCompleteMenu() {
        root.getChildren().clear();
        root.getChildren().add(viewer);

    }

    private void setEvents(ControllerMenu mc) {

            }

    public Text getTitre() { return titre; }

    }




