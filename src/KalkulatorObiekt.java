public class KalkulatorObiekt {
    private double a;
    private double b;

    public KalkulatorObiekt(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double dodawanie(){
        return a+b;
    }
    public double odejmowanie(){
        return a-b;
    }
    public double mnozenie(){
        return a*b;
    }
    public double dzielenie(){
        return a/b;
    }
}
