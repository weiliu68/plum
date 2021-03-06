/*
 * Copyright (c) 2012-2013, Poplar Yfyang 杨友峰 (poplar1123@gmail.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package plum.mybatis;

/**
 * <p>
 * 数据库类型.
 * </p>
 *
 * @author poplar.yfyang
 * @version 1.0 2012-05-08 上午11:36
 * @since JDK 1.5
 */
public enum DBMS {
    MYSQL,
    ORACLE,
    DB2,
    H2,
    HSQL,
    POSTGRE,
    SQLSERVER,
    SQLSERVER2005,
    SYBASE,
    /**
     * 自定义
     */
    EX
}
