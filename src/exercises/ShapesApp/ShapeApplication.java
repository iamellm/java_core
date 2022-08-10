package exercises.ShapesApp;

import javax.swing.*;

public class ShapeApplication {

    public static void main(String[] args) {
        // Создаем графическое окно
        ShapeFrame oF = new ShapeFrame();
        // Задаем правидо, по которому приложение завершиться при
        // закрытии этой формы
        oF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Делаем окно видимым
        oF.setVisible(true);
    }
}
