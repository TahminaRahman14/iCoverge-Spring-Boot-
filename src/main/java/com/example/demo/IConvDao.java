package com.example.demo;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.OracleTypes;

@Repository
public class IConvDao {
	@Autowired
	private JdbcTemplate jdbcTemplete;
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
	SimpleJdbcCall getAllStatesJdbcCall10;
	SimpleJdbcCall getAllStatesJdbcCall11;
	SimpleJdbcCall getAllStatesJdbcCall12;
	SimpleJdbcCall getAllStatesJdbcCall13;
	SimpleJdbcCall getAllStatesJdbcCall14;
	SimpleJdbcCall getAllStatesJdbcCall15;
	SimpleJdbcCall getAllStatesJdbcCall16;
	SimpleJdbcCall getAllStatesJdbcCall17;
	SimpleJdbcCall getAllStatesJdbcCall18;
	SimpleJdbcCall getAllStatesJdbcCall19;
	SimpleJdbcCall getAllStatesJdbcCall20;
	SimpleJdbcCall getAllStatesJdbcCall21;
	SimpleJdbcCall getAllStatesJdbcCall22;
	SimpleJdbcCall getAllStatesJdbcCall23;
	SimpleJdbcCall getAllStatesJdbcCall24;
	SimpleJdbcCall getAllStatesJdbcCall25;
	SimpleJdbcCall getAllStatesJdbcCall26;
	SimpleJdbcCall getAllStatesJdbcCall27;
	SimpleJdbcCall getAllStatesJdbcCall28;
	SimpleJdbcCall getAllStatesJdbcCall29;
	SimpleJdbcCall getAllStatesJdbcCall30;

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

	SimpleJdbcCall getAllStatesJdbcCall1000;
	SimpleJdbcCall getAllStatesJdbcCall1001;
	SimpleJdbcCall getAllStatesJdbcCall1002;
	SimpleJdbcCall getAllStatesJdbcCall1003;
	SimpleJdbcCall getAllStatesJdbcCall1004;
	SimpleJdbcCall getAllStatesJdbcCall1063;
	SimpleJdbcCall getAllStatesJdbcCall1064;
	SimpleJdbcCall getAllStatesJdbcCall1065;
	SimpleJdbcCall getAllStatesJdbcCall1066;
	SimpleJdbcCall getAllStatesJdbcCall1067;
	SimpleJdbcCall getAllStatesJdbcCall1068;
	SimpleJdbcCall getAllStatesJdbcCall1069;
	SimpleJdbcCall getAllStatesJdbcCall1070;
	SimpleJdbcCall getAllStatesJdbcCall1071;

	SimpleJdbcCall getAllStatesJdbcCall5000;
	SimpleJdbcCall getAllStatesJdbcCall5001;
	SimpleJdbcCall getAllStatesJdbcCall3000;
	SimpleJdbcCall getAllStatesJdbcCall3001;

	SimpleJdbcCall getAllStatesJdbcCall3002;
	SimpleJdbcCall getAllStatesJdbcCall3003;
	SimpleJdbcCall getAllStatesJdbcCall3004;
	SimpleJdbcCall getAllStatesJdbcCall3005;
	SimpleJdbcCall getAllStatesJdbcCall3006;
	SimpleJdbcCall getAllStatesJdbcCall3007;
	SimpleJdbcCall getAllStatesJdbcCall3008;
	SimpleJdbcCall getAllStatesJdbcCall3009;
	SimpleJdbcCall getAllStatesJdbcCall30010;
	SimpleJdbcCall getAllStatesJdbcCall3015;
	SimpleJdbcCall getAllStatesJdbcCall3016;
	SimpleJdbcCall getAllStatesJdbcCall3017;
	SimpleJdbcCall getAllStatesJdbcCall3018;
	SimpleJdbcCall getAllStatesJdbcCall3019;

	SimpleJdbcCall getAllStatesJdbcCall4000;
	SimpleJdbcCall getAllStatesJdbcCall4001;
	SimpleJdbcCall getAllStatesJdbcCall4002;
	SimpleJdbcCall getAllStatesJdbcCall4003;
	SimpleJdbcCall getAllStatesJdbcCall4004;

	SimpleJdbcCall getAllStatesJdbcCall420;
	SimpleJdbcCall getAllStatesJdbcCall421;
	SimpleJdbcCall getAllStatesJdbcCall422;
	SimpleJdbcCall getAllStatesJdbcCall423;
	SimpleJdbcCall getAllStatesJdbcCall424;
	SimpleJdbcCall getAllStatesJdbcCall425;
	SimpleJdbcCall getAllStatesJdbcCall426;
	SimpleJdbcCall getAllStatesJdbcCall427;
	SimpleJdbcCall getAllStatesJdbcCall428;

	public IConvDao(DataSource dataSource) {
		// TODO Auto-generated method stub
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
		this.getAllStatesJdbcCall10 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall11 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall12 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall13 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall14 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall15 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall16 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall17 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall18 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall19 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall20 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall21 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall22 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall23 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall24 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall25 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall26 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall27 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall28 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall29 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall30 = new SimpleJdbcCall(dataSource);

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

		this.getAllStatesJdbcCall1000 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1001 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1002 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1003 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1004 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1063 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1064 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1065 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1066 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1067 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1068 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1069 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1070 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1071 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall5000 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5001 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3000 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3001 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall3002 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3003 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3004 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3005 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3006 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3007 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3008 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3009 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall30010 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3015 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3016 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3017 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3018 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3019 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall4000 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4001 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4002 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4003 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4004 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall420 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall421 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall422 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall423 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall424 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall425 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall426 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall427 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall428 = new SimpleJdbcCall(dataSource);

	}

