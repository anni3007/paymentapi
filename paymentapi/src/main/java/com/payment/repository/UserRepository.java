package com.payment.repository;

/*import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
*/
/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
/*import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
*/import org.springframework.stereotype.Repository;

import com.payment.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	/*
	 * @Autowired JdbcTemplate jdbcTemplate;
	 * 
	 class UserRowMapper implements RowMapper<User> {
	  
	  @Override public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	  User user = new User(); user.setEmailId(rs.getString("EMAILID"));
	  user.setFirstName(rs.getString("FIRSTNAME"));
	  user.setLastName(rs.getString("LASTNAME"));
	  user.setPhoneNumber(rs.getString("PHONENUMBER")); return user; }
	  
	 }
	 */
	 /* public List<User> findAll() { return jdbcTemplate.query("select * from user",
	 * new UserRowMapper()); }
	 * 
	 * public User findById() { return
	 * jdbcTemplate.queryForObject("select * from user where isself=true", new
	 * Object[] {}, new BeanPropertyRowMapper<User>(User.class)); }
	 * 
	 * public int deleteById(long id) { return
	 * jdbcTemplate.update("delete from student where id=?", new Object[] { id }); }
	 * 
	 * public int insert(User user) { return jdbcTemplate.
	 * update("insert into user(id, FIRSTNAME,LASTNAME, EMAILID,PHONENUMBER,ISSELF) "
	 * + "values(?,  ?, ?,?,?,?)", new Object[] { user.getId(),
	 * user.getFirstName(),user.getLastName(),user.getEmailId(),user.getPhoneNumber(
	 * ),user.isSelf()}); }
	 * 
	 * public int update(User user) { return jdbcTemplate.update("update user " +
	 * " set FIRSTNAME = ?,LASTNAME =?, EMAILID= ? , PHONENUMBER=? " +
	 * " where id = ?", new Object[]
	 * {user.getFirstName(),user.getLastName(),user.getEmailId(),user.getPhoneNumber
	 * (),user.getId() }); }
	 */

	@Query("SELECT u FROM User u WHERE u.accountNumber = :accountNumber")
	public User findByAccountNumber(@Param("accountNumber")long accountNumber);
}
