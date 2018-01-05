public class Volume {

    public static void main(String[] args)
    {
        Volume[] volumes = { new Circle(10, 20, 30),
                new Rectangle(20, 30, 40, 50) };
        for (int i = 0; i < volumes.length; i++)
            volumes[i].draw();
    }

    private void draw() {
    }

}
class Circle extends Volume{
    private int x, y, r;

    Circle(int x, int y, int r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    void draw()
    {
        System.out.println("Drawing circle (" + x + ", "+ y + ", " + r + ")");
    }
}
class Rectangle extends Volume
{
    private int x, y, w, h;

    Rectangle(int x, int y, int w, int h)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    void draw()
    {
        System.out.println("Drawing rectangle (" + x + ", "+ y + ", " + w + "," +
                h + ")");
    }
}

