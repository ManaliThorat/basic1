public class Rectangle {
    private int length;
    private int width;

    private Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }
    public int getPerimeter() {
        return 2 *(length + width);
    }
    public  static Rectangle createRectangle(int length,int width){
        return new Rectangle(length,width);
    }
    public  static Rectangle createSquare(int length){
        return new Rectangle(length,length);
    }
}
