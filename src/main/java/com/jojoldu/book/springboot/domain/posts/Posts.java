package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
// 테이블과 링크될 클래스임을 나타냅니다.
// 기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍(_)으로
// 이름을 매칭합니다.
// ex) SalesManager.java -> sales_manager table
@Entity
public class Posts extends BaseTimeEntity {
    // 해당 테이블의 PK를 나타냄
    @Id
    // PK의 생성 규칙을 나타냄
    // 스프링 부트 2.0에서는 GenerationType.IDENTITY 옵션을 추가해야만
    // auto increment가 됩니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 테이블의 컬럼을 나타내며 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 칼럼이 됩니다.
    // 사용하는 이유는, 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용합니다.
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    // 해당 클래스의 빌더 패턴 클래스를 생성
    // 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    // ex) Example.builder().a(a).b(b).build();
    //     Example(String a, String b){}
    @Builder
    public Posts(String title, String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
