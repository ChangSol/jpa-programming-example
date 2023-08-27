package org.changsol.apps.members.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.changsol.apps.members.dtos.MemberDto;
import org.changsol.apps.members.services.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "회원", description = "회원 관련 API")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/members")
public class MemberController {

	private final MemberService memberService;

	@Operation(summary = "회원 등록")
	@PostMapping
	public void create(@Valid @RequestBody MemberDto.Create createDto) {
		memberService.create(createDto);
	}
}
