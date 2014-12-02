package FitHits;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import FitHits.Artist;
import FitHits.EchoNestAPI;
import FitHits.EchoNestException;
import FitHits.Params;


/**
 * Servlet implementation class FitServlet
 */
@WebServlet("/FitServlet")
public class FitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().write("Get pumped with FitHits");
		
	}
	
	public static void main() {
		String s = request.getParameter("FitServlet");
		
        EchoNestAPI echoNest = new EchoNestAPI(R5RSCKQLGLGGF08YB);
        List<Artist> artists = echoNest.searchArtists(s);

        if (artists.size() > 0) {
            Artist s = artists.get(0);
            System.out.println("Similar artists for " + s.getName());
            for (Artist simArtist : s.getSimilar(10)) {
                out.println(s + simArtist.getName());
            }
        }
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
