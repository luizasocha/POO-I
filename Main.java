public class Main {

    public static void main(String[] args){
        Temp t = new Temp(5.2);
        System.out.println("Temperatura em Celsius: " +t.c);
        System.out.println("Temperatura em Fahrenheit: " +t.convertToFahrenheit());
        System.out.println("Temperatura em Kelvin: " + t.convertToKelvin());
    }
}
