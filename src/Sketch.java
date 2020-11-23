
/** MAKE SURE TO READ THE README CAREFULLY BEFORE YOU BEGIN EDITING THIS CODE */
import processing.core.PApplet;

public class Sketch extends PApplet {

    /*
     * SUMMATIVE REQUIRED Declare at least four balls, four bubbles, and four
     * snowflakes as instance variables. I have made the first ball for you.
     * 
     * SUMMATIVE OPTIONAL Use *arrays* to store the elements, rather than individual
     * variables.
     */

    Ball[] balls;
    Bubble[] bubbles;
    Snowflake[] snowflakes;
    
    /*
    Ball b1;
    Ball b2;
    Ball b3;
    Ball b4;

    Bubble bu1;
    Bubble bu2;
    Bubble bu3;
    Bubble bu4;

    Snowflake sf1;
    Snowflake sf2;
    Snowflake sf3;
    Snowflake sf4;
    */

    public void settings() {
        size(500, 500);
    }
    /*
     * SUMMATIVE REQUIRED Initialize the balls, bubbles, and snowflakes using your
     * constructors inside of setup(). You must use a non-default-constructor at
     * least once and a default constructor at least once for each type.
     * 
     * I have done the first ball for you.
     */
    public void setup() {
        frameRate(60);
        
        balls = new Ball[]{new Ball(this), new Ball(this), new Ball(this, 250, 190, 60, 10, 10, color(58, 124, 151)), new Ball(this)};
        
        bubbles = new Bubble[]{new Bubble(this), new Bubble(this), new Bubble(this, 169, 420, -5, -10, 100, color(7, 13, 217)), new Bubble(this)};

        snowflakes = new Snowflake[]{new Snowflake(this, 5, 20, 33, 300, 300, color(255, 255, 255)), new Snowflake(this), new Snowflake(this), new Snowflake(this)};
        
        /*
        b1 = new Ball(this);
        b2 = new Ball(this);
        b3 = new Ball(this, 250, 190, 60, 10, 10, color(58, 124, 151));
        b4 = new Ball(this);

        bu1 = new Bubble(this);
        bu2 = new Bubble(this);
        bu3 = new Bubble(this, 169, 420, -5, -10, 100, color(7, 13, 217));
        bu4 = new Bubble(this);

        sf1 = new Snowflake(this, 5, 20, 33, 300, 300, color(255, 255, 255));
        sf2 = new Snowflake(this);
        sf3 = new Snowflake(this);
        sf4 = new Snowflake(this);
        */
    }

    public void draw() {
        background(100);

        /* SUMMATIVE REQUIRED Draw and move all balls, snowflakes, and bubbles */
        
        balls[0].drawBall();
        balls[0].moveBall();
        balls[1].drawBall();
        balls[1].moveBall();
        balls[2].drawBall();
        balls[2].moveBall();
        balls[3].drawBall();
        balls[3].moveBall();

        bubbles[0].drawBubble();
        bubbles[0].moveBubble();
        bubbles[1].drawBubble();
        bubbles[1].moveBubble();
        bubbles[2].drawBubble();
        bubbles[2].moveBubble();
        bubbles[3].drawBubble();
        bubbles[3].moveBubble();

        snowflakes[0].drawSnowflake();
        snowflakes[0].moveSnowflake();
        snowflakes[1].drawSnowflake();
        snowflakes[1].moveSnowflake();
        snowflakes[2].drawSnowflake();
        snowflakes[2].moveSnowflake();
        snowflakes[3].drawSnowflake();
        snowflakes[3].moveSnowflake();

        /*
        b1.drawBall();
        b1.moveBall();
        b2.drawBall();
        b2.moveBall();
        b3.drawBall();
        b3.moveBall();
        b4.drawBall();
        b4.moveBall();

        bu1.drawBubble();
        bu1.moveBubble();
        bu2.drawBubble();
        bu2.moveBubble();
        bu3.drawBubble();
        bu3.moveBubble();
        bu4.drawBubble();
        bu4.moveBubble();

        sf1.drawSnowflake();
        sf1.moveSnowflake();
        sf2.drawSnowflake();
        sf2.moveSnowflake();
        sf3.drawSnowflake();
        sf3.moveSnowflake();
        sf4.drawSnowflake();
        sf4.moveSnowflake();
        */
    }

    /**
     * Convenience method to return a random color
     * 
     * @param transluscent if true, make the color transluscent, otherwise solid
     */
    public int randomColor(boolean transluscent) {
        int alpha;
        if (transluscent) {
            alpha = 125;
        } else {
            alpha = 255;
        }
        return color(random(0, 255), random(0, 255), random(0, 255), alpha);
    }

    /*
     * SUMMATIVE OPTIONAL Add a void method called mousePressed() that stops some or
     * all of the balls from moving when you click the mouse. (it will run
     * automatically when you click if the name is correct)
     * 
     * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
     * stops? (this is a major challenge - you can use the variables mouseX and
     * mouseY to see where the mouse was clicked.)
     */

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
