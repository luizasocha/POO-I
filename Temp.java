public class Temp {

    double c;

    public Temp(double celsius){
        c = celsius;
    }

    public double convertToFahrenheit(){
        double f = (c * 1.8) + 32.0;
        return f;
    }

    public double convertToKelvin(){
        double k = c + 273.0;
        return k;
    }
}
