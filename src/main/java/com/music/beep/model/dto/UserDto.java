package com.music.beep.model.dto;

import com.music.beep.utils.validation.Email;
import com.music.beep.utils.validation.Password;

public class UserDto extends DtoBase {
	private String username;

	@Password
	private String password;

	@Email
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
