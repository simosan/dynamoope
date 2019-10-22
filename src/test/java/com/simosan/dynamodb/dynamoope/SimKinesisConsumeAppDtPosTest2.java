package com.simosan.dynamodb.dynamoope;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import junit.framework.Test;
import junit.framework.TestCase;
//import junit.framework.TestSuite;

/**
 * getdtの正常系テスト（時刻取得メソッドのテスト）
 */
public class SimKinesisConsumeAppDtPosTest2 extends TestCase
{

	private static final Logger log = LoggerFactory.getLogger(SimKinesisConsumeAppDtPosTest2.class);

    public void testSimKinesisConsumeAppDateTimePosPut()
    {

    	SimKinesisConsumeAppDtPos skc = new SimKinesisConsumeAppDtPos("simkai","SimKinesisConsumeAppDateTimePos");
       	try {
       		String kekka = skc.getUtcDt();
       		System.out.println(kekka);
      	}
       	catch (Exception e) {
    	    log.error("SimKinesisConsumeAppDtPosTest2 Error " + e.getMessage());
    	}

    }
}
