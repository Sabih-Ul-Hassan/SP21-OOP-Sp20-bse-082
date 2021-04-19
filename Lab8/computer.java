package Lab8;
public class computer {
    private  int wordSize, memorySize,storageSize,speed;
    public computer() {}
    public computer(int wordSize, int memorySize, int storageSize, int speed) {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }
    public int getWordSize() {
        return wordSize;
    }
    public void setWordSize(int wordSize) {
        this.wordSize = wordSize;
    }
    public int getMemorySize() {
        return memorySize;
    }
    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
    public int getStorageSize() {
        return storageSize;
    }
    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void display() {
        System.out.println("computer:" +
                "wordSize=" + wordSize +
                ", memorySize=" + memorySize +
                ", storageSize=" + storageSize +
                ", speed=" + speed);
    }
    public String toString() {
        return "computer{" +
                "wordSize=" + wordSize +
                ", memorySize=" + memorySize +
                ", storageSize=" + storageSize +
                ", speed=" + speed +
                '}';
    }
    public String toString1() {
        return "wordSize=" + wordSize +
                ", memorySize=" + memorySize +
                ", storageSize=" + storageSize +
                ", speed=" + speed;
    }
}
