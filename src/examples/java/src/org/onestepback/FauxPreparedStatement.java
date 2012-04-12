package org.onestepback;

public class FauxPreparedStatement implements java.sql.PreparedStatement {

    public void setInt(int i, int j) {
        // Faux code here
    }

    public java.sql.ResultSet executeQuery() {
        // Faux code here
        return null;
    }

    public <T> T unwrap(java.lang.Class<T> klass) { return null; }
    public boolean isWrapperFor(java.lang.Class klass) { return false; }
    public void close() { }
    public int getMaxFieldSize() { return 0; }
    public void setMaxFieldSize(int i) { }
    public void setMaxRows(int i) { }
    public int getMaxRows() { return 0; }
    public void setEscapeProcessing(boolean bool) { }
    public int getQueryTimeout() { return 0; }
    public void setQueryTimeout(int timeout) { }
    public void cancel() { }
    public void clearWarnings() { }
    public java.sql.SQLWarning getWarnings() { return null; }
    public void setCursorName(String name) { }
    public java.sql.ResultSet getResultSet() { return null; }
    public int getUpdateCount() { return 0; }
    public int getFetchDirection() { return 0; }
    public void setFetchDirection(int i) { }
    public int getFetchSize() { return 0; }
    public void setFetchSize(int i) { }
    public int getFetchSize(int i) { return 0; }
    public int getResultSetConcurrency() { return 0; }
    public int getResultSetType() { return 0; }
    public java.sql.Connection getConnection() { return null; }
    public java.sql.ResultSet getGeneratedKeys() { return null; }
    public boolean getMoreResults() { return false; }
    public boolean getMoreResults(int i) { return false; }
    public int getResultSetHoldability() { return 0; }
    public boolean isClosed() { return false; }
    public void setPoolable(boolean bool) { }
    public boolean isPoolable() { return false; }
    public boolean execute(String sql) { return false; }
    public boolean execute(String sql, int param) { return false;  }
    public boolean execute(String sql, int params[]) { return false; }
    public boolean execute(String sql, String params[]) { return false; }
    public boolean execute() { return false; }
    public void clearBatch() { }
    public int[] executeBatch() { return null; }
    public java.sql.ResultSet executeQuery(String sql) { return null; }
    public int executeUpdate() { return 0; }
    public int executeUpdate(String sql) { return 0; }
    public int executeUpdate(String sql, int param) { return 0; }
    public int executeUpdate(String sql, int[] params) { return 0; }
    public int executeUpdate(String sql, String[] params) { return 0; }
    public void setNull(int i, int j) { }
    public void setBoolean(int i, boolean bool) { }
    public void setByte(int i, byte b) { }
    public void setShort(int i, short s) { }
    public void setLong(int i, long l) { }
    public void setFloat(int i, float f) { }
    public void setDouble(int i, double d) { }
    public void setBigDecimal(int i, java.math.BigDecimal decimal) { }
    public void setString(int i, String string) { }
    public void setBytes(int i, byte[] bytes) { }
    public void clearParameters() { }
    public void addBatch() { }
    public void addBatch(String string) { }
    public void setRef(int i, java.sql.Ref ref) { }
    public void setArray(int i, java.sql.Array array) { }
    public java.sql.ResultSetMetaData getMetaData() { return null; }
    public void setDate(int i, java.sql.Date date) { }
    public void setDate(int i, java.sql.Date date, java.util.Calendar cal) { }
    public void setTime(int i, java.sql.Time time) { }
    public void setTime(int i, java.sql.Time time, java.util.Calendar cal) { }
    public void setTimestamp(int i, java.sql.Timestamp ts) { }
    public void setTimestamp(int i, java.sql.Timestamp ts, java.util.Calendar cal) { }
    public void setNull(int i, int j, String s) { }
    public void setURL(int i, java.net.URL url) { }
    public java.sql.ParameterMetaData getParameterMetaData() { return null; }
    public void setRowId(int i, java.sql.RowId rowId) { }
    public void setNString(int i, String s) { }
    public void setSQLXML(int i, java.sql.SQLXML sqlXml) { }
    public void setObject(int i, Object obj) { }
    public void setObject(int i, Object obj, int j) { }
    public void setObject(int i, Object obj, int j, int k) { }
    public void setAsciiStream(int i, java.io.InputStream stream) { }
    public void setAsciiStream(int i, java.io.InputStream stream, long l) { }
    public void setAsciiStream(int i, java.io.InputStream stream, int j) { }
    public void setUnicodeStream(int i, java.io.InputStream stream, int j) { }
    public void setBinaryStream(int i, java.io.InputStream stream) { }
    public void setBinaryStream(int i, java.io.InputStream stream, int j) { }
    public void setBinaryStream(int i, java.io.InputStream stream, long l) { }
    public void setCharacterStream(int i, java.io.Reader reader, int j) { }
    public void setCharacterStream(int i, java.io.Reader reader, long l) { }
    public void setCharacterStream(int i, java.io.InputStream stream, long l) { }
    public void setCharacterStream(int i, java.io.Reader reader) { }
    public void setNCharacterStream(int i, java.io.Reader reader) { }
    public void setNCharacterStream(int i, java.io.Reader reader, long l) { }
    public void setClob(int i, java.sql.Clob clob) { }
    public void setClob(int i, java.io.Reader reader) { }
    public void setClob(int i, java.io.Reader reader, long l) { }
    public void setBlob(int i, java.sql.Blob blob) { }
    public void setBlob(int i, java.io.InputStream stream) { }
    public void setBlob(int i, java.io.InputStream stream, long l) { }
    public void setNClob(int i, java.io.Reader reader, long l) { }
    public void setNClob(int i, java.sql.NClob nclob) { }
    public void setNClob(int i, java.io.Reader reader) { }
}
