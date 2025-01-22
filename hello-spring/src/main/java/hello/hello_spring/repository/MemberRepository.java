package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

public interface MemberRepository {
    Member save(Member member);

}
