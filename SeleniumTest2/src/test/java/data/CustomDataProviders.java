package data;

import modelos.Usuario;
import org.testng.annotations.DataProvider;

public class CustomDataProviders {
    public static final String DP_CREDENTIALS = "dpCredentials";
    public static final String DP_MENSAJES_ERROR = "dpMensajeError";

    @DataProvider(name = DP_CREDENTIALS)
    public static Object[][] credentialsDataProvider(){
        final var invalidas = DataGiver.getLockedCredentials();
        final var inexistentes = DataGiver.getUnexistentCredentials();

        return new Object[][]{
                {invalidas.getUsername(), invalidas.getPassword(), invalidas.getMessage()},
                {inexistentes.getUsername(), inexistentes.getPassword(), inexistentes.getMessage()}
        };
    }

    @DataProvider(name = DP_MENSAJES_ERROR)
    public static Object[][] mensajeErrorDataProvider(){
        final var usuario = new Usuario();
        final var mapMensajeError = Parser.obtenerMapMensajeError();

        return new Object[][]{
                {"", usuario.getLastname(), usuario.getZipcode(),
                        mapMensajeError.get("error_name").getMensaje()},
                {usuario.getName(), "", usuario.getZipcode(),
                        mapMensajeError.get("error_lastname").getMensaje()},
                {usuario.getName(), usuario.getLastname(), "",
                        mapMensajeError.get("error_zipcode").getMensaje()}
        };
    }
}
