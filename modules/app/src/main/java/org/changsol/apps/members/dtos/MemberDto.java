package org.changsol.apps.members.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

public class MemberDto {

	@Getter
	@Setter
	@Schema(title = "Member Create")
	public static class Create {

		@Schema(description = "이름", requiredMode = Schema.RequiredMode.REQUIRED)
		@NotBlank(message = "name is required")
		private String name;

		@Schema(description = "도시", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
		private String city;

		@Schema(description = "주소", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
		private String street;

		@Schema(description = "우편번호", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
		private String zipcode;
	}
}
