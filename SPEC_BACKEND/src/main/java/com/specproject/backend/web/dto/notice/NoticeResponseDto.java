
package com.specproject.backend.web.dto.notice;

import com.specproject.backend.domain.notice.Notice;
import com.specproject.backend.web.dto.ResponseDto;
import lombok.Getter;
@Getter
public class NoticeResponseDto extends com.specproject.backend.web.dto.ResponseDto {
  private Long notice_id;

  private String category;

  private String save_date;

  private String contents;

  public NoticeResponseDto(com.specproject.backend.domain.notice.Notice entity) {
        this.notice_id = entity.getNotice_id();
        this.category = entity.getCategory();
        this.save_date = entity.getSave_date();
        this.contents = entity.getContents();
  }

}
