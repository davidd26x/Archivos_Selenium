package principal;

import reader.JsonReader;


public class Ejercicio1 {
    public static void main(String[] args) {
        final var user = JsonReader.leerUsuarioJson();

        System.out.printf("name: %s%n", user.getName());
        System.out.printf("lat: %.2f, lng: %.2f%n",
                user.getAddress().getGeo().getLat(), user.getAddress().getGeo().getLng());
        System.out.printf("catchphrase: %s%n", user.getCompany().getCatchPhrase());
    }
}
