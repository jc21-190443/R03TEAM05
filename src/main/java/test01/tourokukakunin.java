package test01;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OUBO
 */
@WebServlet("/tourokukakunin")
public class tourokukakunin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//final String driverName = "oracle.jdbc.driver.OracleDriver";
		//final String url = "jdbc:mysql://localhost/" + webapp;
		//final String id = "webapp";
		//final String pass = "webapp";
		
		final String driverName = "oracle.jdbc.driver.OracleDriver";
		final String url = "jdbc:oracle:thin:@192.168.54.222:1521/pdborcl";
		final String id = "OUBO";
		final String pass = "Oubo2021";

		try {
			Class.forName(driverName);
			Connection connection = DriverManager.getConnection(url, id, pass);
			PreparedStatement st = connection
					.prepareStatement("select iconNo,foodName,expryDate,quantity from mst_food");
			ResultSet result = st.executeQuery();

			List<String[]> list = new ArrayList<>();

			while (result.next() == true) {

				// System.out.println(result.getString("X"));
				String[] s = new String[3];
				s[0] = result.getString("iconNo");
				s[1] = result.getString("foodName");
				s[2] = result.getString("expryDate");
				s[3] = result.getString("quantity");

				list.add(s);
			}

			for (String[] s : list) {
				System.out.println(s[0]);
				System.out.println(s[1]);
				System.out.println(s[2]);
				System.out.println(s[3]);

			}
			request.setAttribute("list", list);
			request.getRequestDispatcher("/WEB-INF/jsp/tourokukakuninn.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}