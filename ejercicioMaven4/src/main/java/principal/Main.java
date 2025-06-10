package principal;

import utilities.Logs;

public class Main {
    public static void main(String[] args) {
        Logs.error("Esto es un error");
        Logs.info("Soy un paso de alto nivel");
        Logs.debug("Soy un paso técnico");
        Logs.trace("Soy un paso detallado");
    }
}
