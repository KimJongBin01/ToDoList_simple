package com.example.kjb_javafx_practice;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class ToDoListController implements Initializable {

    @FXML
    private Button AddButton;

    @FXML
    private Label FifthCheck;

    @FXML
    private Label FifthLabel;

    @FXML
    private Label FirstCheck;

    @FXML
    private Label FirstLabel;

    @FXML
    private Label FourthCheck;

    @FXML
    private Label FourthLabel;

    @FXML
    private Button ResetButton;

    @FXML
    private Label SecondCheck;

    @FXML
    private Label SecondLabel;

    @FXML
    private Label SeventhCheck;

    @FXML
    private Label SeventhLabel;

    @FXML
    private Label SixthCheck;

    @FXML
    private Label SixthLabel;

    @FXML
    private Label ThirdCheck;

    @FXML
    private Label ThirdLabel;

    @FXML
    private TextField ToDoText;

    @FXML
    private ImageView imageView;

    private Image img = new Image("check.jpg");

    int fill = 1;

    boolean firstBool = false;
    boolean secondBool = false;
    boolean thirdBool = false;
    boolean fourthBool = false;
    boolean fifthBool = false;
    boolean sixthBool = false;
    boolean seventhBool = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file = new File("C:\\Users\\user\\IdeaProjects\\kjb_javafx_practice" +
                "\\src\\main\\resources\\KakaoTalk_20220711_133643222.png");
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);

    }

    @FXML
    void ClickedAddButton(MouseEvent event) {
        String getTxtFiled = ToDoText.getText();
        if(fill >= 8){
            return;
        }

        switch (fill){
            case 1:
                FirstLabel.setText(getTxtFiled);
                fill++;
                ToDoText.clear();
                break;
            case 2:
                SecondLabel.setText(getTxtFiled);
                fill++;
                ToDoText.clear();
                break;
            case 3:
                ThirdLabel.setText(getTxtFiled);
                fill++;
                ToDoText.clear();
                break;
            case 4:
                FourthLabel.setText(getTxtFiled);
                fill++;
                ToDoText.clear();
                break;
            case 5:
                FifthLabel.setText(getTxtFiled);
                fill++;
                ToDoText.clear();
                break;
            case 6:
                SixthLabel.setText(getTxtFiled);
                fill++;
                ToDoText.clear();
                break;
            case 7:
                SeventhLabel.setText(getTxtFiled);
                fill++;
                ToDoText.clear();
                break;
        }
    }

    @FXML
    void ClickedFirstCheck(MouseEvent event) {
        if(!firstBool){
            ImageView view = new ImageView(img);
            view.autosize();
            FirstCheck.setGraphic(view);
            firstBool = true;
        }
        else{
            FirstCheck.setGraphic(null);
            firstBool = false;
        }
    }

    @FXML
    void ClickedSecondCheck(MouseEvent event) {
        if(!secondBool){
            ImageView view = new ImageView(img);
            view.autosize();
            SecondCheck.setGraphic(view);
            secondBool = true;
        }
        else{
            SecondCheck.setGraphic(null);
            secondBool = false;
        }
    }

    @FXML
    void ClickedThirdCheck(MouseEvent event) {
        if(!thirdBool){
            ImageView view = new ImageView(img);
            view.autosize();
            ThirdCheck.setGraphic(view);
            thirdBool = true;
        }
        else{
            ThirdCheck.setGraphic(null);
            thirdBool = false;
        }
    }

    @FXML
    void ClickedFourthCheck(MouseEvent event) {
        if(!fourthBool){
            ImageView view = new ImageView(img);
            view.autosize();
            FourthCheck.setGraphic(view);
            fourthBool = true;
        }
        else{
            FourthCheck.setGraphic(null);
            fourthBool = false;
        }
    }

    @FXML
    void ClickedFifthCheck(MouseEvent event) {
        if(!fifthBool){
            ImageView view = new ImageView(img);
            view.autosize();
            FifthCheck.setGraphic(view);
            fifthBool = true;
        }
        else{
            FifthCheck.setGraphic(null);
            fifthBool = false;
        }
    }

    @FXML
    void ClickedSeventhCheck(MouseEvent event) {
        if(!seventhBool){
            ImageView view = new ImageView(img);
            view.autosize();
            SeventhCheck.setGraphic(view);
            seventhBool = true;
        }
        else{
            SeventhCheck.setGraphic(null);
            seventhBool = false;
        }
    }

    @FXML
    void ClickedSixthCheck(MouseEvent event) {
        if(!sixthBool){
            ImageView view = new ImageView(img);
            view.autosize();
            SixthCheck.setGraphic(view);
            sixthBool = true;
        }
        else{
            SixthCheck.setGraphic(null);
            sixthBool = false;
        }
    }

    @FXML
    void ClickedResetButton(MouseEvent event) {
        fill = 1;
        FirstLabel.setText("");
        SecondLabel.setText("");
        ThirdLabel.setText("");
        FourthLabel.setText("");
        FifthLabel.setText("");
        SixthLabel.setText("");
        SeventhLabel.setText("");

        FirstCheck.setGraphic(null);
        SecondCheck.setGraphic(null);
        ThirdCheck.setGraphic(null);
        FourthCheck.setGraphic(null);
        FifthCheck.setGraphic(null);
        SixthCheck.setGraphic(null);
        SeventhCheck.setGraphic(null);

    }
}
