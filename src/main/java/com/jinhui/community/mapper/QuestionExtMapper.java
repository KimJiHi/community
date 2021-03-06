package com.jinhui.community.mapper;

import com.jinhui.community.model.Question;
import com.jinhui.community.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);
}