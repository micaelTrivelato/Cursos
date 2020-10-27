package pacote;

import br.com.alura.loja.Servidor;
import br.com.alura.loja.modelo.Projeto;
import com.thoughtworks.xstream.XStream;
import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ProjetosTest {

    private HttpServer server;
    private WebTarget target;
    private Client client;

    @Before
    public void startaServidor() {
        server = Servidor.inicializaServidor();
        ClientConfig config = new ClientConfig();
        config.register(new LoggingFilter());
        this.client = ClientBuilder.newClient(config);
        this.target = client.target("http://localhost:8080");
    }

    @After
    public void mataServidor() {
        server.stop();
    }

    @Test
    public void testaQueAConexaoComOServidorFunciona() {

        Projeto projeto = target.path("Projetos/1").request().get(Projeto.class);
        assertEquals("1", projeto.getId());

    }
}
