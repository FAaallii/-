package Controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import Contact.Contacts;
import Util.FileUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

public class NewAdressController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button editphoto;

    @FXML
    private TextField newname;
    @FXML
    private TextField numb_1;
    @FXML
    private TextField numb_2;
    @FXML
    private TextField numb_3;
    @FXML
    private TextField mail_1;
    @FXML
    private TextField mail_2;
    @FXML
    private TextField H_address;
    @FXML
    private TextField W_address;
    @FXML
    private TextField code;
    @FXML
    private DatePicker birthday;
    @FXML
    private ImageView photo;

    @FXML
    private TextArea notes;
    private String photo_Path;
    @FXML
    public void edit_photo(){
        FileChooser chooser=new FileChooser();
        File file = chooser.showOpenDialog(null);//选择文件
        if(file!=null){
            //                  <ImageView fitHeight="150.0" fitWidth="200.0" layoutX="446.0" layoutY="59.0" pickOnBounds="true" preserveRatio="true" />
            photo.setImage(new Image("file:"+file.getAbsolutePath()));
            photo_Path="file"+file.getAbsolutePath();
        }
    }
    @FXML
    public void addDataToFile(){
        Contacts contacts = new Contacts(photo_Path,newname.getText(),numb_1.getText(),numb_2.getText(),numb_3.getText(),
                mail_1.getText(),mail_2.getText(),H_address.getText(),birthday.getEditor().getText(),W_address.getText(),code.getText(),notes.getText());
        FileUtil.addDate(contacts);
    }

}
