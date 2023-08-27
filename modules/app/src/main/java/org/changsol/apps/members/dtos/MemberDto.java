package org.changsol.apps.members.dtos;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

public class MemberDto {

	@Getter
	@Setter
	public static class Create {

		@NotBlank(message = "name is required")
		private String name;

		private String city;

		private String street;

		private String zipcode;
	}
}
