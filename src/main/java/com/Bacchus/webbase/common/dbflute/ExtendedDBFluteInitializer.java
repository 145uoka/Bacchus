package com.Bacchus.webbase.common.dbflute;

import javax.sql.DataSource;

import com.Bacchus.dbflute.allcommon.DBFluteConfig;
import com.Bacchus.dbflute.allcommon.DBFluteInitializer;


public class ExtendedDBFluteInitializer extends DBFluteInitializer {

	public ExtendedDBFluteInitializer(DataSource dataSource) {
		super(dataSource);
	}

	@Override
	protected void setupDataSourceHandler(String dataSourceFqcn) {
        final DBFluteConfig config = DBFluteConfig.getInstance();
        config.unlock();
        config.setDataSourceHandler(new DBFluteConfig.SpringTransactionalDataSourceHandler());
	}
}
