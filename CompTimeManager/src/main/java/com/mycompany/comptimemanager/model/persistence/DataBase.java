package com.mycompany.comptimemanager.model.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mycompany.comptimemanager.model.entity.User;
import com.mycompany.comptimemanager.model.entity.WorkHour;

public class DataBase {

	private static List<WorkHour> list = new ArrayList<>();
	private static List<User> userList = new ArrayList<>();
	
	static {
		User user = new User();
		user.setLogin("Everton42");
		user.setPassword("12345");
		userList.add(user);
		
		WorkHour wkh1 = new WorkHour("2019-09-23", "08:00", "12:00");
		wkh1.setUserId(user.getId());
		WorkHour wkh2 = new WorkHour("2019-09-23", "12:00", "18:00");
		wkh2.setUserId(user.getId());
		list.add(wkh1);
		list.add(wkh2);
	}
	
	public void addWorkHour(WorkHour workHour, Integer userId) {
		workHour.setUserId(userId);
		DataBase.list.add(workHour);
	}
	
	public List<WorkHour> getWorkHours(){
		return DataBase.list;
	}

	public void removeWorkHour(Integer id) {
		Iterator<WorkHour> it = list.iterator();
		
		while(it.hasNext()) {
			WorkHour wk = it.next();
			
			if(wk.getId() == id) {
				it.remove();
			}
		}
	}

	public WorkHour getWorkHourById(Integer id) {
		for (WorkHour wk : list) {
			if(wk.getId() == id) {
				return wk;
			}
		}
		return null;
	}

	public User validateLogin(String login, String password) {
		for(User user : userList) {
			if(user.validate(login, password)) {
				return user;
			}
		}
		return null;
	}
}
