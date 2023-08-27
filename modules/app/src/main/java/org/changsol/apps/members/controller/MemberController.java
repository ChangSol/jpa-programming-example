package org.changsol.apps.members.controller;

import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.changsol.apps.members.dtos.MemberDto;
import org.changsol.apps.members.services.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/members")
public class MemberController {

	private final MemberService memberService;

	@PostMapping
	public void create(@Valid @RequestBody MemberDto.Create createDto) {
		memberService.create(createDto);
	}
}
