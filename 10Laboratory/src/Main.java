import java.applet.Applet;
import java.awt.Graphics;

public class Task1ShapesApplet extends Applet {
    public void paint(Graphics g) {
        // Прямоугольник
        g.drawRect(50, 50, 150, 100);
        g.drawString("Rectangle", 70, 45);

        // Круг
        g.drawOval(250, 50, 100, 100);
        g.drawString("Circle", 270, 45);

        // Линия
        g.drawLine(50, 200, 200, 200);
        g.drawString("Line", 90, 195);
    }
}

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Task2ColorsApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 80);
        g.drawString("Red Rectangle", 50, 140);

        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 80, 80);
        g.drawString("Green Circle", 200, 140);

        g.setColor(Color.BLUE);
        g.fillRoundRect(350, 50, 100, 80, 20, 20);
        g.drawString("Blue RoundRect", 350, 140);

        g.setColor(Color.ORANGE);
        g.fillRect(500, 50, 100, 80);
        g.drawString("Orange Rect", 500, 140);
    }
}

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Task3HelloApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("Hello Java Applet", 80, 100);

        g.setColor(Color.BLUE);
        g.drawString("Hello Java Applet", 80, 150);

        g.setColor(Color.GREEN);
        g.drawString("Hello Java Applet", 80, 200);
    }
}

import java.applet.Applet;
import java.awt.*;
        import java.awt.event.*;

public class Task4ButtonApplet extends Applet implements ActionListener {
    Button button;
    String message = "";

    public void init() {
        button = new Button("Click Me");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        message = "Button clicked!";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 100);
    }
}

import java.applet.Applet;
import java.awt.*;
        import java.awt.event.*;

public class Task5CounterApplet extends Applet implements ActionListener {
    Button button;
    int counter = 0;

    public void init() {
        button = new Button("Click Me");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        counter++;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Clicks: " + counter, 50, 100);
    }
}

import java.applet.Applet;
import java.awt.*;
        import java.awt.event.*;

public class Task6NameApplet extends Applet implements ActionListener {
    TextField textField;
    Button button;
    String name = "";

    public void init() {
        textField = new TextField(20);
        button = new Button("Submit");
        add(textField);
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        name = textField.getText();
        repaint();
    }

    public void paint(Graphics g) {
        if (!name.isEmpty()) {
            g.drawString("Привет, " + name, 50, 100);
        }
    }
}

import java.applet.Applet;
import java.awt.*;
        import java.awt.event.*;

public class Task7ColorChooserApplet extends Applet implements ActionListener {
    Button redButton, greenButton, blueButton;
    Color currentColor = Color.BLACK;

    public void init() {
        redButton = new Button("Red");
        greenButton = new Button("Green");
        blueButton = new Button("Blue");

        add(redButton);
        add(greenButton);
        add(blueButton);

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            currentColor = Color.RED;
        } else if (e.getSource() == greenButton) {
            currentColor = Color.GREEN;
        } else if (e.getSource() == blueButton) {
            currentColor = Color.BLUE;
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(currentColor);
        g.fillRect(50, 80, 150, 100);
        g.drawString("Color changed", 50, 70);
    }
}

import java.applet.Applet;
import java.awt.*;

public class Task8AnimationApplet extends Applet implements Runnable {
    int x = 50;
    int direction = 5;
    Thread thread;

    public void init() {
        setBackground(Color.WHITE);
    }

    public void start() {
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        while (true) {
            x += direction;
            if (x < 50 || x > getWidth() - 100) {
                direction = -direction;
            }
            repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {}
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, 100, 80, 80);
    }
}

import java.applet.Applet;
import java.awt.*;
        import java.awt.event.*;
        import java.util.ArrayList;

public class Task9MouseApplet extends Applet implements MouseListener {
    ArrayList<Point> points = new ArrayList<>();

    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        points.add(e.getPoint());
        repaint();
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        for (Point p : points) {
            g.fillOval(p.x - 5, p.y - 5, 10, 10);
        }
    }
}

import java.applet.Applet;
import java.awt.*;
        import java.awt.event.*;

public class Task10MiniAppApplet extends Applet implements ActionListener {
    TextField textField;
    Button button;
    String inputText = "";
    Color shapeColor = Color.BLACK;

    public void init() {
        textField = new TextField(20);
        button = new Button("Apply");

        add(textField);
        add(button);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        inputText = textField.getText();
        shapeColor = Color.BLUE;
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(shapeColor);
        g.fillRect(50, 80, 150, 100);

        g.setColor(Color.BLACK);
        if (!inputText.isEmpty()) {
            g.drawString("Text: " + inputText, 50, 70);
        }
    }
}

<html>
<body>
<applet code="Task1ShapesApplet.class" width="600" height="300"></applet>
</body>
</html>








































