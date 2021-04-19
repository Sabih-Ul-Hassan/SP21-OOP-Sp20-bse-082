package Lab8;
public class Laptop  extends computer{
    private int length, width, height, weight;
    public Laptop() {}
    public Laptop(int wordSize, int memorySize, int storageSize, int speed, int length, int width, int height, int weight) {
        super(wordSize, memorySize, storageSize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
    public void display() {
        System.out.println("Laptop:" +super.toString1()+
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight);
    }
}
