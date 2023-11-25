package ru.mirea.lab5;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Абстрактный класс для фигур
abstract class Shape {
    protected Color color; // Цвет фигуры
    protected int x; // Позиция по оси X
    protected int y; // Позиция по оси Y

    // Конструктор для создания фигуры с указанными свойствами
    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Абстрактный метод для отрисовки фигуры
    public abstract void draw(Graphics g);
}

// Класс для круга
class Circle extends Shape {
    private int radius; // Радиус круга

    // Конструктор для создания круга
    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    // Реализация метода отрисовки для круга
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}

// Класс для прямоугольника
class Rectangle extends Shape {
    private int width; // Ширина прямоугольника
    private int height; // Высота прямоугольника

    // Конструктор для создания прямоугольника
    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    // Реализация метода отрисовки для прямоугольника
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

public class RandomShapesDrawing extends JPanel {
    private static final int WIDTH = 800; // Ширина окна
    private static final int HEIGHT = 600; // Высота окна
    private static final int NUM_SHAPES = 20; // Количество случайных фигур

    private Random random = new Random();

    // Массив для хранения случайных фигур
    private Shape[] shapes;

    public RandomShapesDrawing() {
        // Устанавливаем размер панели
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        // Создаем массив случайных фигур
        shapes = new Shape[NUM_SHAPES];
        for (int i = 0; i < NUM_SHAPES; i++) {
            Color randomColor = getRandomColor();
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int shapeType = random.nextInt(2); // Случайный выбор типа фигуры (0 - круг, 1 - прямоугольник)

            if (shapeType == 0) {
                int radius = random.nextInt(50) + 10; // Случайный радиус круга
                shapes[i] = new Circle(randomColor, x, y, radius);
            } else {
                int width = random.nextInt(100) + 20; // Случайная ширина прямоугольника
                int height = random.nextInt(100) + 20; // Случайная высота прямоугольника
                shapes[i] = new Rectangle(randomColor, x, y, width, height);
            }
        }
    }

    // Генерация случайного цвета
    private Color getRandomColor() {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    // Метод для отрисовки всех фигур на панели
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Отрисовка каждой фигуры в массиве
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Random Shapes Drawing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                RandomShapesDrawing drawingPanel = new RandomShapesDrawing();
                frame.add(drawingPanel);

                frame.pack(); // Автоматически устанавливаем размер окна
                frame.setLocationRelativeTo(null); // Центрируем окно
                frame.setVisible(true);
            }
        });
    }
}
