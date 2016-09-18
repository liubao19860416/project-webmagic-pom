package com.jh.webmagic.pck;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;
import us.codecraft.webmagic.pipeline.Pipeline;

@Component("JobInfoDaoPipeline")
public class JobInfoDaoPipeline implements PageModelPipeline<LieTouJobInfo>, Pipeline {

    @Resource
    private JobInfoDAO jobInfoDAO;

    @Override
    public void process(LieTouJobInfo lieTouJobInfo, Task task) {
        //调用MyBatis DAO保存结果
        jobInfoDAO.add(lieTouJobInfo);
    }

    @Override
    public void process(ResultItems resultItems, Task task) {
        System.out.println(JSON.toJSONString(resultItems.get("all")));
        System.out.println(JSON.toJSONString(resultItems));
        System.out.println("ok");
    }
}