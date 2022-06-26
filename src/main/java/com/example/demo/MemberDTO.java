package com.example.demo;

import lombok.Data;

@Data
public class MemberDTO {
	// id, pw, name, email
	private String id;
	private String pw;
	private String name;
	private String email;
	// 우클릭 > Source > Generate Getters and Setters > Select All > Generate ...

}
