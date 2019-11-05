package View;


import javafx.scene.Group;
import javafx.scene.control.Menu;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import Tools.Path;
import javafx.stage.Stage;



public class ViewMenuPrincipal {
    private final Menu model;
    private Text titre;
    private String MotDePasse;
    private String Nom;
    private String Prenom;
    private String Adresse;
    private String CodePostal;
    private String Ville;
    private String Email;
    private Group root;
    private Stage stage;


    ViewMenuPrincipal(Menu model, Group root) {
        this.root = root;
        this.model = model;



    }

    private void initTitre() {
        titre = new Text();
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontMadame),80);
        titre.setFont(policeTitre);

    }

    public void setMotDePasse() {
        MotDePasse = new String();
        this.MotDePasse = MotDePasse;

    }


    public void setNom() {

        this.Nom = Nom;

    }

    public String getNom() {
        return Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;

    }

    public String getPrenom() {
        return Prenom;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;

    }

    public String getAdresse() {
        return Adresse;
    }


    public void setCodePostal(String CodePostal) {
        this.CodePostal = CodePostal;
    }

    public String getCodePostal() {
        return CodePostal;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public String getVille() {
        return Ville;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }


}