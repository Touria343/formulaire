package View;

import Model.Menu;
import javafx.scene.Group;
import javafx.scene.control.PasswordField;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

import javax.xml.soap.Text;
import java.awt.*;

public class ViewMenuConnexion {
    private Text titre;
    private Menu model;
    private Group root;
    private Stage stage;
    private Label MotDePasse;
    private PasswordField passwordFielMotDePasse;
    private Label Email;
    private TextField textFieldEmail;
    private Button btn2;
    private MediaView viewer;



    ViewMenuConnexion(Menu model, Group root) {
    this.root = root;
    this.model = model;
    model.getEmail();
    model.getMotDePasse();
    model.getbtn2();

     initEmail();
     initMotDePasse();
     initbtn2();

     setVueCompletMenu();

    }

    private void initEmail() {
        Label Email = new Label("Email");
        final TextField textFieldEmail = new TextField();
        this.Email = Email;
    }



    private void initMotDePasse() {
        Label MotDePasse = new Label("Mot de Passe");
        final PasswordField passwordFielMotDePass = new PasswordField();
        this.MotDePasse = MotDePasse;


    }

    private  void initbtn2() {
        Button btn2 = new Button("Envoyer");
        this.btn2 = btn2;

    }

    private void setVueCompletMenu() {
        root.getChildren().clear();
        root.getChildren().add(viewer);

    }


}