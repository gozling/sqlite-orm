package com.gaozl.sqlite;

/**
 * The main way to interact with the database
 * @author gaozl Create by 2017/12/18
 */
public class SqlStatement {

    /**
     * Returns a new instance of {@linkplain SqlExecutor} to be used for retrieving an Object out of the database.
     *
     * @param clazz A reference to the Object.class that you are retrieving from the database.
     * @return new {@linkplain SqlExecutor} used to retrieve an object from the database.
     * @throws DataConnException
     */
    public static <T> SqlExecutor<T> select(Class<T> clazz) throws DataConnException {
        return new SqlExecutor<T>().select(clazz);
    }

    /**
     * Returns a new instance of {@linkplain SqlExecutor} to be used for updating an Object in the database.
     *
     * <p> If you specify a {@linkplain PrimaryKey} on your POJO then a "where clause" is not needed when updating
     * an object instead it will use the {@linkplain PrimaryKey} to auto generate a where clause.
     *
     * @param databaseObject An object that was queried from the database that has been updated.
     * @return new {@linkplain SqlExecutor} used to update an object in the database.
     * @throws DataConnException
     */
    public static <T> SqlExecutor<T> update(T databaseObject) throws DataConnException {
        return new SqlExecutor<T>().update(databaseObject);
    }

    /**
     * Returns a new instance of {@linkplain SqlExecutor} to be used for inserting an Object into the database.
     *
     * <p> Note that the values that are set on the passed in POJO will be used for creating the record in the
     * database. If a value isn't set on the POJO than the default Java value will be used (e.g. 0 for int, null
     * for an Object, etc).
     *
     * @param databaseObject An object that is to be input into the database.
     * @return new {@linkplain SqlExecutor} used to insert an object into the database.
     * @throws DataConnException
     */
    public static <T> SqlExecutor<T> save(T databaseObject) throws DataConnException {
        return new SqlExecutor<T>().save(databaseObject);
    }

    /**
     * Returns a new instance of {@linkplain SqlExecutor} to be used for deleting an record in the database.
     *
     * @param clazz A reference to the Object.class that you are deleting from the database.
     * @return new {@linkplain SqlExecutor} used to delete a record in the database.
     * @throws DataConnException
     */
    public static <T> SqlExecutor<T> delete(Class<T> clazz) throws DataConnException {
        return new SqlExecutor<T>().delete(clazz);
    }

    /**
     * Returns a new instance of {@linkplain SqlExecutor} to be used for deleting an Object in the database.
     *
     * <p> If you specify a {@linkplain PrimaryKey} on your POJO then a "where clause" is not needed when deleting
     * an object instead it will use the {@linkplain PrimaryKey} to auto generate a where clause.
     *
     * @param databaseObject An object that should be deleted from the database.
     * @return new {@linkplain SqlExecutor} used to delete an object in the database.
     * @throws DataConnException
     */
    public static <T> SqlExecutor<T> delete(T databaseObject) throws DataConnException {
        return new SqlExecutor<T>().delete(databaseObject);
    }

    /**
     * @deprecated As of 8/13/2012 the creation of a SqlStatement is deprecated in favor of using the static methods off of the
     * {@link SqlStatement} class. The methods will continue to work but you will get compiler warnings to access the methods
     * in a static way.
     */
    @Deprecated
    public SqlStatement() {

    }
}
