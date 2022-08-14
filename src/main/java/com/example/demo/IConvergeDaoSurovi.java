package com.example.demo;

import java.util.ArrayList;
import java.util.Map;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class IConvergeDaoSurovi {

	SimpleJdbcCall getAllStatesJdbcCall;
	SimpleJdbcCall getAllStatesJdbcCall1;
	SimpleJdbcCall getAllStatesJdbcCall2;
	SimpleJdbcCall getAllStatesJdbcCall3;
	SimpleJdbcCall getAllStatesJdbcCall4;

	SimpleJdbcCall getAllStatesJdbcCall5;
	SimpleJdbcCall getAllStatesJdbcCall6;
	SimpleJdbcCall getAllStatesJdbcCall7;
	SimpleJdbcCall getAllStatesJdbcCall8;
	SimpleJdbcCall getAllStatesJdbcCall9;
	SimpleJdbcCall getAllStatesJdbcCall30;
	SimpleJdbcCall getAllStatesJdbcCall31;
	SimpleJdbcCall getAllStatesJdbcCall32;
	SimpleJdbcCall getAllStatesJdbcCall33;
	SimpleJdbcCall getAllStatesJdbcCall34;
	SimpleJdbcCall getAllStatesJdbcCall35;
	SimpleJdbcCall getAllStatesJdbcCall36;
	SimpleJdbcCall getAllStatesJdbcCall37;
	SimpleJdbcCall getAllStatesJdbcCall38;
	SimpleJdbcCall getAllStatesJdbcCall39;
	SimpleJdbcCall getAllStatesJdbcCall40;
	SimpleJdbcCall getAllStatesJdbcCall41;
	SimpleJdbcCall getAllStatesJdbcCall42;
	SimpleJdbcCall getAllStatesJdbcCall43;
	SimpleJdbcCall getAllStatesJdbcCall44;
	SimpleJdbcCall getAllStatesJdbcCall45;
	SimpleJdbcCall getAllStatesJdbcCall46;
	SimpleJdbcCall getAllStatesJdbcCall47;
	SimpleJdbcCall getAllStatesJdbcCall48;
	SimpleJdbcCall getAllStatesJdbcCall49;
	SimpleJdbcCall getAllStatesJdbcCall50;
	SimpleJdbcCall getAllStatesJdbcCall51;
	SimpleJdbcCall getAllStatesJdbcCall52;
	SimpleJdbcCall getAllStatesJdbcCall53;
	SimpleJdbcCall getAllStatesJdbcCall54;
	SimpleJdbcCall getAllStatesJdbcCall55;
	SimpleJdbcCall getAllStatesJdbcCall56;
	SimpleJdbcCall getAllStatesJdbcCall57;
	SimpleJdbcCall getAllStatesJdbcCall58;
	SimpleJdbcCall getAllStatesJdbcCall59;
	SimpleJdbcCall getAllStatesJdbcCall60;
	SimpleJdbcCall getAllStatesJdbcCall61;
	SimpleJdbcCall getAllStatesJdbcCall62;
	SimpleJdbcCall getAllStatesJdbcCall63;
	SimpleJdbcCall getAllStatesJdbcCall64;
	SimpleJdbcCall getAllStatesJdbcCall65;
	SimpleJdbcCall getAllStatesJdbcCall66;
	SimpleJdbcCall getAllStatesJdbcCall67;
	SimpleJdbcCall getAllStatesJdbcCall68;
	SimpleJdbcCall getAllStatesJdbcCall69;
	SimpleJdbcCall getAllStatesJdbcCall70;
	SimpleJdbcCall getAllStatesJdbcCall71;
	SimpleJdbcCall getAllStatesJdbcCall72;
	SimpleJdbcCall getAllStatesJdbcCall73;
	SimpleJdbcCall getAllStatesJdbcCall74;
	SimpleJdbcCall getAllStatesJdbcCall75;
	SimpleJdbcCall getAllStatesJdbcCall76;
	SimpleJdbcCall getAllStatesJdbcCall77;
	SimpleJdbcCall getAllStatesJdbcCall78;
	SimpleJdbcCall getAllStatesJdbcCall79;
	SimpleJdbcCall getAllStatesJdbcCall80;
	SimpleJdbcCall getAllStatesJdbcCall81;
	SimpleJdbcCall getAllStatesJdbcCall82;
	SimpleJdbcCall getAllStatesJdbcCall83;
	SimpleJdbcCall getAllStatesJdbcCall84;
	SimpleJdbcCall getAllStatesJdbcCall85;
	SimpleJdbcCall getAllStatesJdbcCall86;
	SimpleJdbcCall getAllStatesJdbcCall87;
	SimpleJdbcCall getAllStatesJdbcCall88;
	SimpleJdbcCall getAllStatesJdbcCall89;
	SimpleJdbcCall getAllStatesJdbcCall90;
	SimpleJdbcCall getAllStatesJdbcCall91;
	SimpleJdbcCall getAllStatesJdbcCall92;
	SimpleJdbcCall getAllStatesJdbcCall93;
	SimpleJdbcCall getAllStatesJdbcCall94;
	SimpleJdbcCall getAllStatesJdbcCall95;
	SimpleJdbcCall getAllStatesJdbcCall96;
	SimpleJdbcCall getAllStatesJdbcCall97;
	SimpleJdbcCall getAllStatesJdbcCall98;
	SimpleJdbcCall getAllStatesJdbcCall99;
	SimpleJdbcCall getAllStatesJdbcCall100;
	SimpleJdbcCall getAllStatesJdbcCall101;
	SimpleJdbcCall getAllStatesJdbcCall102;

	public IConvergeDaoSurovi(DataSource dataSource) {

		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall2 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall5 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall6 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall7 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall8 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall9 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall30 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall31 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall32 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall33 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall34 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall35 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall36 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall37 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall38 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall39 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall40 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall41 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall42 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall43 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall44 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall45 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall46 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall47 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall48 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall49 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall50 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall51 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall52 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall53 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall54 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall55 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall56 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall57 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall58 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall59 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall60 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall61 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall62 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall63 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall64 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall65 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall66 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall67 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall68 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall69 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall70 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall71 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall72 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall73 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall74 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall75 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall76 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall77 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall78 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall79 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall80 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall81 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall82 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall83 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall84 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall85 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall86 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall87 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall88 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall89 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall90 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall91 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall92 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall93 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall94 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall95 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall96 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall97 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall98 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall99 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall100 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall101 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall102 = new SimpleJdbcCall(dataSource);

	}

//	ic_sector_mst list starts 

	public ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST() {

		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("ICON_PKG")
				.withProcedureName("IC_SECTOR_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);

//		System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//	    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_SECTOR_MST.add(new IC_SECTOR_MST(jsonData.optString("SECT_CODE"), jsonData.optString("SECT_NAME"),
					jsonData.optString("GROSS_FLAG"), jsonData.optString("STATUS"), jsonData.optString("SECT_ID")));
		}

//	    System.out.println(listPKG_MST);
		return listIC_SECTOR_MST;
	}

//	ic_sector_mst list ends

	// ic sector mst insert starts

	public void insertIcSectorMst(IC_SECTOR_MST ic_sector_mst) {

//				System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_sector_mst.getSECT_CODE();
		String b = ic_sector_mst.getSECT_NAME();
		String c = ic_sector_mst.getGROSS_FLAG();
		String d = ic_sector_mst.getSTATUS();

//				SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//				String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall2.withCatalogName("ICON_PKG")
				.withProcedureName("IC_SECTOR_MST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println("TEST");
//			System.out.println(out);   

	}

	// ic sector mst insert ends

//	ic sector mst single starts 

	public IC_SECTOR_MST singleIC_SECTOR_MST(int id) {

		IC_SECTOR_MST singleIC_SECTOR_MST = new IC_SECTOR_MST();

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("ICON_PKG")
				.withProcedureName("IC_SECTOR_MST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//				System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//			    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_SECTOR_MST = new IC_SECTOR_MST(jsonData.optString("SECT_CODE"), jsonData.optString("SECT_NAME"),
					jsonData.optString("GROSS_FLAG"), jsonData.optString("STATUS"), jsonData.optString("SECT_ID"));
		}

//			    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_SECTOR_MST;
	}

