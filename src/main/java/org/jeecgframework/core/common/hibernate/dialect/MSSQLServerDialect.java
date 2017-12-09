package org.jeecgframework.core.common.hibernate.dialect;

import org.hibernate.dialect.function.NoArgSQLFunction;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.StringType;

import java.sql.Types;

/**
 * Created by matthewqu on 2017/12/9.
 */
public class MSSQLServerDialect extends org.hibernate.dialect.SQLServer2005Dialect {

    public MSSQLServerDialect() {
        registerColumnType( Types.DATE, "date" );
        registerColumnType( Types.TIME, "time" );
        registerColumnType( Types.VARCHAR, "nvarchar($l)" );

        registerFunction(
                "current_timestamp", new NoArgSQLFunction( "current_timestamp", StandardBasicTypes.TIMESTAMP, false )
        );
        registerFunction( "SUBSTR", new SQLFunctionTemplate( StandardBasicTypes.STRING, "substring(?1, ?2, ?3)" ) );

        registerHibernateType(Types.NVARCHAR, StringType.INSTANCE.getName());
    }
}
