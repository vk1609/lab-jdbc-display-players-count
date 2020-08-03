package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeMap;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	public TreeMap<Integer,Skill> skillCount() throws IOException, SQLException, ClassNotFoundException{
		Connection con = ConnectionManager.getConnection();
		TreeMap<Integer, Skill>map = new TreeMap<Integer,Skill>();
		String sql="select * from player";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		int rider =0;
		int defender =0;
		int allrounder = 0;
		while(rs.next()) {
			if(rs.getLong(4)==1) {
				allrounder++;
			}
			else if(rs.getLong(4)==2) {
				rider++;
				}
			else if(rs.getLong(4)==3) {
				defender++;
			}
		}
		Skill s1=new Skill((long)1,"rider",rider);
		Skill s2=new Skill((long)2,"defender",defender);
		Skill s3=new Skill((long)3,"allrounder",allrounder);
		map.put(1,s1);
		map.put(2,s2);
		map.put(3,s3);
		con.close();	
		return map;
	}
}