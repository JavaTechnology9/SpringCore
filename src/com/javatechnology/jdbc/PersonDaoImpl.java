package com.javatechnology.jdbc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.javatechnology.jdbc.model.Person;

public class PersonDaoImpl implements PersonDao{
	//private JdbcTemplate template;
	private NamedParameterJdbcTemplate template;
	
	private static final String INSERTQUERY="insert into person(id,name,address) values(?,?,?)";
	
	/*public void setJdbcTemplate(JdbcTemplate template) {
		this.template=template;
	}
	*/
	
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate template) {
		this.template=template;
	}
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

}
