package View;

import Controller.ControllerMenu;
import Model.Menu;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewHandler extends Application {
    private Stage primaryStage;
    private ViewMenuInscription mp;
    private ViewMenuConnexion mo;
    private ControllerMenu controllerMenu;
    private Menu model;
    private Text t;
    private Button btn1,btn2;
    private Scene scene, scene2;
    private Stage stage;
    private MediaView viewwer;


 @Override
 public void start(Stage primaryStage) throws Exception {

    this.primaryStage = primaryStage;
     Group root = new Group();
     Scene menuDemarrage = new Scene(root);

     model = new Menu();

     mp = new ViewMenuInscription(model, root);
     controllerMenu = new ControllerMenu(this, model);

     Group root2 = new Group();

     Scene scene2 = new Scene(root2, Color.WHITE);

     Menu model = new Menu();
     mo = new ViewMenuConnexion(model, root2);



 primaryStage.setScene(menuDemarrage);
 primaryStage.show();
 primaryStage.setFullScreenExitHint("");
 primaryStage.setScene(menuDemarrage);
 primaryStage.setFullScreen(true);
 primaryStage.show();

 }

 private Button initButton(int longeur, int largeur, String texteDuBouton) {
     Button b = new Button();
     b.setLayoutX(longeur);
     b.setLayoutY(largeur);
     b.setText(texteDuBouton);
     return b;
 }

  public void setEventHandlerMenu(ControllerMenu cm) { mp.setEvents(cm);}

    public Stage getPrimaryStage() { return primaryStage; }
    public ViewMenuInscription getMp() { return mp; }


}

