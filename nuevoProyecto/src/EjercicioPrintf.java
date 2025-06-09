public class EjercicioPrintf {
    public static void main(String[] args) {
        final var numeroGatos = 5;
        final var peso = 13.2;
        final var libro_fav = "Hola mundo 123";
        final var es_bajo = false;
        final var inicial = 'V';

        System.out.printf("Hola tengo %d gatos%n", numeroGatos);
        System.out.printf("%.2f es mi peso%n", peso);
        System.out.printf("Mi libro favorito es %s y lo leo todas las noches%n", libro_fav);
        System.out.printf("Mi inicial es %c%n", inicial);
        System.out.printf("Si me preguntan si soy bajo pues la respuesta es %b%n", es_bajo);
    }
}
