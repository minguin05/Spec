
package com.specproject.backend.domain.account;

import com.specproject.backend.domain.BaseEntity;
import com.specproject.backend.domain.activities.Activities;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.*;

@Getter
@Entity // 테이블 생성
@NoArgsConstructor
@Component
public class Account extends com.specproject.backend.domain.BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long account_id; // PRIMARY KEY 지정

  private String user_id;

  private String user_name;

  @Column(nullable = false)
  private String category;

  @Builder
  private Account(String user_id, String user_name, String category) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.category = category;
  }

}