	public int insert_usage_cat_code(UsageCatCode usageCatCode) {
		if (usageCatCode.getStatus() == null) {
			usageCatCode.setStatus("0");
		}
		System.out.println(usageCatCode);
		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_USAGE_CAT_CODE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(usageCatCode.getUsageCatCode(), usageCatCode.getUsageCatName(), usageCatCode.getUsageType(),
						usageCatCode.getLineType(), usageCatCode.getAreaCode());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<UsagArea> showAreaName() {
		ArrayList<UsagArea> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall2.withCatalogName("USAGE_INFO").withProcedureName("AREA_NAME")
				.declareParameters(new SqlOutParameter("AREADATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("AREADATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new UsagArea(jsonData.getString("AREA_CODE"), jsonData.getString("AREA_NAME")));
		}
		return showList;
	}

	public ArrayList<LineType> showLine() {
		ArrayList<LineType> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("USAGE_INFO").withProcedureName("LINETYPE")
				.declareParameters(new SqlOutParameter("LINEDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("LINEDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LineType(jsonData.getString("LINE_TYPE"), jsonData.getString("LINE_TYPE_NAME")));
		}
		return showList;
	}

	public ArrayList<ShowUsage> showUsage() {
		ArrayList<ShowUsage> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("USAGE_INFO")
				.withProcedureName("SHOW_USAGE_CAT_CODE")
				.declareParameters(new SqlOutParameter("USAGEDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("USAGEDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ShowUsage(Integer.valueOf(jsonData.getString("USAGE_CAT_ID")),
					jsonData.getString("USAGE_CAT_CODE"), jsonData.getString("USAGE_CAT_NAME"),
					jsonData.getString("USAGE_TYPE"), jsonData.getString("LINE_TYPE_NAME"),
					jsonData.getString("AREA_NAME")));
		}
		return showList;
	}

	public int deleteUsage(int usageCatId) {

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_USAGE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(usageCatId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	String lines;
	String area;

	public ArrayList<EditUsage> editUsage(int useCatId) {
		ArrayList<EditUsage> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall6.withCatalogName("USAGE_INFO").withProcedureName("EDIT_USAGE")
				.declareParameters(new SqlOutParameter("USAGEEDIT", OracleTypes.CURSOR)).execute(useCatId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("USAGEEDIT").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new EditUsage(Integer.valueOf(jsonData.getString("USAGE_CAT_ID")),
					jsonData.getString("USAGE_CAT_CODE"), jsonData.getString("USAGE_CAT_NAME"),
					jsonData.getString("USAGE_TYPE"), jsonData.getString("LINE_TYPE"), jsonData.getString("AREA_CODE"),
					jsonData.getString("LINE_TYPE_NAME"), jsonData.getString("AREA_NAME")));
		}
		lines = showList.get(0).getUsageLineCode();
		area = showList.get(0).getUsageType();

		System.out.println(lines);
		System.out.println(area);

		return showList;
	}

	public int update_usage_cat_code(UsageCatCode usageCatCode, int id) {
		if (usageCatCode.getAreaCode() == null) {
			usageCatCode.setAreaCode(area);
		}

		if (usageCatCode.getLineType() == null) {
			usageCatCode.setLineType(lines);
		}

		Map<String, Object> result = getAllStatesJdbcCall7.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_USAGE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(usageCatCode.getUsageCatCode(), usageCatCode.getUsageCatName(), usageCatCode.getUsageType(),
						usageCatCode.getLineType(), usageCatCode.getAreaCode(), id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<LocationShow> locationShow() {
		ArrayList<LocationShow> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall8.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_LOCATION_MASTER_LIST")
				.declareParameters(new SqlOutParameter("LOCDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("LOCDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LocationShow(Integer.valueOf(jsonData.getString("LOCATION_ID")),
					jsonData.getString("LOCATION_CODE"), jsonData.getString("LOCATION_NAME"),
					jsonData.getString("STATUS")));
		}
		return showList;
	}

	public int insert_location_master(LocationInsert locationInsert) {
		if (locationInsert.getStatus() == null) {
			locationInsert.setStatus("A");
		}

		Map<String, Object> result = getAllStatesJdbcCall9.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_LOCATION_MASTER")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(
						locationInsert.getLocationCode(), locationInsert.getLocationName(), locationInsert.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public int deleteLocation(int locationId) {

		Map<String, Object> result = getAllStatesJdbcCall10.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_LOCATION_MASTER")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(locationId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<LocationInsert> locationEdit(int locationId) {
		ArrayList<LocationInsert> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall11.withCatalogName("USAGE_INFO")
				.withProcedureName("EDIT_LOCATION")
				.declareParameters(new SqlOutParameter("LOCEDIT", OracleTypes.CURSOR)).execute(locationId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("LOCEDIT").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LocationInsert(jsonData.getString("LOCATION_CODE"), jsonData.getString("LOCATION_NAME"),
					jsonData.getString("STATUS")));
		}
		return showList;
	}

	public int location_update(LocationInsert locationInsert, int locationId) {
		if (locationInsert.getStatus() == null) {
			locationInsert.setStatus("A");
		}

		Map<String, Object> result = getAllStatesJdbcCall12.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_LOCATION")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(locationInsert.getLocationCode(), locationInsert.getLocationName(), locationInsert.getStatus(),
						locationId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<Area> areaShow() {
		ArrayList<Area> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall13.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_GEN_AREA_LIST")
				.declareParameters(new SqlOutParameter("AREADATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("AREADATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new Area(jsonData.getString("GEN_AREA_CODE"), jsonData.getString("GEN_AREA_NAME"),
					jsonData.getString("STATUS"), Integer.valueOf(jsonData.getString("GEN_AREA_ID"))));
		}
		return showList;
	}

	public int insert_area(LocationInsert locationInsert) {
		if (locationInsert.getStatus() == null) {
			locationInsert.setStatus("C");
		}
		System.out.println(locationInsert);

		Map<String, Object> result = getAllStatesJdbcCall14.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_GEN_AREA")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(
						locationInsert.getLocationCode(), locationInsert.getLocationName(), locationInsert.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		System.out.println(val);
		return val;
	}

	public int deleteArea(int areaId) {

		Map<String, Object> result = getAllStatesJdbcCall15.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_GEN_AREA")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(areaId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<LocationInsert> areaEdit(int areaId) {
		ArrayList<LocationInsert> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall16.withCatalogName("USAGE_INFO")
				.withProcedureName("EDIT_IC_GEN_AREA")
				.declareParameters(new SqlOutParameter("AREAEDIT", OracleTypes.CURSOR)).execute(areaId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("AREAEDIT").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LocationInsert(jsonData.getString("GEN_AREA_CODE"), jsonData.getString("GEN_AREA_NAME"),
					jsonData.getString("STATUS")));
		}
		return showList;
	}

	public int areaUpdate(LocationInsert locationInsert, int areaId) {
		if (locationInsert.getStatus() == null) {
			locationInsert.setStatus("A");
		}

		Map<String, Object> result = getAllStatesJdbcCall17.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_GEN_AREA")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(locationInsert.getLocationCode(), locationInsert.getLocationName(), locationInsert.getStatus(),
						areaId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

//	public ArrayList<IC_POWER_PLANTmain> powerPlantShow() {
//		ArrayList<IC_POWER_PLANTmain> showList = new ArrayList<>();
//
//		Map<String, Object> result = getAllStatesJdbcCall18.withCatalogName("USAGE_INFO")
//				.withProcedureName("IC_POWER_PLANT_LIST")
//				.declareParameters(new SqlOutParameter("PLANTDATA", OracleTypes.CURSOR)).execute();
//
//		JSONObject json = new JSONObject(result);
//		String jesonString = json.get("PLANTDATA").toString();
//		JSONArray jsonArray = new JSONArray(jesonString);
//
//		for (int i = 0; i < jsonArray.length(); i++) {
//			JSONObject jsonData = jsonArray.getJSONObject(i);
//			showList.add(new IC_POWER_PLANTmain(jsonData.getString("PP_CODE"), jsonData.getString("PP_NAME"),
//					Integer.valueOf(jsonData.getString("NO_OF_UNIT")),
//					Double.valueOf(jsonData.getString("INSTALLED_CAPACITY")),
//					Double.valueOf(jsonData.getString("MAX_CAPACITY")), jsonData.getString("GRID_CODE"),
//					jsonData.getString("GRID_DESC"), jsonData.getString("STATUS"), jsonData.getString("OWNER_CODE"),
//					jsonData.getString("OWNER_NAME"), jsonData.getString("SHORT_NAME"),
//					jsonData.getString("GEN_AREA_CODE"), jsonData.getString("GEN_AREA_NAME"),
//					Integer.valueOf(jsonData.getString("PP_ID"))));
//		}
//		return showList;
//	}

	public ArrayList<GenArea> genAreaLists() {
		ArrayList<GenArea> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall19.withCatalogName("USAGE_INFO")
				.withProcedureName("GENAREALIST").declareParameters(new SqlOutParameter("GENAREA", OracleTypes.CURSOR))
				.execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("GENAREA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new GenArea(jsonData.getString("GEN_AREA_CODE"), jsonData.getString("GEN_AREA_NAME")));
		}
		return showList;
	}

	public ArrayList<PPOwnerList> ppOwnerLists() {
		ArrayList<PPOwnerList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall20.withCatalogName("USAGE_INFO")
				.withProcedureName("PPOWNERLIST").declareParameters(new SqlOutParameter("PODATA", OracleTypes.CURSOR))
				.execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PODATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PPOwnerList(jsonData.getString("OWNER_CODE"), jsonData.getString("OWNER_NAME")));
		}
		return showList;
	}

	public ArrayList<GridList> gridLists() {
		ArrayList<GridList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall21.withCatalogName("USAGE_INFO").withProcedureName("GRIDLIST")
				.declareParameters(new SqlOutParameter("GRIDDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("GRIDDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new GridList(jsonData.getString("GRID_CODE"), jsonData.getString("GRID_DESC")));
		}
		return showList;
	}

//	public int insert_power_plant(PowerPlantInsert powerPlantInsert) {
//		if (powerPlantInsert.getStatus() == null) {
//			powerPlantInsert.setStatus("C");
//		}
//
//		Map<String, Object> result = getAllStatesJdbcCall22.withCatalogName("USAGE_INFO")
//				.withProcedureName("INSERT_IC_POWER_PLANT")
//				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
//				.execute(powerPlantInsert.getPowerPointCode(), powerPlantInsert.getPowerPointName(),
//						powerPlantInsert.getNoOfUnit(), powerPlantInsert.getInstallenCapacity(),
//						powerPlantInsert.getGridCode(), powerPlantInsert.getOwnerCode(),
//						powerPlantInsert.getGenAreaCode(), powerPlantInsert.getMaxCapacity(),
//						powerPlantInsert.getShortName(), powerPlantInsert.getStatus());
//
//		JSONObject json = new JSONObject(result);
//		int val = Integer.valueOf(json.get("OUTPUT").toString());
//		return val;
//	}

//	public ArrayList<IC_POWER_PLANTmain> powerPlantEdits(String ppCode) {
//		ArrayList<IC_POWER_PLANTmain> showList = new ArrayList<>();
//
//		Map<String, Object> result = getAllStatesJdbcCall23.withCatalogName("USAGE_INFO")
//				.withProcedureName("IC_POWER_PLANT_EDIT")
//				.declareParameters(new SqlOutParameter("PPDATA", OracleTypes.CURSOR)).execute(ppCode);
//
//		JSONObject json = new JSONObject(result);
//		String jesonString = json.get("PPDATA").toString();
//		JSONArray jsonArray = new JSONArray(jesonString);
//
//		for (int i = 0; i < jsonArray.length(); i++) {
//			JSONObject jsonData = jsonArray.getJSONObject(i);
//			showList.add(new IC_POWER_PLANTmain(jsonData.getString("PP_CODE"), jsonData.getString("PP_NAME"),
//					Integer.valueOf(jsonData.getString("NO_OF_UNIT")),
//					Double.valueOf(jsonData.getString("INSTALLED_CAPACITY")),
//					Double.valueOf(jsonData.getString("MAX_CAPACITY")), jsonData.getString("GRID_CODE"),
//					jsonData.getString("GRID_DESC"), jsonData.getString("STATUS"), jsonData.getString("OWNER_CODE"),
//					jsonData.getString("OWNER_NAME"), jsonData.getString("SHORT_NAME"),
//					jsonData.getString("GEN_AREA_CODE"), jsonData.getString("GEN_AREA_NAME"),
//					Integer.valueOf(jsonData.getString("PP_ID"))));
//		}
//		return showList;
//	}

//	public int update_power_plant(PowerPlantInsert powerPlantInsert, String id, String genACode, String OwnerCode,
//			String gridCode) {
//		if (powerPlantInsert.getStatus() == null) {
//			powerPlantInsert.setStatus("YES");
//		}
//		if (powerPlantInsert.getGenAreaCode() == null) {
//			powerPlantInsert.setGenAreaCode(genACode);
//		}
//		if (powerPlantInsert.getOwnerCode() == null) {
//			powerPlantInsert.setOwnerCode(OwnerCode);
//		}
//		if (powerPlantInsert.getGridCode() == null) {
//			powerPlantInsert.setGridCode(gridCode);
//		}
//
//		Map<String, Object> result = getAllStatesJdbcCall24.withCatalogName("USAGE_INFO")
//				.withProcedureName("UPDATE_IC_POWER_PLANT")
//				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
//				.execute(powerPlantInsert.getPowerPointName(), powerPlantInsert.getNoOfUnit(),
//						powerPlantInsert.getInstallenCapacity(), powerPlantInsert.getGridCode(),
//						powerPlantInsert.getOwnerCode(), powerPlantInsert.getGenAreaCode(),
//						powerPlantInsert.getMaxCapacity(), powerPlantInsert.getShortName(),
//						powerPlantInsert.getStatus(), id);
//
//		JSONObject json = new JSONObject(result);
//		int val = Integer.valueOf(json.get("OUTPUT").toString());
//		return val;
//	}

	public int deletePowerPoint(String ppCode) {

		Map<String, Object> result = getAllStatesJdbcCall25.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_POWER_PLANT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(ppCode);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<DemandPhaseList> demandPhaseLists() {
		ArrayList<DemandPhaseList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall26.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_DEMAND_PHASE_MST_LIST")
				.declareParameters(new SqlOutParameter("DEMANDDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("DEMANDDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new DemandPhaseList(jsonData.getString("DP_CODE"), jsonData.getString("DEMAND_PHASE"),
					Integer.valueOf(jsonData.getString("SRL_NO")), jsonData.getString("STATUS"),
					Integer.valueOf(jsonData.getString("DP_ID"))));
		}

		return showList;
	}

	public int demandPhaseInsert(DemandPhaseInsert demandPhaseInsert) {
		if (demandPhaseInsert.getStatus() == null) {
			demandPhaseInsert.setStatus("YES");
		}
		System.out.println(demandPhaseInsert);

		Map<String, Object> result = getAllStatesJdbcCall27.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_DEMAND_PHASE_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(demandPhaseInsert.getDpCode(), demandPhaseInsert.getDemandPhase(),
						demandPhaseInsert.getSrlNo(), demandPhaseInsert.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<DemandPhaseList> demandPhaseEdit(String demandCode) {
		ArrayList<DemandPhaseList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall28.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_DEMAND_PHASE_MST_EDIT")
				.declareParameters(new SqlOutParameter("DPMDATA", OracleTypes.CURSOR)).execute(demandCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("DPMDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new DemandPhaseList(jsonData.getString("DP_CODE"), jsonData.getString("DEMAND_PHASE"),
					Integer.valueOf(jsonData.getString("SRL_NO")), jsonData.getString("STATUS"),
					Integer.valueOf(jsonData.getString("DP_ID"))));
		}
		return showList;
	}

	public int demandPhaseUpdate(DemandPhaseInsert demandPhaseInsert) {
		if (demandPhaseInsert.getStatus() == null) {
			demandPhaseInsert.setStatus("YES");
		}

		Map<String, Object> result = getAllStatesJdbcCall29.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_DEMAND_PHASE_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(demandPhaseInsert.getDemandPhase(), demandPhaseInsert.getSrlNo(),
						demandPhaseInsert.getStatus(), demandPhaseInsert.getDpCode());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public int deleteDemandPhase(String demandCode) {
		Map<String, Object> result = getAllStatesJdbcCall30.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_DEMAND_PHASE_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(demandCode);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<ActivityList> activityListShow() {
		ArrayList<ActivityList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall10.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_ACTIVITY_MST_LIST")
				.declareParameters(new SqlOutParameter("ACTIVITYDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("ACTIVITYDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ActivityList(Integer.valueOf(jsonData.getString("ACTIVITY_ID")),
					jsonData.getString("ACTIVITY_CODE"), jsonData.getString("ACTIVITY_NAME"),
					jsonData.getString("STATUS")));
		}
		return showList;
	}

	public int insert_activity(ActivityInsert activityInsert) {
		if (activityInsert.getStatus() == null) {
			activityInsert.setStatus("C");
		}
		Map<String, Object> result = getAllStatesJdbcCall11.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_ACTIVITY_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(
						activityInsert.getActivityCode(), activityInsert.getActivityName(), activityInsert.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<ActivityInsert> activityedit(int activityId) {
		ArrayList<ActivityInsert> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall12.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_ACTIVITY_MST_EDIT")
				.declareParameters(new SqlOutParameter("ACTIDATA", OracleTypes.CURSOR)).execute(activityId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("ACTIDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ActivityInsert(jsonData.getString("ACTIVITY_CODE"), jsonData.getString("ACTIVITY_NAME"),
					jsonData.getString("STATUS")));
		}
		return showList;
	}

	public int updateActivity(ActivityInsert activityInsert, int activityId) {
		if (activityInsert.getStatus() == null) {
			activityInsert.setStatus("C");
		}
		Map<String, Object> result = getAllStatesJdbcCall13.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_ACTIVITY_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(activityInsert.getActivityCode(), activityInsert.getActivityName(), activityInsert.getStatus(),
						activityId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public int deleteActivity(int activityId) {

		Map<String, Object> result = getAllStatesJdbcCall14.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_ACTIVITY_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(activityId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<PeriodList> periodListShow() {
		ArrayList<PeriodList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall55.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IC_PERIOD_MST")
				.declareParameters(new SqlOutParameter("PEROPDDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PEROPDDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PeriodList(jsonData.getString("YEAR_CODE"), jsonData.getString("PERIOD_CODE"),
					jsonData.getString("PERIOD_DESC"), jsonData.getString("FROM_DATE"), jsonData.getString("TO_DATE"),
					jsonData.getString("STATUS"), Integer.valueOf(jsonData.getString("PR_ID"))));
		}

		return showList;
	}

	public ArrayList<IppPaymentList> ippPaymentList(String billCycleCode, String ppCode) {
		ArrayList<IppPaymentList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall56.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IPP_PAYMENT_LIST")
				.declareParameters(new SqlOutParameter("PAYDATA", OracleTypes.CURSOR)).execute(billCycleCode, ppCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PAYDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IppPaymentList(jsonData.getString("BILL_CYCLE_CODE"), jsonData.getString("PP_CODE"),
					jsonData.getString("PP_NAME"), jsonData.getString("ENRG_PURCHASED"),
					jsonData.getString("PAY_AMOUNT"), jsonData.getString("PAY_DATE"),
					Integer.valueOf(jsonData.getString("IPP_PAY_ID")), jsonData.getString("STATUS")));
		}
		return showList;
	}

	public ArrayList<PowerPlantDropdown> pppDropdown(String billCycleCode) {
		ArrayList<PowerPlantDropdown> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall57.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IPP_POWER_PLANT_DROPDOWN")
				.declareParameters(new SqlOutParameter("PDDATA", OracleTypes.CURSOR)).execute(billCycleCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PDDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PowerPlantDropdown(jsonData.getString("PP_CODE"), jsonData.getString("PP_NAME")));
		}

		return showList;
	}

	public int insertPppPayment(InsertIppPayment insertIppPayment) {
		if (insertIppPayment.getStatus() == null) {
			insertIppPayment.setStatus("C");
		}
		System.out.println("tHIUS" + insertIppPayment);

		Map<String, Object> result = getAllStatesJdbcCall58.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IPP_PAYMENT_LIST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insertIppPayment.getBillCycleCode(), insertIppPayment.getPpCode(),
						insertIppPayment.getEngrPurchased(), insertIppPayment.getPayAmount(),
						insertIppPayment.getPayDate(), insertIppPayment.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<PpModList> ppModListListShow(String periodCode) {
		ArrayList<PpModList> ppModList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall59.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_MOD_DATA").declareParameters(new SqlOutParameter("MODATA", OracleTypes.CURSOR))
				.execute(periodCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("MODATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			ppModList.add(new PpModList(Integer.valueOf(jsonData.getString("PP_MOD_ID")),
					jsonData.getString("BILL_CYCLE_CODE"), jsonData.getString("STATUS"), jsonData.getString("PP_CODE"),
					jsonData.getString("PP_NAME")));
		}
		return ppModList;
	}

	public int insertPpMod(InsertPpMod insertPpMod) {
		System.out.println("This is in the dao " + insertPpMod);
		Map<String, Object> result = getAllStatesJdbcCall60.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_PP_MOD")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insertPpMod.getBillCycleCode(), insertPpMod.getPpCode(), insertPpMod.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public int deleteIcPpPayment(int id) {

		Map<String, Object> result = getAllStatesJdbcCall61.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_IPP_PAYMENT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<IcPpPaymentEdit> icPaymentEdit(int iPpPayId) {
		ArrayList<IcPpPaymentEdit> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall62.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IPP_PAYMENT_EDIT")
				.declareParameters(new SqlOutParameter("PAYMENTDATA", OracleTypes.CURSOR)).execute(iPpPayId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PAYMENTDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IcPpPaymentEdit(jsonData.getString("BILL_CYCLE_CODE"), jsonData.getString("PP_NAME"),
					jsonData.getString("ENRG_PURCHASED"), Integer.valueOf(jsonData.getString("PAY_AMOUNT")),
					jsonData.getString("STATUS")));
		}

		return showList;
	}

	public int updatePayment(IcPpPaymentEdit icPpPaymentEdit, int payId) {
		if (icPpPaymentEdit.getStatus() == null) {
			icPpPaymentEdit.setStatus("C");
		}
		Map<String, Object> result = getAllStatesJdbcCall63.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_IPP_PAYMENT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(icPpPaymentEdit.getPayAmount(), icPpPaymentEdit.getEnrgPuchansed(),
						icPpPaymentEdit.getStatus(), payId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<PowerPlantDropdown> ppDropdown(String billCycleCode) {
		ArrayList<PowerPlantDropdown> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall64.withCatalogName("USAGE_INFO")
				.withProcedureName("IPP_POWER_PLANT_DROP")
				.declareParameters(new SqlOutParameter("PDDATAS", OracleTypes.CURSOR)).execute(billCycleCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PDDATAS").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PowerPlantDropdown(jsonData.getString("PP_CODE"), jsonData.getString("PP_NAME")));
		}

		return showList;
	}

	public ArrayList<PpModEdit> ppModEdit(int ppModId) {
		ArrayList<PpModEdit> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall65.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_PP_MOD_EDIT")
				.declareParameters(new SqlOutParameter("EMODDATA", OracleTypes.CURSOR)).execute(ppModId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("EMODDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PpModEdit(jsonData.getString("BILL_CYCLE_CODE"), jsonData.getString("PP_CODE"),
					jsonData.getString("PP_NAME")));
		}

		return showList;
	}

	public int updatePpMod(InsertPpMod insertPpMod, String pp_code, int id) {
		if (insertPpMod.getPpCode() == null) {
			insertPpMod.setPpCode(pp_code);
		}
		Map<String, Object> result = getAllStatesJdbcCall66.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_PP_MOD")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insertPpMod.getBillCycleCode(), insertPpMod.getPpCode(), id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<PpUnitDtlDrop> ppUnitDropdown(String ppCode) {
		ArrayList<PpUnitDtlDrop> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall67.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_PP_UNIT_DTL_DROP")
				.declareParameters(new SqlOutParameter("UNITDILDATA", OracleTypes.CURSOR)).execute(ppCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("UNITDILDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PpUnitDtlDrop(jsonData.getString("PP_UNIT_CODE"), jsonData.getString("PP_UNIT_NAME")));
		}

		return showList;
	}

	public ArrayList<UnitModList> UnitModShow(String billCycleCode, String ppCode) {
		ArrayList<UnitModList> ppModList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall68.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_PP_UNIT_MOD_LIST")
				.declareParameters(new SqlOutParameter("UNDATA", OracleTypes.CURSOR)).execute(billCycleCode, ppCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("UNDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			ppModList.add(new UnitModList(jsonData.getString("BILL_CYCLE_CODE"), jsonData.getString("PP_CODE"),
					jsonData.getString("PP_NAME"), jsonData.getString("PP_UNIT_CODE"),
					jsonData.getString("PP_UNIT_NAME"), Integer.valueOf(jsonData.getString("ENRG_GEN")),
					Integer.valueOf(jsonData.getString("ENRG_CONS_SELF")),
					Integer.valueOf(jsonData.getString("FUEL_USED")),
					Integer.valueOf(jsonData.getString("PP_UNIT_MOD_ID"))));
		}
		return ppModList;
	}

	public int insertUnitMod(UnitModInset unitModInset) {
		if (unitModInset.getStatus() == null) {
			unitModInset.setStatus("C");
		}

		Map<String, Object> result = getAllStatesJdbcCall69.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IPP_UNIT_MOD_LIST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(unitModInset.getBillCycleCode(), unitModInset.getPpUnitCode(), unitModInset.getEnrgGen(),
						unitModInset.getEnrgConsSelf(), unitModInset.getStatus(), unitModInset.getFuelUsed(),
						unitModInset.getPpCode());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<UnirmodEdit> ppUnitEdit(int ppUnitModId) {
		ArrayList<UnirmodEdit> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall70.withCatalogName("USAGE_INFO")
				.withProcedureName("PP_UNIT_CODE_EDIT")
				.declareParameters(new SqlOutParameter("UNCODATA", OracleTypes.CURSOR)).execute(ppUnitModId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("UNCODATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new UnirmodEdit(jsonData.getString("PP_UNIT_CODE"), jsonData.getString("PP_UNIT_NAME"),
					Integer.valueOf(jsonData.getString("ENRG_GEN")),
					Integer.valueOf(jsonData.getString("ENRG_CONS_SELF")),
					Integer.valueOf(jsonData.getString("FUEL_USED")),
					Integer.valueOf(jsonData.getString("PP_UNIT_MOD_ID"))));
		}

		return showList;
	}

	public int updatePpModUnit(UnitModInset unitModInset, String ppUnitCode, int id) {
		if (unitModInset.getPpUnitCode() == null) {
			unitModInset.setPpUnitCode(ppUnitCode);
		}
		Map<String, Object> result = getAllStatesJdbcCall71.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_PP_UNIT_MOD")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(unitModInset.getPpUnitCode(), unitModInset.getEnrgGen(), unitModInset.getEnrgConsSelf(),
						unitModInset.getFuelUsed(), id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<IC_REV_PER_ZONE> listIC_REV_PER_ZONE(String officeCode, String one, String two) {
		ArrayList<IC_REV_PER_ZONE> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall1000.withCatalogName("pkg_Revenue_Report")
				.withProcedureName("dpd_Zone_wize_performance")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, one, two);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_REV_PER_ZONE(jsonData.getString("TP"), jsonData.getString("ZONE_NAME"),
					jsonData.getString("ZC_NAME"), jsonData.getString("PREV_YEAR"), jsonData.getString("CURR_YEAR"),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("PREV_YR_SL_TARGET"))),
					jsonData.getString("PREV_YR_SL_ACHIVE"), jsonData.getString("PREV_YR_SL_UPTO"),
					jsonData.getString("CURR_YR_SL_TARGET"), jsonData.getString("CURR_MONTH_SL"),
					jsonData.getString("CURR_YR_SL_UPTO"),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("CURR_YR_CI_TARGET"))),
					jsonData.getString("CURR_YR_CI_UPTO"),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("PREV_YR_REC"))),
					jsonData.getString("PREV_YR_EQM"),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("CURR_MONTH_REC"))),
					jsonData.getString("CURR_MONTH_EQM"), jsonData.getString("PREV_YR_MON"),
					jsonData.getString("CURR_YR_MON"), jsonData.getString("PREV_FIN_LAST_MONTH")));
		}
		return showList;
	}

