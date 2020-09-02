package com.jojoldu.book.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);
        // DTO
        // 이름과 같이 계층 간 데이터 교환을 위해 사용하는 객체
        // 데이터를 담을 private 변수와 그 변수를 조작할 수 있는 Getter, Setter 메소드로 구성되어있다.
        //then
        assertThat(dto.getName()).isEqualTo(name);
        // assertThat
        // assertj라는 테스트 검증 라이브러리의 검증 메소드입니다.
        // 검증하고 싶은 대상을 메소드 인자로 받습니다.
        // 메소드 체이닝이 지원되어 isEqualTo와 같이 메소드를 이어서 사용할 수 있습니다.
        assertThat(dto.getAmount()).isEqualTo(amount);
        // isEqualTo
        // assertj의 동등 비교 메소드입니다.
        // assertThat에 있는 값과 isEqualTo의 값을 비교해서 같을 때만 성공
        System.out.println(dto.toString());
    }
}
