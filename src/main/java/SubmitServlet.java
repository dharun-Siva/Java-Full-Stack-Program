import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/SubmitServlet")
public class SubmitServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    
    
    private static final String url = "jdbc:mysql://localhost:3306/dharun";
    private static final String user = "root";
    private static final String pass = "dharunsiva@1";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            try (Connection conn = DriverManager.getConnection(url, user, pass)) {
          
                String sql = "SELECT * FROM EmployeeManagement";
                try (PreparedStatement ps = conn.prepareStatement(sql);
                     ResultSet rs = ps.executeQuery()) {
                     
                    // Display Data
                	out.println("<html><body><h2>Employee Details</h2><table border='1'><tr><th>Emp Id</th><th>Emp Name</th><th>Emp Salary</th><th>Emp Experience</th></tr>");
                	while (rs.next()) {
                	    out.println("<tr><td>" + rs.getInt("id") + "</td><td>" + rs.getString("name") + "</td><td>" + rs.getInt("salary") + "</td><td>" + rs.getInt("Experience") + "</td></tr>");
                	}
                	out.println("</table>");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }

        out.println("<br><a href='./index.html'>Return to Home Page</a>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String updates = request.getParameter("updates");

        if ("put".equalsIgnoreCase(updates)) {
            doPut(request, response);
            return;
        } else if ("delete".equalsIgnoreCase(updates)) 
        {
            doDelete(request, response);
            return;}
        
        String method = request.getParameter("_method");


        try {
          
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            int salary = Integer.parseInt(request.getParameter("salary"));
            int exp = Integer.parseInt(request.getParameter("exp"));


           
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(url, user, pass)) {
                String query = "INSERT INTO EmployeeManagement  VALUES (?, ?, ?, ?)";
                try (PreparedStatement stm = conn.prepareStatement(query)) {
                    stm.setInt(1, id);
                    stm.setString(2, name); 
                    stm.setInt(3, salary);
                    stm.setInt(4, exp);  

                    stm.executeUpdate();
                    out.println("<html><body><p>Inserted successfully!</p><br><a href='./view.jsp'>View Employee Details</a></body></html>");
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
        
    }
    
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int salary = Integer.parseInt(request.getParameter("salary"));
        int exp = Integer.parseInt(request.getParameter("exp"));
        

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pass);

            String sql = "UPDATE EmployeeManagement SET name = ?, salary = ? , experience = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setInt(2, salary);
            ps.setInt(3, exp);
            ps.setInt(4, id);
            
            

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                out.println("<p>User with ID " + id + " updated successfully.</p>");
            } else {
                out.println("<p>No user found with ID " + id + "</p>");
            }

            ps.close();
            conn.close();
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }

        out.println("<br><a href='index.jsp'>Go Back</a>");
    }

    
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int id = Integer.parseInt(request.getParameter("id"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
           

            String sql = "DELETE FROM EmployeeManagement WHERE id = ?";
//            if (id == null || id.isEmpty()) {
//                out.println("<p>Error: ID parameter is missing.</p>");
//                out.println("<br><a href='index.jsp'>Go Back</a>");
//                return;
//            }
            PreparedStatement pstmt = conn.prepareStatement(sql);
           pstmt.setInt(1, id);

            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                out.println("<p>User with ID " + id + " deleted successfully.</p>");
            } else {
                out.println("<p>No user found with ID " + id + "</p>");
            }
            
            doGet(request,response);

            pstmt.close();
            conn.close();
        } catch ( Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }

        out.println("<br><a href='index.jsp'>Go Back</a>");
    }
}
