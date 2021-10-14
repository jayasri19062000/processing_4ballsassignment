import processing.core.PApplet;

public class Procedural_Processing_withOOPS extends PApplet
{
    final int width = 640;
    final int height = 480;

    public static void main(String[] args) {
        PApplet.main("Procedural_Processing_withOOPS", args);
    }
    @Override
    public void settings() {
        super.settings();
        size(width, height);
    }

    @Override
    public void setup() {
        super.setup();
    }
    int circle1_speed = 1;
    int circle2_speed = 2;
    int circle3_speed = 3;
    int circle4_speed = 4;
    int circle_number1 = 1;
    int circle_number2 = 2;
    int circle_number3 = 3;
    int circle_number4 = 4;
    @Override
    public void draw() {
        draw_circle1(circle_number1);
        draw_circle2(circle_number2);
        draw_circle3(circle_number3);
        draw_circle4(circle_number4);
    }
    int distance_between_circles=height/5;
    private void draw_circle1(int circle_number) {
        circle(circle1_speed, circle_number);
        circle1_speed+=1;
    }
    private void draw_circle2(int circle_number) {
        circle(circle2_speed, circle_number);
        circle2_speed+=2;
    }
    private void draw_circle3(int circle_number) {
        circle(circle3_speed, circle_number);
        circle3_speed+=3;
    }
    private void draw_circle4(int circle_number) {
        circle(circle4_speed, circle_number);
        circle4_speed+=4;
    }
    private void circle(int circle_speed,int circle_number) {
        ellipse(circle_speed,distance_between_circles*circle_number,10,10);
    }



}
