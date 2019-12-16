package sunbookstore.Manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import sunbookstore.Manager.domain.Manager;

public class ManagerDao {
	ComboPooledDataSource dataSource = new ComboPooledDataSource();
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;

	/* 管理员登录 */
	public int login(Manager manager) {
		int count = -1;
		
		try {
			conn = dataSource.getConnection();
			String sql = "select mid from manager where mname = ? and mpassword = ? ";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, manager.getMname());
			pstm.setString(2, manager.getMpassword());
			rs = pstm.executeQuery();
			if(rs.next()) {
				 count = rs.getInt(1);
				return count;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
		return count;
	}

	/* 修改管理员密码 */
	public int updatePassword(Manager manager1,Manager manager2) {
	int count = -1;
		try {
			conn = dataSource.getConnection();
			String sql = "update manager set mname=?,mpassword=? where mname=? and mpassword=? ";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, manager1.getMname());
			pstm.setString(2, manager1.getMpassword());
			pstm.setString(3, manager2.getMname());
			pstm.setString(4, manager2.getMpassword());
			count = pstm.executeUpdate();
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
		
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
		return count;
	}

}
