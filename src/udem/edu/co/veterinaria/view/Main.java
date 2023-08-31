package udem.edu.co.veterinaria.view;

import udem.edu.co.veterinaria.controller.Controller;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        String listOutput = controller.imp();
        System.out.println(listOutput);

        }
    }
