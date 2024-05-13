import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RectangularShape;
import java.util.*;
import java.util.List;

public class GamePanel extends JFrame {
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 1200;
    private Ball ball;
    private Paddle paddle;
    private Block[] bricks;

private Map<String,Integer> leaderbord = new HashMap<String,Integer>();

    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {
/*
        // 1. Convert Map to List of Map
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }


    //classic iterator example
    for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext(); ) {
        Map.Entry<String, Integer> entry = it.next();
        sortedMap.put(entry.getKey(), entry.getValue());
    }*/


        return null; //return null for now have to correct sort method
    }



    public GamePanel(Ball ball, Paddle paddle, Block[] bricks) {
        this.ball = ball;
        this.paddle = paddle;
        this.bricks = bricks;
        setBackground(Color.BLACK);
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Paddle getPaddle() {
        return paddle;
    }

    public void setPaddle(Paddle paddle) {
        this.paddle = paddle;
    }

    public List<Block> getBricks() {
        return List.of(bricks);
    }

    public void setBricks(Block[] bricks) {
        this.bricks = bricks;
    }

   public void drawGameObjects(Graphics2D g2) {
        ball.draw(g2);
        paddle.draw(g2);
        for (Block brick : bricks) {
            brick.draw(g2);
        }
    }
   public static void createGameField(){
        JFrame frame = new JFrame("Game Field");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }
    public static void createLeaderBord(Map<String, Integer> leaderbord ){
        JPanel jPanel = new JPanel();
        JLabel player = new JLabel();// have to add player nickname
        JLabel score = new JLabel();//have to add player score
        JFrame frame = new JFrame("leaderbord");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setShape(new Rectangle(1200, 600));

        frame.setVisible(true);

    }
    public static void createGameMenu(){
        JFrame frame = new JFrame("menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setShape(new Rectangle(600,1200));
        JPanel controlPanel  = new JPanel();
        JButton startButton = new JButton();
        JButton exitButton = new JButton();
        JButton leaderBordButton = new JButton();

        controlPanel.add(exitButton);
        controlPanel.add(startButton);
        controlPanel.add(leaderBordButton);

exitButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
});

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createGameField();
            }
        });
        leaderBordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //   createLeaderBord();
            }
        });

        frame.getContentPane().add(controlPanel, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}