//			misc bill type single ends

	// misc bill type update starts

	public void editIcSectorMst(IC_SECTOR_MST ic_sector_mst) {

//				System.out.println(ic_sector_mst);
		// System.out.println(sfmodel);
		String a = ic_sector_mst.getSECT_CODE();
		String b = ic_sector_mst.getSECT_NAME();
		String c = ic_sector_mst.getGROSS_FLAG();
		String d = ic_sector_mst.getSTATUS();

		int e = Integer.valueOf(ic_sector_mst.getSECT_ID());

//				SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//				String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("ICON_PKG")
				.withProcedureName("IC_SECTOR_MST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// ic sector mst update ends

//			
//
	// ic sector mst delete starts

	public void deleteIcSectorMst(int id) {

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("ICON_PKG")
				.withProcedureName("IC_SECTOR_MST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// ic sector mst delete ends

	public ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA() {

		ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USAGE_AREA_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//	    System.out.println("npnp");
//		System.out.println(result);
//		
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_USAGE_AREA.add(new IC_USAGE_AREA(jsonData.optString("AREA_CODE"), jsonData.optString("AREA_NAME"),
					jsonData.optString("STATUS"), jsonData.optString("AREA_ID")));
		}

//	    System.out.println("npnp");
//	    System.out.println(listIC_FUEL_TYPE);
		return listIC_USAGE_AREA;
	}

//	ic usage area list ends 

	// ic usage area insert starts

	public void insertICUsageArea(IC_USAGE_AREA ic_usage_area) {

//		System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_usage_area.getAREA_CODE();
		String b = ic_usage_area.getAREA_NAME();
		String c = ic_usage_area.getSTATUS();

//		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
//
//		String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USAGE_AREA_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c);

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();

//	System.out.println("TEST");
//	System.out.println(out);   

	}

	// ic fuel types insert ends

//	ic fuel types single starts 

	public IC_USAGE_AREA singleIC_USAGE_AREA(int id) {

		IC_USAGE_AREA singleIC_USAGE_AREA = new IC_USAGE_AREA();

		Map<String, Object> result = getAllStatesJdbcCall6.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USAGE_AREA_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//		System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//	    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_USAGE_AREA = new IC_USAGE_AREA(jsonData.optString("AREA_CODE"), jsonData.optString("AREA_NAME"),
					jsonData.optString("STATUS"), jsonData.optString("AREA_ID"));
		}

//	    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_USAGE_AREA;
	}

//	ic usage area single ends

	// ic usage area update starts

	public void editICUsageArea(IC_USAGE_AREA ic_usage_area) {

//		System.out.println(misc_bill_type);
		// System.out.println(sfmodel);
		String a = ic_usage_area.getAREA_CODE();
		String b = ic_usage_area.getAREA_NAME();
		String c = ic_usage_area.getSTATUS();

		int d = Integer.valueOf(ic_usage_area.getAREA_ID());

//		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
//
//		String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USAGE_AREA_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();

//	System.out.println(out);   

	}

	// ic fuel types update ends

	// ic fuel types delete starts

	public void deleteICUsageArea(int id) {

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USAGE_AREA_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();

//	System.out.println(out);   

	}
	// ic forward header mst starts

	public ArrayList<IC_FORWARD_HEADER_MST> listIC_FORWARD_HEADER_MST() {

		ArrayList<IC_FORWARD_HEADER_MST> listIC_FORWARD_HEADER_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("ICON_PKG")
				.withProcedureName("IC_FORWARD_HEADER_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//			    System.out.println("npnp");
//				System.out.println(result);
//				
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_FORWARD_HEADER_MST.add(new IC_FORWARD_HEADER_MST(jsonData.optString("BILL_CYCLE_CODE"),
					jsonData.optString("NET_ENRG_GEN_FUEL_TYPE_HEADER"), jsonData.optString("FRD_HDR_ID")));
		}

//			    System.out.println("npnp");
//			    System.out.println(listIC_FUEL_TYPE);
		return listIC_FORWARD_HEADER_MST;
	}

//			ic usage area list ends 

	// ic usage area insert starts

	public void insertICForwardHeaderMst(IC_FORWARD_HEADER_MST ic_forward_header_mst) {

//				System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_forward_header_mst.getBILL_CYCLE_CODE();
		String b = ic_forward_header_mst.getNET_ENRG_GEN_FUEL_TYPE_HEADER();

//				SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//				String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall7.withCatalogName("ICON_PKG")
				.withProcedureName("IC_FORWARD_HEADER_MST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println("TEST");
//			System.out.println(out);   

	}

	// ic fuel types insert ends

//			ic fuel types single starts 

	public IC_FORWARD_HEADER_MST singleIC_FORWARD_HEADER_MST(int id) {

		IC_FORWARD_HEADER_MST singleIC_FORWARD_HEADER_MST = new IC_FORWARD_HEADER_MST();

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("ICON_PKG")
				.withProcedureName("IC_FORWARD_HEADER_MST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//				System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//			    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_FORWARD_HEADER_MST = new IC_FORWARD_HEADER_MST(jsonData.optString("BILL_CYCLE_CODE"),
					jsonData.optString("NET_ENRG_GEN_FUEL_TYPE_HEADER"), jsonData.optString("FRD_HDR_ID"));
		}

//			    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_FORWARD_HEADER_MST;
	}

//			ic usage area single ends

	// ic usage area update starts

	public void editICForwardHeaderMst(IC_FORWARD_HEADER_MST ic_forward_header_mst) {

//				System.out.println(misc_bill_type);
		// System.out.println(sfmodel);
		String a = ic_forward_header_mst.getBILL_CYCLE_CODE();
		String b = ic_forward_header_mst.getNET_ENRG_GEN_FUEL_TYPE_HEADER();

		int c = Integer.valueOf(ic_forward_header_mst.getFRD_HDR_ID());

//				SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//				String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("ICON_PKG")
				.withProcedureName("IC_FORWARD_HEADER_MST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// ic fuel types update ends

	// ic fuel types delete starts

	public void deleteICForwardHeaderMst(int id) {

		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("ICON_PKG")
				.withProcedureName("IC_FORWARD_HEADER_MST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// ic forward header mst ends

	// ic user mst starts

	public ArrayList<IC_USER_MST> listIC_USER_MST() {

		ArrayList<IC_USER_MST> listIC_USER_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall8.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//			    System.out.println("npnp");
//				System.out.println(result);
//				
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_USER_MST.add(new IC_USER_MST(jsonData.optString("USER_ID"), jsonData.optString("NAME"),
					jsonData.optString("USER_NAME"), jsonData.optString("USER_PASSWORD"), jsonData.optString("MOBILE"),
					jsonData.optString("EMAIL"), jsonData.optString("USER_TYPE"), jsonData.optString("USER_TYPE_DESC"),
					jsonData.optString("STATUS"), jsonData.optString("GRP_CODE"), jsonData.optString("GRP_NAME")));
		}

//			    System.out.println("npnp");
//			    System.out.println(listIC_FUEL_TYPE);
		return listIC_USER_MST;
	}

//			ic user mst list ends 

	// ic user mst insert starts

	public void insertICUserMst(IC_USER_MST ic_user_mst) {

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_MST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(ic_user_mst.getNAME(),
						ic_user_mst.getUSER_NAME(), ic_user_mst.getUSER_PASSWORD(), ic_user_mst.getMOBILE(),
						ic_user_mst.getEMAIL(), ic_user_mst.getUSER_TYPE(), ic_user_mst.getSTATUS(),
						ic_user_mst.getGRP_CODE());

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}

	// ic fuel types insert ends

//			ic fuel types single starts 

	public IC_USER_MST singleIC_USER_MST(int id) {

		IC_USER_MST singleIC_USER_MST = new IC_USER_MST();

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_MST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//				System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//			    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_USER_MST = new IC_USER_MST(jsonData.optString("USER_ID"), jsonData.optString("NAME"),
					jsonData.optString("USER_NAME"), jsonData.optString("USER_PASSWORD"), jsonData.optString("MOBILE"),
					jsonData.optString("EMAIL"), jsonData.optString("USER_TYPE"), jsonData.optString("USER_TYPE_DESC"),
					jsonData.optString("STATUS"), jsonData.optString("GRP_CODE"), jsonData.optString("GRP_NAME"));
		}

//			    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_USER_MST;
	}

//			ic usage area single ends

	// ic usage area update starts

	public void editICUserMst(IC_USER_MST ic_user_mst) {

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_MST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(Integer.valueOf(ic_user_mst.getUSER_ID()), ic_user_mst.getNAME(), ic_user_mst.getUSER_NAME(),
						ic_user_mst.getUSER_PASSWORD(), ic_user_mst.getMOBILE(), ic_user_mst.getEMAIL(),
						ic_user_mst.getUSER_TYPE(), ic_user_mst.getSTATUS());

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// ic fuel types update ends

	// ic fuel types delete starts

	public void deleteICUserMst(int id) {

		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_MST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// IC_USER_ACCESS starts

	public ArrayList<IC_USER_ACCESS> listIC_USER_ACCESS(String userN, String grpC) {

		ArrayList<IC_USER_ACCESS> listIC_USER_ACCESS = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall82.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_ACCESS_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(userN, grpC);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_USER_ACCESS.add(new IC_USER_ACCESS(jsonData.optString("USER_NAME"), jsonData.optString("MOD_CODE"),
					jsonData.optString("MOD_NAME"), jsonData.optString("STATUS"), jsonData.optString("ACTIVITY_CODE"),
					jsonData.optString("ACTIVITY_NAME"), jsonData.optInt("USER_ACS_ID"), jsonData.optString("GRP_CODE"),
					jsonData.optString("GRP_NAME")));
		}

		return listIC_USER_ACCESS;
	}

//		IC_USER_ACCESS list ends 

	// IC_USER_ACCESS insert starts

	public void insertICUserAccess(IC_USER_ACCESS ic_user_access) {

		Map<String, Object> result = getAllStatesJdbcCall83.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_ACCESS_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_user_access.getUSER_NAME(), ic_user_access.getMOD_CODE(), ic_user_access.getSTATUS(),
						ic_user_access.getACTIVITY_CODE(), ic_user_access.getGRP_CODE());

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}

	// IC_USER_ACCESS insert ends

//		IC_USER_ACCESS single starts 

	public IC_USER_ACCESS singleIC_USER_ACCESS(int id) {

		IC_USER_ACCESS singleIC_USER_ACCESS = new IC_USER_ACCESS();

		Map<String, Object> result = getAllStatesJdbcCall84.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_ACCESS_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_USER_ACCESS = new IC_USER_ACCESS(jsonData.optString("USER_NAME"), jsonData.optString("MOD_CODE"),
					jsonData.optString("MOD_NAME"), jsonData.optString("STATUS"), jsonData.optString("ACTIVITY_CODE"),
					jsonData.optString("ACTIVITY_NAME"), jsonData.optInt("USER_ACS_ID"), jsonData.optString("GRP_CODE"),
					jsonData.optString("GRP_NAME"));
		}

		return singleIC_USER_ACCESS;
	}

//		IC_USER_ACCESS single ends

	// IC_USER_ACCESS update starts

	public void editICUserAccess(IC_USER_ACCESS ic_user_access) {

		Map<String, Object> result = getAllStatesJdbcCall85.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_ACCESS_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_user_access.getUSER_ACS_ID(), ic_user_access.getUSER_NAME(), ic_user_access.getMOD_CODE(),
						ic_user_access.getSTATUS(), ic_user_access.getACTIVITY_CODE(), ic_user_access.getGRP_CODE());

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}

	// IC_USER_ACCESS update ends

	// IC_USER_ACCESS delete starts

	public void deleteICUserAccess(int id) {

		Map<String, Object> result = getAllStatesJdbcCall86.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_ACCESS_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

	}

	// IC_USER_TYPE_MST starts

	public ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST() {

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall30.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_TYPE_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//			    System.out.println("npnp");
//				System.out.println(result);
//				
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_USER_TYPE_MST
					.add(new IC_USER_TYPE_MST(jsonData.optString("USERS_TYPE"), jsonData.optString("USER_TYPE_DESC"),
							jsonData.optString("STATUS"), jsonData.optString("USER_TYPE_ID")));
		}

