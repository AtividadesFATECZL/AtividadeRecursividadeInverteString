package controller;

public class StringInvertidaController {
    public StringInvertidaController() {
        super();
    }

    public String inverter(String string, int index) {
        if (index == 0) {
            return "";
        } else {
            return string.substring(index - 1, index) + inverter(string, index - 1);
        }
    }
}
