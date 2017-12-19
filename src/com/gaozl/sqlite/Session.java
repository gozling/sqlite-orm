//package com.gaozl.sqlite;
//
//import javax.management.Query;
//import java.io.Serializable;
//
///**
// * @author gaozl Create by 2017/12/19
// */
//public interface Session extends Serializable {
//
//    /**
//     * 开始一个事务, 当该session为非只读时。
//     * @return
//     * @throws SQLiteException
//     */
//    public Transaction begin() throws SQLiteException;
//
//    /**
//     * 获取当前session所持有的连接
//     * @return
//     * @throws SQLiteException
//     */
//    public Connection connection() throws SQLiteException;
//
//    /**
//     * 关闭当前session断开连接, 清理缓存并刷新未提交的事务。
//     * @throws SQLiteException
//     */
//    public void close() throws SQLiteException;
//
//    /**
//     * 当前session所持有的连接是否打开。
//     * @return
//     */
//    public boolean isConnected();
//
//    /**
//     * 根据id获取相应实体对象。
//     * @param <T>
//     * @param clazz
//     * @param id
//     * @return
//     * @throws SQLiteException
//     */
//    public <T> T load(Class<T> clazz, Serializable id) throws SQLiteException;
//
//    /**
//     * 根据表名称获取相应实体对象, 先从一级缓存中获取, 没有时再到数据库加载。
//     * @param <T>
//     * @param entityName
//     * @param id
//     * @return
//     * @throws SQLiteException
//     */
//    public <T> T load(String entityName, Serializable id) throws SQLiteException;
//
//    /**
//     * 根据一个实例化但没有参数的对象获取相应实体对象, 先从一级缓存中获取, 没有时再到数据库加载。
//     * @param entity
//     * @param id
//     * @throws SQLiteException
//     */
//    public void load(Object entity, Serializable id) throws SQLiteException;
//
//    /**
//     * 持久化保存对象到数据库。
//     * @param object
//     * @return
//     * @throws SQLiteException
//     */
//    public void save(Object object) throws SQLiteException;
//
//    /**
//     * 持久化对象更新。
//     * @param object
//     * @throws SQLiteException
//     */
//    public void update(Object object) throws SQLiteException;
//
//    /**
//     * 根据主键或非空属性删除持久化对象。
//     * @param object
//     * @throws SQLiteException
//     */
//    public void delete(Object object) throws SQLiteException;
//
//    /**
//     * 根据主键删除持久化对象(只有一个字段作为主键时)。
//     * @param <T>
//     * @param clazz
//     * @param id
//     * @throws SQLiteException
//     */
//    public <T> void delete(Class<T> clazz, Serializable id) throws SQLiteException;
//
//    /**
//     * 获取数据库查询对象。
//     * @param queryString
//     * @return
//     * @throws SQLiteException
//     */
//    public Query createQuery(String queryString) throws SQLiteException;
//
//    /**
//     * 清理缓存并持久化未持久化得缓存对象
//     */
//    public void clear();
//
//    /**
//     * 根据ID从数据库加载实体对象。
//     * @param <T>
//     * @param clazz
//     * @param id
//     * @return
//     * @throws SQLiteException
//     */
//    public <T> T get(Class<T> clazz, Serializable id) throws SQLiteException;
//
//    /**
//     * 根据表名称从数据库加载实体对象。
//     * @param <T>
//     * @param entityName
//     * @param id
//     * @return
//     * @throws SQLiteException
//     */
//    public <T> T get(String entityName, Serializable id) throws SQLiteException;
//
//    /**
//     * 自定义查询。
//     * @param <T>
//     * @param sql
//     * @param callback
//     * @return
//     * @throws SQLiteException
//     */
//    public <T> T query(String sql, ConnectionCallback<T> callback) throws SQLiteException ;
//
//    /**
//     * 该session是否时只读的。
//     * @return
//     */
//    public boolean isReadOnly() ;
//}
