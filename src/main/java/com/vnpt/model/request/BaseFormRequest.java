package com.vnpt.model.request;

import lombok.*;

/**
 * @author HieuDM24
 * @date 8/6/2022
 */

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseFormRequest {

    protected String requestUri;

}
