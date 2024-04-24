package com.hsrp.nic_project.relation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_data")
public class User {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String organization_name;
    private String user_name;
    private String password;
    private Long phone_num;
    private String email;
    
    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL, CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Bank> bank;


    public User() {

    }

    public User(Long id, String org_name, String user_name, String password, Long phone_num, String email, Long registration_num, List<Bank> ipaddress) {
        this.id = id;
        this.organization_name = org_name;
        this.user_name = user_name;
        this.password = password;
        this.phone_num = phone_num;
        this.email = email;
        this.bank = bank;
    }
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrganization_name() {
		return organization_name;
	}

	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(Long phone_num) {
		this.phone_num = phone_num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Bank> getBank() {
        return bank;
    }

    public void setBank(List<Bank> bank) {
        this.bank = bank;
    }
	
	@Override
    public String toString() {
        return "User [id=" + id +
                ", organization_name=" + organization_name +
                ", user_name=" + user_name +
                ", password=" + password +
                ", phone_num=" + phone_num +
                ", email=" + email +
                ", bank=" + bank + "]";
    }
}
