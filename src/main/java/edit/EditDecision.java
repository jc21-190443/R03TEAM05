package edit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditDecision
 */
@WebServlet("/checkjsp/editDecision")
public class EditDecision extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDecision() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		try {
			String foodName1=request.getParameter("foodName1").toString();
			String expryDate1=request.getParameter("expryDate1").toString();
			String quantity1=request.getParameter("quantity1").toString();
			
			String foodName2=request.getParameter("foodName2").toString();
			String expryDate2=request.getParameter("expryDate2").toString();
			String quantity2=request.getParameter("quantity2").toString();
			
			String foodName3=request.getParameter("foodName3").toString();
			String expryDate3=request.getParameter("expryDate3").toString();
			String quantity3=request.getParameter("quantity3").toString();
			
			String foodName4=request.getParameter("foodName4").toString();
			String expryDate4=request.getParameter("expryDate4").toString();
			String quantity4=request.getParameter("quantity4").toString();
			
			String foodName5=request.getParameter("foodName5").toString();
			String expryDate5=request.getParameter("expryDate5").toString();
			String quantity5=request.getParameter("quantity5").toString();
			
			String foodName6=request.getParameter("foodName6").toString();
			String expryDate6=request.getParameter("expryDate6").toString();
			String quantity6=request.getParameter("quantity6").toString();
			
			String foodName7=request.getParameter("foodName7").toString();
			String expryDate7=request.getParameter("expryDate7").toString();
			String quantity7=request.getParameter("quantity7").toString();
			
			String foodName8=request.getParameter("foodName8").toString();
			String expryDate8=request.getParameter("expryDate8").toString();
			String quantity8=request.getParameter("quantity8").toString();
			
			String foodName9=request.getParameter("foodName9").toString();
			String expryDate9=request.getParameter("expryDate9").toString();
			String quantity9=request.getParameter("quantity9").toString();
			
			String foodName10=request.getParameter("foodName10").toString();
			String expryDate10=request.getParameter("expryDate10").toString();
			String quantity10=request.getParameter("quantity10").toString();
			
			String foodName11=request.getParameter("foodName11").toString();
			String expryDate11=request.getParameter("expryDate11").toString();
			String quantity11=request.getParameter("quantity11").toString();
			
			String foodName12=request.getParameter("foodName12").toString();
			String expryDate12=request.getParameter("expryDate12").toString();
			String quantity12=request.getParameter("quantity12").toString();
			
			String foodName13=request.getParameter("foodName13").toString();
			String expryDate13=request.getParameter("expryDate13").toString();
			String quantity13=request.getParameter("quantity13").toString();
			
			String foodName14=request.getParameter("foodName14").toString();
			String expryDate14=request.getParameter("expryDate14").toString();
			String quantity14=request.getParameter("quantity14").toString();
			
			String foodName15=request.getParameter("foodName15").toString();
			String expryDate15=request.getParameter("expryDate15").toString();
			String quantity15=request.getParameter("quantity15").toString();
			
			String foodName16=request.getParameter("foodName16").toString();
			String expryDate16=request.getParameter("expryDate16").toString();
			String quantity16=request.getParameter("quantity16").toString();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://192.168.54.191/webapp","webapp","webapp");
			java.sql.Statement st =connection.createStatement();
			
			if(foodName1 != "NotEntered."){
				ResultSet result1 = st.executeQuery("update mst_food set foodName='" + foodName1 + "',expryDate='" + expryDate1 + "',quantity='" + quantity1 + "' where foodNo='1';");
				System.out.println(result1);
			}
			
			if(foodName2 != "NotEntered."){
				ResultSet result2 = st.executeQuery("update mst_food set foodName='" + foodName2 + "',expryDate='" + expryDate2 + "',quantity='" + quantity2 + "' where foodNo='2';");
				System.out.println(result2);
			}
			
