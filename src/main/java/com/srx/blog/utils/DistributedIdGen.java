package com.srx.blog.utils;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DistributedIdGen {

    //日志
    private Logger logger = Logger.getLogger(DistributedIdGen.class);

    @Value("${master.product.workerId}")
    private long workerId;

    @Value("${master.product.datacenterId}")
    private long datacenterId;

    private SnowflakeIdWorker idWorker;

    public DistributedIdGen(){
        logger.info("DistributedIdGen-info:idWorker inited start");
        idWorker=new SnowflakeIdWorker(workerId,datacenterId);
        logger.info("DistributedIdGen-info:idWorker's name is "+idWorker.toString()+" and workerId is "+workerId+" and datacenterId is "+datacenterId+"");
        logger.info("DistributedIdGen-info:idWorker inited end");

    }
    /**
     * 获取分布式ID
     * @return
     */
    public Long getId() {
        if(idWorker == null){
            logger.warn("idWorker is null;Begin initing idWorker");
            idWorker=new SnowflakeIdWorker(workerId,datacenterId);
        }
        logger.info("DistributedIdGen-info:idWorker'name is "+idWorker.toString());
        return idWorker.nextId();
    }

    /**
     * 秒级时间戳
     * @return
     */
    public Integer getTimeStampSecond() {
        Long timeStamp = System.currentTimeMillis();
        timeStamp = timeStamp/1000;
        String timeStampStr = String.valueOf(timeStamp);
        return Integer.valueOf(timeStampStr);
    }

    /**
     * 毫秒级时间戳
     * @return
     */
    public Long getTimeStampMillis(){
        return System.currentTimeMillis();
    }

}
