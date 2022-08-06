package com.vnpt.entities;

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
public class Category {

    private Integer id;
    private String name;
    private Integer status;
    private String description;

}
