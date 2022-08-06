package com.vnpt.model.request;

import lombok.*;

/**
 * @author HieuDM24
 * @date 8/6/2022
 */

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindCategoryFormRequest extends BaseFormRequest {

    private Integer categoryId;
    private Integer orderType;
    private String msisdn;
    private Integer page;
    private Integer pageSize;

}
