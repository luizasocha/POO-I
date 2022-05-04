public class Coordenadas {

    String latitude;
    String longitude;

    public Coordenadas(String novaLatitude, String novaLongitude){
        latitude = novaLatitude;
        longitude = novaLongitude;
    }

    public String gerarCoordenada(){
        return latitude + " / " + longitude;
    }
}
