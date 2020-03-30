package com.jinhui.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JinHui
 * @Date: 2020-03-29 16:01
 * @version: 1.0
 */
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showFirst;
    private boolean showEnd;
    private boolean showPrevious;
    private boolean showNext;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setTotalCount(Integer totalCount, Integer page, Integer size) {

        if (totalCount % size == 0) {
            totalPage = totalCount / size;
        } else {
            totalPage = totalCount / size + 1;
        }

        if (page<1){
            page=1;
        }
        if (page>totalPage){
            page=totalPage;
        }
        pages.add(page);
        this.page = page;

        for (Integer i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(0, page - i);
            }
            if (page + i <= totalPage) {
                pages.add(page + i);
            }
        }

//是否显示上一页
        if (page == 1) {
            showPrevious = false;
        } else {
            showPrevious = true;
        }
//是否显示下一页
        if (page == totalPage) {
            showNext = false;
        } else {
            showNext = true;
        }
//是否显示首页按钮
        if (pages.contains(1)) {
            showFirst = false;
        } else {
            showFirst = true;
        }
//是否显示尾页按钮
        if (pages.contains(totalPage)) {
            showEnd = false;
        } else {
            showEnd = true;
        }
    }
}
