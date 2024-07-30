package DSX1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DAO {

   @SuppressWarnings("finally")
   public String Login(DTO dto) {

      String result = null;
      PreparedStatement psmt = null;
      Connection conn = null;
      ResultSet rs = null;

      try {

         Class.forName("oracle.jdbc.driver.OracleDriver");

         String url = "jdbc:oracle:thin:project-db-campus.smhrd.com:1523:xe";
         String user = "seocho_DCX_DB_p1_1";
         String password = "smhrd1";

         conn = DriverManager.getConnection(url, user, password);

         String sql = "SELECT * FROM USER_DT WHERE ID = ? AND PS = ?";

         psmt = conn.prepareStatement(sql);

         psmt.setString(1, dto.getID());
         psmt.setInt(2, dto.getPW());

         rs = psmt.executeQuery();

         if (rs.next()) {
            result = rs.getString("Name");
         }
      } catch (Exception e) {
         System.out.println("클라스 파일 찾기 실패.");
         e.printStackTrace();
      } finally {

         try {
            if (rs != null)
               rs.close();
            if (psmt != null)
               psmt.close();
            if (conn != null)
               conn.close();

         } catch (SQLException e) {
            e.printStackTrace();
         }
         return result;
      }
   }

   public int join(DTO dto) {
      int result = 0;
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");

         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String user = "nthnew";
         String password = "12345";

         Connection conn = DriverManager.getConnection(url, user, password);

         String sql = "INSERT INTO DCXMEMBER VALUES(?,?,?,?,?)";

         PreparedStatement psmt = conn.prepareStatement(sql);

         psmt.setString(1, dto.getID());
         psmt.setInt(2, dto.getPW());
         psmt.setString(3, dto.getNAME());

         result = psmt.executeUpdate();

      } catch (Exception e) {

         e.printStackTrace();
      }
      return result;
   }

}