	public ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> listIC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON(String officeCode,
			String two) {
		ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall5000.withCatalogName("pkg_ES_circle_wise_com_stat")
				.withProcedureName("dpd_circle_wise_com_stat")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON(jsonData.getString("TP1"),
					jsonData.getString("ZONE_NAME"), jsonData.getString("TP2"), jsonData.getString("CIRCLE_NAME"),
					jsonData.getString("NO_OF_ACTIVE_CONS"), jsonData.getString("IMPORT_MKWH"),
					jsonData.getString("SALE_MKWH"), jsonData.getString("DIST_SYS_LOSS"), "",
					jsonData.getString("NET_BILL_MTK"), jsonData.getString("NET_COLL_MTK"),
					jsonData.getString("CB_RATIO"), jsonData.getString("CI_RATIO"), jsonData.getString("BILL_RATE"),
					jsonData.getString("REC_AMT"), jsonData.getString("EQM")));
		}
		return showList;
	}

	public ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> listIC_ES_Z_C_COM_OPR_STAT_BPDB_FY(String officeCode,
			String two) {
		ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall5001.withCatalogName("pkg_ES_circle_wise_com_st_upto")
				.withProcedureName("dpd_circle_wise_com_stat_upto")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON(jsonData.getString("TP1"),
					jsonData.getString("ZONE_NAME"), jsonData.getString("TP2"), jsonData.getString("CIRCLE_NAME"),
					jsonData.getString("NO_OF_ACTIVE_CONS"), jsonData.getString("IMPORT_MKWH"),
					jsonData.getString("SALE_MKWH"), jsonData.getString("DIST_SYS_LOSS"), "",
					jsonData.getString("NET_BILL_MTK"), jsonData.getString("NET_COLL_MTK"),
					jsonData.getString("CB_RATIO"), jsonData.getString("CI_RATIO"), jsonData.getString("BILL_RATE"),
					jsonData.getString("REC_AMT"), jsonData.getString("EQM")));
		}
		return showList;
	}

	public ArrayList<IC_REV_PER_ZONE> listIC_REV_PER_CIRCLE(String officeCode, String one, String two) {
		ArrayList<IC_REV_PER_ZONE> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall1001.withCatalogName("pkg_Revenue_Report")
				.withProcedureName("dpd_circle_wize_performance")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, one, two);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_REV_PER_ZONE(jsonData.getString("TP"), jsonData.getString("CIRCLE_NAME"),
					jsonData.getString("CL_NAME"), jsonData.getString("PREV_YEAR"), jsonData.getString("CURR_YEAR"),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("PREV_YR_SL_TARGET"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("PREV_YR_SL_ACHIVE"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("PREV_YR_SL_UPTO"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("CURR_YR_SL_TARGET"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("CURR_MONTH_SL"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("CURR_YR_SL_UPTO"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("CURR_YR_CI_TARGET"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("CURR_YR_CI_UPTO"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("PREV_YR_REC"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("PREV_YR_EQM"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("CURR_MONTH_REC"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.getString("CURR_MONTH_EQM"))), "", "", ""));
		}
		return showList;
	}

	public ArrayList<IC_CIRCLE_MST> getCircleList(String officeCode, String id) {

		ArrayList<IC_CIRCLE_MST> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall1003.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_circle").declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(id, officeCode);
		JSONObject j = new JSONObject(c);
		String d = j.get("CUR_DATA").toString();
		JSONArray e = new JSONArray(d);

		for (int i = 0; i < e.length(); i++) {
			JSONObject f = e.getJSONObject(i);
			b.add(new IC_CIRCLE_MST(f.getString("CIRCLE_CODE"), f.getString("CIRCLE_NAME")));
		}
		return b;
	}

	public ArrayList<IC_REV_PER_DIV_MODEL> listIC_REV_PER_DIV(String officeCode, String one, String two) {
		ArrayList<IC_REV_PER_DIV_MODEL> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall1004.withCatalogName("pkg_Revenue_Report")
				.withProcedureName("dpd_Sector_wise_rec")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, one, two);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);

			showList.add(new IC_REV_PER_DIV_MODEL(jsonData.getString("TP"), jsonData.getString("CIRCLE_NAME"),
					jsonData.getString("CL_NAME"), jsonData.getString("REC_GOVT"), jsonData.getString("EQM_GOVT"),
					jsonData.getString("REC_AUTO"), jsonData.getString("EQM_AUTO"), jsonData.getString("REC_PRIV"),
					jsonData.getString("REC_TOT"), jsonData.getString("EQM_TOT")));
		}
		return showList;
	}

	public ArrayList<IC_REV_CAT_ACC_REC_MODEL> listIC_REV_CAT_ACC_REC_MODEL(String officeCode, String one, String two) {
		ArrayList<IC_REV_CAT_ACC_REC_MODEL> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall1002.withCatalogName("pkg_Revenue_Report")
				.withProcedureName("dpd_cat_wise_rec")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, one, two);
		// System.out.println(result);
		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_REV_CAT_ACC_REC_MODEL(jsonData.getString("TP"), jsonData.getString("CIRCLE_NAME"),
					jsonData.getString("CL_NAME"), jsonData.getString("REC_LTA"), jsonData.getString("EQM_LTA"),
					jsonData.getString("REC_LTB"), jsonData.getString("EQM_LTB"), jsonData.getString("REC_LTC1"),
					jsonData.getString("EQM_LTC1"), jsonData.getString("REC_LTD1"), jsonData.getString("EQM_LTD1"),
					jsonData.getString("REC_LTD2"), jsonData.getString("EQM_LTD2"), jsonData.getString("REC_LTE"),
					jsonData.getString("EQM_LTE"), jsonData.getString("REC_MT2"), jsonData.getString("EQM_MT2"),
					jsonData.getString("REC_MT3"), jsonData.getString("EQM_MT3"), jsonData.getString("REC_MT5"),
					jsonData.getString("EQM_MT5"), jsonData.getString("REC_TOT"), jsonData.getString("EQM_TOT")));
		}
		return showList;
	}

	public ArrayList<Month_Dropdown> months(String officeCode) {
		ArrayList<Month_Dropdown> monthDropdown = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall1063.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_bill_cycle")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode);

		JSONObject json = new JSONObject(result);
		String jsonString = json.get("CUR_DATA").toString();
		JSONArray e = new JSONArray(jsonString);
		for (int i = 0; i < e.length(); i++) {
			JSONObject obj = e.getJSONObject(i);
			monthDropdown.add(new Month_Dropdown(obj.getString("BILL_CYCLE_CODE"), obj.getString("BILL_CYCLE_DESC")));
		}
		return monthDropdown;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_K> listIC_ES_CAT_ACC_REC(String month) {
		ArrayList<IC_ES_CAT_ACC_REC_K> iC_ES_CAT_ACC_REC_K = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall64.withCatalogName("pkg_ES_cat_wise_bill")
				.withProcedureName("dpd_cat_wise_bill_upto1617")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				iC_ES_CAT_ACC_REC_K.add(new IC_ES_CAT_ACC_REC_K(jsonData.getString("YEAR_CODE"),
						jsonData.getString("REC_A"), jsonData.getString("REC_B"), jsonData.getString("REC_C"),
						jsonData.getString("REC_D"), jsonData.getString("REC_E"), jsonData.getString("REC_F"),
						jsonData.getString("REC_J"), jsonData.getString("REC_G1"), jsonData.getString("REC_G2"),
						jsonData.getString("REC_G3"), jsonData.getString("REC_H"), jsonData.getString("REC_I1"),
						jsonData.getString("REC_I2"), jsonData.getString("REC_I3"), jsonData.getString("REC_I5"),
						jsonData.getString("REC_DESA"), jsonData.getString("TOTAL")));
			}
		}

		System.out.println(iC_ES_CAT_ACC_REC_K);

		return iC_ES_CAT_ACC_REC_K;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_KK> listIC_ES_CAT_ACC_REC2(String month) {
		ArrayList<IC_ES_CAT_ACC_REC_KK> iC_ES_CAT_ACC_REC_KK = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall65.withCatalogName("pkg_ES_cat_wise_bill")
				.withProcedureName("dpd_cat_wise_bill_from1718")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				iC_ES_CAT_ACC_REC_KK.add(new IC_ES_CAT_ACC_REC_KK(jsonData.getString("YRMON"),
						jsonData.getString("REC_LTA"), jsonData.getString("REC_LTB"), jsonData.getString("REC_LTC1"),
						jsonData.getString("REC_LTC2"), jsonData.getString("REC_LTD1"), jsonData.getString("REC_LTD3"),
						jsonData.getString("REC_LTE"), jsonData.getString("REC_LTT"), jsonData.getString("REC_MT1"),
						jsonData.getString("REC_MT2"), jsonData.getString("REC_MT3"), jsonData.getString("REC_MT4"),
						jsonData.getString("REC_MT5"), jsonData.getString("REC_MT6"), jsonData.getString("REC_EHT1"),
						jsonData.getString("REC_EHT2"), jsonData.getString("REC_HT1"), jsonData.getString("REC_HT2"),
						jsonData.getString("REC_HT3"), jsonData.getString("REC_HT4"), jsonData.getString("REC_LTD2"),
						jsonData.getString("REC_G1"), jsonData.getString("REC_I1"), jsonData.getString("REC_I2"),
						jsonData.getString("REC_I3"), jsonData.getString("REC_I5"), jsonData.getString("REC_DESA"),
						jsonData.getString("TOTAL")));
			}
		}

		return iC_ES_CAT_ACC_REC_KK;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_K> listIC_ES_CAT_BILL_AMT(String month) {
		ArrayList<IC_ES_CAT_ACC_REC_K> iC_ES_CAT_ACC_REC_K = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall66.withCatalogName("pkg_ES_cat_wise_Bill_AMT")
				.withProcedureName("dpd_cat_wise_Bill_AMT_upto1617")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				iC_ES_CAT_ACC_REC_K.add(new IC_ES_CAT_ACC_REC_K(jsonData.getString("YEAR_CODE"),
						jsonData.getString("REC_A"), jsonData.getString("REC_B"), jsonData.getString("REC_C"),
						jsonData.getString("REC_D"), jsonData.getString("REC_E"), jsonData.getString("REC_F"),
						jsonData.getString("REC_J"), jsonData.getString("REC_G1"), jsonData.getString("REC_G2"),
						jsonData.getString("REC_G3"), jsonData.getString("REC_H"), jsonData.getString("REC_I1"),
						jsonData.getString("REC_I2"), jsonData.getString("REC_I3"), jsonData.getString("REC_I5"),
						jsonData.getString("REC_DESA"), jsonData.getString("TOTAL")));
			}
		}

		return iC_ES_CAT_ACC_REC_K;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_KK> listIC_ES_CAT_BILL_AMT2(String month) {
		ArrayList<IC_ES_CAT_ACC_REC_KK> iC_ES_CAT_ACC_REC_KK = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall67.withCatalogName("pkg_ES_cat_wise_Bill_AMT")
				.withProcedureName("dpd_cat_wise_Bill_AMT_from1718")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				iC_ES_CAT_ACC_REC_KK.add(new IC_ES_CAT_ACC_REC_KK(jsonData.getString("YRMON"),
						jsonData.getString("REC_LTA"), jsonData.getString("REC_LTB"), jsonData.getString("REC_LTC1"),
						jsonData.getString("REC_LTC2"), jsonData.getString("REC_LTD1"), jsonData.getString("REC_LTD3"),
						jsonData.getString("REC_LTE"), jsonData.getString("REC_LTT"), jsonData.getString("REC_MT1"),
						jsonData.getString("REC_MT2"), jsonData.getString("REC_MT3"), jsonData.getString("REC_MT4"),
						jsonData.getString("REC_MT5"), jsonData.getString("REC_MT6"), jsonData.getString("REC_EHT1"),
						jsonData.getString("REC_EHT2"), jsonData.getString("REC_HT1"), jsonData.getString("REC_HT2"),
						jsonData.getString("REC_HT3"), jsonData.getString("REC_HT4"), jsonData.getString("REC_LTD2"),
						jsonData.getString("REC_G1"), jsonData.getString("REC_I1"), jsonData.getString("REC_I2"),
						jsonData.getString("REC_I3"), jsonData.getString("REC_I5"), jsonData.getString("REC_DESA"),
						jsonData.getString("TOTAL")));
			}
		}

		return iC_ES_CAT_ACC_REC_KK;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_K> listIC_ES_CAT_BILL_RATE(String month) {
		ArrayList<IC_ES_CAT_ACC_REC_K> iC_ES_CAT_ACC_REC_K = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall68.withCatalogName("pkg_ES_cat_wise_Billrate")
				.withProcedureName("dpd_cat_wise_Billrate_upto1617")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				iC_ES_CAT_ACC_REC_K.add(new IC_ES_CAT_ACC_REC_K(jsonData.getString("YEAR_CODE"),
						jsonData.getString("REC_A"), jsonData.getString("REC_B"), jsonData.getString("REC_C"),
						jsonData.getString("REC_D"), jsonData.getString("REC_E"), jsonData.getString("REC_F"),
						jsonData.getString("REC_J"), jsonData.getString("REC_G1"), jsonData.getString("REC_G2"),
						jsonData.getString("REC_G3"), jsonData.getString("REC_H"), jsonData.getString("REC_I1"),
						jsonData.getString("REC_I2"), jsonData.getString("REC_I3"), jsonData.getString("REC_I5"),
						jsonData.getString("REC_DESA"), jsonData.getString("TOTAL")));
			}
		}

		return iC_ES_CAT_ACC_REC_K;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_KK> listIC_ES_CAT_BILL_RATE2(String month) {
		ArrayList<IC_ES_CAT_ACC_REC_KK> iC_ES_CAT_ACC_REC_KK = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall69.withCatalogName("pkg_ES_cat_wise_Billrate")
				.withProcedureName("dpd_cat_wise_Billrate_from1718")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				iC_ES_CAT_ACC_REC_KK.add(new IC_ES_CAT_ACC_REC_KK(jsonData.getString("YRMON"),
						jsonData.getString("REC_LTA"), jsonData.getString("REC_LTB"), jsonData.getString("REC_LTC1"),
						jsonData.getString("REC_LTC2"), jsonData.getString("REC_LTD1"), jsonData.getString("REC_LTD3"),
						jsonData.getString("REC_LTE"), jsonData.getString("REC_LTT"), jsonData.getString("REC_MT1"),
						jsonData.getString("REC_MT2"), jsonData.getString("REC_MT3"), jsonData.getString("REC_MT4"),
						jsonData.getString("REC_MT5"), jsonData.getString("REC_MT6"), jsonData.getString("REC_EHT1"),
						jsonData.getString("REC_EHT2"), jsonData.getString("REC_HT1"), jsonData.getString("REC_HT2"),
						jsonData.getString("REC_HT3"), jsonData.getString("REC_HT4"), jsonData.getString("REC_LTD2"),
						jsonData.getString("REC_G1"), jsonData.getString("REC_I1"), jsonData.getString("REC_I2"),
						jsonData.getString("REC_I3"), jsonData.getString("REC_I5"), jsonData.getString("REC_DESA"),
						jsonData.getString("TOTAL")));
			}
		}

		return iC_ES_CAT_ACC_REC_KK;
	}

	public ArrayList<DpdBrebStatementDetail> listIC_ES_COM_OPR_STAT_REB(String month) {
		ArrayList<DpdBrebStatementDetail> dpdBrebStatementDetail = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3000.withCatalogName("pkg_ES_BREB_STATEMENT_11_12")
				.withProcedureName("dpd_BREB_STATEMENT_detail")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdBrebStatementDetail.add(new DpdBrebStatementDetail(jsonData.getString("TP"),
						jsonData.getString("LOCATION_NAME"), jsonData.getString("TP2"),
						jsonData.getString("CUSTOMER_NAME"), jsonData.getString("ENRG_UNIT"),
						jsonData.getString("PFC_UNIT"), jsonData.getString("BUS_LOSS"),
						jsonData.getString("TOTAL_UNIT"), jsonData.getString("ENRG_CHARGE"),
						jsonData.getString("PFC_CHARGE"), jsonData.getString("BUS_LOSS_CHARGE"),
						jsonData.getString("TOTAL_BILL"), jsonData.getString("TOTAL_COLL"),
						jsonData.getString("REC_PREV"), jsonData.getString("REC_CURR")));
			}
		}
		return dpdBrebStatementDetail;
	}

	public ArrayList<BrebStatementSummary> listIC_ES_COM_OPR_STAT_REB_two(String month) {
		ArrayList<BrebStatementSummary> brebStatementSummary = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3001.withCatalogName("pkg_ES_BREB_STATEMENT_11_12")
				.withProcedureName("dpd_BREB_STATEMENT_summary")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);

				brebStatementSummary.add(new BrebStatementSummary(jsonData.getString("YRMON"),
						jsonData.getString("ENRGSALE"), jsonData.getString("PFCSALE"), jsonData.getString("BUSSALE"),
						jsonData.getString("TOTENRGSALE"), jsonData.getString("ENRGBILLAMT"),
						jsonData.getString("PFCBILLAMT"), jsonData.getString("BUSBILLAMT"),
						jsonData.getString("TOTBILLAMT"), jsonData.getString("COLL"),
						jsonData.getString("REC_ENRG_PFC"), jsonData.getString("REC_LPS"),
						jsonData.getString("REC_TOT")));
			}
		}
		return brebStatementSummary;
	}

	public ArrayList<IC_PERIOD_MST1> d(String officeCode) {
		ArrayList<IC_PERIOD_MST1> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall3002.withCatalogName("PKG_GEN_DASH_BOARD")
				.withProcedureName("dpd_bill_cycle")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode);

		JSONObject j = new JSONObject(c);
		String d = j.get("CUR_DATA").toString();
		JSONArray e = new JSONArray(d);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_PERIOD_MST1(null, f.getString("BILL_CYCLE_CODE"), f.getString("BILL_CYCLE_DESC"), null));
		}
		return b;
	}

	public ArrayList<DPD_MON_SALE_LOSS_MODEL> IC_ES_YR_MON_SALES_one(String month) {
		ArrayList<DPD_MON_SALE_LOSS_MODEL> dPD_MON_SALE_LOSS_MODEL = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3003.withCatalogName("pkg_ES_yr_mon_gen_sale_loss")
				.withProcedureName("dpd_mon_gen_sale_loss")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);

				dPD_MON_SALE_LOSS_MODEL.add(new DPD_MON_SALE_LOSS_MODEL(jsonData.optString("BILL_CYCLE_CODE"),
						jsonData.optString("TP"), jsonData.optString("OWNER_TYPE"), !jsonData.optString("ENRG_GEN").equals("0")?jsonData.optString("ENRG_GEN"):"",
						!jsonData.optString("NET_GEN").equals("0")?jsonData.optString("NET_GEN"):""
							, !jsonData.optString("AUX_USEF").equals("0")?jsonData.optString("AUX_USEF"):"",
						!jsonData.optString("AUX_USE_PER").equals("0")?jsonData.optString("AUX_USE_PER"):""
							, !jsonData.optString("PDB_ZONE").equals("0")?jsonData.optString("PDB_ZONE"):""
								, !jsonData.optString("DPDC").equals("0")?jsonData.optString("DPDC"):"",
						!jsonData.optString("DESCO").equals("0")?jsonData.optString("DESCO"):"", 
								!jsonData.optString("WZPDCL").equals("0")?jsonData.optString("WZPDCL"):"",
										!jsonData.optString("PBS").equals("0")?jsonData.optString("PBS"):"",
						!jsonData.optString("NESCO").equals("0")?jsonData.optString("NESCO"):"",
								!jsonData.optString("TOTAL_IMPORT").equals("0")?jsonData.optString("TOTAL_IMPORT"):"",
						!jsonData.optString("NON_GRID_GEN").equals("0")?jsonData.optString("NON_GRID_GEN"):"", 
								!jsonData.optString("TRANS_LOSS").equals("0")?jsonData.optString("TRANS_LOSS"):"",
						!jsonData.optString("TRANS_LOSS_PER").equals("0")?jsonData.optString("TRANS_LOSS_PER"):""));
			}
		}
		return dPD_MON_SALE_LOSS_MODEL;
	}

	public ArrayList<DPD_MON_SALE_LOSS_MODEL> IC_ES_YR_MON_SALES_two(String month) {
		ArrayList<DPD_MON_SALE_LOSS_MODEL> dPD_MON_SALE_LOSS_MODEL = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3004.withCatalogName("pkg_ES_yr_mon_gen_sale_loss")
				.withProcedureName("dpd_yr_gen_sale_loss")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);

				dPD_MON_SALE_LOSS_MODEL.add(new DPD_MON_SALE_LOSS_MODEL(jsonData.optString("YEAR_CODE"),
						jsonData.optString("TP"), jsonData.optString("OWNER_TYPE"), !jsonData.optString("ENRG_GEN").equals("0")?jsonData.optString("ENRG_GEN"):"",
						!jsonData.optString("NET_GEN").equals("0")?jsonData.optString("NET_GEN"):"",
								!jsonData.optString("AUX_USEF").equals("0")?jsonData.optString("AUX_USEF"):"",
						!jsonData.optString("AUX_USE_PER").equals("0")?jsonData.optString("AUX_USE_PER"):"",
								!jsonData.optString("PDB_ZONE").equals("0")?jsonData.optString("PDB_ZONE"):"",
										!jsonData.optString("DPDC").equals("0")?jsonData.optString("DPDC"):"",												
						!jsonData.optString("DESCO").equals("0")?jsonData.optString("DESCO"):"",
								!jsonData.optString("WZPDCL").equals("0")?jsonData.optString("WZPDCL"):"", 
										!jsonData.optString("PBS").equals("0")?jsonData.optString("PBS"):"",
						!jsonData.optString("NESCO").equals("0")?jsonData.optString("NESCO"):"",
								!jsonData.optString("TOTAL_IMPORT").equals("0")?jsonData.optString("TOTAL_IMPORT"):"",
						!jsonData.optString("NON_GRID_GEN").equals("0")?jsonData.optString("NON_GRID_GEN"):"",
								!jsonData.optString("TRANS_LOSS").equals("0")?jsonData.optString("TRANS_LOSS"):"",
						!jsonData.optString("TRANS_LOSS_PER").equals("0")?jsonData.optString("TRANS_LOSS_PER"):""));
			}
		}
		return dPD_MON_SALE_LOSS_MODEL;

	}

	public ArrayList<Dpd_Year> Dpd_Year_Gen_sale(String month) {
		ArrayList<Dpd_Year> dpd_year = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3005.withCatalogName("pkg_ES_yr_mon_gen_sale")
				.withProcedureName("dpd_yr_gen_sale")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpd_year.add(new Dpd_Year(jsonData.optString("YEAR_CODE"), jsonData.optString("OWNER_TYPE"),
						!jsonData.optString("ENRG_GEN").equals("0")?jsonData.optString("ENRG_GEN"):"",
								!jsonData.optString("AUX_USEF").equals("0")?jsonData.optString("AUX_USEF"):"", 
										!jsonData.optString("NET_GEN").equals("0")?jsonData.optString("NET_GEN"):"",
						!jsonData.optString("UT_SALES").equals("0")?jsonData.optString("UT_SALES"):"", !jsonData.optString("UT_SYSTEM_LOSS").equals("0")?jsonData.optString("UT_SYSTEM_LOSS"):"",
						!jsonData.optString("UT_NET_BILL").equals("0")?jsonData.optString("UT_NET_BILL"):"", !jsonData.optString("UT_NET_COLL").equals("0")?jsonData.optString("UT_NET_COLL"):"",
						!jsonData.optString("UT_CB_RATIO").equals("0")?jsonData.optString("UT_CB_RATIO"):"", !jsonData.optString("UT_CI_RARIO").equals("0")?jsonData.optString("UT_CI_RARIO"):"",
						!jsonData.optString("DT_IMPORT").equals("0")?jsonData.optString("DT_IMPORT"):"", !jsonData.optString("DT_SALES").equals("0")?jsonData.optString("DT_SALES"):"",
						!jsonData.optString("DT_SYSTEM_LOSS").equals("0")?jsonData.optString("DT_SYSTEM_LOSS"):"", !jsonData.optString("DT_NET_BILL").equals("0")?jsonData.optString("DT_NET_BILL"):"",
						!jsonData.optString("DT_NET_COLL").equals("0")?jsonData.optString("DT_NET_COLL"):"", !jsonData.optString("DT_CB_RATIO").equals("0")?jsonData.optString("DT_CB_RATIO"):"",
						!jsonData.optString("DT_CI_RARIO").equals("0")?jsonData.optString("DT_CI_RARIO"):"", !jsonData.optString("DT_REC").equals("0")?jsonData.optString("DT_REC"):""
							, !jsonData.optString("DT_EQM").equals("0")?jsonData.optString("DT_EQM"):""));
			}
		}

		return dpd_year;
	}

	public ArrayList<Dpd_Month> Dpd_Month_Gen_sale(String month) {
		ArrayList<Dpd_Month> dpd_month = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3006.withCatalogName("pkg_ES_yr_mon_gen_sale")
				.withProcedureName("dpd_mon_gen_sale")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpd_month.add(new Dpd_Month(jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("OWNER_TYPE"),
						!jsonData.optString("ENRG_GEN").equals("0")?jsonData.optString("ENRG_GEN"):"",
								!jsonData.optString("AUX_USEF").equals("0")?jsonData.optString("AUX_USEF"):""
									, !jsonData.optString("NET_GEN").equals("0")?jsonData.optString("NET_GEN"):"",
						!jsonData.optString("UT_SALES").equals("0")?jsonData.optString("UT_SALES"):""
							, !jsonData.optString("UT_SYSTEM_LOSS").equals("0")?jsonData.optString("UT_SYSTEM_LOSS"):"",
						!jsonData.optString("UT_NET_BILL").equals("0")?jsonData.optString("UT_NET_BILL"):""
							, !jsonData.optString("UT_NET_COLL").equals("0")?jsonData.optString("UT_NET_COLL"):"",
						!jsonData.optString("UT_CB_RATIO").equals("0")?jsonData.optString("UT_CB_RATIO"):"", 
						!jsonData.optString("UT_CI_RARIO").equals("0")?jsonData.optString("UT_CI_RARIO"):"",
						!jsonData.optString("DT_IMPORT").equals("0")?jsonData.optString("DT_IMPORT"):""
							, !jsonData.optString("DT_SALES").equals("0")?jsonData.optString("DT_SALES"):"",
						!jsonData.optString("DT_SYSTEM_LOSS").equals("0")?jsonData.optString("DT_SYSTEM_LOSS"):""
							, !jsonData.optString("DT_NET_BILL").equals("0")?jsonData.optString("DT_NET_BILL"):"",
						!jsonData.optString("DT_NET_COLL").equals("0")?jsonData.optString("DT_NET_COLL"):""
							, !jsonData.optString("DT_CB_RATIO").equals("0")?jsonData.optString("DT_CB_RATIO"):"",
						!jsonData.optString("DT_CI_RARIO").equals("0")?jsonData.optString("DT_CI_RARIO"):""
							, !jsonData.optString("DT_REC").equals("0")?jsonData.optString("DT_REC"):""
								, !jsonData.optString("DT_EQM").equals("0")?jsonData.optString("DT_EQM"):""));
			}
		}

		return dpd_month;
	}

	public ArrayList<Dpd_pp_wise_gen> IC_ES_GEN(String month) {
		ArrayList<Dpd_pp_wise_gen> Dpd_wise_gen = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3007.withCatalogName("pkg_ES_PP_wise_gen")
				.withProcedureName("dpd_PP_wise_gen")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				Dpd_wise_gen
						.add(new Dpd_pp_wise_gen(jsonData.optString("CURR_MONTH"),jsonData.optString("UPTO_MONTH"),jsonData.optString("POWER_PLANT"), jsonData.optString("OWNER_TYPE"),
								jsonData.optString("VOLTAGE_LEVEL"), jsonData.optString("FUEL_NAME"),
								jsonData.optString("ENRG_GEN"), jsonData.optString("ENRG_CONS_SELF"),
								jsonData.optString("ENRG_CONS_SELF_PER"), jsonData.optString("NET_GEN"),
								jsonData.optString("ENRG_GEN_YR"), jsonData.optString("NET_GEN_YR")));
			}
		}

		return Dpd_wise_gen;
	}

	public ArrayList<Dpd_Illigal_Use> IC_ES_ILLE_USER(String month) {
		ArrayList<Dpd_Illigal_Use> Dpd_St_Illigal_Use = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3008.withCatalogName("pkg_ES_DC_OF_ILLIGAL_USE_ST")
				.withProcedureName("dpd_DC_OF_ILLIGAL_USE_ST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				Dpd_St_Illigal_Use
						.add(new Dpd_Illigal_Use(jsonData.optString("MON"), jsonData.optString("NO_OF_DC_LINE"),
								jsonData.optString("NO_OF_CASE_FILED"), jsonData.optString("FINE_REALISE")));
			}
		}

		return Dpd_St_Illigal_Use;
	}

	public ArrayList<Dpd_Rc_Dc_St> IC_DISC_OF_ILLE_USER(String month) {
		ArrayList<Dpd_Rc_Dc_St> Dpd_Dc_St = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3009.withCatalogName("pkg_ES_RC_DC_ST")
				.withProcedureName("dpd_RC_DC_ST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				Dpd_Dc_St.add(new Dpd_Rc_Dc_St(jsonData.optString("MON"), jsonData.optString("NO_OF_DC_LINE"),
						jsonData.optString("COLL_AGAINST_DC"), jsonData.optString("NO_OF_RC_LINE"),
						jsonData.optString("COLL_AGAINST_RC")));
			}
		}

		return Dpd_Dc_St;
	}

	public ArrayList<IC_MAGIS_COURTS_MODEL> magisList() {
		ArrayList<IC_MAGIS_COURTS_MODEL> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3015.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_MAGIS_COURTS_LIST")
				.declareParameters(new SqlOutParameter("MAGISDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("MAGISDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_MAGIS_COURTS_MODEL(jsonData.optString("BILL_CYCLE_CODE"),
					Integer.valueOf(jsonData.getString("BAL_OF_PREV_MONTH")),
					Integer.valueOf(jsonData.getString("CASES_FILED_PDB_OFF")),
					Integer.valueOf(jsonData.getString("CASES_FILED_MOB_COURT")),
					Integer.valueOf(jsonData.getString("NO_OF_PER_JAILED")),
					Integer.valueOf(jsonData.getString("NO_OF_PER_FINED")),
					Integer.valueOf(jsonData.getString("NO_OF_PER_FINE_OR_JAIL")),
					Integer.valueOf(jsonData.getString("OTHERS")),
					Integer.valueOf(jsonData.getString("NO_OF_PER_REDEMPTION")),
					Integer.valueOf(jsonData.getString("NO_OF_PER_JUDGMENT")),
					Integer.valueOf(jsonData.getString("BAL_NOS")),
					Integer.valueOf(jsonData.getString("DC_ILLEGAL_CON")),
					Integer.valueOf(jsonData.getString("NO_OF_MOB_COURT_CONDU")),
					Integer.valueOf(jsonData.getString("FINES_REALISED_TK")), jsonData.getString("MONTHS"),
					Integer.valueOf(jsonData.getString("MAG_CT_ACT_ID"))

			));
		}
		return showList;
	}

	public int magisListInstrt(IC_MAGIS_INSERT iC_MAGIS_INSERT) {
		Map<String, Object> result = getAllStatesJdbcCall3016.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_MAGIS_ACTV_DTL")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(iC_MAGIS_INSERT.getpBILL_CYCLE_CODE(), iC_MAGIS_INSERT.getpBAL_OF_PREV_MONTH(),
						iC_MAGIS_INSERT.getpCASES_FILED_PDB_OFF(), iC_MAGIS_INSERT.getpCASES_FILED_MOB_COURT(),
						iC_MAGIS_INSERT.getpNO_OF_PER_JAILED(), iC_MAGIS_INSERT.getpNO_OF_PER_FINED(),
						iC_MAGIS_INSERT.getpNO_OF_PER_FINE_OR_JAIL(), iC_MAGIS_INSERT.getpOTHERS(),
						iC_MAGIS_INSERT.getpNO_OF_PER_REDEMPTION(), iC_MAGIS_INSERT.getpNO_OF_PER_JUDGMENT(),
						iC_MAGIS_INSERT.getpBAL_NOS(), iC_MAGIS_INSERT.getpDC_ILLEGAL_CON(),
						iC_MAGIS_INSERT.getpNO_OF_MOB_COURT_CONDU(), iC_MAGIS_INSERT.getpFINES_REALISED_TK(),
						iC_MAGIS_INSERT.getpMONTHS());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<IC_MAGIS_COURTS_MODEL> magisListEdit(int mId) {
		ArrayList<IC_MAGIS_COURTS_MODEL> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3017.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_MAGIS_COURTS_EDIT")
				.declareParameters(new SqlOutParameter("MAGIDATA", OracleTypes.CURSOR)).execute(mId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("MAGIDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_MAGIS_COURTS_MODEL(jsonData.optString("BILL_CYCLE_CODE"),
					Integer.valueOf(jsonData.getString("BAL_OF_PREV_MONTH")),
					Integer.valueOf(jsonData.getString("CASES_FILED_PDB_OFF")),
					Integer.valueOf(jsonData.getString("CASES_FILED_MOB_COURT")),
					Integer.valueOf(jsonData.getString("NO_OF_PER_JAILED")),
					Integer.valueOf(jsonData.getString("NO_OF_PER_FINED")),
					Integer.valueOf(jsonData.getString("NO_OF_PER_FINE_OR_JAIL")),
					Integer.valueOf(jsonData.getString("OTHERS")),
					Integer.valueOf(jsonData.getString("NO_OF_PER_REDEMPTION")),
					Integer.valueOf(jsonData.getString("NO_OF_PER_JUDGMENT")),
					Integer.valueOf(jsonData.getString("BAL_NOS")),
					Integer.valueOf(jsonData.getString("DC_ILLEGAL_CON")),
					Integer.valueOf(jsonData.getString("NO_OF_MOB_COURT_CONDU")),
					Integer.valueOf(jsonData.getString("FINES_REALISED_TK")), jsonData.getString("MONTHS"),
					Integer.valueOf(jsonData.getString("MAG_CT_ACT_ID"))

			));
		}
		return showList;
	}

	public int magisListUpdate(IC_MAGIS_INSERT iC_MAGIS_INSERT, int mId) {

		Map<String, Object> result = getAllStatesJdbcCall3018.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_MAGIS")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(iC_MAGIS_INSERT.getpBILL_CYCLE_CODE(), iC_MAGIS_INSERT.getpBAL_OF_PREV_MONTH(),
						iC_MAGIS_INSERT.getpCASES_FILED_PDB_OFF(), iC_MAGIS_INSERT.getpCASES_FILED_MOB_COURT(),
						iC_MAGIS_INSERT.getpNO_OF_PER_JAILED(), iC_MAGIS_INSERT.getpNO_OF_PER_FINED(),
						iC_MAGIS_INSERT.getpNO_OF_PER_FINE_OR_JAIL(), iC_MAGIS_INSERT.getpOTHERS(),
						iC_MAGIS_INSERT.getpNO_OF_PER_REDEMPTION(), iC_MAGIS_INSERT.getpNO_OF_PER_JUDGMENT(),
						iC_MAGIS_INSERT.getpBAL_NOS(), iC_MAGIS_INSERT.getpDC_ILLEGAL_CON(),
						iC_MAGIS_INSERT.getpNO_OF_MOB_COURT_CONDU(), iC_MAGIS_INSERT.getpFINES_REALISED_TK(),
						iC_MAGIS_INSERT.getpMONTHS(), mId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public int magisListDelte(int mId) {

		Map<String, Object> result = getAllStatesJdbcCall3019.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_MAGIS")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(mId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<IC_DC_RC> IC_RC_DC_one() {
		ArrayList<IC_DC_RC> pIC_RC_DC_ST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4000.withCatalogName("IC_RC_DC_One")
				.withProcedureName("IC_RC_DC").declareParameters(new SqlOutParameter("RCDATA", OracleTypes.CURSOR))
				.execute();
		JSONObject json = new JSONObject(result);
		String out = json.get("RCDATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				pIC_RC_DC_ST.add(new IC_DC_RC(jsonData.optString("BILL_CYCLE_CODE"),
						jsonData.optString("NO_OF_DC_LINE"), jsonData.optString("COLL_AGAINST_DC"),
						jsonData.optString("NO_OF_RC_LINE"), jsonData.optString("COLL_AGAINST_RC"),
						jsonData.optString("RC_DC_ID"), jsonData.optString("STATUS")

				));
			}
		}

		return pIC_RC_DC_ST;
	}

	public int insert_DC_RC(IC_DC_RC ic_dc_rc_insert) {

		Map<String, Object> result = getAllStatesJdbcCall4001.withCatalogName("IC_RC_DC_One")
				.withProcedureName("INSERT_IC_RC_DC")
				.declareParameters(new SqlOutParameter("RCDATA", OracleTypes.CURSOR))
				.execute(ic_dc_rc_insert.getpBILL_CYCLE_CODE(), Integer.valueOf(ic_dc_rc_insert.getpNO_OF_DC_LINE()),
						Integer.valueOf(ic_dc_rc_insert.getpCOLL_AGAINST_DC()),
						Integer.valueOf(ic_dc_rc_insert.getpNO_OF_RC_LINE()),
						Integer.valueOf(ic_dc_rc_insert.getpCOLL_AGAINST_RC()), ic_dc_rc_insert.getpSTATUS());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public int delete_RC_DC(int id) {

		Map<String, Object> result = getAllStatesJdbcCall4002.withCatalogName("IC_RC_DC_One")
				.withProcedureName("DETELE_IC").declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<IC_DC_RC> RC_DC_Edit(int id) {
		ArrayList<IC_DC_RC> pIC_RC_DC_ST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4003.withCatalogName("IC_RC_DC_One")
				.withProcedureName("IC_RC_EDIT_DATA")
				.declareParameters(new SqlOutParameter("RCDATAS", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("RCDATAS").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			pIC_RC_DC_ST.add(new IC_DC_RC(jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("NO_OF_DC_LINE"),
					jsonData.optString("COLL_AGAINST_DC"), jsonData.optString("NO_OF_RC_LINE"),
					jsonData.optString("COLL_AGAINST_RC"), jsonData.optString("RC_DC_ID"),
					jsonData.optString("STATUS")));
		}

		System.out.println("This is dao DATA " + pIC_RC_DC_ST);
		return pIC_RC_DC_ST;
	}

	public int RC_DC_update(IC_DC_RC iC_DC_RC, int id) {
		Map<String, Object> result = getAllStatesJdbcCall4004.withCatalogName("IC_RC_DC_One")
				.withProcedureName("UPDATE_IC").declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(iC_DC_RC.getpBILL_CYCLE_CODE(), Integer.valueOf(iC_DC_RC.getpNO_OF_DC_LINE()),
						Integer.valueOf(iC_DC_RC.getpCOLL_AGAINST_DC()), Integer.valueOf(iC_DC_RC.getpNO_OF_RC_LINE()),
						Integer.valueOf(iC_DC_RC.getpCOLL_AGAINST_RC()), iC_DC_RC.getpSTATUS(), id

				);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	// location

	public ArrayList<OfficeDrop> officeDropdown() {
		ArrayList<OfficeDrop> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall421.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_OFFICE_INFO_DROP")
				.declareParameters(new SqlOutParameter("OFDATAS", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("OFDATAS").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new OfficeDrop(jsonData.getString("OFFICE_CODE"), jsonData.getString("OFFICE_DESC")));
		}

		return showList;
	}

	public ArrayList<OfficeDrop> comDropdown() {
		ArrayList<OfficeDrop> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall422.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_COMP_CNTR_MST_DROP")
				.declareParameters(new SqlOutParameter("COMDATAS", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("COMDATAS").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new OfficeDrop(jsonData.getString("COMP_CNTR_CODE"), jsonData.getString("COMP_CNTR_NAME")));
		}

		return showList;
	}

	public ArrayList<LocationListModel> locationList() {
		ArrayList<LocationListModel> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall423.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_LOCATION_LIST")
				.declareParameters(new SqlOutParameter("LOCATIONDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("LOCATIONDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LocationListModel(Integer.valueOf(jsonData.getString("LOCATION_ID")),
					jsonData.getString("LOCATION_CODE"), jsonData.getString("LOCATION_NAME"),
					jsonData.getString("STATUS"), jsonData.getString("ZONE_DESC"), jsonData.getString("CIRCLE_DESC"),
					jsonData.getString("DIV_DESC"), jsonData.getString("COMP_CNTR_NAME")));
		}
		return showList;
	}

	public int insertLocations(InsLocation insLocation) {
		if (insLocation.getStatus() == "C") {
			insLocation.setStatus("Yes");
		}

		Map<String, Object> result = getAllStatesJdbcCall424.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_LOCATION_MASTERR")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(insLocation.getCode(),
						insLocation.getName(), insLocation.getStatus(), insLocation.getZone(), insLocation.getCircle(),
						insLocation.getDiv(), insLocation.getSubDiv(), insLocation.getOfficeCode(),
						insLocation.getComputerSec());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<LocationEditM> locationEdits(int locationId) {
		ArrayList<LocationEditM> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall425.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_LOCATION_LIST_EDID")
				.declareParameters(new SqlOutParameter("LOCAEDITDATA", OracleTypes.CURSOR)).execute(locationId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("LOCAEDITDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LocationEditM(Integer.valueOf(jsonData.getString("LOCATION_ID")),
					jsonData.getString("LOCATION_CODE"), jsonData.getString("LOCATION_NAME"),
					jsonData.getString("STATUS"), jsonData.getString("ZONE_DESC"), jsonData.getString("CIRCLE_DESC"),
					jsonData.getString("DIV_DESC"), jsonData.getString("COMP_CNTR_NAME"),
					jsonData.getString("ZONE_CODE"), jsonData.getString("CIRCLE_CODE"), jsonData.getString("DIV_CODE"),
					jsonData.getString("SUB_DIV_CODE"), jsonData.getString("COMP_CNTR_CODE"),
					jsonData.getString("OFFICE_CODE")));
		}
		return showList;
	}

	public int updateLocations(InsLocation insLocation, String aZone, String bCircle, String cDiv, String dComCen,
			String eOffCode, int id) {
		if (insLocation.getStatus() == "C") {
			insLocation.setStatus("Yes");
		}
		if (insLocation.getZone() == null) {
			insLocation.setZone(aZone);
		}
		if (insLocation.getCircle() == null) {
			insLocation.setCircle(bCircle);
		}
		if (insLocation.getDiv() == null) {
			insLocation.setDiv(cDiv);
		}
		if (insLocation.getComputerSec() == null) {
			insLocation.setComputerSec(dComCen);
		}
		if (insLocation.getOfficeCode() == null) {
			insLocation.setOfficeCode(eOffCode);
		}

		Map<String, Object> result = getAllStatesJdbcCall426.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_LOCATION_MASTERR")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(insLocation.getCode(),
						insLocation.getName(), insLocation.getStatus(), insLocation.getZone(), insLocation.getCircle(),
						insLocation.getDiv(), insLocation.getSubDiv(), insLocation.getOfficeCode(),
						insLocation.getComputerSec(), id);
		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<IC_ZONE_MST_R> r(String officeCode) {

		ArrayList<IC_ZONE_MST_R> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall428.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Zone").declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(officeCode);
		JSONObject j = new JSONObject(c);
		String d = j.get("CUR_DATA").toString();
		JSONArray e = new JSONArray(d);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_ZONE_MST_R(f.getString("ZONE_CODE"), f.getString("ZONE_NAME")

			));
		}

		return b;

	}
}