			if(foodName3 != "NotEntered."){
				ResultSet result3 = st.executeQuery("update mst_food set foodName='" + foodName3 + "',expryDate='" + expryDate3 + "',quantity='" + quantity3 + "' where foodNo='2';");
				System.out.println(result3);
			}
			
			if(foodName4 != "NotEntered."){
				ResultSet result4 = st.executeQuery("update mst_food set foodName='" + foodName4 + "',expryDate='" + expryDate4 + "',quantity='" + quantity4 + "' where foodNo='4';");
				System.out.println(result4);
			}
			
			if(foodName5 != "NotEntered."){
				ResultSet result5 = st.executeQuery("update mst_food set foodName='" + foodName5 + "',expryDate='" + expryDate5 + "',quantity='" + quantity5 + "' where foodNo='5';");
				System.out.println(result5);
			}
			
			if(foodName6 != "NotEntered."){
				ResultSet result6 = st.executeQuery("update mst_food set foodName='" + foodName6 + "',expryDate='" + expryDate6 + "',quantity='" + quantity6 + "' where foodNo='6';");
				System.out.println(result6);
			}
			
			if(foodName7 != "NotEntered."){
				ResultSet result7 = st.executeQuery("update mst_food set foodName='" + foodName7 + "',expryDate='" + expryDate7 + "',quantity='" + quantity7 + "' where foodNo='7';");
				System.out.println(result7);
			}
			
			if(foodName8 != "NotEntered."){
				ResultSet result8 = st.executeQuery("update mst_food set foodName='" + foodName8 + "',expryDate='" + expryDate8 + "',quantity='" + quantity8 + "' where foodNo='8';");
				System.out.println(result8);
			}
			
			if(foodName9 != "NotEntered."){
				ResultSet result9 = st.executeQuery("update mst_food set foodName='" + foodName9 + "',expryDate='" + expryDate9 + "',quantity='" + quantity9 + "' where foodNo='9';");
				System.out.println(result9);
			}
			
			if(foodName10 != "NotEntered."){
				ResultSet result10 = st.executeQuery("update mst_food set foodName='" + foodName10 + "',expryDate='" + expryDate10 + "',quantity='" + quantity10 + "' where foodNo='10';");
				System.out.println(result10);
			}
			
			if(foodName11 != "NotEntered."){
				ResultSet result11 = st.executeQuery("update mst_food set foodName='" + foodName11 + "',expryDate='" + expryDate11 + "',quantity='" + quantity11 + "' where foodNo='11';");
				System.out.println(result11);
			}
			
			if(foodName12 != "NotEntered."){
				ResultSet result12 = st.executeQuery("update mst_food set foodName='" + foodName12 + "',expryDate='" + expryDate12 + "',quantity='" + quantity12 + "' where foodNo='12';");
				System.out.println(result12);
			}
			
			if(foodName13 != "NotEntered."){
				ResultSet result13 = st.executeQuery("update mst_food set foodName='" + foodName13 + "',expryDate='" + expryDate13 + "',quantity='" + quantity13 + "' where foodNo='13';");
				System.out.println(result13);
			}
			
			if(foodName14 != "NotEntered."){
				ResultSet result14 = st.executeQuery("update mst_food set foodName='" + foodName14 + "',expryDate='" + expryDate14 + "',quantity='" + quantity14 + "' where foodNo='14';");
				System.out.println(result14);
			}
			
			if(foodName15 != "NotEntered."){
				ResultSet result15 = st.executeQuery("update mst_food set foodName='" + foodName15 + "',expryDate='" + expryDate15 + "',quantity='" + quantity15 + "' where foodNo='15';");
				System.out.println(result15);
			}
			
			if(foodName16 != "NotEntered."){
				ResultSet result16 = st.executeQuery("update mst_food set foodName='" + foodName16 + "',expryDate='" + expryDate16 + "',quantity='" + quantity16 + "' where foodNo='16';");
				System.out.println(result16);
			}
			
			response.sendRedirect("http://localhost:8080/Refrigerator/editPage");
		}catch(Exception e) {
			e.printStackTrace(out);
		}
	}

}
