package com.ctrip.platform.dal.dao;


import com.ctrip.platform.dal.dao.helper.EntityManagerTest.EntityManagerTest;
import com.ctrip.platform.dal.dao.task._AllTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
		com.ctrip.platform.dal.dao.client._AllTests.class,
		com.ctrip.platform.dal.dao.common._AllTests.class,
		com.ctrip.platform.dal.dao.datasource._AllTests.class,
		com.ctrip.platform.dal.dao.dialet.mysql.MySqlHelperTest.class,
		com.ctrip.platform.dal.dao.helper._AllTests.class,
		com.ctrip.platform.dal.dao.parser._AllTests.class,
		com.ctrip.platform.dal.dao.shard._AllTests.class,
		com.ctrip.platform.dal.dao.sqlbuilder._AllTests.class,
		_AllTests.class,
		com.ctrip.platform.dal.dao.unittests._AllTests.class,
		com.ctrip.platform.dal.dao.annotation._AllTests.class,
		com.ctrip.platform.dal.dao.configure._AllTests.class,
        com.ctrip.platform.dal.dao.sharding.idgen._AllTests.class,
        EntityManagerTest.class,
		/**
		 * IMPORTANT NOTE! markdown test must be the last one to avoid interfere other test
		 */
		com.ctrip.platform.dal.dao.markdown._AllTests.class,

})
// 7 errors
public class AllTests {}