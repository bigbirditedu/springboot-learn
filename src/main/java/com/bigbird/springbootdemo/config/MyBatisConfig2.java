package com.bigbird.springbootdemo.config;

import com.mysql.cj.jdbc.MysqlXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
// basePackages 最好分开配置 如果放在同一个文件夹可能会报错,不同包下的mapper操作不同的数据库数据
@MapperScan(basePackages = "com.bigbird.springbootdemo.mapper2", sqlSessionTemplateRef = "test2SqlSessionTemplate")
public class MyBatisConfig2 {
    // 配置数据源
    @Bean(name = "test2DataSource")
    public DataSource testDataSource(DBConfig2 dbConfig2) throws SQLException {
        MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
        mysqlXaDataSource.setUrl(dbConfig2.getUrl());
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
        mysqlXaDataSource.setPassword(dbConfig2.getPassword());
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
        mysqlXaDataSource.setUser(dbConfig2.getUsername());
        // 将本地事务注册到创 Atomikos全局事务
        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(mysqlXaDataSource);
        xaDataSource.setUniqueResourceName("testDataSource2");
        xaDataSource.setMinPoolSize(dbConfig2.getMinPoolSize());
        xaDataSource.setMaxPoolSize(dbConfig2.getMaxPoolSize());
        xaDataSource.setMaxLifetime(dbConfig2.getMaxLifetime());
        xaDataSource.setBorrowConnectionTimeout(dbConfig2.getBorrowConnectionTimeout());
        xaDataSource.setLoginTimeout(dbConfig2.getLoginTimeout());
        xaDataSource.setMaintenanceInterval(dbConfig2.getMaintenanceInterval());
        xaDataSource.setMaxIdleTime(dbConfig2.getMaxIdleTime());
        xaDataSource.setTestQuery(dbConfig2.getTestQuery());
        return xaDataSource;
    }

    @Bean(name = "test2SqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("test2DataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean(name = "test2SqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("test2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    //使用全局事务管理器就不需要下面这个管理器了
    //@Bean(name = "test2TransactionManager")
    //public DataSourceTransactionManager testTransactionManager(
    //        @Qualifier("test2DataSource") DataSource dataSource) throws Exception {
    //    return new DataSourceTransactionManager(dataSource);
    //}
}