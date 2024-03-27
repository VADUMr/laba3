package com.example.laba3;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;
public class HelloController {
    @FXML
    private TextField storona_kub;
    @FXML
    private TextField radius_sf;
    @FXML
    private TextField radius_cl;
    @FXML
    private TextField hight_cl;
    @FXML
    private TextField storona_1;
    @FXML
    private TextField storona_2;
    @FXML
    private TextField storona_3;
    @FXML
    private TextField volume_kub;
    @FXML
    private TextField area_kub;
    @FXML
    private TextField volume_sf;
    @FXML
    private TextField area_sf;
    @FXML
    private TextField volume_cl;
    @FXML
    private TextField area_cl;
    @FXML
    private TextField volume_pr;
    @FXML
    private TextField area_pr;

    double pi = 3.1415;
    @FXML
    protected void onClickMethod() {
        String kub = storona_kub.getText();
        if(!kub.isEmpty()) {
            volume_kub.setText(String.valueOf(pow(Double.parseDouble(storona_kub.getText()), 3)));
            area_kub.setText(String.valueOf(6 * pow(Double.parseDouble(storona_kub.getText()), 2)));
        }

        String sf = radius_sf.getText();
        if(!sf.isEmpty()) {
            volume_sf.setText(String.valueOf(((double) 4 / 3) * pi * pow(Double.parseDouble(radius_sf.getText()), 3)));
            area_sf.setText(String.valueOf(4 * pi * pow(Double.parseDouble(radius_sf.getText()), 2)));
        }

        String cl_r = radius_cl.getText();
        String cl_h = hight_cl.getText();
        if(!(cl_r.isEmpty() && cl_h.isEmpty())) {
            volume_cl.setText(String.valueOf((Double.parseDouble(hight_cl.getText())) * pi * pow(Double.parseDouble(radius_cl.getText()), 2)));
            area_cl.setText(String.valueOf(2 * pi * Double.parseDouble(radius_cl.getText())*(Double.parseDouble(radius_cl.getText())+ Double.parseDouble(hight_cl.getText()))));
        }

        String pr_1 = radius_cl.getText();
        String pr_2 = hight_cl.getText();
        String pr_3 = hight_cl.getText();
        if(!(cl_r.isEmpty() && cl_h.isEmpty())) {
            volume_cl.setText(String.valueOf((Double.parseDouble(hight_cl.getText())) * pi * pow(Double.parseDouble(radius_cl.getText()), 2)));
            area_cl.setText(String.valueOf(2 * pi * Double.parseDouble(radius_cl.getText())*(Double.parseDouble(radius_cl.getText())+ Double.parseDouble(hight_cl.getText()))));
        }
    }
}