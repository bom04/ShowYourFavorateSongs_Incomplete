package net.skhu.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


//@ToString(exclude={"students","courses","professors"})
//@EqualsAndHashCode(exclude={"students","courses","professors"})
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int user_idx;

    String email;
    String password;
    String nickname;
    String message;
    String auth_key;
    boolean user_auth;
    boolean manager;


    public User() {}
    public User(String email,String password, String nickname,String message,
    		String auth_key,boolean user_auth,boolean manager) {
    	this.email=email;
    	this.password=password;
    	this.nickname=nickname;
    	this.message=message;
    	this.auth_key=auth_key;
    	this.user_auth=user_auth;
    	this.manager=manager;
    }

    public String getEmail() {
    	return email;
    }
    public String getPassword() {
    	return password;
    }
    public String getNickname() {
    	return nickname;
    }
    public String getAuth_key() {
    	return auth_key;
    }
    public boolean getUser_auth() {
    	return user_auth;
    }
    public boolean getManager() {
    	return manager;
    }



    public void setEmail(String email) {
    	this.email=email;
    }
    public void setPassword(String password) {
    	this.password=password;
    }
    public void setNickname(String nickname) {
    	this.nickname=nickname;
    }
    public void setMessage(String message) {
    	this.message=message;
    }
    public void setAuth_key(String auth_key) {
    	this.auth_key=auth_key;
    }
    public void setUser_auth(boolean user_auth) {
    	this.user_auth=user_auth;
    }
    public void setManager(boolean manager) {
    	this.manager=manager;
    }




//    @JsonIgnore
//    @OneToMany(mappedBy="department", fetch = FetchType.LAZY)
//    List<Student> students;
//
//    @JsonIgnore
//    @OneToMany(mappedBy="department", fetch = FetchType.LAZY)
//    List<Course> courses;
//
//    @JsonIgnore
//    @OneToMany(mappedBy="department", fetch = FetchType.LAZY)
//    List<Professor> professors;
}
