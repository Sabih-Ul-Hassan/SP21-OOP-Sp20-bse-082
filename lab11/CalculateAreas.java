package lab11;

public class CalculateAreas {
    Shape[] Shapes;
    double[] AreaValues;

    public Shape[] getShapes() {
        return Shapes;
    }

    public double[] getAreaValues() {
        return AreaValues;
    }

    public double[]  CalculateAreasFunction(Shape[] x) {
        this.Shapes = x;
        AreaValues=new double[x.length];
        makeDoubleArray();
        return AreaValues;
    }
    private void makeDoubleArray(){
        int i=0;
        for (Shape s:Shapes) {
            AreaValues[i]=s.area(); i++;
        }
        }
}