//			    System.out.println("npnp");
//			    System.out.println(listIC_FUEL_TYPE);
		return listIC_USER_TYPE_MST;
	}

//			ic user mst list ends 

	// ic user mst insert starts

	public void insertICUserTypeMst(IC_USER_TYPE_MST ic_user_type_mst) {

		Map<String, Object> result = getAllStatesJdbcCall31.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_TYPE_MST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_user_type_mst.getUSERS_TYPE(), ic_user_type_mst.getUSER_TYPE_DESC(),
						ic_user_type_mst.getSTATUS(), ic_user_type_mst.getUSER_TYPE_ID());

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}

	// ic fuel types insert ends

//			ic fuel types single starts 

	public IC_USER_TYPE_MST singleIC_USER_TYPE_MST(int id) {

		IC_USER_TYPE_MST singleIC_USER_TYPE_MST = new IC_USER_TYPE_MST();

		Map<String, Object> result = getAllStatesJdbcCall32.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_TYPE_MST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//				System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//			    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_USER_TYPE_MST = new IC_USER_TYPE_MST(jsonData.optString("USERS_TYPE"),
					jsonData.optString("USER_TYPE_DESC"), jsonData.optString("STATUS"),
					jsonData.optString("USER_TYPE_ID"));
		}

//			    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_USER_TYPE_MST;
	}

//			ic usage area single ends

	// ic usage area update starts

	public void editICUserTypeMst(IC_USER_TYPE_MST ic_user_type_mst) {

		Map<String, Object> result = getAllStatesJdbcCall33.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_TYPE_MST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_user_type_mst.getUSERS_TYPE(), ic_user_type_mst.getUSER_TYPE_DESC(),
						ic_user_type_mst.getSTATUS(), Integer.valueOf(ic_user_type_mst.getUSER_TYPE_ID()));

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// ic fuel types update ends

	// ic fuel types delete starts

	public void deleteICUserTypeMst(int id) {

		Map<String, Object> result = getAllStatesJdbcCall34.withCatalogName("ICON_PKG")
				.withProcedureName("IC_USER_TYPE_MST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// IC_ZONE_MST starts

	public ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST() {

		ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall35.withCatalogName("ICON_PKG")
				.withProcedureName("IC_ZONE_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//				System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_ZONE_MST.add(new IC_ZONE_MSTmain(jsonData.optString("ZONE_ID"), jsonData.optString("ZONE_CODE"),
					jsonData.optString("ZONE_DESC"), jsonData.optString("ZONE_TYPE"),
					jsonData.optString("REC_STATUS")));
		}

		return listIC_ZONE_MST;
	}

//				IC_ZONE_MSTo list ends 

	// IC_ZONE_MST insert starts

	public void insertICZoneMst(IC_ZONE_MSTmain ic_zone_mst) {

		String a = ic_zone_mst.getZONE_CODE();

		String b = ic_zone_mst.getZONE_DESC();

		String c = ic_zone_mst.getZONE_TYPE();
		String d = ic_zone_mst.getREC_STATUS();

		Map<String, Object> result = getAllStatesJdbcCall36.withCatalogName("ICON_PKG")
				.withProcedureName("IC_ZONE_MST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

//				System.out.println("fh");
//				System.out.println(out);

	}

	public IC_ZONE_MSTmain singleIC_ZONE_MST(int id) {

		IC_ZONE_MSTmain singleIC_ZONE_MST = new IC_ZONE_MSTmain();

		Map<String, Object> result = getAllStatesJdbcCall37.withCatalogName("ICON_PKG")
				.withProcedureName("IC_ZONE_MST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_ZONE_MST = new IC_ZONE_MSTmain(jsonData.optString("ZONE_ID"), jsonData.optString("ZONE_CODE"),
					jsonData.optString("ZONE_DESC"), jsonData.optString("ZONE_TYPE"), jsonData.optString("REC_STATUS"));
		}

		return singleIC_ZONE_MST;
	}

