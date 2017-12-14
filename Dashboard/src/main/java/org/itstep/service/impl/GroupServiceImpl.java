package org.itstep.service.impl;

import java.util.List;

import org.itstep.dao.GroupDAO;
import org.itstep.dao.pojo.Group;
import org.itstep.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService{

	@Autowired
	GroupDAO groupDAO;
	
	public Group createAndUpdateGroup(Group group) {
		return groupDAO.saveAndFlush(group);
	}

	public void deleteGroup(String groupName) {
		groupDAO.delete(groupName);		
	}

	public List<Group> findAllGroupsByCourse(int course) {
		return groupDAO.findAllGroupsByCourse(course);
	}
	
	public boolean isUnique(Group group) {
		if(groupDAO.findOne(group.getGroupName()) != null) {
			return false;
		}
		return true;
	}

	public Group getGroup(String groupName) {
		return groupDAO.findOne(groupName);
	}

	public List<Group> getAllGroups() {
		return groupDAO.findAll();
	}



}
