package com.vnpt.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

/**
 * @author HieuDM24
 * @date 8/6/2022
 */

@Data
@Builder
public class InfoCategory {

    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("cateId")
    private Integer categoryId;

    @Expose
    @SerializedName("img")
    private String image;

}
