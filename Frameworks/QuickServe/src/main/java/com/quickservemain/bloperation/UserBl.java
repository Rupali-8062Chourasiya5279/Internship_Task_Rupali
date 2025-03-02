package com.quickservemain.bloperation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.quickservemain.dtoreponse.ShowAllUsersRes;
import com.quickservemain.dtoreponse.UserLoginRes;
import com.quickservemain.dtoreponse.UserResponse;
import com.quickservemain.dtorequest.UserDTO;
import com.quickservemain.dtorequest.UserLoginReq;
import com.quickservemain.entities.Users;
import com.quickservemain.repository.UserRepository;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class UserBl {
	
	@Autowired
	private UserRepository urepo;
	
	//private final BCryptPasswordEncoder passwordencoder = new BCryptPasswordEncoder();
	
	public Users registerUser(UserDTO udto)
	{
		//String encryptpass = passwordencoder.encode(udto.getPassword());
		Users u = new Users();
		u.setName(udto.getName());
		u.setEmail(udto.getEmail());
		u.setMobile(udto.getMobile());
		u.setPassword(udto.getPassword());
		u.setRole(udto.getRole());
		return urepo.save(u);
	}
	
	public UserLoginRes login(UserLoginReq ulr)
	{
		String reqemail = ulr.getEmail();
		String reqpassword = ulr.getPassword();
		
		Users u = urepo.findByEmailAndPassword(reqemail,reqpassword);
		
		if(reqemail.equals(u.getEmail()) && reqpassword.equals(u.getPassword()))
		{
			return new UserLoginRes("success","Login successfully",200);
		}
		else
		{
			return new UserLoginRes("failed","Unauthorised access",401);
		}
	}
	
	public void logout(HttpServletRequest request)
	{
		request.getSession().invalidate();
	}
	
	public boolean verifyemail(String email)
	{
		 Users u = urepo.findByEmail(email);
		if(u==null)
		{
		return false;
		}
		else
		{
			return true;
		}
	}
	
	public ShowAllUsersRes showallusers() {
		List<Users> l =urepo.findAll();
		return new ShowAllUsersRes("success", l, 200);	
	}
	
	public Users addUser(UserDTO udto)
	{
		Users u = new Users();
		u.setName(udto.getName());
		u.setEmail(udto.getEmail());
		u.setMobile(udto.getMobile());
		u.setPassword(udto.getPassword());
		u.setRole(udto.getRole());
		return urepo.save(u);
	}
	
	public Users showByUserId(String userid)
	{
		return urepo.findById(userid).get();
	}
	
	public Users updateUser(UserDTO udto)
	{
		Users u = new Users();
		u.setName(udto.getName());
		u.setEmail(udto.getEmail());
		u.setMobile(udto.getMobile());
		u.setPassword(udto.getPassword());
		u.setRole(udto.getRole());
		return urepo.save(u);
	}
	
	public UserResponse deleteByUserId(String userid)
	{
		Optional<Users> u = urepo.findById(userid);
		if(u.isPresent())
		{
		urepo.deleteById(u.get().getUserid());
		return new UserResponse("success", "deleted sucessfully",u);
		}
		return new UserResponse("failed", "user not deleted ",u);
	}

}
