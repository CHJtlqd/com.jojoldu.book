package com.jojoldu.book.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // 소셜 로그인으로 반환되는 값 중 email을 통해 이미 생성된 사용자인지
    // 처음 가입하는 사용자인지 판단하기 위한 메소드입니다.
    Optional<User> findByEmail(String email);

    // Optional
    // 자바의 고질적인 문제인 NullpointerException 문제를 해결할 수 있는
    // 방법을 제공합니다.


}
