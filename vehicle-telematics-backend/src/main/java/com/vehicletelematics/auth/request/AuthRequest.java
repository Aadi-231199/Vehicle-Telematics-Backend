package com.vehicletelematics.auth.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequest {
	
	@NotBlank
	@Email()
	private String email;
	
	@NotBlank
	@Size(min = 6)
	private String password;

}
