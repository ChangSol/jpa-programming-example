package org.changsol.apps.members.services;

import lombok.RequiredArgsConstructor;
import org.changsol.apps.members.domains.MemberRepository;
import org.changsol.apps.members.dtos.MemberDto;
import org.changsol.apps.members.dtos.MemberDtoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;

	@Transactional
	public void create(MemberDto.Create createDto) {
		memberRepository.save(MemberDtoMapper.INSTANCE.dtoToEntity(createDto));
	}
}
