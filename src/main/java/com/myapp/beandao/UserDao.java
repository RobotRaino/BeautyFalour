package com.myapp.beandao;

import com.myapp.enumeration.Gender;
import com.myapp.model.User;
import com.myapp.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDao {
    JdbcTemplate jdbcTem;
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTem = jdbcTemplate;
    }
    public boolean saveuser(User user){
        String query="insert into user (Firstname,Lastname,ContactNo,Email,Password,Gender) values (?,?,?,?,?,?)";
        try{
        int res=jdbcTem.update(query,
                        user.getFirstname(),
                        user.getLastname(),
                        user.getContactno(),
                        user.getEmail(),
                        user.getPassword(),
                        user.getGender().toString()
        );
        return res>0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean edituser(User user){
        try{
        String query="UPDATE user SET Firstname=?," +
                                      "Lastname=?," +
                                      "ContactNo=?," +
                                      "Email=?," +
                                      "Password=?," +
                                      "Gender=? WHERE id=?";
        int res=jdbcTem.update(query,
                user.getFirstname(),
                user.getLastname(),
                user.getContactno(),
                user.getEmail(),
                user.getPassword(),
                user.getGender().toString(),
                user.getId()
        );
        return res>0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public List<UserDetails> showAll(){
        String query="Select * from user";
        return jdbcTem.query(query,this::maptouserDetails);
    }

    private UserDetails maptouserDetails(ResultSet resultSet, int i) {
        UserDetails userDetails=new  UserDetails();
        try {
          userDetails.setId(resultSet.getInt("uid"));
          userDetails.setFirstname(resultSet.getString("Firstname"));
          userDetails.setLastname(resultSet.getString("Lastname"));
          userDetails.setEmail(resultSet.getString("Email"));
          userDetails.setContactno(resultSet.getString("ContactNo"));
          userDetails.setGender(Gender.valueOf(resultSet.getString("Gender")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userDetails;
    }
    public User getUserByid(int id){
        String query="Select * from user where uid=?";
        return jdbcTem.queryForObject(query,this::maptoUser);
    }

    private User maptoUser(ResultSet resultSet, int i) {
        User user=new User();
        try{
            user.setId(resultSet.getInt("uid"));
            user.setFirstname(resultSet.getString("Firstname"));
            user.setLastname(resultSet.getString("Lastname"));
            user.setEmail(resultSet.getString("Email"));
            user.setContactno(resultSet.getString("ContactNo"));
            user.setGender(Gender.valueOf(resultSet.getString("Gender")));
            user.setPassword(resultSet.getString("Password"));
        }
        catch (Exception e){

        }
        return user;
    }
    public int getNextId() {

        String query = "SELECT uid FROM user ORDER BY uid DESC LIMIT 1";

        int index = 0;
        try {
            index = jdbcTem.queryForObject(query, new Object[]{"paramValue"}, Integer.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return index;
    }
}
