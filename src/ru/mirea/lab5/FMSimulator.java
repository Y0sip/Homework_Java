package ru.mirea.lab5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FMSimulator extends JFrame {
    private int milanScore = 0; // Переменная для счета голов Милана
    private int madridScore = 0; // Переменная для счета голов Мадрида
    private JLabel resultLabel; // Надпись для отображения счета матча
    private JLabel lastScorerLabel; // Надпись для отображения последнего забившего
    private JLabel winnerLabel; // Надпись для отображения победителя

    public FMSimulator() {
        setTitle("Final UCL"); // Заголовок окна
        setSize(300, 200); // Размер окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Закрытие приложения при закрытии окна
        setLayout(new GridLayout(4, 1)); // Устанавливаем сетку для компонентов

        JButton milanButton = new JButton("AC Milan"); // Кнопка для забития гола Миланом
        JButton madridButton = new JButton("Real Madrid"); // Кнопка для забития гола Мадридом
        resultLabel = new JLabel("Result: 0 X 0"); // Надпись для отображения результата
        lastScorerLabel = new JLabel("Last Scorer: N/A"); // Надпись для отображения последнего забившего
        winnerLabel = new JLabel("Winner: DRAW"); // Надпись для отображения победителя

        // Обработчик события для кнопки Милана
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++; // Увеличиваем счет Милана
                updateResult(); // Обновляем результат
                lastScorerLabel.setText("Last Scorer: AC Milan"); // Обновляем надпись последнего забившего
            }
        });

        // Обработчик события для кнопки Мадрида
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++; // Увеличиваем счет Мадрида
                updateResult(); // Обновляем результат
                lastScorerLabel.setText("Last Scorer: Real Madrid"); // Обновляем надпись последнего забившего
            }
        });

        // Добавляем компоненты в окно
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }

    // Метод для обновления результатов и определения победителя
    private void updateResult() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore); // Обновляем надпись с результатом

        // Определяем победителя на основе счета
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FMSimulator simulator = new FMSimulator();
                simulator.setVisible(true); // Отображаем окно
            }
        });
    }
}
