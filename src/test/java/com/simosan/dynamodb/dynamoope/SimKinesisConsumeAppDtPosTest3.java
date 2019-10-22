package com.simosan.dynamodb.dynamoope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;
import software.amazon.awssdk.services.dynamodb.model.DynamoDbException;

public class SimKinesisConsumeAppDtPosTest3 extends TestCase
{

	private static final Logger log = LoggerFactory.getLogger(SimKinesisConsumeAppDtPosTest3.class);

    public void testSimKinesisConsumeAppDateTimePosPut()
    {

    	SimKinesisConsumeAppDtPos skc = new SimKinesisConsumeAppDtPos("simkai","SimKinesisConsumeAppDateTimePos");
       	try {

       		skc.updateTimestampItem("LogGroupKey","cloudtrail","dtp");
      	}
       	catch (DynamoDbException e) {
    	    log.error("SimKinesisConsumeAppDtPosTest3 Error " + e.getMessage());
    	}

    }
}