public class Ubicacion {

    double lat;
    double lon;

    Ubicacion(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }
        double distancia (Ubicacion b){
        double d = (lat - b.lat) * (lat - b.lat) + (lon - b.lon) * (lon - b.lon);
        d = Math.sqrt(d);
        return d;

    }
    void imprimir(){
        System.out.println(lat);
        System.out.println(lon);
    }
}