//				IC_ZONE_MST single ends

	// IC_ZONE_MST update starts

	public void editICZoneMst(IC_ZONE_MSTmain ic_zone_mst) {

		Map<String, Object> result = getAllStatesJdbcCall38.withCatalogName("ICON_PKG")
				.withProcedureName("IC_ZONE_MST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(Integer.valueOf(ic_zone_mst.getZONE_ID()), ic_zone_mst.getZONE_CODE(),
						ic_zone_mst.getZONE_DESC(), ic_zone_mst.getZONE_TYPE(), ic_zone_mst.getREC_STATUS());

		JSONObject json = new JSONObject(result);
//				System.out.println(result);
		String out = json.get("OUTPUT").toString();

//				System.out.println(out);   

	}

	// ic_zone_mst update ends

	// ic_zone_mst delete starts

	public void deleteICZoneMst(int id) {

		Map<String, Object> result = getAllStatesJdbcCall39.withCatalogName("ICON_PKG")
				.withProcedureName("IC_ZONE_MST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//				System.out.println(result);
		String out = json.get("OUTPUT").toString();

	}

	// IC_CIRCLE_MST starts

	public ArrayList<IC_CIRCLE_MSTmain> listIC_CIRCLE_MST(String zCode) {
		ArrayList<IC_CIRCLE_MSTmain> listIC_CIRCLE_MST = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall30.withCatalogName("ICON_PKG")
				.withProcedureName("IC_CIRCLE_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(zCode);

		JSONObject j = new JSONObject(c);
		String d = j.get("CUR_DATA").toString();
		JSONArray e = new JSONArray(d);

		for (int i = 0; i < e.length(); i++) {
			JSONObject f = e.getJSONObject(i);

			listIC_CIRCLE_MST.add(new IC_CIRCLE_MSTmain(f.optString("ZONE_CODE"), f.optString("CIRCLE_CODE"),
					f.optString("CIRCLE_DESC"), f.optString("STATUS"), f.optString("CIRCLE_ID")

			));
		}
		return listIC_CIRCLE_MST;
	}

//			IC_CIRCLE_MST list ends 

//			IC_CIRCLE_MST insert start 

	public void insertICCircleMst(IC_CIRCLE_MSTmain ic_circle_mst) {

		String a = ic_circle_mst.getZONE_CODE();
		String c = ic_circle_mst.getCIRCLE_CODE();
		String d = ic_circle_mst.getCIRCLE_DESC();

		String e = ic_circle_mst.getSTATUS();
		Map<String, Object> result = getAllStatesJdbcCall31.withCatalogName("ICON_PKG")
				.withProcedureName("IC_CIRCLE_MST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, c, d, e);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();
	}
//			IC_CIRCLE_MST insert end

	public IC_CIRCLE_MSTmain singleIC_CIRCLE_MST(String id) {

		IC_CIRCLE_MSTmain singleIC_CIRCLE_MST = new IC_CIRCLE_MSTmain();

		Map<String, Object> result = getAllStatesJdbcCall40.withCatalogName("ICON_PKG")
				.withProcedureName("IC_CIRCLE_MST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_CIRCLE_MST = new IC_CIRCLE_MSTmain(jsonData.optString("ZONE_CODE"),
					jsonData.optString("CIRCLE_CODE"), jsonData.optString("CIRCLE_DESC"), jsonData.optString("STATUS"),
					jsonData.optString("CIRCLE_ID"));
		}

		return singleIC_CIRCLE_MST;
	}

//				IC_CIRCLE_MST single ends

	// IC_CIRCLE_MST update starts

	public void editICCircleMst(IC_CIRCLE_MSTmain ic_circle_mst) {

		String a = ic_circle_mst.getZONE_CODE();
		String b = ic_circle_mst.getCIRCLE_CODE();
		String c = ic_circle_mst.getCIRCLE_DESC();
		String d = ic_circle_mst.getSTATUS();
		int e = Integer.valueOf(ic_circle_mst.getCIRCLE_ID());

		Map<String, Object> result = getAllStatesJdbcCall41.withCatalogName("ICON_PKG")
				.withProcedureName("IC_CIRCLE_MST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, e, b, c, d);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out4 = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// IC_CIRCLE_MST update end

	public void deleteICCircleMst(int id) {
		Map<String, Object> result = getAllStatesJdbcCall42.withCatalogName("ICON_PKG")
				.withProcedureName("IC_CIRCLE_MST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//				System.out.println(result);
		String out = json.get("OUTPUT").toString();

//				System.out.println(out);   

	}

	// IC_DIST_DIV_MST starts

	public ArrayList<IC_DIST_DIV_MSTmain> listIC_DIST_DIV_MST(String z) {
		ArrayList<IC_DIST_DIV_MSTmain> div = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall43.withCatalogName("ICON_PKG")
				.withProcedureName("IC_DIST_DIV_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(z);

		JSONObject j = new JSONObject(c);
		String d = j.get("CUR_DATA").toString();
		JSONArray e = new JSONArray(d);

		for (int i = 0; i < e.length(); i++) {
			JSONObject f = e.getJSONObject(i);

			div.add(new IC_DIST_DIV_MSTmain(

					f.optString("ZONE_CODE"), f.optString("CIRCLE_CODE"), f.optString("DIV_CODE"),
					f.optString("DIV_DESC"), f.optString("STATUS"), f.optString("DIST_DIV_ID")

			));
		}

		return div;
	}

//					IC_DIST_DIV_MST list ends 

//					IC_DIST_DIV_MST insert start 

	public void insertICDivMst(IC_DIST_DIV_MSTmain ic_dist_div_mst) {

		String a = ic_dist_div_mst.getCIRCLE_CODE();

		String c = ic_dist_div_mst.getDIV_CODE();
		String d = ic_dist_div_mst.getDIV_DESC();

		String e = ic_dist_div_mst.getSTATUS();

		Map<String, Object> result = getAllStatesJdbcCall44.withCatalogName("ICON_PKG")
				.withProcedureName("IC_DIST_DIV_MST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, c, d, e);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}
//					IC_DIST_DIV_MST insert end

//					IC_DIST_DIV_MST single starts

	public IC_DIST_DIV_MSTmain singleIC_DIST_DIV_MST(String id) {

		IC_DIST_DIV_MSTmain singleIC_DIST_DIV_MST = new IC_DIST_DIV_MSTmain();

		Map<String, Object> result = getAllStatesJdbcCall45.withCatalogName("ICON_PKG")
				.withProcedureName("IC_DIST_DIV_MST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_DIST_DIV_MST = new IC_DIST_DIV_MSTmain(jsonData.optString("ZONE_CODE"),
					jsonData.optString("CIRCLE_CODE"), jsonData.optString("DIV_CODE"), jsonData.optString("DIV_DESC"),
					jsonData.optString("STATUS"), jsonData.optString("DIST_DIV_ID"));
		}

		return singleIC_DIST_DIV_MST;
	}

//						IC_DIST_DIV_MST single ends

	// IC_DIST_DIV_MST update starts

	public void editICDivMst(IC_DIST_DIV_MSTmain ic_dist_div_mst) {

		String a = ic_dist_div_mst.getCIRCLE_CODE();
		String b = ic_dist_div_mst.getDIV_CODE();
		String c = ic_dist_div_mst.getDIV_DESC();
		String d = ic_dist_div_mst.getSTATUS();
		int e = Integer.valueOf(ic_dist_div_mst.getDIST_DIV_ID());

		Map<String, Object> result = getAllStatesJdbcCall46.withCatalogName("ICON_PKG")
				.withProcedureName("IC_DIST_DIV_MST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e);

		JSONObject json = new JSONObject(result);
//					System.out.println(result);
		String out4 = json.get("OUTPUT").toString();
	}

	// IC_DIST_DIV_MST update end

	public void deleteICDivMst(int id) {
		Map<String, Object> result = getAllStatesJdbcCall47.withCatalogName("ICON_PKG")
				.withProcedureName("IC_DIST_DIV_MST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//						System.out.println(result);
		String out = json.get("OUTPUT").toString();

	}

//				 	IC_REPORT_LEVEL_MST list starts

	public ArrayList<IC_REPORT_LEVEL_MSTmain> listIC_REPORT_LEVEL_MST() {

		ArrayList<IC_REPORT_LEVEL_MSTmain> listIC_REPORT_LEVEL_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall48.withCatalogName("ICON_PKG")
				.withProcedureName("IC_REPORT_LEVEL_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//							    System.out.println("npnp");
//								System.out.println(result);
//								
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_REPORT_LEVEL_MST.add(new IC_REPORT_LEVEL_MSTmain(jsonData.optString("REPORT_LEVEL_CODE"),
					jsonData.optString("REPORT_LEVEL_DESC"), jsonData.optString("STATUS"),
					jsonData.optString("REPORT_LV_ID")));
		}

		return listIC_REPORT_LEVEL_MST;
	}

	// IC_REPORT_LEVEL_MST insert starts

	public void insertICReportLevelMst(IC_REPORT_LEVEL_MSTmain ic_report_level_mst) {

		String a = ic_report_level_mst.getREPORT_LEVEL_CODE();
		String b = ic_report_level_mst.getREPORT_LEVEL_DESC();
		String c = ic_report_level_mst.getSTATUS();

		Map<String, Object> result = getAllStatesJdbcCall49.withCatalogName("ICON_PKG")
				.withProcedureName("IC_REPORT_LEVEL_MST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}

	// IC_REPORT_LEVEL_MST insert ends

//							IC_REPORT_LEVEL_MST single starts 

	public IC_REPORT_LEVEL_MSTmain singleIC_REPORT_LEVEL_MST(int id) {

		IC_REPORT_LEVEL_MSTmain singleIC_REPORT_LEVEL_MST = new IC_REPORT_LEVEL_MSTmain();

		Map<String, Object> result = getAllStatesJdbcCall50.withCatalogName("ICON_PKG")
				.withProcedureName("IC_REPORT_LEVEL_MST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//								System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//							    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_REPORT_LEVEL_MST = new IC_REPORT_LEVEL_MSTmain(jsonData.optString("REPORT_LEVEL_CODE"),
					jsonData.optString("REPORT_LEVEL_DESC"), jsonData.optString("STATUS"),
					jsonData.optString("REPORT_LV_ID"));
		}

		return singleIC_REPORT_LEVEL_MST;
	}

//							IC_REPORT_LEVEL_MST single ends

	// IC_REPORT_LEVEL_MST update starts

	public void editICReportLevelMst(IC_REPORT_LEVEL_MSTmain ic_report_level_mst) {

		String a = ic_report_level_mst.getREPORT_LEVEL_CODE();
		String b = ic_report_level_mst.getREPORT_LEVEL_DESC();
		String c = ic_report_level_mst.getSTATUS();
		int d = Integer.valueOf(ic_report_level_mst.getREPORT_LV_ID());

		Map<String, Object> result = getAllStatesJdbcCall51.withCatalogName("ICON_PKG")
				.withProcedureName("IC_REPORT_LEVEL_MST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);
//							System.out.println(result);
		String out = json.get("OUTPUT").toString();
	}

	// IC_REPORT_LEVEL_MST update ends

	// IC_REPORT_LEVEL_MST delete starts

	public void deleteICReportLevelMst(int id) {

		Map<String, Object> result = getAllStatesJdbcCall52.withCatalogName("ICON_PKG")
				.withProcedureName("IC_REPORT_LEVEL_MST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//							System.out.println(result);
		String out = json.get("OUTPUT").toString();

	}

	// IC_REPORT_LEVEL_MST delete ends

//					 	IC_GEN_REPORT_LEVEL_MST list starts

	public ArrayList<IC_GEN_REPORT_LEVEL_MSTmain> listIC_GEN_REPORT_LEVEL_MST() {

		ArrayList<IC_GEN_REPORT_LEVEL_MSTmain> listIC_GEN_REPORT_LEVEL_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall53.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GEN_REPORT_LEVEL_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_GEN_REPORT_LEVEL_MST.add(new IC_GEN_REPORT_LEVEL_MSTmain(jsonData.optString("REPORT_LEVEL_CODE"),
					jsonData.optString("REPORT_LEVEL_DESC"), jsonData.optString("STATUS"),
					jsonData.optString("GEN_REPORT_LV_ID")));
		}

		return listIC_GEN_REPORT_LEVEL_MST;
	}

	// IC_GEM_REPORT_LEVEL_MST insert starts

	public void insertICGenReportLevelMst(IC_GEN_REPORT_LEVEL_MSTmain ic_gen_report_level_mst) {

		String a = ic_gen_report_level_mst.getREPORT_LEVEL_CODE();
		String b = ic_gen_report_level_mst.getREPORT_LEVEL_DESC();
		String c = ic_gen_report_level_mst.getSTATUS();

		Map<String, Object> result = getAllStatesJdbcCall54.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GEN_REPORT_LEVEL_MST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}

	// IC_GEN_REPORT_LEVEL_MST insert ends

//						IC_GEN_REPORT_LEVEL_MST single starts 

	public IC_GEN_REPORT_LEVEL_MSTmain singleIC_GEN_REPORT_LEVEL_MST(int id) {

		IC_GEN_REPORT_LEVEL_MSTmain singleIC_GEN_REPORT_LEVEL_MST = new IC_GEN_REPORT_LEVEL_MSTmain();

		Map<String, Object> result = getAllStatesJdbcCall55.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GEN_REPORT_LEVEL_MST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//									System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//								    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_GEN_REPORT_LEVEL_MST = new IC_GEN_REPORT_LEVEL_MSTmain(jsonData.optString("REPORT_LEVEL_CODE"),
					jsonData.optString("REPORT_LEVEL_DESC"), jsonData.optString("STATUS"),
					jsonData.optString("GEN_REPORT_LV_ID"));
		}

		return singleIC_GEN_REPORT_LEVEL_MST;
	}

//								IC_GEN_REPORT_LEVEL_MST single ends

	// IC_GEN_REPORT_LEVEL_MST update starts

	public void editICGenReportLevelMst(IC_GEN_REPORT_LEVEL_MSTmain ic_gen_report_level_mst) {

		String a = ic_gen_report_level_mst.getREPORT_LEVEL_CODE();
		String b = ic_gen_report_level_mst.getREPORT_LEVEL_DESC();
		String c = ic_gen_report_level_mst.getSTATUS();
		int d = Integer.valueOf(ic_gen_report_level_mst.getGEN_REPORT_LV_ID());

		Map<String, Object> result = getAllStatesJdbcCall56.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GEN_REPORT_LEVEL_MST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);
//								System.out.println(result);
		String out = json.get("OUTPUT").toString();
	}

	// IC_GEN_REPORT_LEVEL_MST update ends

	// IC_GEN_REPORT_LEVEL_MST delete starts

	public void deleteICGenReportLevelMst(int id) {

		Map<String, Object> result = getAllStatesJdbcCall57.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GEN_REPORT_LEVEL_MST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//								System.out.println(result);
		String out = json.get("OUTPUT").toString();

	}

	// IC_GEN_REPORT_LEVEL_MST delete ends

	// IC_LDC_TYPE Drop-down
	public ArrayList<IC_LDC_TYPE> listIC_LDC_TYPE() {

		ArrayList<IC_LDC_TYPE> listIC_LDC_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall58.withCatalogName("ICON_PKG")
				.withProcedureName("IC_LDC_TYPE_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//								System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_LDC_TYPE
					.add(new IC_LDC_TYPE(jsonData.optString("LDC_TYPE_CODE"), jsonData.optString("LDC_TYPE_NAME")));
		}

		return listIC_LDC_TYPE;
	}

	// IC_LDC_MONTH_MAX_DATA starts
	public ArrayList<IC_LDC_MONTH_MAX_DATA> listIC_LDC_MONTH_MAX_DATA() {

		ArrayList<IC_LDC_MONTH_MAX_DATA> listIC_LDC_MONTH_MAX_DATA = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall59.withCatalogName("ICON_PKG")
				.withProcedureName("IC_LDC_MONTH_MAX_DATA_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//								System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_LDC_MONTH_MAX_DATA.add(new IC_LDC_MONTH_MAX_DATA(jsonData.optString("BILL_CYCLE_CODE"),
					jsonData.optString("LDC_CODE"), jsonData.optString("LDC_DATE").replace(" 00:00:00.0", ""),
					jsonData.optDouble("LDC"), jsonData.optString("UPTO_DATE").replace(" 00:00:00.0", ""),
					jsonData.optInt("UPTO_LDC"), jsonData.optString("STATUS"), jsonData.optInt("LDC_ID")));
		}

		return listIC_LDC_MONTH_MAX_DATA;
	}

	// IC_LDC_MONTH_MAX_DATA insert starts

	public void insertICLdcMonthMaxData(IC_LDC_MONTH_MAX_DATA ic_ldc_month_max_data) {

		String a = ic_ldc_month_max_data.getBILL_CYCLE_CODE();
		String b = ic_ldc_month_max_data.getLDC_CODE();
		String c = ic_ldc_month_max_data.getLDC_DATE();
		double d = ic_ldc_month_max_data.getLDC();
		String e = ic_ldc_month_max_data.getUPTO_DATE();
		int f = ic_ldc_month_max_data.getUPTO_LDC();
		String g = ic_ldc_month_max_data.getSTATUS();

		Map<String, Object> result = getAllStatesJdbcCall60.withCatalogName("ICON_PKG")
				.withProcedureName("IC_LDC_MONTH_MAX_DATA_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e, f, g);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}

	// IC_LDC_MONTH_MAX_DATA insert ends

//						IC_LDC_MONTH_MAX_DATA single starts 

	public IC_LDC_MONTH_MAX_DATA singleIC_LDC_MONTH_MAX_DATA(int id) {

		IC_LDC_MONTH_MAX_DATA singleIC_LDC_MONTH_MAX_DATA = new IC_LDC_MONTH_MAX_DATA();

		Map<String, Object> result = getAllStatesJdbcCall61.withCatalogName("ICON_PKG")
				.withProcedureName("IC_LDC_MONTH_MAX_DATA_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//									System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//								    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_LDC_MONTH_MAX_DATA = new IC_LDC_MONTH_MAX_DATA(jsonData.optString("BILL_CYCLE_CODE"),
					jsonData.optString("LDC_CODE"), jsonData.optString("LDC_DATE").replace(" 00:00:00.0", ""),
					jsonData.optDouble("LDC"), jsonData.optString("UPTO_DATE").replace(" 00:00:00.0", ""),
					jsonData.optInt("UPTO_LDC"), jsonData.optString("STATUS"), jsonData.optInt("LDC_ID"));
		}

		return singleIC_LDC_MONTH_MAX_DATA;
	}

//								IC_LDC_MONTH_MAX_DATA single ends

	// IC_LDC_MONTH_MAX_DATA update starts

	public void editICGenReportLevelMst(IC_LDC_MONTH_MAX_DATA ic_ldc_month_max_data) {

		String a = ic_ldc_month_max_data.getBILL_CYCLE_CODE();
		String b = ic_ldc_month_max_data.getLDC_CODE();
		String c = ic_ldc_month_max_data.getLDC_DATE();
		double d = ic_ldc_month_max_data.getLDC();
		String e = ic_ldc_month_max_data.getUPTO_DATE();
		int f = ic_ldc_month_max_data.getUPTO_LDC();
		String g = ic_ldc_month_max_data.getSTATUS();
		int h = Integer.valueOf(ic_ldc_month_max_data.getLDC_ID());

		Map<String, Object> result = getAllStatesJdbcCall62.withCatalogName("ICON_PKG")
				.withProcedureName("IC_LDC_MONTH_MAX_DATA_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e, f, g, h);

		JSONObject json = new JSONObject(result);
//								System.out.println(result);
		String out = json.get("OUTPUT").toString();
	}

	// IC_LDC_MONTH_MAX_DATA update ends

	// IC_LDC_MONTH_MAX_DATA delete starts

	public void deleteICLdcMonthMaxData(int id) {

		Map<String, Object> result = getAllStatesJdbcCall63.withCatalogName("ICON_PKG")
				.withProcedureName("IC_LDC_MONTH_MAX_DATA_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//								System.out.println(result);
		String out = json.get("OUTPUT").toString();

	}

	// IC_GEN_REPORT_LEVEL_MST delete ends

	// IC_GROUP_INFO starts

	public ArrayList<IC_GROUP_INFO> listIC_GROUP_INFO() {

		ArrayList<IC_GROUP_INFO> listIC_GROUP_INFO = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall64.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GROUP_INFO_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_GROUP_INFO.add(new IC_GROUP_INFO(jsonData.optString("GRP_ID"), jsonData.optString("GRP_CODE"),
					jsonData.optString("GRP_NAME"), jsonData.optString("USERS_TYPE"),
					jsonData.optString("USER_TYPE_DESC"), jsonData.optString("STATUS")));
		}

		return listIC_GROUP_INFO;
	}

//								IC_GROUP_INFO list ends 

	// IC_GROUP_INFO insert starts

	public void insertICGroupInfo(IC_GROUP_INFO ic_group_info) {

		String a = ic_group_info.getGRP_CODE();

		String b = ic_group_info.getGRP_NAME();

		String c = ic_group_info.getUSER_TYPE();
		String d = ic_group_info.getSTATUS();

		Map<String, Object> result = getAllStatesJdbcCall65.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GROUP_INFO_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

		System.out.println("fh");
		System.out.println(out);

	}

	public IC_GROUP_INFO singleIC_GROUP_INFO(int id) {

		IC_GROUP_INFO singleIC_GROUP_INFO = new IC_GROUP_INFO();

		Map<String, Object> result = getAllStatesJdbcCall66.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GROUP_INFO_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_GROUP_INFO = new IC_GROUP_INFO(jsonData.optString("GRP_ID"), jsonData.optString("GRP_CODE"),
					jsonData.optString("GRP_NAME"), jsonData.optString("USER_TYPE"),
					jsonData.optString("USER_TYPE_DESC"), jsonData.optString("STATUS"));
		}

		return singleIC_GROUP_INFO;
	}

//								IC_GROUP_INFO single ends

	// IC_GROUP_INFO update starts

	public void editICGroupInfo(IC_GROUP_INFO ic_group_info) {

		Map<String, Object> result = getAllStatesJdbcCall67.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GROUP_INFO_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(Integer.valueOf(ic_group_info.getGRP_ID()), ic_group_info.getGRP_CODE(),
						ic_group_info.getGRP_NAME(), ic_group_info.getUSER_TYPE(), ic_group_info.getSTATUS());

		JSONObject json = new JSONObject(result);
//								System.out.println(result);
		String out = json.get("OUTPUT").toString();

//								System.out.println(out);   

	}

	// IC_GROUP_INFO update ends

	// IC_GROUP_INFO delete starts

	public void deleteICGroupInfo(int id) {

		Map<String, Object> result = getAllStatesJdbcCall68.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GROUP_INFO_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//								System.out.println(result);
		String out = json.get("OUTPUT").toString();

	}

//							IC_GROUP_ACCESS list starts 

	public ArrayList<IC_GROUP_ACCESS> listIC_GROUP_ACCESS(String z) {

		ArrayList<IC_GROUP_ACCESS> listIC_GROUP_ACCESS = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall69.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GROUP_ACCESS_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(z);

		JSONObject j = new JSONObject(c);

		String d = j.get("CUR_DATA").toString();

		JSONArray e = new JSONArray(d);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			listIC_GROUP_ACCESS.add(new IC_GROUP_ACCESS(f.optString("GRP_CODE"), f.optString("GRP_NAME"),
					f.optString("MOD_CODE"), f.optString("MOD_NAME"), f.optString("STATUS"),
					f.optString("ACTIVITY_CODE"), f.optString("ACTIVITY_NAME"), f.getInt("GRP_ACS_ID")

			));
		}
		return listIC_GROUP_ACCESS;

	}

//							IC_GROUP_ACCESS list ends 

//							IC_GROUP_ACCESS insert start 

	public void insertICGroupAccess(IC_GROUP_ACCESS ic_group_access) {

		String a = ic_group_access.getGRP_CODE();
//							String b = ic_group_access.getGRP_NAME();
		String c = ic_group_access.getMOD_CODE();
		String d = ic_group_access.getSTATUS();
		String e = ic_group_access.getACTIVITY_CODE();

		String[] arr = e.split(",");
		for (int i = 0; i < arr.length; i++) {

			Map<String, Object> result = getAllStatesJdbcCall70.withCatalogName("ICON_PKG")
					.withProcedureName("IC_GROUP_ACCESS_INSERT")
					.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, c, d, arr[i]);

			JSONObject json = new JSONObject(result);
			String out = json.get("OUTPUT").toString();
		}

	}

//							IC_GROUP_ACCESS insert end

//		IC_GROUP_ACCESS single start

	public IC_GROUP_ACCESS singleIC_GROUP_ACCESS(int id) {

		IC_GROUP_ACCESS singleIC_GROUP_ACCESS = new IC_GROUP_ACCESS();

		Map<String, Object> result = getAllStatesJdbcCall71.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GROUP_ACCESS_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_GROUP_ACCESS = new IC_GROUP_ACCESS(jsonData.optString("GRP_CODE"), jsonData.optString("GRP_NAME"),
					jsonData.optString("MOD_CODE"), jsonData.optString("MOD_NAME"), jsonData.optString("STATUS"),
					jsonData.optString("ACTIVITY_CODE"), jsonData.optString("ACTIVITY_NAME"),
					jsonData.optInt("GRP_ACS_ID"));
		}

		return singleIC_GROUP_ACCESS;
	}

//			IC_GROUP_ACCESS single ends

	// IC_GROUP_ACCESS update starts

	public void editICGroupAccess(IC_GROUP_ACCESS ic_group_access) {

		Map<String, Object> result = getAllStatesJdbcCall72.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GROUP_ACCESS_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_group_access.getGRP_CODE(), ic_group_access.getMOD_CODE(), ic_group_access.getSTATUS(),
						ic_group_access.getACTIVITY_CODE(), ic_group_access.getGRP_ACS_ID());

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// IC_GROUP_ACCESS update ends

	// IC_GROUP_ACCESS delete starts

	public void deleteICGroupAccess(int id) {

		Map<String, Object> result = getAllStatesJdbcCall73.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GROUP_ACCESS_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

	}

	// IC_MODULE_ACCESS starts

	public ArrayList<IC_MODULE_ACCESS> listIC_MODULE_ACCESS(String modeC) {

		ArrayList<IC_MODULE_ACCESS> listIC_MODULE_ACCESS = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall75.withCatalogName("ICON_PKG")
				.withProcedureName("IC_MODULE_ACCESS_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(modeC);

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_MODULE_ACCESS.add(new IC_MODULE_ACCESS(jsonData.optString("MOD_CODE"),
					jsonData.optString("MOD_NAME"), jsonData.optString("STATUS"), jsonData.optString("ACTIVITY_CODE"),
					jsonData.optString("ACTIVITY_NAME"), jsonData.optInt("MOD_ACS_ID")));
		}

		return listIC_MODULE_ACCESS;
	}

//			IC_MODULE_ACCESS list ends 

	// IC_MODULE_ACCESS insert starts

	public void insertICModuleAccess(IC_MODULE_ACCESS ic_module_access) {

		String a = ic_module_access.getMOD_CODE();

		String b = ic_module_access.getSTATUS();

		String c = ic_module_access.getACTIVITY_CODE();
		
		String[] arr = c.split(",");
		for (int i = 0; i < arr.length; i++) {


		Map<String, Object> result = getAllStatesJdbcCall76.withCatalogName("ICON_PKG")
				.withProcedureName("IC_MODULE_ACCESS_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b,  arr[i]);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();
		
		}

	}

	public IC_MODULE_ACCESS singleIC_MODULE_ACCESS(int id) {

		IC_MODULE_ACCESS singleIC_MODULE_ACCESS = new IC_MODULE_ACCESS();

		Map<String, Object> result = getAllStatesJdbcCall77.withCatalogName("ICON_PKG")
				.withProcedureName("IC_MODULE_ACCESS_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_MODULE_ACCESS = new IC_MODULE_ACCESS(jsonData.optString("MOD_CODE"),
					jsonData.optString("MOD_NAME"), jsonData.optString("STATUS"), jsonData.optString("ACTIVITY_CODE"),
					jsonData.optString("ACTIVITY_NAME"), jsonData.optInt("MOD_ACS_ID"));
		}

		return singleIC_MODULE_ACCESS;
	}

//			IC_MODULE_ACCESS single ends

	// IC_MODULE_ACCESS update starts

	public void editICModuleAccess(IC_MODULE_ACCESS ic_module_access) {

		Map<String, Object> result = getAllStatesJdbcCall78.withCatalogName("ICON_PKG")
				.withProcedureName("IC_MODULE_ACCESS_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_module_access.getMOD_CODE(), ic_module_access.getSTATUS(),
						ic_module_access.getACTIVITY_CODE(), Integer.valueOf(ic_module_access.getMOD_ACS_ID()));

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	// IC_MODULE_ACCESS update ends

	// IC_MODULE_ACCESS delete starts

	public void deleteICModulesAccess(int id) {

		Map<String, Object> result = getAllStatesJdbcCall79.withCatalogName("ICON_PKG")
				.withProcedureName("IC_MODULE_ACCESS_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

	}

	public ArrayList<ModuleDropdownList> moduleDropdownList() {
		ArrayList<ModuleDropdownList> moduleDropdownList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall37.withCatalogName("ICON_PKG")
				.withProcedureName("IC_MODULE_LIST_DROPDOWN")
				.declareParameters(new SqlOutParameter("MODULEDROPDOWN", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String outString = json.get("MODULEDROPDOWN").toString();
		JSONArray jsonArray = new JSONArray(outString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			moduleDropdownList
					.add(new ModuleDropdownList(jsonData.optString("MOD_CODE"), jsonData.optString("MOD_NAME")));
		}

		return moduleDropdownList;
	}

	public ArrayList<ActivityList> activityListShow(String modCode) {
		ArrayList<ActivityList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall74.withCatalogName("ICON_PKG")
				.withProcedureName("IC_ACTIVITY_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(modCode);

		JSONObject json = new JSONObject(result);
		String outString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(outString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ActivityList(Integer.valueOf(jsonData.optString("MOD_CODE")),
					jsonData.optString("ACTIVITY_CODE"), jsonData.optString("ACTIVITY_NAME"),
					jsonData.optString("ACTIVITY_NAME")));
		}

		return showList;

	}

	public ArrayList<ActivityDrop> activityDropDown() {
		ArrayList<ActivityDrop> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall80.withCatalogName("ICON_PKG")
				.withProcedureName("IC_ACTIVITY_LISTS")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String outString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(outString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ActivityDrop(jsonData.optString("ACTIVITY_CODE"), jsonData.optString("ACTIVITY_NAME")));
		}

		return showList;

	}

	public ArrayList<ModuleDropdownList> moduleDropdown() {
		ArrayList<ModuleDropdownList> moduleDropdown = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall81.withCatalogName("ICON_PKG")
				.withProcedureName("IC_MODULE_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String outString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(outString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			moduleDropdown.add(new ModuleDropdownList(jsonData.optString("MOD_CODE"), jsonData.optString("MOD_NAME")));
		}
		return moduleDropdown;
	}

	public ArrayList<IC_GROUP_ACCESS> groupAccessModDropdown(String c) {
		ArrayList<IC_GROUP_ACCESS> groupAccessModDropdown = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall87.withCatalogName("ICON_PKG")
				.withProcedureName("IC_GROUP_ACCESS_DROP")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(c);

		JSONObject json = new JSONObject(result);
		String outString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(outString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			groupAccessModDropdown.add(new IC_GROUP_ACCESS(jsonData.optString("GRP_CODE"),
					jsonData.optString("GRP_NAME"), jsonData.optString("MOD_CODE"), jsonData.optString("MOD_NAME"),
					jsonData.optString("STATUS"), jsonData.optString("ACTIVITY_CODE"),
					jsonData.optString("ACTIVITY_NAME"), jsonData.optInt("GRP_ACS_ID")));
		}
		return groupAccessModDropdown;
	}
	
	// IC_MODULES_LIST starts

	public ArrayList<IC_MODULES_LIST> listIC_MODULES_LIST() {

		ArrayList<IC_MODULES_LIST> listIC_MODULES_LIST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall88.withCatalogName("ICON_PKG")
				.withProcedureName("IC_MODULES_LIST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_MODULES_LIST.add(new IC_MODULES_LIST(jsonData.optString("PARENT"),
					jsonData.optString("MOD_APP"), jsonData.optString("EXT"), jsonData.optString("ROOTLEAF"),
					jsonData.optString("MOD_NAME"),jsonData.optString("MTYPE"),jsonData.optString("MOD_CODE"),
					jsonData.optString("PAGE_RANG"),jsonData.optString("SHORT_NAME"), jsonData.optInt("MOD_ID")));
		}

		return listIC_MODULES_LIST;
	}

   //	 IC_MODULE_LIST list ends 
	
	// IC_MODULES_LIST insert starts

	public void insertICModulesList(IC_MODULES_LIST ic_module_list) {
		
		String a = ic_module_list.getPARENT();
		String b = ic_module_list.getMOD_APP();
		String c = ic_module_list.getEXT();
		String d = ic_module_list.getROOTLEAF();
		String e = ic_module_list.getMOD_NAME();
		String f = ic_module_list.getMTYPE();
		String g = ic_module_list.getMOD_CODE();
		String h = ic_module_list.getPAGE_RANG();
		String i = ic_module_list.getSHORT_NAME();
		int j = ic_module_list.getMOD_ID();

		Map<String, Object> result = getAllStatesJdbcCall89.withCatalogName("ICON_PKG")
				.withProcedureName("IC_MODULES_LIST_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a,b,c,d,e,f,g,h,i,j);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}

	public IC_MODULES_LIST singleIC_MODULES_LIST(int id) {

		IC_MODULES_LIST singleIC_MODULES_LIST = new IC_MODULES_LIST();

		Map<String, Object> result = getAllStatesJdbcCall90.withCatalogName("ICON_PKG")
				.withProcedureName("IC_MODULES_LIST_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_MODULES_LIST = new IC_MODULES_LIST(jsonData.optString("PARENT"),
					jsonData.optString("MOD_APP"), jsonData.optString("EXT"), jsonData.optString("ROOTLEAF"),
					jsonData.optString("MOD_NAME"),jsonData.optString("MTYPE"),jsonData.optString("MOD_CODE"),
					jsonData.optString("PAGE_RANG"),jsonData.optString("SHORT_NAME"), jsonData.optInt("MOD_ID"));
		}

		return singleIC_MODULES_LIST;
	}

//			IC_MODULES_LIST single ends

	// IC_MODULES_LIST update starts

	public void editICModulesList(IC_MODULES_LIST ic_module_list) {

		Map<String, Object> result = getAllStatesJdbcCall91.withCatalogName("ICON_PKG")
				.withProcedureName("IC_MODULES_LIST_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_module_list.getPARENT(),ic_module_list.getMOD_APP(),ic_module_list.getEXT(),ic_module_list.getROOTLEAF(),
						ic_module_list.getMOD_NAME(),ic_module_list.getMTYPE(),
						ic_module_list.getMOD_CODE(),ic_module_list.getPAGE_RANG(),ic_module_list.getSHORT_NAME(),ic_module_list.getMOD_ID());

		JSONObject json = new JSONObject(result);

		String out = json.get("OUTPUT").toString();
 

	}

	// IC_MODULES_LIST update ends

	// IC_MODULES_LIST delete starts

	public void deleteICModulesList(int id) {

		Map<String, Object> result = getAllStatesJdbcCall92.withCatalogName("ICON_PKG")
				.withProcedureName("IC_MODULES_LIST_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

	}

	
	// IC_TRANS_GRID starts
	
	public ArrayList<IC_TRANS_GRIDmain> listIC_TRANS_GRID() {

		ArrayList<IC_TRANS_GRIDmain> listIC_TRANS_GRID = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall93.withCatalogName("ICON_PKG")
				.withProcedureName("IC_TRANS_GRID_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_TRANS_GRID.add(new IC_TRANS_GRIDmain(jsonData.optString("GRID_CODE"), jsonData.optString("GRID_DESC"),
					jsonData.optString("AREA_CODE"), jsonData.optString("AREA_NAME"),jsonData.optString("STATUS"),jsonData.optString("GRID_ID")));
		}

		return listIC_TRANS_GRID;
	}

//	IC_TRANS_GRID list ends 

	// IC_TRANS_GRID insert starts

	public void insertICTransGrid(IC_TRANS_GRIDmain ic_trans_grid) {

		String a = ic_trans_grid.getGRID_CODE();
		String b = ic_trans_grid.getGRID_DESC();
		String c = ic_trans_grid.getAREA_CODE();
		String d = ic_trans_grid.getSTATUS();


		Map<String, Object> result = getAllStatesJdbcCall94.withCatalogName("ICON_PKG")
				.withProcedureName("IC_TRANS_GRID_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);

		String out = json.get("OUTPUT").toString();


	}

	// IC_TRANS_GRID insert ends

//	IC_TRANS_GRID single starts 

	public IC_TRANS_GRIDmain singleIC_TRANS_GRID(int id) {

		IC_TRANS_GRIDmain singleIC_TRANS_GRID = new IC_TRANS_GRIDmain();

		Map<String, Object> result = getAllStatesJdbcCall95.withCatalogName("ICON_PKG")
				.withProcedureName("IC_TRANS_GRID_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);


		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_TRANS_GRID = new IC_TRANS_GRIDmain(jsonData.optString("GRID_CODE"), jsonData.optString("GRID_DESC"),jsonData.optString("AREA_CODE"),
					jsonData.optString("AREA_NAME"),jsonData.optString("STATUS"), jsonData.optString("GRID_ID"));
		}
		
		return singleIC_TRANS_GRID;
	}

//	IC_TRANS_GRID single ends

	// IC_TRANS_GRID update starts

	public void editICTransGrid(IC_TRANS_GRIDmain ic_trans_grid) {

		String a = ic_trans_grid.getGRID_CODE();
		String b = ic_trans_grid.getGRID_DESC();
		String c = ic_trans_grid.getAREA_CODE();
		String d = ic_trans_grid.getSTATUS();

		int e = Integer.valueOf(ic_trans_grid.getGRID_ID());


		Map<String, Object> result = getAllStatesJdbcCall96.withCatalogName("ICON_PKG")
				.withProcedureName("IC_TRANS_GRID_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d,e);

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();


	}

	// IC_TRANS_GRID update ends

	// IC_TRANS_GRID delete starts

	public void deleteICTransGrid(int id) {

		Map<String, Object> result = getAllStatesJdbcCall97.withCatalogName("ICON_PKG")
				.withProcedureName("IC_TRANS_GRID_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("OUTPUT").toString();
 

	}
	
	// IC_POWER_PLANT starts
	
	public ArrayList<IC_POWER_PLANTmain> listIC_POWER_PLANT() {

		ArrayList<IC_POWER_PLANTmain> listIC_POWER_PLANT = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall98.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_POWER_PLANT_LIST")
				.declareParameters(new SqlOutParameter("PLANTDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		
		String out = json.get("PLANTDATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_POWER_PLANT.add(new IC_POWER_PLANTmain(jsonData.optString("PP_CODE"), jsonData.optString("PP_NAME"),
					jsonData.optString("NO_OF_UNIT"), jsonData.optDouble("INSTALLED_CAPACITY"),jsonData.optDouble("MAX_CAPACITY"),
					jsonData.optString("GRID_CODE"),jsonData.optString("GRID_DESC"),jsonData.optString("STATUS"),jsonData.optString("OWNER_CODE"),
					jsonData.optString("OWNER_NAME"),jsonData.optString("SHORT_NAME"),jsonData.optString("GEN_AREA_CODE"),jsonData.optString("GEN_AREA_NAME"),jsonData.optInt("PP_ID")));
		}

		return listIC_POWER_PLANT;
	}

//	IC_POWER_PLANT list ends 

	// IC_POWER_PLANT insert starts

//	public void insertICPowerPlant(IC_POWER_PLANTmain ic_power_plant) {
//
//		
//		String a = ic_power_plant.getPpCode();
//		String b = ic_power_plant.getPpName();
//		String c = ic_power_plant.getNoOfUnit();
//		double d = ic_power_plant.getInstalledCapacity();
//		double e = ic_power_plant.getMaxCapacity();
//		String f = ic_power_plant.getGridCode();
//		String g = ic_power_plant.getStatus();
//		String h = ic_power_plant.getOwnerCode();
//		String i = ic_power_plant.getShortName();
//		String j = ic_power_plant.getGenAreaCode();
//		
//
//
//		Map<String, Object> result = getAllStatesJdbcCall99.withCatalogName("ICON_PKG")
//				.withProcedureName("IC_POWER_PLANT_INSERT")
//				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d,e,f,g,h,i,j);
//
//		JSONObject json = new JSONObject(result);
//
//		String out = json.get("OUTPUT").toString();
//
//
//	}
//
//	// IC_POWER_PLANT insert ends
//
////	IC_POWER_PLANT single starts 
//
//	public IC_POWER_PLANTmain singleIC_POWER_PLANT(int id) {
//
//		IC_POWER_PLANTmain singleIC_POWER_PLANT = new IC_POWER_PLANTmain();
//
//		Map<String, Object> result = getAllStatesJdbcCall100.withCatalogName("ICON_PKG")
//				.withProcedureName("IC_POWER_PLANT_SINGLE")
//				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);
//
//		JSONObject json = new JSONObject(result);
//
//		String out = json.get("CUR_DATA").toString();
//		JSONArray jsonArray = new JSONArray(out);
//
//
//		for (int i = 0; i < jsonArray.length(); i++) {
//			JSONObject jsonData = jsonArray.getJSONObject(i);
//			singleIC_POWER_PLANT = new IC_POWER_PLANTmain(jsonData.optString("ppCode"), jsonData.optString("ppName"),
//					jsonData.optString("noOfUnit"), jsonData.optDouble("installedCapacity"),jsonData.optDouble("maxCapacity"),
//					jsonData.optString("gridCode"),jsonData.optString("gridDesc"),jsonData.optString("status"),jsonData.optString("ownerCode"),
//					jsonData.optString("ownerName"),jsonData.optString("shortName"),jsonData.optString("genAreaCode"),jsonData.optString("genAreaName"),jsonData.optInt("ppId"));
//		}
//		
//		return singleIC_POWER_PLANT;
//	}
//
////	IC_POWER_PLANT single ends
//
//	// IC_POWER_PLANT update starts
//
//	public void editICPPowerPlant(IC_POWER_PLANTmain ic_power_plant) {
//
//		String a = ic_power_plant.getPpCode();
//		String b = ic_power_plant.getPpName();
//		String c = ic_power_plant.getNoOfUnit();
//		double d = ic_power_plant.getInstalledCapacity();
//		double e = ic_power_plant.getMaxCapacity();
//		String f = ic_power_plant.getGridCode();
//		String g = ic_power_plant.getStatus();
//		String h = ic_power_plant.getOwnerCode();
//		String i = ic_power_plant.getShortName();
//		String j = ic_power_plant.getGenAreaCode();
//
//		int k = Integer.valueOf(ic_power_plant.getPpId());
//
//
//		Map<String, Object> result = getAllStatesJdbcCall101.withCatalogName("ICON_PKG")
//				.withProcedureName("IC_POWER_PLANT_UPDATE")
//				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d,e,f,g,h,i,j,k);
//
//		JSONObject json = new JSONObject(result);
////	System.out.println(result);
//		String out = json.get("OUTPUT").toString();
//
//
//	}
//
//	// IC_POWER_PLANT update ends
//
//	// IC_POWER_PLANT delete starts
//
//	public void deleteICPowerPlant(int id) {
//
//		Map<String, Object> result = getAllStatesJdbcCall102.withCatalogName("ICON_PKG")
//				.withProcedureName("IC_POWER_PLANT_DELETE")
//				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);
//
//		JSONObject json = new JSONObject(result);
//
//		String out = json.get("OUTPUT").toString();
// 
//
//	}
}
