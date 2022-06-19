package violetbeach.querydsl.repository;

import org.springframework.data.domain.Page;
import violetbeach.querydsl.dto.MemberSearchCondition;
import violetbeach.querydsl.dto.MemberTeamDto;

import java.awt.print.Pageable;
import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCondition condition);
    Page<MemberTeamDto> searchPageSimple(MemberSearchCondition condition, Pageable pageable);
    Page<MemberTeamDto> searchPageComplex(MemberSearchCondition condition, Pageable pageable);
}
