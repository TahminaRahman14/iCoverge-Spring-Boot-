package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RowSqlDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<IC_DC_OF_ILLIGAL_USE_ST> listIC_DC_OF_ILLIGAL_USE_ST() {

		String sql = "SELECT BILL_CYCLE_CODE, NO_OF_DC_LINE, NO_OF_CASE_FILED, FINE_REALISE, ILL_DC_ID, STATUS FROM IC_DC_OF_ILLIGAL_USE_ST";
		List<IC_DC_OF_ILLIGAL_USE_ST> listIC_DC_OF_ILLIGAL_USE_ST = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(IC_DC_OF_ILLIGAL_USE_ST.class));

		return listIC_DC_OF_ILLIGAL_USE_ST;
	}

	public IC_DC_OF_ILLIGAL_USE_ST listIC_DC_OF_ILLIGAL_USE_ST_S(int id) {

		String sql = "SELECT BILL_CYCLE_CODE, NO_OF_DC_LINE, NO_OF_CASE_FILED, FINE_REALISE, ILL_DC_ID, STATUS FROM IC_DC_OF_ILLIGAL_USE_ST where ILL_DC_ID=?";
		Object[] args = { id };
		@SuppressWarnings("deprecation")
		IC_DC_OF_ILLIGAL_USE_ST ic_DC_OF_ILLIGAL_USE_ST = jdbcTemplate.queryForObject(sql, args,
				BeanPropertyRowMapper.newInstance(IC_DC_OF_ILLIGAL_USE_ST.class));

		return ic_DC_OF_ILLIGAL_USE_ST;
	}

	public void insertIC_DC_OF_ILLIGAL_USE_ST(IC_DC_OF_ILLIGAL_USE_ST sale) {
		String sql = "INSERT INTO IC_DC_OF_ILLIGAL_USE_ST (BILL_CYCLE_CODE, NO_OF_DC_LINE, NO_OF_CASE_FILED, FINE_REALISE, STATUS)VALUES(:BILL_CYCLE_CODE, :NO_OF_DC_LINE, :NO_OF_CASE_FILED, :FINE_REALISE, :STATUS)";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql, param);
	}

	public void IC_DC_OF_ILLIGAL_USE_ST_edit(IC_DC_OF_ILLIGAL_USE_ST sale) {
		String sql = "UPDATE IC_DC_OF_ILLIGAL_USE_ST SET BILL_CYCLE_CODE=:BILL_CYCLE_CODE, NO_OF_DC_LINE=:NO_OF_DC_LINE, NO_OF_CASE_FILED=:NO_OF_CASE_FILED, FINE_REALISE=:FINE_REALISE, STATUS=:STATUS where ILL_DC_ID=:ILL_DC_ID";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql, param);
	}

	public void IC_DC_OF_ILLIGAL_USE_ST_delete(int id) {
		String sql = "DELETE FROM IC_DC_OF_ILLIGAL_USE_ST WHERE ILL_DC_ID = ?";
		jdbcTemplate.update(sql, id);
	}
	
	public List<IC_LOC_MOD_DF> listIC_LOC_MOD_DF(String ST) {

//		String sql = "select BILL_CYCLE_CODE,IC_LOC_MOD_DF.LOCATION_CODE,LOCATION_NAME,LOC_MOD_ID,PR_USER,PR_OFFICE_CODE,NEXT_USER,NEXT_OFFICE_CODE from IC_LOC_MOD_DF,IC_LOCATION_MASTER\r\n"
//				+ "where  IC_LOC_MOD_DF.LOCATION_CODE=IC_LOCATION_MASTER.LOCATION_CODE AND (PR_USER='"+ST+"' OR NEXT_USER='"+ST+"')";
		String sql = "select  BILL_CYCLE_CODE,IC_LOC_MOD_DF.LOCATION_CODE,LOCATION_NAME,LOC_MOD_ID,PR_USER,(select OFFICE_DESC  from ic_office_info where office_code= PR_OFFICE_CODE) PR_OFFICE_CODE,NEXT_USER,(select OFFICE_DESC  from ic_office_info where office_code= NEXT_OFFICE_CODE) NEXT_OFFICE_CODE from IC_LOC_MOD_DF,IC_LOCATION_MASTER\r\n"
	               + " where  IC_LOC_MOD_DF.LOCATION_CODE=IC_LOCATION_MASTER.LOCATION_CODE AND (PR_USER='"+ST+"' OR NEXT_USER='"+ST+"') AND PR_USER IS NOT NULL AND NEXT_USER IS NOT NULL";
		
		List<IC_LOC_MOD_DF> listIC_LOC_MOD_DF = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(IC_LOC_MOD_DF.class));

		return listIC_LOC_MOD_DF;
	}
	public List<ReportIndex> listReportIndex() {

		String sql = "select MOD_APP,MOD_NAME,PAGE_RANG  from IC_MODULES_LIST AA\r\n"
				+ "where  parent='6200'\r\n"
				+ "and PAGE_RANG is not null\r\n"
				+ "order by mod_id";
		List<ReportIndex> listReportIndex = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(ReportIndex.class));

		return listReportIndex;
	}
	public List<NextUserAndOffice> listFORWORD(String p_PR_USER,String p_PR_OFFICE_CODE) {

		String sql = "SELECT NEXT_USER,NEXT_OFFICE_CODE  FROM IC_USER_FLOW_DIST \r\n"
				+ "WHERE PR_USER='"+p_PR_USER +"' AND PR_OFFICE_CODE='"+p_PR_OFFICE_CODE+"'";
		List<NextUserAndOffice> listFORWORD = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(NextUserAndOffice.class));

		return listFORWORD;
	}
	public List<NextUserAndOffice> listbackWORD(String p_PR_USER,String p_PR_OFFICE_CODE) {

		String sql = "SELECT PR_USER as NEXT_USER,PR_OFFICE_CODE as NEXT_OFFICE_CODE FROM IC_USER_FLOW_DIST \r\n"
				+ "WHERE NEXT_USER='"+p_PR_USER +"' AND NEXT_OFFICE_CODE='"+p_PR_OFFICE_CODE+"'";
		List<NextUserAndOffice> listFORWORD = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(NextUserAndOffice.class));

		return listFORWORD;
	}
}
