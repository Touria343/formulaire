package View;

import Model.Menu;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.media.MediaView;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.xml.soap.Text;
import java.awt.*;

public class ViewMenuConnexion {
    private Stage primaryStage;
    private Text titre;
    private Menu model;
    private Group root;
    private Stage stage;
    private Label MotDePasse;
    private PasswordField passwordFielMotDePasse;
    private Label email;
    private TextField textFieldEmail;
    private Button btn1;
    private MediaView viewer;
    private Scene scene, scene2, scene3;



    ViewMenuConnexion(Menu model, Group root) {
    this.root = root;
    this.model = model;
    model.getEmail();
    model.getMotDePasse();
    model.getbtn2();

     initEmail();
     initMotDePasse();


     setVueCompletMenu();

     btn1 = initbtn1(100, 80, "Connexion");
     btn1.setOnAction(event -> {
      primaryStage.setScene(scene3);
     primaryStage.setFullScreen(true);

     });

    }

    private void initEmail() {
        Label email = new Label("Email");
        final TextField textFieldEmail = new TextField();
        this.email = email;
    }



    private void initMotDePasse() {
        Label MotDePasse = new Label("Mot de Passe");
        final PasswordField passwordFielMotDePass = new PasswordField();
        this.MotDePasse = MotDePasse;


    }


    private Button initbtn1(int longeur, int largeur, String texteDuBouton) {
        Button d = new Button();
        d.setLayoutY(longeur);
        d.setLayoutX(largeur);
        d.setText(texteDuBouton);
        return d;
    }

    private void setVueCompletMenu() {
        root.getChildren().clear();
        root.getChildren().add(viewer);
        root.getChildren().add(btn1);


    }

    public Text getTitre() { return titre;}


}