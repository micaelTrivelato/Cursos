
package projetomaven.lojaweb;

import br.com.caelum.stella.tinytype.CPF;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import projetoMaven.Produto;

@WebServlet(urlPatterns={"/contato"})
public class ContatoServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Produto produto = new Produto("produto", 0.0);
        PrintWriter writer = resp.getWriter();
        writer.println("<html><h2>Fale conosco</h2></html>" + produto.getNome());
        writer.close();
        
    }
  
}
