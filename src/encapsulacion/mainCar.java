package encapsulacion;

import javax.swing.*;

public class mainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPlater(JOptionPane.showInputDialog("plater"));
        car.setColor(JOptionPane.showInputDialog("color"));
        car.setPlater(JOptionPane.showInputDialog(("modelo:")));

    }
}
