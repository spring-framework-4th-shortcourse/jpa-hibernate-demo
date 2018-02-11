package com.kshrd.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.kshrd.entity.User;

@Service
@Transactional
public class UserService {
	
	@PersistenceContext
	private EntityManager em;
	
	public void saveUser(User user){
		em.persist(user);		
	}
	
	public User getUserById(int id){
		User user = em.find(User.class, id);
		return user;
	}
	
	public List<User> getAllUsers(){
		List<User> users = em.createQuery("from User u", User.class).getResultList();
		return users;
	}
	
}
