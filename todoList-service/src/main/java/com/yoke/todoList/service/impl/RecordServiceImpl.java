package com.yoke.todoList.service.impl;

import com.yoke.todoList.mapper.RecordMapper;
import com.yoke.todoList.pojo.Record;
import com.yoke.todoList.pojo.RecordExample;
import com.yoke.todoList.service.RecordService;
import org.springframework.stereotype.Service;

/**
 * @author Yoke
 * Created on 2018/4/6
 */
@Service
public class RecordServiceImpl extends BaseServiceImpl<RecordMapper, Record, RecordExample> implements RecordService {
}
