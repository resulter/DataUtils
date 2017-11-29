package com.example.service;

import com.example.dao.DisplayDataDao;
import com.example.entity.*;
import com.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("displayDataService")
public class DisplayDataService {
    @Autowired
    private DisplayDataDao displayDataDao;

    public List<SysDict> getData(int pageNum, int pageSize) {
        List<SysDict> SysDict = displayDataDao.getData();
        int totalRecord = SysDict.size();

        return displayDataDao.getData();
    }


}
