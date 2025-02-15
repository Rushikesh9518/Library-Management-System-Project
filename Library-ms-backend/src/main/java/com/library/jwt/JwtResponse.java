package com.library.jwt;

import com.fasterxml.jackson.annotation.JsonView;
import com.library.model.JsonResoponse_View;

//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public class JwtResponse {
	
    

	@JsonView(JsonResoponse_View.BasicView.class)
    private String token;
    
    @JsonView(JsonResoponse_View.BasicView.class)
    private Object userData; // Can be Trainer, Student, or any user details

	public JwtResponse(String token, Object userData) {
		super();
		this.token = token;
		this.userData = userData;
	}



    
    
}




