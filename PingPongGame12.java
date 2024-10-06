import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PingPongGame12 extends JPanel implements ActionListener, KeyListener {
    private static final int WIDTH = 900;
    private static final int HEIGHT = 600;
    private static final int PADDLE_WIDTH = 80; // Increased width
    private static final int PADDLE_HEIGHT = 90; // Decreased height
    private static final int BALL_SIZE = 30;
    private static final int DELAY = 3;
    private static final int WINNING_SCORE = 3;

    private int player1Y = HEIGHT / 2 - PADDLE_HEIGHT / 2;
    private int player2Y = HEIGHT / 2 - PADDLE_HEIGHT / 2;
    private int player1Score = 0;
    private int player2Score = 0;

    private int ballX = WIDTH / 2 - BALL_SIZE / 2;
    private int ballY = HEIGHT / 2 - BALL_SIZE / 2;
    private int ballXDir = -2;
    private int ballYDir = 2;

    private boolean upPressed = false;
    private boolean downPressed = false;
    private boolean gamePaused = false;

    private Timer timer;
    private Image paddle1Image;
    private Image paddle2Image;
    private Image ballImage;
    private Image backgroundImage;

    public PingPongGame12() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        addKeyListener(this);

        // Load and scale images
        try {
            paddle1Image = new ImageIcon("C:\\Users\\Acer\\Downloads\\snake\\p1jpg.jpg").getImage().getScaledInstance(PADDLE_WIDTH, PADDLE_HEIGHT, Image.SCALE_SMOOTH);
            paddle2Image = new ImageIcon("C:\\Users\\Acer\\Downloads\\snake\\Arial View.jpg").getImage().getScaledInstance(PADDLE_WIDTH, PADDLE_HEIGHT, Image.SCALE_SMOOTH);
            ballImage = new ImageIcon("C:\\Users\\Acer\\Downloads\\snake\\Screenshot 2024-08-18 143920.png").getImage();
            backgroundImage = new ImageIcon("C:\\Users\\Acer\\Downloads\\snake\\Screenshot 2024-08-18 150736.png").getImage();
        } catch (Exception e) {
            System.out.println("Error loading images: " + e.getMessage());
        }

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw background image
        g.drawImage(backgroundImage, 0, 0, WIDTH, HEIGHT, this);

        // Draw paddles and ball
        draw(g);
    }

    private void draw(Graphics g) {
        // Check if images are loaded
        if (paddle1Image == null || paddle2Image == null || ballImage == null || backgroundImage == null) {
            System.out.println("One or more images are not loaded correctly.");
            return;
        }

        // Draw paddles using images
        g.drawImage(paddle1Image, 20, player1Y, this);
        g.drawImage(paddle2Image, WIDTH - 30 - PADDLE_WIDTH, player2Y, this);

        // Draw ball image
        g.drawImage(ballImage, ballX, ballY, BALL_SIZE, BALL_SIZE, this);

        // Draw scores
        g.setColor(Color.red); // Semi-transparent black background
        g.fillRect(40, 10, 160, 40); // Player 1 score box
        g.fillRect(WIDTH - 200, 10, 160, 40); // AI score box
        g.setColor(Color.blue);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("Player: " + player1Score, 50, 40);
        g.drawString("AI: " + player2Score, WIDTH - 150, 40);

        if (gamePaused) {
            g.setColor(Color.white);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("PAUSED", WIDTH / 2 - 100, HEIGHT / 2);
        }
    }

    private void move() {
        if (!gamePaused) {
            // Move player 1 paddle
            if (upPressed && player1Y > 0) {
                player1Y -= 5;
            }
            if (downPressed && player1Y < HEIGHT - PADDLE_HEIGHT) {
                player1Y += 5;
            }

            // Move AI paddle (player 2)
            if (ballY > player2Y + PADDLE_HEIGHT / 2 && player2Y < HEIGHT - PADDLE_HEIGHT) {
                player2Y += 3;
            } else if (ballY < player2Y + PADDLE_HEIGHT / 2 && player2Y > 0) {
                player2Y -= 3;
            }

            // Move ball
            ballX += ballXDir;
            ballY += ballYDir;

            // Ball collision with top and bottom walls
            if (ballY <= 0 || ballY >= HEIGHT - BALL_SIZE) {
                ballYDir = -ballYDir;
            }

            // Define rectangle bounds for collision detection
            Rectangle ballBounds = new Rectangle(ballX, ballY, BALL_SIZE, BALL_SIZE);
            Rectangle player1Bounds = new Rectangle(20, player1Y, PADDLE_WIDTH, PADDLE_HEIGHT);
            Rectangle player2Bounds = new Rectangle(WIDTH - 30 - PADDLE_WIDTH, player2Y, PADDLE_WIDTH, PADDLE_HEIGHT);

            // Ball collision with paddles
            if (ballBounds.intersects(player1Bounds) || ballBounds.intersects(player2Bounds)) {
                ballXDir = -ballXDir;
                // Increase speed slightly after each paddle hit
                ballXDir += (ballXDir > 0) ? 1 : -1;
            }

            // Ball out of bounds
            if (ballX <= 0) {
                player2Score++;
                resetBall();
            }
            if (ballX >= WIDTH - BALL_SIZE) {
                player1Score++;
                resetBall();
            }

            checkGameOver();
        }
    }

    private void resetBall() {
        ballX = WIDTH / 2 - BALL_SIZE / 2;
        ballY = HEIGHT / 2 - BALL_SIZE / 2;
        ballXDir = (Math.random() > 0.5) ? 2 : -2;
        ballYDir = (Math.random() > 0.5) ? 2 : -2;
    }

    private void checkGameOver() {
        if (player1Score == WINNING_SCORE || player2Score == WINNING_SCORE) {
            timer.stop();
            String winner = player1Score == WINNING_SCORE ? "Player 1" : "AI (Computer)";
            JOptionPane.showMessageDialog(this, winner + " wins!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            upPressed = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downPressed = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            gamePaused = !gamePaused;
            if (!gamePaused) {
                timer.start();
            } else {
                timer.stop();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            upPressed = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downPressed = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ping Pong Game");
        PingPongGame12 game = new PingPongGame12();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}