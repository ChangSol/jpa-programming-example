package org.changsol.apps.members.dtos;

import org.changsol.apps.members.domains.Member;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MemberDtoMapper {

	MemberDtoMapper INSTANCE = Mappers.getMapper(MemberDtoMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "orders", ignore = true)
	Member dtoToEntity(MemberDto.Create createDto);
}
