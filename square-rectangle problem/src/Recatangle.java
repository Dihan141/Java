public class Recatangle implements Shape{
    private int height, width;
    Recatangle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    @Override
    public int CalculateArea() {
        return height*width;
    }
}
