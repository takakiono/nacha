package com.example.nacha.repository.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 家計簿エンティティ
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountEntity{

    /**
     * 家計簿ID
     */
    private Long accountId;

    /**
     * グループID
     */
    private Long groupId;

    /**
     * カテゴリID
     */
    private Long categoryId;

    /**
     * 備考
     */
    private String note;

    /**
     * 金額
     */
    private Long amount;

    /**
     * 日時
     */
    private LocalDateTime accountDatetime;

    /**
     * 登録日時
     */
    private LocalDateTime registrationDatetime;

    /**
     * 更新日時
     */
    private LocalDateTime updateDatetime;

    /**
     * 論理削除フラグ
     */
    private boolean logicalDeleteFlag;

}
