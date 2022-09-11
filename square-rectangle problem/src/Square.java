public class Square implements Shape{

    private int edge;
    Square(int edge){
        this.edge = edge;
    }
    @Override
    public int CalculateArea() {
        return edge*edge;
    }
}
