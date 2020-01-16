package tudelft.cgv.volvis;

public class threadobject {
    private final double[] viewVec;
    private final double[] uVec;
    private final double[] vVec;
   // private final double[] pixelCoord;
   // private final double[] entryPoint;
   // private final double[] exitPoint;
    private final int increment;
    private final int sampleStep;
    private final int imageW;
    private final int i1;
    private final double[] rayVector;
    private final int j;

    public threadobject(double[] viewVec, double[] uVec, double[] vVec, /*double[] pixelCoord, double[] entryPoint, double[] exitPoint,*/ int increment, int sampleStep, int imageW, int i1, double[] rayVector, int j) {
        this.viewVec = viewVec;
        this.uVec = uVec;
        this.vVec = vVec;
       // this.pixelCoord = pixelCoord;
       // this.entryPoint = entryPoint;
       // this.exitPoint = exitPoint;
        this.increment = increment;
        this.sampleStep = sampleStep;
        this.imageW = imageW;
        this.i1 = i1;
        this.rayVector = rayVector;
        this.j = j;
    }

    public double[] getViewVec() {
        return viewVec;
    }

    public double[] getuVec() {
        return uVec;
    }

    public double[] getvVec() {
        return vVec;
    }

  // public double[] getPixelCoord() {
  //     return pixelCoord;
  // }

  // public double[] getEntryPoint() {
  //     return entryPoint;
  // }

  // public double[] getExitPoint() {
  //     return exitPoint;
  // }

    public int getIncrement() {
        return increment;
    }

    public int getSampleStep() {
        return sampleStep;
    }

    public int getImageW() {
        return imageW;
    }

    public int getI1() {
        return i1;
    }

    public double[] getRayVector() {
        return rayVector;
    }

    public int getJ() {
        return j;
    }
}
