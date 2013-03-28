package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import cases.PropertyMgr;

public class FileDealer {
	private static final int MAX_COUNT = 50000;

	private ArrayList<String> datadraw(String separator, String sql) throws Exception {
		ArrayList<String> result = new ArrayList<String>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		conn = fetchConnection();
		try {
			System.out.println((new StringBuilder("执行的SQL语句是")).append(sql).toString());
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			int columns = rs.getMetaData().getColumnCount();
			StringBuffer sb;
			for (; rs.next(); result.add(sb.toString())) {
				sb = new StringBuffer("");
				int temp;
				for (temp = 1; temp < columns; temp++)
					if (rs.getObject(temp) == null)
						sb.append("").append(separator);
					else
						sb.append(rs.getObject(temp).toString().replaceAll(separator, ".")).append(separator);

				if (columns > 0)
					if (rs.getObject(temp) == null)
						sb.append("");
					else
						sb.append(rs.getObject(temp).toString().replaceAll(separator, "."));
			}

			System.out.println((new StringBuilder("查询到结果")).append(result.size())
					.append("条").toString());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			closeResources(rs, ps, conn);
		}
		return result;
	}

	public void writeFile(Map<String, String> configMap, String filename, String sql) throws Exception {
		this.writeFile(configMap.get("LocalPath"), filename, configMap.get("newLine"), sql, configMap.get("separator"));
	}

