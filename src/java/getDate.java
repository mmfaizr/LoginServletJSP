import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getDate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
       PrintWriter out = response.getWriter();
       
       String user = request.getParameter("user");
       String pass=request.getParameter("pass");
       responseServlet(response,user,pass);
    }

    
    private void responseServlet(HttpServletResponse response, String a, String b)
            throws ServletException, IOException
    {
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<b1>JSP Event Page<br>Welcome Garcia</b1>");
        out.println("<form action=\"showResult\" method=\"post\">\n"
                + "            \n"
                + "            <table>\n"
                + "                \n"
                + "                <tr>\n"
                + "                    <td>date</td>\n"
                + "                    <td><input name=\"date\"></td>\n"
                + "                </tr>\n"
                + "            </table>\n"
                + "            <input type=\"submit\" value=\"test\">\n"
                + "        </form>");
        out.println("</html>");
        out.println("</body>");
    }
        
    
}

