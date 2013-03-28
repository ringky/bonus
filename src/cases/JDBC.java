package cases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public enum Color {
		RED, BLUE, WHITE
	};

	public enum Type {
		Integer, Long, String
	};

	/**
	 * @author Li,Gen
	 */
	public static void main(String[] args) throws SQLException {

		Class<Type> type = Type.class;

		String url = PropertyMgr.getProperty("jdbc.url");

		String user = PropertyMgr.getProperty("jdbc.username");
		String password = PropertyMgr.getProperty("jdbc.password");
		String driver = PropertyMgr.getProperty("jdbc.driverClassName");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		Connection conn = DriverManager.getConnection(url, user, password);

		// ¶ÁÈ¡propertiesÎÄ¼þ
		String sql = "select * from coin_rate t";
		ResultSet rs = jdbc(sql, conn);
		try {

			if (rs != null) {
				while (rs.next()) {
					System.out.println(rs.getInt("ORDER_SORT") + " " + rs.getDate("GET_DATE"));
				}
				rs.close();
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static ResultSet jdbc(String sql, Connection conn) throws SQLException {
		ResultSet set = null;
		Statement m_stmt = null;
		try {
			m_stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			set = m_stmt.executeQuery(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return set;
	}
}