	public void writeFile(String path, String filename, String newLine, String sql, String separator) throws Exception {
		try {
			File f = new File((new StringBuilder(String.valueOf(path))).append(File.separator).append(filename)
					.toString());
			if (f.exists())
				f.delete();
			f.getParentFile().mkdirs();
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				throw e;
			}
			ArrayList<String> list = datadraw(separator, sql);
			int len = list.size();
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(f));
				for (int i = 0; i < len; i++) {
					String temp = (String) list.get(i);
					String[] words = temp.split(",");
					int lens = words.length;
					for (int j = 0; j < lens; j++) {
						bw.write("\"");
						bw.write(words[j]);
						bw.write("\"");
						if (j != lens - 1) {
							bw.write(separator);
						}
					}
					bw.write(newLine);
				}
				bw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw e;
			} catch (IOException e) {
				e.printStackTrace();
				throw e;
			}
		} catch (Exception e) {
			throw new IOException("生成CSV文件异常......");
		}
	}

	/**
	 * 生成没有双引号括起来的数据
	 * 
	 * @param path
	 * @param filename
	 * @param newLine
	 * @param sql
	 * @param separator
	 * @throws Exception
	 */
	public void writeFile1(String path, String filename, String newLine, String sql, String separator) throws Exception {
		try {
			File f = new File((new StringBuilder(String.valueOf(path))).append(File.separator).append(filename)
					.toString());
			if (f.exists())
				f.delete();
			f.getParentFile().mkdirs();
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				throw e;
			}
			ArrayList<String> list = datadraw(separator, sql);
			int len = list.size();
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(f));
				for (int i = 0; i < len; i++) {
					String temp = (String) list.get(i);
					String[] words = temp.split(",");
					int lens = words.length;
					for (int j = 0; j < lens; j++) {
						// bw.write("\"");
						bw.write(words[j]);
						// bw.write("\"");
						if (j != lens - 1) {
							bw.write(separator);
						}
					}
					bw.write(newLine);
				}
				bw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw e;
			} catch (IOException e) {
				e.printStackTrace();
				throw e;
			}
		} catch (Exception e) {
			throw new IOException("生成CSV文件异常......");
		}
	}

	public boolean produceCSVFile(String path, String filename, String newLine, String sql, String separator)
			throws Exception {
		boolean isDone = false;
		if (path == null || "".equals(path) || filename == null || "".equals(filename) || newLine == null
				|| "".equals(newLine) || sql == null || "".equals(sql) || separator == null || "".equals(separator)) {
			return isDone;
		} else {
			FileDealer dd = new FileDealer();
			dd.writeFile(path, filename, newLine, sql, separator);
			isDone = true;
			return isDone;
		}
	}

	private void closeResources(ResultSet rs, PreparedStatement ps, Connection connection) {
		// 关闭ResultSet   防止异常传播  如rs关闭失败了，则connection就无法关闭了，就回导致连接数过大。服务器会挂起。
		if (rs != null) {
			try {
				rs.close();
				rs = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// 关闭PreparedStatement
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ps = null;
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			connection = null;
		}
	}

	public boolean deleteFile(String absolutePath) {
		if (absolutePath == null || absolutePath.length() < 1) {
			throw new IllegalArgumentException("文件路径不存在！");
		}
		File file = new File(absolutePath);
		if (file.exists()) {
			return file.delete();
		}
		return false;
	}

	public void batchWriteFile(Map<String, String> configMap, String filename, String sql) throws Exception {
		this.batchWriteFile(configMap.get("LocalPath"), filename, configMap.get("newLine"), sql,
				configMap.get("separator"));
	}

	/**
	 * 大批量写文件时调用此方法。
	 * 
	 * @param path
	 * @param filename
	 * @param newLine
	 * @param sql
	 * @param separator
	 * @throws Exception
	 */
	public void batchWriteFile(String path, String filename, String newLine, String sql, String separator)
			throws Exception {
		try {
			File f = new File((new StringBuilder(String.valueOf(path))).append(File.separator).append(filename)
					.toString());
			if (f.exists())
				f.delete();
			f.getParentFile().mkdirs();
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				throw e;
			}

			int counts = getSqlCounts(sql);// 得到当前sql查询条数
			
			

			ArrayList<String> list = null;
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));// 文件可续写

				for (int i = 0, m = 0; i <= counts; i += MAX_COUNT, m++) {

					list = batchDatadraw(separator, getPaginationSql(sql, MAX_COUNT * (m + 1), i));

					int len = list.size();

					for (int q = 0; q < len; q++) {
						String temp = (String) list.get(q);
						String[] words = temp.split(",");
						int lens = words.length;
						for (int j = 0; j < lens; j++) {
							bw.write("\"");
							bw.write(words[j]);
							bw.write("\"");
							if (j != lens - 1) {
								bw.write(separator);
							}
						}
						bw.write(newLine);
					}
				}
				bw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw e;
			} catch (IOException e) {
				e.printStackTrace();
				throw e;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new IOException("生成CSV文件异常......");
		}
	}

	private int getSqlCounts(String sql) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int counts = 0;
		conn = fetchConnection();
		try {
			StringBuilder sb = new StringBuilder("");
			sb.append(" select count(*) counts from ( ").append(sql).append(" )");
			ps = conn.prepareStatement(sb.toString());
			rs = ps.executeQuery();
			while (rs.next()) {
				counts = rs.getInt("counts");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			closeResources(rs, ps, conn);
		}
		return counts;
	}

	private String getPaginationSql(String sql, int maxValue, int minValue) throws Exception {
		StringBuilder sb = new StringBuilder("");
		sb.append(" SELECT * ").append("   FROM (SELECT E.*, ROWNUM NUM FROM ( ").append(sql)
				.append("   ) E WHERE ROWNUM <= ").append(maxValue).append(")").append("   WHERE NUM > ")
				.append(minValue);
		return sb.toString();
	}

	private ArrayList<String> batchDatadraw(String separator, String sql) throws Exception {
		ArrayList<String> result = new ArrayList<String>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = fetchConnection();
		try {
			System.out.println((new StringBuilder("执行的SQL语句是")).append(sql).toString());
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			int columns = rs.getMetaData().getColumnCount();
			StringBuffer sb;
			for (; rs.next(); result.add(sb.toString().substring(0, sb.toString().lastIndexOf(separator)))) {
				sb = new StringBuffer("");
				int temp;
				for (temp = 1; temp < columns; temp++)
					if (rs.getObject(temp) == null)
						sb.append("").append(separator);
					else
						sb.append(rs.getObject(temp).toString().replaceAll(separator, ".")).append(separator);

				if (columns > 0)
					if (rs.getObject(temp) == null)
						sb.append("");
					else
						sb.append(rs.getObject(temp).toString().replaceAll(separator, "."));
			}

			System.out.println((new StringBuilder("查询到结果")).append(result.size())
					.append("条").toString());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			closeResources(rs, ps, conn);
		}
		return result;
	}
	
	private static Connection fetchConnection() throws Exception {
		String url = PropertyMgr.getProperty("jdbc.url");
		String user = PropertyMgr.getProperty("jdbc.username");
		String password = PropertyMgr.getProperty("jdbc.password");
		String driver = PropertyMgr.getProperty("jdbc.driverClassName");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return DriverManager.getConnection(url, user, password);
	}
}
