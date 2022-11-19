package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Splitter;

/**
 * Servlet implementation class getAdditionServlet
 */
@WebServlet("/getAdditionServlet")
public class getAdditionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAdditionServlet() {
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//int Integer.parseInt(request.getParameter("userNumber"));
		int userNumber1 = 0;
		int userNumber2 = 0;
		int userNumber3 = 0;
		try {
			if (!request.getParameter("userNumber1").equals("")) {
				userNumber1 = Integer.parseInt(request.getParameter("userNumber1"));
			}
		} catch (Exception e) {
			
		}
		try {
			if (!request.getParameter("userNumber2").equals("")) {
				userNumber2 = Integer.parseInt(request.getParameter("userNumber2"));
	
			}
		} catch (Exception e) {
			
		}
		try {
			if (!request.getParameter("userNumber3").equals("")) {
				userNumber3 = Integer.parseInt(request.getParameter("userNumber3"));
			}
		} catch (Exception e) {
			
		}
		int total = userNumber1 + userNumber2 + userNumber3;
		
		Splitter split = new Splitter(total);
		split.setSplits(total);
		request.setAttribute("userAdditionPouch", split);
		if (userNumber1 == 0 || userNumber2 == 0 || userNumber3 == 0) {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

		}else {
		getServletContext().getRequestDispatcher("/result2.jsp").forward(request, response);
		}
		//writer.println("Those numbers are equal to" + (userNumber1 + userNumber2 + userNumber3));
		PrintWriter writer = response.getWriter();

		writer.println("Those numbers are equal to " + split.getQuarters() + "/4ths, or " + split.getTenths() + " /10ths, or " + split.getHundredths() + "/100ths.");

		writer.close();
		
	}

}
