import java.sql.*;

public class StudentDAO {

    public void addStudent(Student student) {

        String sql =
                "INSERT INTO students(name,age,course) VALUES(?,?,?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCourse());

            ps.executeUpdate();

            System.out.println("Student Added!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs =
                    st.executeQuery("SELECT * FROM students");

            while(rs.next()){

                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getInt("age") + " " +
                        rs.getString("course")
                );

            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id){

        try{

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(
                            "DELETE FROM students WHERE id=?");

            ps.setInt(1,id);

            ps.executeUpdate();

            System.out.println("Deleted!");

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void updateStudent(Student s){

        try{

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(
                    "UPDATE students SET name=?,age=?,course=? WHERE id=?");

            ps.setString(1,s.getName());
            ps.setInt(2,s.getAge());
            ps.setString(3,s.getCourse());
            ps.setInt(4,s.getId());

            ps.executeUpdate();

            System.out.println("Updated!");

        }catch(Exception e){
            e.printStackTrace();
        }

    }

}