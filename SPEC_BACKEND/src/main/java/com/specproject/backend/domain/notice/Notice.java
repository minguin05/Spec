package com.specproject.backend.domain.notice;

import com.specproject.backend.domain.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@Component
public class Notice extends BaseEntity {
    @Id // Primary KEY 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notice_id;

    @Column(nullable = false)
    private String category;

    @Column(columnDefinition = "DATE", nullable = false)
    private String create_date;

    @Column(columnDefinition = "LONGTEXT")
    private String contents;

    @Builder
    private Notice(String category, String create_date, String contents)
    {
        this.category = category;
        this.create_date = create_date;
        this.contents = contents;
    }
}