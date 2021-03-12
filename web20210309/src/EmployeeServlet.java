

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.*;
import model.Employee;
/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user="root";
		String password="1234";
		String url="jdbc:mysql://localhost:3306/classicmodels";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection(url, user, password);
			String sql="select *from classicmodels.employees";
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			List<Employee> data=getRows(rs);
			request.setAttribute("emps",data);
			//response.getWriter().append(data.toString());
			request.getRequestDispatcher("ViewEmployee.jsp").forward(request, response);
		}catch(SQLException | ClassNotFoundException ex) {
		System.out.println("SQL Error:"+ex.getMessage());}
		
	}
		List<Employee> getRows(ResultSet rs) throws SQLException{
			List<Employee> temp=new ArrayList<>();
			while(rs.next()) {
				int no=rs.getInt("employeeNumber");
				String fn=rs.getString("firstName");
				String ln=rs.getString("lastName");
				String ex=rs.getString("extension");
				String code=rs.getString("officeCode");
				String mail=rs.getString("email");
				String title=rs.getString("jobTitle");
				int rept=rs.getInt("reportsTo");
				Employee e=new Employee(no,fn,ln,ex,code,mail,title,rept);
				temp.add(e);
				
			}
			return temp;
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
