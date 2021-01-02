public class Rectangle {

    private int height, width;

    public Rectangle(int height, int width) {
        try {
            setHeight(height);
            setWidth(width);
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }

    }

    public void setHeight(int height) throws NegativeValueException {
        if(height < 0) throw new NegativeValueException();
        else this.height = height;
    }

    public void setWidth(int width) throws NegativeValueException {
        if(width < 0) throw new NegativeValueException();
        else this.width = width;
    }

    public static void main(String[] args) {
        new Rectangle(2, -1);
        new Rectangle(2, 2);
    }
}
