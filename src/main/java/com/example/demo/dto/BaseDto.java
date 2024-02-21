package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 모든 엔티티 공통 필드
 */
@Getter
@NoArgsConstructor
public class BaseDto {
    /**
     * 고유번호
     */
    private int id;

    /**
     * 생성일시
     * api timeStamp 용도
     * TODO  자료형 후후 확인 필요
     */
    private LocalDateTime regDateTime;


    /**
     * 수정일시
     * api timeStamp 용도
     * TODO  자료형 후후 확인 필요
     */
    private LocalDateTime modDateTime;

    /**
     * 삭제여부
     */
    private char delYn = 'N';

    /**
     * 전체 초기화 용도
     */
    public BaseDto(int id, LocalDateTime createDateTime, LocalDateTime modDateTime) {
        this.id = id;
        this.regDateTime = createDateTime;
        this.modDateTime = modDateTime;
    }

    /**
     * 등록용도
     * @param regDateTime
     */
    public BaseDto(int id, LocalDateTime regDateTime) {
        this.id = id;
        this.regDateTime = regDateTime;
        this.modDateTime = regDateTime;
        this.delYn = 'N';
    }

    /**
     * 삭제용도
     */
    public BaseDto(int id,LocalDateTime modDateTime, char delYn) {
        this.id = id;
        this.modDateTime = modDateTime;
        this.delYn = delYn;
    }


}
