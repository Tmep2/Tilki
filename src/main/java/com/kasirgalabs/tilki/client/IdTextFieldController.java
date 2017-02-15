/*
 * Copyright (C) 2017 Kasirgalabs
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.kasirgalabs.tilki.client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class IdTextFieldController implements Initializable {
    @FXML
    private TextField textField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        textField.setText("");
        IdListener idListener = new IdListener();
        textField.textProperty().addListener(idListener);
    }

    private class IdListener implements ChangeListener<String> {
        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue,
                            String newValue) {
            String numbers = newValue.replaceAll("[^\\d]", "");
            textField.setText(numbers);
            User user = User.getInstance();
            user.setId(numbers);
        }
    }
}