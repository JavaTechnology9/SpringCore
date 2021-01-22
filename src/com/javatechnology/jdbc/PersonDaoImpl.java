package com.javatechnology.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.javatechnology.jdbc.model.Person;
@Repository
public class PersonDaoImpl implements PersonDao{
	@Autowired
	//private JdbcTemplate template;
	private NamedParameterJdbcTemplate template;
	
	private static final String INSERTQUERY="insert into person(id,name,address) values(:id,:name,:address)";
	private static final String LOADPERSON="select * from person where id=?";
	private static final String UPDATEPERSON="update person set name=:name where id=:id";
	
	@Override
	public Person getPerson(Long id) {
		/*Person person = template.query(LOADPERSON, new Object[] {id}, new ResultSetExtractor<Person>() {

			@Override
			public Person extractData(ResultSet rs) throws SQLException, DataAccessException {
				Person person=new Person();
				while(rs.next()) {
				person.setId(rs.getLong(1));
				person.setName(rs.getString(2));
				person.setAddress(rs.getString(3));
				}
				return person;
				
			}
			
		});*/
		return null;
	}
	
	/*public void setJdbcTemplate(JdbcTemplate template) {
		this.template=template;
	}
	
	*/
	/*public void setDataSource(DataSource dataSource) {
		template=new NamedParameterJdbcTemplate(dataSource);
	}*/
	
// the below savePerson method used for JdbcTemplate example
	/*@Override
	public String savePerson(Person person) {
		int update = template.update(INSERTQUERY, person.getId(),person.getName(),person.getAddress());
		return update>0?"successfully inserted one record":"we geot exception";
	}*/
	
	@Override
	public String savePerson(Person person) {
		Map<String, Object> paramMap=new HashMap<String, Object>();
		paramMap.put("id", person.getId());
		paramMap.put("name", person.getName());
		paramMap.put("address", person.getAddress());
		int update = template.update(INSERTQUERY, paramMap);
		
		return update>0?"successfully inserted one record":"we geot exception";
	}

	@Override
	public Person updatePerson(Person person) {
		//SqlParameterSource namedparameter=new MapSqlParameterSource().addValue("name", person.getName()).addValue("id", person.getId());
		Map<String, Object> paramMap=new HashMap<String, Object>();
		paramMap.put("id", person.getId());
		paramMap.put("name", person.getName());
		int update = template.update(UPDATEPERSON, paramMap);
		if(update>0)
			System.out.println("Person data is updated :"+person.getId());
		else
			System.out.println("No Person data Found with this id :"+person.getId());
		return null;
	}

	/*@Override
	public Person getPerson(Long id) {
		Map<String, Object> paramMap=new HashMap<String, Object>();
		paramMap.put("id", id);
		Person person = template.query(LOADPERSON, paramMap, new ResultSetExtractor<Person>() {

			@Override
			public Person extractData(ResultSet rs) throws SQLException, DataAccessException {
				Person person=new Person();
				while(rs.next()) {
				person.setId(rs.getLong(1));
				person.setName(rs.getString(2));
				person.setAddress(rs.getString(3));
				}
				return person;
			}
		});
		return person!=null?person:null;
	}*/

}
