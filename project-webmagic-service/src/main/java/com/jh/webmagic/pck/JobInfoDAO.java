package com.jh.webmagic.pck;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

@Component
public interface JobInfoDAO {

    @Insert("insert into JobInfo (`title`,`salary`,`company`,`description`,`requirement`,`source`,`url`,`urlMd5`) values (#{title},#{salary},#{company},#{description},#{requirement},#{source},#{url},#{urlMd5})")
    public int add(LieTouJobInfo jobInfo);
}