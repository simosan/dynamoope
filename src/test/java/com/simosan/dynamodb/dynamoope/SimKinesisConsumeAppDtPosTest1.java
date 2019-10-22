package com.simosan.dynamodb.dynamoope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import junit.framework.Test;
import junit.framework.TestCase;
//import junit.framework.TestSuite;
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.services.dynamodb.model.DynamoDbException;

/**
 * getTimestampItemの正常系テスト（格納されている時刻を取得）
 */
public class SimKinesisConsumeAppDtPosTest1 extends TestCase
{

	private static final Logger log = LoggerFactory.getLogger(SimKinesisConsumeAppDtPosTest1.class);

    public void testSimKinesisConsumeAppDateTimePosPut()
    {

    	SimKinesisConsumeAppDtPos skc = new SimKinesisConsumeAppDtPos("simkai","SimKinesisConsumeAppDateTimePos");
       	try {
       		String kekka = skc.getTimestampItem("LogGroupKey","cloudtrail","dtp");
       		assertEquals( "2019-09-01T00:00:00",kekka );
    	}
       	catch (DynamoDbException | SdkClientException e) {
    	    log.error("SimKinesisConsumeAppDtPosTest1 Error " + e.getMessage());
    	}

    }
}
