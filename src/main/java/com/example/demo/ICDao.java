package com.example.demo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class ICDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	SimpleJdbcCall getAllStatesJdbcCall;
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
	SimpleJdbcCall getAllStatesJdbcCall121;
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
	
	SimpleJdbcCall getAllStatesJdbcCall1000;
	
	SimpleJdbcCall getAllStatesJdbcCall3000;
	SimpleJdbcCall getAllStatesJdbcCall3001;
	SimpleJdbcCall getAllStatesJdbcCall3002;
	SimpleJdbcCall getAllStatesJdbcCall3003;
	SimpleJdbcCall getAllStatesJdbcCall3004;
	SimpleJdbcCall getAllStatesJdbcCall3005;
	

	SimpleJdbcCall getAllStatesJdbcCall4000;
	SimpleJdbcCall getAllStatesJdbcCall4001;
	SimpleJdbcCall getAllStatesJdbcCall4002;
	SimpleJdbcCall getAllStatesJdbcCall4003;
	SimpleJdbcCall getAllStatesJdbcCall4004;
	SimpleJdbcCall getAllStatesJdbcCall4005;
	SimpleJdbcCall getAllStatesJdbcCall4006;
	SimpleJdbcCall getAllStatesJdbcCall4007;
	SimpleJdbcCall getAllStatesJdbcCall4008;

	public ICDao(DataSource dataSource) {
		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
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
		this.getAllStatesJdbcCall121 = new SimpleJdbcCall(dataSource);
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
		this.getAllStatesJdbcCall1000 = new SimpleJdbcCall(dataSource);
		
		this.getAllStatesJdbcCall3000 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3001 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3002 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3003 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3004 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3005 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall4000 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4001 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4002 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4003 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4004 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4005 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4006 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4007 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4008 = new SimpleJdbcCall(dataSource);
		
	}

	public LoginModel getLogin(String name, String pass) {

		System.out.println(name);
		System.out.println(pass);

		LoginModel user = null;
		Map<String, Object> result = getAllStatesJdbcCall2.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("USER_LOGIN")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR)).execute(name, pass);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		System.out.println(jsonArray);
		
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			user = new LoginModel(jsonData.getString("USER_NAME"), jsonData.getString("USER_PASSWORD"),
					jsonData.getString("USER_TYPE"),jsonData.getString("OFFICE_CODE"),jsonData.getString("NAME"));

		}

		return user;

	}

	public String getDynamicMenu() {
		ArrayList<DynamicMenu> dynamicMenu = new ArrayList<DynamicMenu>();
		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_DYNAMIC_MENU_OLD")
				.declareParameters(new SqlOutParameter("results_0cursor", OracleTypes.VARCHAR)).execute();

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			dynamicMenu.add(new DynamicMenu(jsonData.getString("PARENT"), jsonData.getString("MOD_ID"),
					jsonData.getString("MOD_APP"), jsonData.getString("EXT"), jsonData.getString("ROOTLEAF"),
					jsonData.getString("MOD_NAME"), jsonData.getString("MTYPE"), jsonData.getString("MOD_CODE")));

		}
		String dataHtml = "<nav id=\"sidebar\" class=\"sidebar-wrapper\"\r\n"
				+ "            style=\"box-shadow: 0px 2px 22px 0 rgb(0 0 0 / 20%), 0px 2px 30px 0 rgb(0 0 0 / 35%);\">\r\n"
				+ "            <div class=\"sidebar-content\">\r\n" + "                <!-- sidebar-brand  -->\r\n"
				+ "                <div class=\"sidebar-item sidebar-brand\">\r\n"
				+ "                    <a href='../Home' class=\"text-center\">\r\n"
				+ "                        <img src=\'../../../img/logo.jpg' alt=\"\" height=\"85px\" width=\"160px\">\r\n"
				+ "                    </a>\r\n" + "                </div>";
		dataHtml += "<!-- sidebar-search  -->\r\n" + "                <div class=\"sidebar-item sidebar-search\">\r\n"
				+ "                    <div>\r\n" + "                        <div class=\"input-group\">\r\n"
				+ "                            <input type=\"text\" class=\"form-control search-menu\" placeholder=\"Search...\">\r\n"
				+ "                            <div class=\"input-group-append\">\r\n"
				+ "                                <span class=\"input-group-text\" style=\"margin-top: 6px; margin-left: 3px;\">\r\n"
				+ "                                    <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\r\n"
				+ "                                </span>\r\n" + "                            </div>\r\n"
				+ "                        </div>\r\n" + "                    </div>\r\n" + "                </div>\r\n"
				+ "                <!-- sidebar-menu  -->\r\n"
				+ "                <div class=\" sidebar-item sidebar-menu\">\r\n" + "                    <ul>";
		int lMOD_ID = 0;
		int pcont = 0;
		int lavel = 0;
		int lavel2 = 1000;
		int lavel3 = 0;
		int lavel4 = 0;
		for (int i = 0; i < dynamicMenu.size(); i++) {
			if (dynamicMenu.get(i).PARENT.equals("0")) {
				lMOD_ID = Integer.valueOf(dynamicMenu.get(i).MOD_ID);
			}
			pcont = lMOD_ID / 1000;
		}
		for (int i = 0; i < pcont; i++) {
			lavel += 1000;
			lavel2 += 1000;
			for (int i1 = 0; i1 < dynamicMenu.size(); i1++) {
				if (dynamicMenu.get(i1).PARENT.equals("0")) {
					if (Integer.valueOf(dynamicMenu.get(i1).MOD_ID) >= lavel
							&& Integer.valueOf(dynamicMenu.get(i1).MOD_ID) < lavel2) {
						dataHtml += "<li class=\"sidebar-dropdown\">";
						dataHtml += "<a href='#'>";
						dataHtml += "<i class=\"fas fa-angle-down\"></i>";
						dataHtml += "<span>" + dynamicMenu.get(i1).MOD_NAME + "</span>";
						dataHtml += "</a>";
						dataHtml += "<div class=\"sidebar-submenu\">\r\n" + "                                <ul>";
						for (int i2 = 0; i2 < dynamicMenu.size(); i2++) {
							if (Integer.valueOf(dynamicMenu.get(i2).MOD_ID) > lavel
									&& Integer.valueOf(dynamicMenu.get(i2).MOD_ID) < lavel2) {
								lavel3 = Integer.valueOf(dynamicMenu.get(i2).MOD_ID);
								lavel4 = Integer.valueOf(dynamicMenu.get(i2).MOD_ID) + 100;
								if (dynamicMenu.get(i2).MOD_APP.equals("#")) {
									dataHtml += "<li class=\"sidebar-dropdown2\">\r\n"
											+ "                                        <a href='#'>"
											+ dynamicMenu.get(i2).MOD_NAME
											+ "<span class=\"badge badge-pill badge-success\">></span></a>\r\n";
									dataHtml += "<div class=\"sidebar-submenu2\">\r\n"
											+ "                                <ul>";

									for (int i21 = 0; i21 < dynamicMenu.size(); i21++) {
										if (Integer.valueOf(dynamicMenu.get(i21).MOD_ID) > lavel3
												&& Integer.valueOf(dynamicMenu.get(i21).MOD_ID) < lavel4) {

											dataHtml += "<li>\r\n"
													+ "                                        <a style='width:250px; white-space:normal;' href=../../../"
													+ dynamicMenu.get(i21).MOD_APP + ">" + dynamicMenu.get(i21).MOD_NAME
													+ "</a>\r\n";

											dataHtml += "                                    </li>\r\n";

										}
									}
									dataHtml += "                                </ul>\r\n"
											+ "                            </div>";
									dataHtml += "                                    </li>\r\n";
								} else {
									int pid = Integer.valueOf(dynamicMenu.get(i2).PARENT);
									if (pid == lavel) {

										dataHtml += "<li>\r\n"
												+ "                                        <a href=../../../"
												+ dynamicMenu.get(i2).MOD_APP + ">" + dynamicMenu.get(i2).MOD_NAME
												+ "</a>\r\n";

										dataHtml += "                                    </li>\r\n";
									}
								}
							}
						}
						dataHtml += "                                </ul>\r\n" + "                            </div>";
						dataHtml += "</li>";
					}
				}
			}
		}
		dataHtml += "<li>\r\n" + "                            <a href=\"../../../logout\">\r\n"
				+ "                                <i class=\"fas fa-sign-out-alt\"></i>\r\n"
				+ "                                <span class=\"menu-text\">Sign Out</span>\r\n"
				+ "                            </a>\r\n" + "                        </li>";
		dataHtml += "</ul>\r\n" + "                </div>\r\n" + "                <!-- sidebar-menu  -->\r\n"
				+ "            </div>\r\n" + "            <!-- sidebar-footer  -->\r\n" + "\r\n" + "        </nav>";
		return dataHtml;

	}

	public String getDynamicMenuOld() {
		ArrayList<DynamicMenu> dynamicMenu = new ArrayList<DynamicMenu>();
		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_DYNAMIC_MENU_OLD")
				.declareParameters(new SqlOutParameter("results_0cursor", OracleTypes.VARCHAR)).execute();

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			dynamicMenu.add(new DynamicMenu(jsonData.getString("PARENT"), jsonData.getString("MOD_ID"),
					jsonData.getString("MOD_APP"), jsonData.getString("EXT"), jsonData.getString("ROOTLEAF"),
					jsonData.getString("MOD_NAME"), jsonData.getString("MTYPE"), jsonData.getString("MOD_CODE")));

		}
		String dataHtml = "<aside class=\"sidebar\">\r\n" + "    <div class=\"toggle\">\r\n"
				+ "      <a href=\"#\" class=\"burger js-menu-toggle\" data-toggle=\"collapse\" data-target=\"#main-navbar\">\r\n"
				+ "        <span></span>\r\n" + "      </a>\r\n" + "    </div>\r\n"
				+ "    <div class=\"side-inner\">\r\n" + "\r\n" + "      <div class=\"profile\">\r\n"
				+ "        <img src='..//img/logo.jpg' alt=\"Image\" class=\"img-fluid\" height=\"auto\" width=\"auto\">\r\n"
				+ "        <h3 class=\"name\">iConverge</h3>\r\n"
				+ "        <!-- <span class=\"country\">New York, USA</span> -->\r\n" + "      </div>"
				+ "<div class=\"nav-menu\">\r\n" + "        <ul>";
		int pcont = 0;
		int lavel = 0;
		int lavel2 = 1000;
		int lavel3 = 0;
		int lavel4 = 0;
		for (int i = 0; i < dynamicMenu.size(); i++) {
			if (dynamicMenu.get(i).PARENT.equals("0")) {
				pcont += 1;
			}
		}
		for (int i = 0; i < pcont; i++) {
			lavel += 1000;
			lavel2 += 1000;
			for (int i1 = 0; i1 < dynamicMenu.size(); i1++) {
				if (dynamicMenu.get(i1).PARENT.equals("0")) {
					if (Integer.valueOf(dynamicMenu.get(i1).MOD_ID) >= lavel
							&& Integer.valueOf(dynamicMenu.get(i1).MOD_ID) < lavel2) {
						dataHtml += "<li class=\"accordion\">";
						dataHtml += "<a th:href='../redirect:/" + dynamicMenu.get(i1).MOD_APP
								+ "' data-toggle=\"collapse\" data-target=\"#collapseTwo\" aria-expanded=\"false\"\r\n"
								+ "              aria-controls=\"collapseTwo\" class=\"collapsible\">";
						dataHtml += "<i class=\"fas fa-angle-down\"></i>";
						dataHtml += "<span>" + dynamicMenu.get(i1).MOD_NAME + "</span>";
						dataHtml += "</a>";
						dataHtml += "<div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingOne\">\r\n"
								+ "              <div>\r\n" + "                <ul>";
						for (int i2 = 0; i2 < dynamicMenu.size(); i2++) {
							if (Integer.valueOf(dynamicMenu.get(i2).MOD_ID) > lavel
									&& Integer.valueOf(dynamicMenu.get(i2).MOD_ID) < lavel2) {
								lavel3 = Integer.valueOf(dynamicMenu.get(i2).MOD_ID);
								lavel4 = Integer.valueOf(dynamicMenu.get(i2).MOD_ID) + 100;
								if (dynamicMenu.get(i2).MOD_APP.equals("#")) {
									dataHtml += "<div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingOne\">\r\n"
											+ "              <div>\r\n" + "                <ul>\r\n"
											+ "                  <li class=\"accordion\">"
											+ "                                        <a href='#' data-toggle=\"collapse\" data-target=\"#collapseThree\" aria-expanded=\"false\"\r\n"
											+ "                      aria-controls=\"collapseThree\" class=\"collapsible\" style=\"margin-left: 20px;\">"
											+ dynamicMenu.get(i2).MOD_NAME + "</a>\r\n";
									dataHtml += "<div id=\"collapseThree\" class=\"collapse\" aria-labelledby=\"headingOne\">\r\n"
											+ "                      <div>\r\n" + "                        <ul>\r\n";

									for (int i21 = 0; i21 < dynamicMenu.size(); i21++) {
										if (Integer.valueOf(dynamicMenu.get(i21).MOD_ID) > lavel3
												&& Integer.valueOf(dynamicMenu.get(i21).MOD_ID) < lavel4) {

											dataHtml += "<li>\r\n"
													+ "                                        <a th:href='../redirect:/"
													+ dynamicMenu.get(i21).MOD_APP + "' style=\'margin-left: 40px;'>"
													+ dynamicMenu.get(i21).MOD_NAME + "</a>\r\n";

											dataHtml += "                                    </li>\r\n";

										}
									}
									dataHtml += "</ul>\r\n" + "                      </div>\r\n"
											+ "                    </div>";
									dataHtml += "</li>\r\n" + "                </ul>\r\n" + "              </div>\r\n"
											+ "            </div>";
								} else {
									int pid = Integer.valueOf(dynamicMenu.get(i2).PARENT);
									if (pid == lavel) {

										dataHtml += "<li>\r\n"
												+ "                                        <a th:href='../redirect:/"
												+ dynamicMenu.get(i2).MOD_APP + "'>" + dynamicMenu.get(i2).MOD_NAME
												+ "</a>\r\n";

										dataHtml += "                                    </li>\r\n";
									}
								}
							}
						}
						dataHtml += "</ul>\r\n" + "              </div>\r\n" + "            </div>";
						dataHtml += "</li>";
					}
				}
			}
		}
		dataHtml += "<li><a href=\"#\"><span class=\"icon-sign-out mr-3\"></span>Sign out</a></li>";
		dataHtml += "</div>\r\n" + "\r\n" + "  </aside>" + "</ul>\r\n" + "      </div>";
		return dataHtml;

	}

	public ArrayList<IC_YEAR_MST> listIC_YEAR_MST() {
		ArrayList<IC_YEAR_MST> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_IC_YEAR_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);


		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_MISC_BILL_TYPE.add(new IC_YEAR_MST(jsonData.getString("YR_ID"), jsonData.getString("YEAR_CODE"),
					jsonData.getString("FROM_DATE").replace(" 00:00:00.0", ""),
					jsonData.getString("TO_DATE").replace(" 00:00:00.0", ""), jsonData.getString("STATUS")));
		}

		return listIC_MISC_BILL_TYPE;
	}

	public IC_YEAR_MST singleIC_YEAR_MST(int id) {

		IC_YEAR_MST singleIC_YEAR_MST = new IC_YEAR_MST();

		Map<String, Object> result = getAllStatesJdbcCall7.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_IC_YEAR_MST_S")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//		System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//	    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_YEAR_MST = new IC_YEAR_MST(jsonData.getString("YR_ID"), jsonData.getString("YEAR_CODE"),
					jsonData.getString("FROM_DATE").replace(" 00:00:00.0", ""),
					jsonData.getString("TO_DATE").replace(" 00:00:00.0", ""), jsonData.getString("STATUS"));
		}

//	    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_YEAR_MST;
	}

	public String insertIC_YEAR_MST(IC_YEAR_MST ic_misc_bill_type) {

		String a = ic_misc_bill_type.getYEAR_CODE();
		String b = ic_misc_bill_type.getFROM_DATE();
		String c = ic_misc_bill_type.getTO_DATE();
		String d = ic_misc_bill_type.getSTATUS();

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("INSERT_IC_YEAR_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d);

		JSONObject json = new JSONObject(result);
		return json.get("OUTPUT").toString();

	}

	public String editIC_YEAR_MST(IC_YEAR_MST ic_misc_bill_type) {

		String a = ic_misc_bill_type.getYEAR_CODE();
		String b = ic_misc_bill_type.getFROM_DATE();
		String c = ic_misc_bill_type.getTO_DATE();
		String d = ic_misc_bill_type.getSTATUS();

		int e = Integer.valueOf(ic_misc_bill_type.getYR_ID());

		Map<String, Object> result = getAllStatesJdbcCall8.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("UPDATE_IC_YEAR_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e);

		JSONObject json = new JSONObject(result);
		return json.get("OUTPUT").toString();

	}

	public String deleteIC_YEAR_MST(int id) {

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("DELETE_IC_YEAR_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
		return json.get("OUTPUT").toString();

	}

	public ArrayList<IC_BPDB_TARGET> listIC_BPDB_TARGET(String yearCode) {
		ArrayList<IC_BPDB_TARGET> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_IC_BPDB_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(yearCode);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_BPDB_TARGET(jsonData.getString("YEAR_CODE"),
						Double.valueOf(jsonData.getString("SYS_LOSS")), Double.valueOf(jsonData.getString("CI_RATIO")),
						Double.valueOf(jsonData.getString("CB_RATIO")), Double.valueOf(jsonData.getString("EQ_MONTH")),
						Double.valueOf(jsonData.getString("SAIDI")), Double.valueOf(jsonData.getString("SAIFI")), "",
						"", Integer.valueOf(jsonData.getString("BPDB_TARGET_ID"))));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}

	public IC_BPDB_TARGET singleIC_BPDB_TARGET(int id) {

		IC_BPDB_TARGET ic_BPDB_TARGET = new IC_BPDB_TARGET();
		Map<String, Object> result = getAllStatesJdbcCall121.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_IC_BPDB_TARGET_S")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				ic_BPDB_TARGET = new IC_BPDB_TARGET(jsonData.getString("YEAR_CODE"),
						Double.valueOf(jsonData.getString("SYS_LOSS")), Double.valueOf(jsonData.getString("CI_RATIO")),
						Double.valueOf(jsonData.getString("CB_RATIO")), Double.valueOf(jsonData.getString("EQ_MONTH")),
						Double.valueOf(jsonData.getString("SAIDI")), Double.valueOf(jsonData.getString("SAIFI")), "",
						"", Integer.valueOf(jsonData.getString("BPDB_TARGET_ID")));
			}
		}

		return ic_BPDB_TARGET;
	}

	public String insertIC_BPDB_TARGET(IC_BPDB_TARGET ic_BPDB_TARGET) {

		Map<String, Object> result = getAllStatesJdbcCall12.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("INSERT_IC_BPDB_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(ic_BPDB_TARGET.getYEAR_CODE(), ic_BPDB_TARGET.getSYS_LOSS(), ic_BPDB_TARGET.getCI_RATIO(),
						ic_BPDB_TARGET.getCB_RATIO(), ic_BPDB_TARGET.getEQ_MONTH(), ic_BPDB_TARGET.getSAIDI(),
						ic_BPDB_TARGET.getSAIFI(), ic_BPDB_TARGET.getREC_STATUS(), ic_BPDB_TARGET.getOFFICE_CODE());

		JSONObject json = new JSONObject(result);

		return json.get("OUTPUT").toString();
	}

	public String updateIC_BPDB_TARGET(IC_BPDB_TARGET ic_BPDB_TARGET) {

		Map<String, Object> result = getAllStatesJdbcCall13.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("UPDATE_IC_BPDB_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(ic_BPDB_TARGET.getYEAR_CODE(), ic_BPDB_TARGET.getSYS_LOSS(), ic_BPDB_TARGET.getCI_RATIO(),
						ic_BPDB_TARGET.getCB_RATIO(), ic_BPDB_TARGET.getEQ_MONTH(), ic_BPDB_TARGET.getSAIDI(),
						ic_BPDB_TARGET.getSAIFI(), ic_BPDB_TARGET.getREC_STATUS(), ic_BPDB_TARGET.getOFFICE_CODE(),
						ic_BPDB_TARGET.getBPDB_TARGET_ID());

		JSONObject json = new JSONObject(result);

		return json.get("OUTPUT").toString();
	}

	public String deleteIC_BPDB_TARGET(int id) {

		Map<String, Object> result = getAllStatesJdbcCall14.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("DELETE_IC_BPDB_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		return json.get("OUTPUT").toString();
	}

	public ArrayList<IC_ZONE_TARGET> listIC_ZONE_TARGET(String yearCode) {
		ArrayList<IC_ZONE_TARGET> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall9.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_IC_ZONE_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(yearCode);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ZONE_TARGET(jsonData.getString("ZONE_CODE"),
						jsonData.getString("ZONE_CODE") + " - " + jsonData.getString("ZONE_DESC"),
						jsonData.getString("YEAR_CODE"), Double.valueOf(jsonData.getString("SYS_LOSS")),
						Double.valueOf(jsonData.getString("CI_RATIO")), Double.valueOf(jsonData.getString("CB_RATIO")),
						Double.valueOf(jsonData.getString("EQ_MONTH")), Double.valueOf(jsonData.getString("SAIDI")),
						Double.valueOf(jsonData.getString("SAIFI")), "", "",
						Integer.valueOf(jsonData.getString("ZONE_TARGET_ID"))));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}

	public IC_ZONE_TARGET singleIC_ZONE_TARGET(int id) {

		IC_ZONE_TARGET ic_ZONE_TARGET = new IC_ZONE_TARGET();
		Map<String, Object> result = getAllStatesJdbcCall15.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_IC_ZONE_TARGET_S")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				ic_ZONE_TARGET = new IC_ZONE_TARGET(jsonData.getString("ZONE_CODE"),
						jsonData.getString("ZONE_CODE") + " - " + jsonData.getString("ZONE_DESC"),
						jsonData.getString("YEAR_CODE"), Double.valueOf(jsonData.getString("SYS_LOSS")),
						Double.valueOf(jsonData.getString("CI_RATIO")), Double.valueOf(jsonData.getString("CB_RATIO")),
						Double.valueOf(jsonData.getString("EQ_MONTH")), Double.valueOf(jsonData.getString("SAIDI")),
						Double.valueOf(jsonData.getString("SAIFI")), "", "",
						Integer.valueOf(jsonData.getString("ZONE_TARGET_ID")));
			}
		}

		return ic_ZONE_TARGET;
	}

	public String insertIC_ZONE_TARGET(IC_ZONE_TARGET ic_ZONE_TARGET) {

		Map<String, Object> result = getAllStatesJdbcCall16.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("INSERT_IC_ZONE_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(ic_ZONE_TARGET.getZONE_CODE(), ic_ZONE_TARGET.getYEAR_CODE(), ic_ZONE_TARGET.getSYS_LOSS(),
						ic_ZONE_TARGET.getCI_RATIO(), ic_ZONE_TARGET.getCB_RATIO(), ic_ZONE_TARGET.getEQ_MONTH(),
						ic_ZONE_TARGET.getSAIDI(), ic_ZONE_TARGET.getSAIFI(), ic_ZONE_TARGET.getREC_STATUS(),
						ic_ZONE_TARGET.getOFFICE_CODE());

		JSONObject json = new JSONObject(result);

		return json.get("OUTPUT").toString();
	}

	public String updateIC_ZONE_TARGET(IC_ZONE_TARGET ic_ZONE_TARGET) {

		Map<String, Object> result = getAllStatesJdbcCall17.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("UPDATE_IC_ZONE_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(ic_ZONE_TARGET.getZONE_CODE(), ic_ZONE_TARGET.getYEAR_CODE(), ic_ZONE_TARGET.getSYS_LOSS(),
						ic_ZONE_TARGET.getCI_RATIO(), ic_ZONE_TARGET.getCB_RATIO(), ic_ZONE_TARGET.getEQ_MONTH(),
						ic_ZONE_TARGET.getSAIDI(), ic_ZONE_TARGET.getSAIFI(), ic_ZONE_TARGET.getREC_STATUS(),
						ic_ZONE_TARGET.getOFFICE_CODE(), ic_ZONE_TARGET.getZONE_TARGET_ID());

		JSONObject json = new JSONObject(result);

		return json.get("OUTPUT").toString();
	}

	public String deleteIC_ZONE_TARGET(int id) {

		Map<String, Object> result = getAllStatesJdbcCall18.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("DELETE_IC_ZONE_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		return json.get("OUTPUT").toString();
	}

	public ArrayList<IC_CIRCLE_TARGET> listIC_CIRCLE_TARGET(String yearCode, String zoneCode) {
		ArrayList<IC_CIRCLE_TARGET> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall10.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_IC_CIRCLE_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(yearCode, zoneCode);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_CIRCLE_TARGET(jsonData.getString("CIRCLE_CODE"),
						jsonData.getString("CIRCLE_CODE") + " - " + jsonData.getString("CIRCLE_DESC"),
						jsonData.getString("YEAR_CODE"), Double.valueOf(jsonData.getString("SYS_LOSS")),
						Double.valueOf(jsonData.getString("CI_RATIO")), Double.valueOf(jsonData.getString("CB_RATIO")),
						Double.valueOf(jsonData.getString("EQ_MONTH")), Double.valueOf(jsonData.getString("SAIDI")),
						Double.valueOf(jsonData.getString("SAIFI")), "", "",
						Integer.valueOf(jsonData.getString("CIRCLE_TARGET_ID"))));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}

	public IC_CIRCLE_TARGET singleIC_CIRCLE_TARGET(int id) {

		IC_CIRCLE_TARGET ic_CIRCLE_TARGET = new IC_CIRCLE_TARGET();
		Map<String, Object> result = getAllStatesJdbcCall19.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_IC_CIRCLE_TARGET_S")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				ic_CIRCLE_TARGET = new IC_CIRCLE_TARGET(jsonData.getString("CIRCLE_CODE"),
						jsonData.getString("CIRCLE_CODE") + " - " + jsonData.getString("CIRCLE_DESC"),
						jsonData.getString("YEAR_CODE"), Double.valueOf(jsonData.getString("SYS_LOSS")),
						Double.valueOf(jsonData.getString("CI_RATIO")), Double.valueOf(jsonData.getString("CB_RATIO")),
						Double.valueOf(jsonData.getString("EQ_MONTH")), Double.valueOf(jsonData.getString("SAIDI")),
						Double.valueOf(jsonData.getString("SAIFI")), "", "",
						Integer.valueOf(jsonData.getString("CIRCLE_TARGET_ID")));
			}
		}

		return ic_CIRCLE_TARGET;
	}

	public String insertIC_CIRCLE_TARGET(IC_CIRCLE_TARGET ic_CIRCLE_TARGET) {

		Map<String, Object> result = getAllStatesJdbcCall20.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("INSERT_IC_CIRCLE_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(ic_CIRCLE_TARGET.getCIRCLE_CODE(), ic_CIRCLE_TARGET.getYEAR_CODE(),
						ic_CIRCLE_TARGET.getSYS_LOSS(), ic_CIRCLE_TARGET.getCI_RATIO(), ic_CIRCLE_TARGET.getCB_RATIO(),
						ic_CIRCLE_TARGET.getEQ_MONTH(), ic_CIRCLE_TARGET.getSAIDI(), ic_CIRCLE_TARGET.getSAIFI(),
						ic_CIRCLE_TARGET.getREC_STATUS(), ic_CIRCLE_TARGET.getOFFICE_CODE());

		JSONObject json = new JSONObject(result);

		return json.get("OUTPUT").toString();
	}

	public String updateIC_CIRCLE_TARGET(IC_CIRCLE_TARGET ic_CIRCLE_TARGET) {

		Map<String, Object> result = getAllStatesJdbcCall21.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("UPDATE_IC_CIRCLE_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(ic_CIRCLE_TARGET.getCIRCLE_CODE(), ic_CIRCLE_TARGET.getYEAR_CODE(),
						ic_CIRCLE_TARGET.getSYS_LOSS(), ic_CIRCLE_TARGET.getCI_RATIO(), ic_CIRCLE_TARGET.getCB_RATIO(),
						ic_CIRCLE_TARGET.getEQ_MONTH(), ic_CIRCLE_TARGET.getSAIDI(), ic_CIRCLE_TARGET.getSAIFI(),
						ic_CIRCLE_TARGET.getREC_STATUS(), ic_CIRCLE_TARGET.getOFFICE_CODE(),
						ic_CIRCLE_TARGET.getCIRCLE_TARGET_ID());

		JSONObject json = new JSONObject(result);

		return json.get("OUTPUT").toString();
	}

	public String deleteIC_CIRCLE_TARGET(int id) {

		Map<String, Object> result = getAllStatesJdbcCall22.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("DELETE_IC_CIRCLE_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		return json.get("OUTPUT").toString();
	}

	public ArrayList<IC_LOC_TARGET> listIC_LOC_TARGET(String yearCode, String circleCode) {
		ArrayList<IC_LOC_TARGET> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall11.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_IC_LOC_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(yearCode, circleCode);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_LOC_TARGET(
						jsonData.getString("LOC_CODE") + " - " + jsonData.getString("LOCATION_NAME"),
						jsonData.getString("YEAR_CODE"), Double.valueOf(jsonData.getString("SYS_LOSS")),
						Double.valueOf(jsonData.getString("CI_RATIO")), Double.valueOf(jsonData.getString("CB_RATIO")),
						Double.valueOf(jsonData.getString("EQ_MONTH")), Double.valueOf(jsonData.getString("SAIDI")),
						Double.valueOf(jsonData.getString("SAIFI")), "", "",
						Integer.valueOf(jsonData.getString("LOC_TARGET_ID"))));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}

	public IC_LOC_TARGET singleIC_LOC_TARGET(int id) {

		IC_LOC_TARGET ic_LOC_TARGET = new IC_LOC_TARGET();
		Map<String, Object> result = getAllStatesJdbcCall23.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_IC_LOC_TARGET_S")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				ic_LOC_TARGET = new IC_LOC_TARGET(jsonData.getString("LOC_CODE"), jsonData.getString("YEAR_CODE"),
						Double.valueOf(jsonData.getString("SYS_LOSS")), Double.valueOf(jsonData.getString("CI_RATIO")),
						Double.valueOf(jsonData.getString("CB_RATIO")), Double.valueOf(jsonData.getString("EQ_MONTH")),
						Double.valueOf(jsonData.getString("SAIDI")), Double.valueOf(jsonData.getString("SAIFI")), "",
						"", Integer.valueOf(jsonData.getString("LOC_TARGET_ID")));
			}
		}

		return ic_LOC_TARGET;
	}

	public String insertIC_LOC_TARGET(IC_LOC_TARGET ic_LOC_TARGET) {

		Map<String, Object> result = getAllStatesJdbcCall24.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("INSERT_IC_LOC_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(ic_LOC_TARGET.getLOCATION_CODE(), ic_LOC_TARGET.getYEAR_CODE(), ic_LOC_TARGET.getSYS_LOSS(),
						ic_LOC_TARGET.getCI_RATIO(), ic_LOC_TARGET.getCB_RATIO(), ic_LOC_TARGET.getEQ_MONTH(),
						ic_LOC_TARGET.getSAIDI(), ic_LOC_TARGET.getSAIFI(), ic_LOC_TARGET.getREC_STATUS(),
						ic_LOC_TARGET.getOFFICE_CODE());

		JSONObject json = new JSONObject(result);

		return json.get("OUTPUT").toString();
	}

	public String updateIC_LOC_TARGET(IC_LOC_TARGET ic_LOC_TARGET) {

		Map<String, Object> result = getAllStatesJdbcCall25.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("UPDATE_IC_LOC_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(ic_LOC_TARGET.getLOCATION_CODE(), ic_LOC_TARGET.getYEAR_CODE(), ic_LOC_TARGET.getSYS_LOSS(),
						ic_LOC_TARGET.getCI_RATIO(), ic_LOC_TARGET.getCB_RATIO(), ic_LOC_TARGET.getEQ_MONTH(),
						ic_LOC_TARGET.getSAIDI(), ic_LOC_TARGET.getSAIFI(), ic_LOC_TARGET.getREC_STATUS(),
						ic_LOC_TARGET.getOFFICE_CODE(), ic_LOC_TARGET.getLOC_TARGET_ID());

		JSONObject json = new JSONObject(result);

		return json.get("OUTPUT").toString();
	}

	public String deleteIC_LOC_TARGET(int id) {

		Map<String, Object> result = getAllStatesJdbcCall26.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("DELETE_IC_LOC_TARGET")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		return json.get("OUTPUT").toString();
	}

//	public ArrayList<IC_OFFICE_INFO> listIC_OFFICE_INFO() {
//		ArrayList<IC_OFFICE_INFO> listIC_MISC_BILL_TYPE = new ArrayList<>();
//
//		Map<String, Object> result = getAllStatesJdbcCall27.withCatalogName("PKG_SELECT_USER")
//				.withProcedureName("SELECT_IC_OFFICE_INFO")
//				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();
//
//		JSONObject json = new JSONObject(result);
//
//		String out = json.get("CUR_DATA").toString();
//		JSONArray jsonArray = new JSONArray(out);
//
//		System.out.println(jsonArray);
//
//		if (jsonArray.length() > 0) {
//			for (int i = 0; i < jsonArray.length(); i++) {
//				JSONObject jsonData = jsonArray.getJSONObject(i);
//				listIC_MISC_BILL_TYPE
//						.add(new IC_OFFICE_INFO(jsonData.getString("OFFICE_CODE"), jsonData.getString("OFFICE_DESC")));
//			}
//		}
//
//		return listIC_MISC_BILL_TYPE;
//	}

	public ArrayList<IC_ZONE_MST> listIC_ZONE_MST() {
		ArrayList<IC_ZONE_MST> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall28.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_IC_ZONE_MST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE
						.add(new IC_ZONE_MST(jsonData.getString("ZONE_CODE"), jsonData.getString("ZONE_DESC")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}

	public ArrayList<IC_CIRCLE_MST> listIC_CIRCLE_MST(String zoneCode) {
		ArrayList<IC_CIRCLE_MST> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall29.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_IC_CIRCLE_MST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(zoneCode);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE
						.add(new IC_CIRCLE_MST(jsonData.getString("CIRCLE_CODE"), jsonData.getString("CIRCLE_DESC")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}

	public ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER(String circleCode) {
		ArrayList<IC_LOCATION_MASTER> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall30.withCatalogName("PKG_SELECT_USER")
				.withProcedureName("SELECT_IC_LOCATION_MASTER")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(circleCode);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_LOCATION_MASTER(jsonData.getString("LOCATION_CODE"),
						jsonData.getString("LOCATION_NAME")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}
	
	public ArrayList<IC_ES_STAT_BILL_COLL_REC_DPDC> listIC_ES_STAT_BILL_COLL_REC_DPDC(String month) {
		ArrayList<IC_ES_STAT_BILL_COLL_REC_DPDC> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3005.withCatalogName("pkg_ES_DPDC_STATEMENT_16_17")
				.withProcedureName("dpd_DPDC_STAT_upto_nov2017")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ES_STAT_BILL_COLL_REC_DPDC(jsonData.optString("YRMON"),
						jsonData.optString("TOTENRGSALE"), jsonData.optString("TOTBILLAMT"), jsonData.optString("COLL"),
						jsonData.optString("REC_ENRG_PFC"), jsonData.optString("REC_PFC_132KV"),
						jsonData.optString("REC_ENRG"),jsonData.optString("REMARKS")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_ONE> listIC_ES_CAT_ACC_REC(String month) {
		ArrayList<IC_ES_CAT_ACC_REC_ONE> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall31.withCatalogName("pkg_ES_cat_wise_rec_Report")
				.withProcedureName("dpd_cat_wise_rec_upto1617")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ES_CAT_ACC_REC_ONE(jsonData.getString("YEAR_CODE"),
						jsonData.getString("REC_A"), jsonData.getString("REC_B"), jsonData.getString("REC_C"),
						jsonData.getString("REC_D"), jsonData.getString("REC_E"), jsonData.getString("REC_F"),
						jsonData.getString("REC_G1"), jsonData.getString("REC_G2"), jsonData.getString("REC_G3"),
						jsonData.getString("REC_H"), jsonData.getString("REC_I1"), jsonData.getString("REC_I2"),
						jsonData.getString("REC_I3"), jsonData.getString("REC_I5"), jsonData.getString("REC_J"), jsonData.getString("TOTAL")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_TWO> listIC_ES_CAT_ACC_REC2(String month) {
		ArrayList<IC_ES_CAT_ACC_REC_TWO> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall32.withCatalogName("pkg_ES_cat_wise_rec_Report")
				.withProcedureName("dpd_cat_wise_rec_from1718")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ES_CAT_ACC_REC_TWO(jsonData.getString("YRMON"),
						jsonData.getString("REC_LTA"), jsonData.getString("REC_LTB"), jsonData.getString("REC_LTC1"),
						jsonData.getString("REC_LTC2"), jsonData.getString("REC_LTD1"), jsonData.getString("REC_LTD3"),
						jsonData.getString("REC_LTE"), jsonData.getString("REC_LTT"), jsonData.getString("REC_MT1"),
						jsonData.getString("REC_MT2"), jsonData.getString("REC_MT3"), jsonData.getString("REC_MT4"),
						jsonData.getString("REC_MT5"), jsonData.getString("REC_MT6"),jsonData.getString("REC_EHT1"),jsonData.getString("REC_EHT2"),
						jsonData.getString("REC_HT1"),
						jsonData.getString("REC_HT2"), jsonData.getString("REC_HT3"), jsonData.getString("REC_HT4"),
						jsonData.getString("REC_LTD2"), jsonData.getString("REC_G1"), jsonData.getString("REC_I1"),
						jsonData.getString("REC_I2"), jsonData.getString("REC_I3"), jsonData.getString("REC_I5"),
						jsonData.getString("REC_DESA"), jsonData.getString("TOTAL")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}

	public ArrayList<IC_ES_CAT_NUM_OF_CONS_ONE> listIC_ES_CAT_NUM_OF_CONS(String month) {
		ArrayList<IC_ES_CAT_NUM_OF_CONS_ONE> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall33.withCatalogName("pkg_ES_cat_wise_cons")
				.withProcedureName("dpd_cat_wise_cons_upto1617")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ES_CAT_NUM_OF_CONS_ONE(jsonData.getString("YEAR_CODE"),
						jsonData.getString("REC_A"), jsonData.getString("REC_B"), jsonData.getString("REC_C"),
						jsonData.getString("REC_D"), jsonData.getString("REC_E"), jsonData.getString("REC_F"),
						jsonData.getString("REC_G1"), jsonData.getString("REC_G2"), jsonData.getString("REC_G3"),
						jsonData.getString("REC_H"), jsonData.getString("REC_I1"), jsonData.getString("REC_I2"),
						jsonData.getString("REC_I3"), jsonData.getString("REC_I5"), jsonData.getString("REC_J"), jsonData.getString("TOTAL")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}

	public ArrayList<IC_ES_CAT_NUM_OF_CONS_TWO> listIC_ES_CAT_NUM_OF_CONS2(String month) {
		ArrayList<IC_ES_CAT_NUM_OF_CONS_TWO> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall34.withCatalogName("pkg_ES_cat_wise_cons")
				.withProcedureName("dpd_cat_wise_cons_from1718")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ES_CAT_NUM_OF_CONS_TWO(jsonData.getString("YRMON"),
						jsonData.getString("REC_LTA"), jsonData.getString("REC_LTB"), jsonData.getString("REC_LTC1"),
						jsonData.getString("REC_LTC2"), jsonData.getString("REC_LTD1"), jsonData.getString("REC_LTD3"),
						jsonData.getString("REC_LTE"), jsonData.getString("REC_LTT"), jsonData.getString("REC_MT1"),
						jsonData.getString("REC_MT2"), jsonData.getString("REC_MT3"), jsonData.getString("REC_MT4"),
						jsonData.getString("REC_MT5"), jsonData.getString("REC_MT6"), jsonData.getString("REC_EHT1"), jsonData.getString("REC_EHT2"),
						jsonData.getString("REC_HT1"),
						jsonData.getString("REC_HT2"), jsonData.getString("REC_HT3"), jsonData.getString("REC_HT4"),
						jsonData.getString("REC_LTD2"), jsonData.getString("REC_G1"), jsonData.getString("REC_I1"),
						jsonData.getString("REC_I2"), jsonData.getString("REC_I3"), jsonData.getString("REC_I5"),
						jsonData.getString("REC_DESA"), jsonData.getString("TOTAL")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}

	public ArrayList<IC_ES_CAT_SALE_ENERGY_ONE> listIC_ES_CAT_SALE_ENERGY(String month) {
		ArrayList<IC_ES_CAT_SALE_ENERGY_ONE> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall37.withCatalogName("pkg_ES_cat_wise_EnrgSale")
				.withProcedureName("dpd_cat_wise_EnrgSale_upto1617")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ES_CAT_SALE_ENERGY_ONE(jsonData.getString("YEAR_CODE"),
						jsonData.getString("REC_A"), jsonData.getString("REC_B"), jsonData.getString("REC_C"),
						jsonData.getString("REC_D"), jsonData.getString("REC_E"), jsonData.getString("REC_F"),
						jsonData.getString("REC_G1"), jsonData.getString("REC_G2"), jsonData.getString("REC_G3"),
						jsonData.getString("REC_H"), jsonData.getString("REC_I1"), jsonData.getString("REC_I2"),
						jsonData.getString("REC_I3"), jsonData.getString("REC_I5"), jsonData.getString("REC_J"),jsonData.getString("TOTAL")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}

	public ArrayList<IC_ES_CAT_SALE_ENERGY_TWO> listIC_ES_CAT_SALE_ENERGY2(String month) {
		ArrayList<IC_ES_CAT_SALE_ENERGY_TWO> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall38.withCatalogName("pkg_ES_cat_wise_EnrgSale")
				.withProcedureName("dpd_cat_wise_EnrgSale_from1718")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ES_CAT_SALE_ENERGY_TWO(jsonData.getString("YRMON"),
						jsonData.getString("REC_LTA"), jsonData.getString("REC_LTB"), jsonData.getString("REC_LTC1"),
						jsonData.getString("REC_LTC2"), jsonData.getString("REC_LTD1"), jsonData.getString("REC_LTD3"),
						jsonData.getString("REC_LTE"), jsonData.getString("REC_LTT"), jsonData.getString("REC_MT1"),
						jsonData.getString("REC_MT2"), jsonData.getString("REC_MT3"), jsonData.getString("REC_MT4"),
						jsonData.getString("REC_MT5"), jsonData.getString("REC_MT6"),jsonData.getString("REC_EHT1"),
						jsonData.getString("REC_EHT2"), jsonData.getString("REC_HT1"),
						jsonData.getString("REC_HT2"), jsonData.getString("REC_HT3"), jsonData.getString("REC_HT4"),
						jsonData.getString("REC_LTD2"), jsonData.getString("REC_G1"), jsonData.getString("REC_I1"),
						jsonData.getString("REC_I2"), jsonData.getString("REC_I3"), jsonData.getString("REC_I5"),
						jsonData.getString("REC_DESA"),jsonData.getString("TOTAL")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}
	public ArrayList<IC_ES_CAT_REV_COLL_NET_ONE> listIC_ES_CAT_REV_COLL_NET(String month) {
		ArrayList<IC_ES_CAT_REV_COLL_NET_ONE> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall39.withCatalogName("pkg_ES_cat_wise_Coll_AMT")
				.withProcedureName("dpd_cat_wise_Coll_AMT_upto1617")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(MainControllerIC.officeCode,month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);
		
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ES_CAT_REV_COLL_NET_ONE(jsonData.getString("YEAR_CODE"),
						jsonData.getString("REC_A"),jsonData.getString("REC_B"),
						jsonData.getString("REC_C"),jsonData.getString("REC_D"),
						jsonData.getString("REC_E"),
						jsonData.getString("REC_F"),jsonData.getString("REC_G1"),
						jsonData.getString("REC_G2"),jsonData.getString("REC_G3"),
						jsonData.getString("REC_H"),jsonData.getString("REC_I1"),
						jsonData.getString("REC_I2"),jsonData.getString("REC_I3"),jsonData.getString("REC_I5"),
						jsonData.getString("REC_J"),jsonData.getString("TOTAL")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}
	public ArrayList<IC_ES_CAT_REV_COLL_NET_TWO> listIC_ES_CAT_REV_COLL_NET2(String month) {
		ArrayList<IC_ES_CAT_REV_COLL_NET_TWO> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall40.withCatalogName("pkg_ES_cat_wise_Coll_AMT")
				.withProcedureName("dpd_cat_wise_Coll_AMT_from1718")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(MainControllerIC.officeCode,month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);
		
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ES_CAT_REV_COLL_NET_TWO(jsonData.getString("YRMON"),
						jsonData.getString("REC_LTA"),jsonData.getString("REC_LTB"),
						jsonData.getString("REC_LTC1"),jsonData.getString("REC_LTC2"),
						jsonData.getString("REC_LTD1"),
						jsonData.getString("REC_LTD3"),jsonData.getString("REC_LTE"),
						jsonData.getString("REC_LTT"),jsonData.getString("REC_MT1"),
						jsonData.getString("REC_MT2"),jsonData.getString("REC_MT3"),
						jsonData.getString("REC_MT4"),jsonData.getString("REC_MT5"),jsonData.getString("REC_MT6"),
						jsonData.getString("REC_EHT1"),
						jsonData.getString("REC_EHT2"),
						jsonData.getString("REC_HT1"),jsonData.getString("REC_HT2"),
						jsonData.getString("REC_HT3"),jsonData.getString("REC_HT4"),
						jsonData.getString("REC_LTD2"),jsonData.getString("REC_G1"),
						jsonData.getString("REC_I1"),jsonData.getString("REC_I2"),
						jsonData.getString("REC_I3"),jsonData.getString("REC_I5"),
						jsonData.getString("REC_DESA"),jsonData.getString("TOTAL")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}
	
	///////////////
	
	public ArrayList<IC_ES_STAT_BILL_COLL_REC_DESCO> listIC_ES_STAT_BILL_COLL_REC_DESCO(String month) {
		ArrayList<IC_ES_STAT_BILL_COLL_REC_DESCO> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall41.withCatalogName("pkg_ES_DESCO_STATEMENT_04_05")
				.withProcedureName("dpd_DESCO_STATEMENT")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(MainControllerIC.officeCode,month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);
		
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ES_STAT_BILL_COLL_REC_DESCO(jsonData.getString("YRMON"),
						jsonData.getString("ENRGSALE"),jsonData.getString("BILLAMT"),
						jsonData.getString("COLL"),jsonData.getString("REC_ENRG_PFC"),
						jsonData.getString("REC_LPS"),
						jsonData.getString("REC_TOT")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}
	
	
	public ArrayList<IC_ES_STAT_BILL_COLL_REC_WZPDCL> listIC_ES_STAT_BILL_COLL_REC_WZPDCL(String month) {
		ArrayList<IC_ES_STAT_BILL_COLL_REC_WZPDCL> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall42.withCatalogName("pkg_ES_WZPDCL_STATEMENT_15_16")
				.withProcedureName("dpd_WZPDCL_STATEMENT")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(MainControllerIC.officeCode,month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);
		
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ES_STAT_BILL_COLL_REC_WZPDCL(jsonData.getString("YRMON"),
						jsonData.getString("ENRGSALE"),jsonData.getString("PFCSALE"),
						jsonData.getString("TOTENRGSALE"),jsonData.getString("ENRGBILLAMT"),
						jsonData.getString("PFCBILLAMT"),
						jsonData.getString("TOTBILLAMT"),jsonData.getString("COLL"),
						jsonData.getString("REC_ENRG_PFC"),jsonData.getString("REC_LPS"),jsonData.getString("REC_TOT")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}
	
	public ArrayList<IC_ES_STAT_BILL_COLL_REC_NESCO> listIC_ES_STAT_BILL_COLL_REC_NESCO(String month) {
		ArrayList<IC_ES_STAT_BILL_COLL_REC_NESCO> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall43.withCatalogName("pkg_ES_NESCO_STATEMENT_16_17")
				.withProcedureName("dpd_nesco_STATEMENT")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(MainControllerIC.officeCode,month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);
		
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ES_STAT_BILL_COLL_REC_NESCO(jsonData.getString("YRMON"),
						jsonData.getString("ENRGSALE"),jsonData.getString("PFCSALE"),
						jsonData.getString("TOTENRGSALE"),jsonData.getString("NRGBILLAMT"),
						jsonData.getString("PFCBILLAMT"),
						jsonData.getString("TOTBILLAMT"),jsonData.getString("COLL"),
						jsonData.getString("REC_ENRG_PFC"),jsonData.getString("REC_LPS"),jsonData.getString("REC_TOT")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}
	public ArrayList<IC_ES_MON_PER_MAG_COURT> listIC_ES_MON_PER_MAG_COURT(String month) {
		ArrayList<IC_ES_MON_PER_MAG_COURT> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall1000.withCatalogName("pkg_ES_mon_wise_magis_crt_per")
				.withProcedureName("dpd_mon_wise_magis_crt_per")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(MainControllerIC.officeCode,month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		
		
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				listIC_MISC_BILL_TYPE.add(new IC_ES_MON_PER_MAG_COURT(jsonData.optString("YRMON"),
						jsonData.optString("BAL_OF_PREV_MONTH"),jsonData.optString("CASES_FILED_PDB_OFF"),
						jsonData.optString("CASES_FILED_MOB_COURT"),jsonData.optString("CASES_FILED_TOTAL"),
						jsonData.optString("NO_OF_PER_JAILED"),
						jsonData.optString("NO_OF_PER_FINED"),jsonData.optString("NO_OF_PER_FINE_OR_JAIL"),
						jsonData.optString("OTHERS"),jsonData.optString("CASE_FINA_TOTAL")
						,jsonData.optString("NO_OF_PER_REDEMPTION"),jsonData.optString("NO_OF_PER_JUDGMENT"),jsonData.optString("DC_ILLEGAL_CON")
						,jsonData.optString("NO_OF_MOB_COURT_CONDU"),jsonData.optString("FINES_REALISED_TK"),jsonData.optString("BAL_NOS")));
			}
		}

		return listIC_MISC_BILL_TYPE;
	}
	
	public ArrayList<Month> listMONTH(String month) {
		ArrayList<Month>  months= new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3000.withCatalogName("pkg_ES_SECTOR_WISE_rec")
				.withProcedureName("dpd_Month_hdr")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		
		System.out.println("What??");
		System.out.println(result);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				months.add(new Month(jsonData.getString("MON1"),
						jsonData.getString("MON2"), jsonData.getString("MON3"), 
						jsonData.getString("MON4"),
						jsonData.getString("MON5"), jsonData.getString("MON6")
						));
			}
		}

		return months;
	}
	
	public ArrayList<DpdSector> listDpdSectors(String month) {
		ArrayList<DpdSector>  dpdSector= new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3001.withCatalogName("pkg_ES_SECTOR_WISE_rec")
				.withProcedureName("dpd_sector_wise_rec_BPDB")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		
//		System.out.println("testing");
//		System.out.println(result);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdSector.add(new DpdSector(jsonData.getString("SECT_NAME"),
						jsonData.getString("REC1"), jsonData.getString("REC2"), 
						jsonData.getString("REC3"),
						jsonData.getString("REC4"), jsonData.getString("REC5"),
						jsonData.getString("REC6"), jsonData.getString("EQM1"),
						jsonData.getString("EQM2"),
						jsonData.getString("EQM3"),jsonData.getString("EQM4"),
						jsonData.getString("EQM5"), jsonData.getString("EQM6")
						));
			}
		}

		return dpdSector;
	}
	
	public ArrayList<DpdSector> listDpdSectorwise(String month) {
		ArrayList<DpdSector>  dpdSector= new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3002.withCatalogName("pkg_ES_SECTOR_WISE_rec")
				.withProcedureName("dpd_sector_wise_rec_DPDC_DESA")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		System.out.println("problem");
		System.out.println(result);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdSector.add(new DpdSector(jsonData.getString("UC_TYPE_DESC"),
						jsonData.getString("REC1"), jsonData.getString("REC2"), 
						jsonData.getString("REC3"),
						jsonData.getString("REC4"), jsonData.getString("REC5"),
						jsonData.getString("REC6"),
//						jsonData.getString("EQM1"),
//						jsonData.getString("EQM2"),
//						jsonData.getString("EQM3"),jsonData.getString("EQM4"),
//						jsonData.getString("EQM5"), jsonData.getString("EQM6"),
						"","","","","",""
						));
			}
		}

		return dpdSector;
	}
	
	public ArrayList<IC_ES_ENRG_PUR_PAID_NEIG> IC_ES_ENRG_PUR_PAID_NEIG(String month) {
		ArrayList<IC_ES_ENRG_PUR_PAID_NEIG> IC_ES_ENRG_PUR_PAID_NEIG = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4008.withCatalogName("pkg_ES_Energy_pur_EIFNC")
				.withProcedureName("dpd_ENERGY_pur_and_paid_EIFNC")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				IC_ES_ENRG_PUR_PAID_NEIG
						.add(new IC_ES_ENRG_PUR_PAID_NEIG(jsonData.optString("YRMON"), jsonData.optString("EIFNC_NAME1"),
								jsonData.optString("ENERGY1"), jsonData.optString("BILL1"),jsonData.optString("RATE1"),jsonData.optString("EIFNC_NAME2"),
								jsonData.optString("ENERGY2"), jsonData.optString("BILL2"),jsonData.optString("RATE2"),jsonData.optString("EIFNC_NAME3"),
								jsonData.optString("ENERGY3"), jsonData.optString("BILL3"),jsonData.optString("RATE3"),jsonData.optString("EIFNC_NAME4"),
								jsonData.optString("ENERGY4"), jsonData.optString("BILL4"),jsonData.optString("RATE4"),jsonData.optString("EIFNC_NAME5"),
								jsonData.optString("ENERGY5"), jsonData.optString("BILL5"),jsonData.optString("RATE5"),jsonData.optString("EIFNC_NAME6"),
								jsonData.optString("ENERGY6"), jsonData.optString("BILL6"),jsonData.optString("RATE6"),jsonData.optString("EIFNC_NAME7"),
								jsonData.optString("ENERGY7"), jsonData.optString("BILL7"),jsonData.optString("RATE7"),jsonData.optString("ENERGYTOT"),jsonData.optString("BILLTOT1"),jsonData.optString("BILLTOT2")));
			}
		}

		return IC_ES_ENRG_PUR_PAID_NEIG;
	}
	
	public ArrayList<DpdSector> listDpdSectorUt(String month) {
		ArrayList<DpdSector>  dpdSector= new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3003.withCatalogName("pkg_ES_SECTOR_WISE_rec")
				.withProcedureName("dpd_sector_wise_rec_grand_tot")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdSector.add(new DpdSector(jsonData.optString("UC_TYPE_DESC"),
						jsonData.optString("REC1"), jsonData.optString("REC2"), 
						jsonData.optString("REC3"),
						jsonData.optString("REC4"), jsonData.optString("REC5"),
						jsonData.optString("REC6"), jsonData.optString("EQM1"),
						jsonData.optString("EQM2"),
						jsonData.optString("EQM3"),jsonData.optString("EQM4"),
						jsonData.optString("EQM5"), jsonData.optString("EQM6")
						));
			}
		}
		return dpdSector;
	}
	
	public ArrayList<DpdSector> listDpdSectorGrantot(String month) {
		ArrayList<DpdSector>  dpdSector= new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3004.withCatalogName("pkg_ES_SECTOR_WISE_rec")
				.withProcedureName("dpd_sector_wise_rec_ut_others")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdSector.add(new DpdSector(jsonData.optString("GRANDTOTAL"),
						jsonData.optString("REC1"), jsonData.optString("REC2"), 
						jsonData.optString("REC3"),
						jsonData.optString("REC4"), jsonData.optString("REC5"),
						jsonData.optString("REC6"), jsonData.optString("EQM1"),
						jsonData.optString("EQM2"),
						jsonData.optString("EQM3"),jsonData.optString("EQM4"),
						jsonData.optString("EQM5"), jsonData.optString("EQM6")
						));
			}
		}
		return dpdSector;
	}
	public ArrayList<EnergyPurAndPaidIpp> IC_ES_ENRG_PUR_PAID_IPPa(String month) {
		ArrayList<EnergyPurAndPaidIpp>  dpdSector= new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4000.withCatalogName("pkg_ES_Energy_pur_and_paid_ipp")
				.withProcedureName("dpd_ENERGY_pur_and_paid_ipp1")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdSector.add(new EnergyPurAndPaidIpp(jsonData.optString("YRMON"),
						jsonData.optString("IPP_NAME1"), jsonData.optString("ENERGY1"), 
						jsonData.optString("BILL1"),jsonData.optString("RATE1"),
						jsonData.optString("IPP_NAME2"), jsonData.optString("ENERGY2"), 
						jsonData.optString("BILL2"),jsonData.optString("RATE2"),
						jsonData.optString("IPP_NAME3"), jsonData.optString("ENERGY3"), 
						jsonData.optString("BILL3"),jsonData.optString("RATE3"),
						jsonData.optString("IPP_NAME4"), jsonData.optString("ENERGY4"), 
						jsonData.optString("BILL4"),jsonData.optString("RATE4"),
						jsonData.optString("IPP_NAME5"), jsonData.optString("ENERGY5"), 
						jsonData.optString("BILL5"),jsonData.optString("RATE5"),
						jsonData.optString("IPP_NAME6"), jsonData.optString("ENERGY6"), 
						jsonData.optString("BILL6"),jsonData.optString("RATE6"),
						jsonData.optString("IPP_NAME7"), jsonData.optString("ENERGY7"), 
						jsonData.optString("BILL7"),jsonData.optString("RATE7"),
						jsonData.optString("IPP_NAME8"), jsonData.optString("ENERGY8"), 
						jsonData.optString("BILL8"),jsonData.optString("RATE8"),
						jsonData.optString("IPP_NAME9"), jsonData.optString("ENERGY9"), 
						jsonData.optString("BILL9"),jsonData.optString("RATE9"),
						jsonData.optString("IPP_NAME10"), jsonData.optString("ENERGY10"), 
						jsonData.optString("BILL10"),jsonData.optString("RATE10"),
						jsonData.optString("IPP_NAME11"), jsonData.optString("ENERGY11"), 
						jsonData.optString("BILL11"),jsonData.optString("RATE11")			
						));
			}
		}
		return dpdSector;
	}
	
	public ArrayList<EnergyPurAndPaidIpp> IC_ES_ENRG_PUR_PAID_IPPb(String month) {
		ArrayList<EnergyPurAndPaidIpp>  dpdSector= new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4001.withCatalogName("pkg_ES_Energy_pur_and_paid_ipp")
				.withProcedureName("dpd_ENERGY_pur_and_paid_ipp2")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdSector.add(new EnergyPurAndPaidIpp(jsonData.optString("YRMON"),
						jsonData.optString("IPP_NAME1"), jsonData.optString("ENERGY1"), 
						jsonData.optString("BILL1"),jsonData.optString("RATE1"),
						jsonData.optString("IPP_NAME2"), jsonData.optString("ENERGY2"), 
						jsonData.optString("BILL2"),jsonData.optString("RATE2"),
						jsonData.optString("IPP_NAME3"), jsonData.optString("ENERGY3"), 
						jsonData.optString("BILL3"),jsonData.optString("RATE3"),
						jsonData.optString("IPP_NAME4"), jsonData.optString("ENERGY4"), 
						jsonData.optString("BILL4"),jsonData.optString("RATE4"),
						jsonData.optString("IPP_NAME5"), jsonData.optString("ENERGY5"), 
						jsonData.optString("BILL5"),jsonData.optString("RATE5"),
						jsonData.optString("IPP_NAME6"), jsonData.optString("ENERGY6"), 
						jsonData.optString("BILL6"),jsonData.optString("RATE6"),
						jsonData.optString("IPP_NAME7"), jsonData.optString("ENERGY7"), 
						jsonData.optString("BILL7"),jsonData.optString("RATE7"),
						jsonData.optString("IPP_NAME8"), jsonData.optString("ENERGY8"), 
						jsonData.optString("BILL8"),jsonData.optString("RATE8"),
						jsonData.optString("IPP_NAME9"), jsonData.optString("ENERGY9"), 
						jsonData.optString("BILL9"),jsonData.optString("RATE9"),
						jsonData.optString("IPP_NAME10"), jsonData.optString("ENERGY10"), 
						jsonData.optString("BILL10"),jsonData.optString("RATE10"),
						jsonData.optString("IPP_NAME11"), jsonData.optString("ENERGY11"), 
						jsonData.optString("BILL11"),jsonData.optString("RATE11")			
						));
			}
		}
		return dpdSector;
	}
	
	public ArrayList<EnergyPurAndPaidIpp> IC_ES_ENRG_PUR_PAID_IPPc(String month) {
		ArrayList<EnergyPurAndPaidIpp>  dpdSector= new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4002.withCatalogName("pkg_ES_Energy_pur_and_paid_ipp")
				.withProcedureName("dpd_ENERGY_pur_and_paid_ipp3")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdSector.add(new EnergyPurAndPaidIpp(jsonData.optString("YRMON"),
						jsonData.optString("IPP_NAME1"), jsonData.optString("ENERGY1"), 
						jsonData.optString("BILL1"),jsonData.optString("RATE1"),
						jsonData.optString("IPP_NAME2"), jsonData.optString("ENERGY2"), 
						jsonData.optString("BILL2"),jsonData.optString("RATE2"),
						jsonData.optString("IPP_NAME3"), jsonData.optString("ENERGY3"), 
						jsonData.optString("BILL3"),jsonData.optString("RATE3"),
						jsonData.optString("IPP_NAME4"), jsonData.optString("ENERGY4"), 
						jsonData.optString("BILL4"),jsonData.optString("RATE4"),
						jsonData.optString("IPP_NAME5"), jsonData.optString("ENERGY5"), 
						jsonData.optString("BILL5"),jsonData.optString("RATE5"),
						jsonData.optString("IPP_NAME6"), jsonData.optString("ENERGY6"), 
						jsonData.optString("BILL6"),jsonData.optString("RATE6"),
						jsonData.optString("IPP_NAME7"), jsonData.optString("ENERGY7"), 
						jsonData.optString("BILL7"),jsonData.optString("RATE7"),
						jsonData.optString("IPP_NAME8"), jsonData.optString("ENERGY8"), 
						jsonData.optString("BILL8"),jsonData.optString("RATE8"),
						jsonData.optString("IPP_NAME9"), jsonData.optString("ENERGY9"), 
						jsonData.optString("BILL9"),jsonData.optString("RATE9"),
						jsonData.optString("IPP_NAME10"), jsonData.optString("ENERGY10"), 
						jsonData.optString("BILL10"),jsonData.optString("RATE10"),
						jsonData.optString("IPP_NAME11"), jsonData.optString("ENERGY11"), 
						jsonData.optString("BILL11"),jsonData.optString("RATE11")			
						));
			}
		}
		return dpdSector;
	}
	
	public ArrayList<EnergyPurAndPaidIpp> IC_ES_ENRG_PUR_PAID_IPPd(String month) {
		ArrayList<EnergyPurAndPaidIpp>  dpdSector= new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4003.withCatalogName("pkg_ES_Energy_pur_and_paid_ipp")
				.withProcedureName("dpd_ENERGY_pur_and_paid_ipp4")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdSector.add(new EnergyPurAndPaidIpp(jsonData.optString("YRMON"),
						jsonData.optString("IPP_NAME1"), jsonData.optString("ENERGY1"), 
						jsonData.optString("BILL1"),jsonData.optString("RATE1"),
						jsonData.optString("IPP_NAME2"), jsonData.optString("ENERGY2"), 
						jsonData.optString("BILL2"),jsonData.optString("RATE2"),
						jsonData.optString("IPP_NAME3"), jsonData.optString("ENERGY3"), 
						jsonData.optString("BILL3"),jsonData.optString("RATE3"),
						jsonData.optString("IPP_NAME4"), jsonData.optString("ENERGY4"), 
						jsonData.optString("BILL4"),jsonData.optString("RATE4"),
						jsonData.optString("IPP_NAME5"), jsonData.optString("ENERGY5"), 
						jsonData.optString("BILL5"),jsonData.optString("RATE5"),
						jsonData.optString("IPP_NAME6"), jsonData.optString("ENERGY6"), 
						jsonData.optString("BILL6"),jsonData.optString("RATE6"),
						jsonData.optString("IPP_NAME7"), jsonData.optString("ENERGY7"), 
						jsonData.optString("BILL7"),jsonData.optString("RATE7"),
						jsonData.optString("IPP_NAME8"), jsonData.optString("ENERGY8"), 
						jsonData.optString("BILL8"),jsonData.optString("RATE8"),
						jsonData.optString("IPP_NAME9"), jsonData.optString("ENERGY9"), 
						jsonData.optString("BILL9"),jsonData.optString("RATE9"),
						jsonData.optString("IPP_NAME10"), jsonData.optString("ENERGY10"), 
						jsonData.optString("BILL10"),jsonData.optString("RATE10"),
						jsonData.optString("IPP_NAME11"), jsonData.optString("ENERGY11"), 
						jsonData.optString("BILL11"),jsonData.optString("RATE11")			
						));
			}
		}
		return dpdSector;
	}
	
	public ArrayList<EnergyPurAndPaidIpp> IC_ES_ENRG_PUR_PAID_IPPe(String month) {
		ArrayList<EnergyPurAndPaidIpp>  dpdSector= new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4004.withCatalogName("pkg_ES_Energy_pur_and_paid_ipp")
				.withProcedureName("dpd_ENERGY_pur_and_paid_ipp5")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdSector.add(new EnergyPurAndPaidIpp(jsonData.optString("YRMON"),
						jsonData.optString("IPP_NAME1"), jsonData.optString("ENERGY1"), 
						jsonData.optString("BILL1"),jsonData.optString("RATE1"),
						jsonData.optString("IPP_NAME2"), jsonData.optString("ENERGY2"), 
						jsonData.optString("BILL2"),jsonData.optString("RATE2"),
						jsonData.optString("IPP_NAME3"), jsonData.optString("ENERGY3"), 
						jsonData.optString("BILL3"),jsonData.optString("RATE3"),
						jsonData.optString("IPP_NAME4"), jsonData.optString("ENERGY4"), 
						jsonData.optString("BILL4"),jsonData.optString("RATE4"),
						jsonData.optString("IPP_NAME5"), jsonData.optString("ENERGY5"), 
						jsonData.optString("BILL5"),jsonData.optString("RATE5"),
						jsonData.optString("IPP_NAME6"), jsonData.optString("ENERGY6"), 
						jsonData.optString("BILL6"),jsonData.optString("RATE6"),
						jsonData.optString("IPP_NAME7"), jsonData.optString("ENERGY7"), 
						jsonData.optString("BILL7"),jsonData.optString("RATE7"),
						jsonData.optString("IPP_NAME8"), jsonData.optString("ENERGY8"), 
						jsonData.optString("BILL8"),jsonData.optString("RATE8"),
						jsonData.optString("IPP_NAME9"), jsonData.optString("ENERGY9"), 
						jsonData.optString("BILL9"),jsonData.optString("RATE9"),
						jsonData.optString("IPP_NAME10"), jsonData.optString("ENERGY10"), 
						jsonData.optString("BILL10"),jsonData.optString("RATE10"),
						jsonData.optString("IPP_NAME11"), jsonData.optString("ENERGY11"), 
						jsonData.optString("BILL11"),jsonData.optString("RATE11")			
						));
			}
		}
		return dpdSector;
	}
	
	public ArrayList<EnergyPurAndPaidIpp> IC_ES_ENRG_PUR_PAID_IPPf(String month) {
		ArrayList<EnergyPurAndPaidIpp>  dpdSector= new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4005.withCatalogName("pkg_ES_Energy_pur_and_paid_ipp")
				.withProcedureName("dpd_ENERGY_pur_and_paid_ipp6")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdSector.add(new EnergyPurAndPaidIpp(jsonData.optString("YRMON"),
						jsonData.optString("IPP_NAME1"), jsonData.optString("ENERGY1"), 
						jsonData.optString("BILL1"),jsonData.optString("RATE1"),
						jsonData.optString("IPP_NAME2"), jsonData.optString("ENERGY2"), 
						jsonData.optString("BILL2"),jsonData.optString("RATE2"),
						jsonData.optString("IPP_NAME3"), jsonData.optString("ENERGY3"), 
						jsonData.optString("BILL3"),jsonData.optString("RATE3"),
						jsonData.optString("IPP_NAME4"), jsonData.optString("ENERGY4"), 
						jsonData.optString("BILL4"),jsonData.optString("RATE4"),
						jsonData.optString("IPP_NAME5"), jsonData.optString("ENERGY5"), 
						jsonData.optString("BILL5"),jsonData.optString("RATE5"),
						jsonData.optString("IPP_NAME6"), jsonData.optString("ENERGY6"), 
						jsonData.optString("BILL6"),jsonData.optString("RATE6"),
						jsonData.optString("IPP_NAME7"), jsonData.optString("ENERGY7"), 
						jsonData.optString("BILL7"),jsonData.optString("RATE7"),
						jsonData.optString("IPP_NAME8"), jsonData.optString("ENERGY8"), 
						jsonData.optString("BILL8"),jsonData.optString("RATE8"),
						jsonData.optString("IPP_NAME9"), jsonData.optString("ENERGY9"), 
						jsonData.optString("BILL9"),jsonData.optString("RATE9"),
						jsonData.optString("IPP_NAME10"), jsonData.optString("ENERGY10"), 
						jsonData.optString("BILL10"),jsonData.optString("RATE10"),
						jsonData.optString("IPP_NAME11"), jsonData.optString("ENERGY11"), 
						jsonData.optString("BILL11"),jsonData.optString("RATE11")			
						));
			}
		}
		return dpdSector;
	}
	
	public ArrayList<EnergyPurAndPaidIpp> IC_ES_ENRG_PUR_PAID_IPPg(String month) {
		ArrayList<EnergyPurAndPaidIpp>  dpdSector= new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4006.withCatalogName("pkg_ES_Energy_pur_and_paid_ipp")
				.withProcedureName("dpd_ENERGY_pur_and_paid_ipp7")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdSector.add(new EnergyPurAndPaidIpp(jsonData.optString("YRMON"),
						jsonData.optString("IPP_NAME1"), jsonData.optString("ENERGY1"), 
						jsonData.optString("BILL1"),jsonData.optString("RATE1"),
						jsonData.optString("IPP_NAME2"), jsonData.optString("ENERGY2"), 
						jsonData.optString("BILL2"),jsonData.optString("RATE2"),
						jsonData.optString("IPP_NAME3"), jsonData.optString("ENERGY3"), 
						jsonData.optString("BILL3"),jsonData.optString("RATE3"),
						jsonData.optString("IPP_NAME4"), jsonData.optString("ENERGY4"), 
						jsonData.optString("BILL4"),jsonData.optString("RATE4"),
						jsonData.optString("IPP_NAME5"), jsonData.optString("ENERGY5"), 
						jsonData.optString("BILL5"),jsonData.optString("RATE5"),
						jsonData.optString("IPP_NAME6"), jsonData.optString("ENERGY6"), 
						jsonData.optString("BILL6"),jsonData.optString("RATE6"),
						jsonData.optString("IPP_NAME7"), jsonData.optString("ENERGY7"), 
						jsonData.optString("BILL7"),jsonData.optString("RATE7"),
						jsonData.optString("IPP_NAME8"), jsonData.optString("ENERGY8"), 
						jsonData.optString("BILL8"),jsonData.optString("RATE8"),
						jsonData.optString("IPP_NAME9"), jsonData.optString("ENERGY9"), 
						jsonData.optString("BILL9"),jsonData.optString("RATE9"),
						jsonData.optString("IPP_NAME10"), jsonData.optString("ENERGY10"), 
						jsonData.optString("BILL10"),jsonData.optString("RATE10"),
						jsonData.optString("IPP_NAME11"), jsonData.optString("ENERGY11"), 
						jsonData.optString("BILL11"),jsonData.optString("RATE11")			
						));
			}
		}
		return dpdSector;
	}
	public ArrayList<EnergyPurAndPaidIpp> IC_ES_ENRG_PUR_PAID_IPPh(String month) {
		ArrayList<EnergyPurAndPaidIpp>  dpdSector= new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4007.withCatalogName("pkg_ES_Energy_pur_and_paid_ipp")
				.withProcedureName("dpd_ENERGY_pur_and_paid_ipp8")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdSector.add(new EnergyPurAndPaidIpp(jsonData.optString("YRMON"),
						jsonData.optString("IPP_NAME1"), jsonData.optString("ENERGY1"), 
						jsonData.optString("BILL1"),jsonData.optString("RATE1"),
						jsonData.optString("IPP_NAME2"), jsonData.optString("ENERGY2"), 
						jsonData.optString("BILL2"),jsonData.optString("RATE2"),
						jsonData.optString("IPP_NAME3"), jsonData.optString("ENERGY3"), 
						jsonData.optString("BILL3"),jsonData.optString("RATE3"),
						jsonData.optString("IPP_NAME4"), jsonData.optString("ENERGY4"), 
						jsonData.optString("BILL4"),jsonData.optString("RATE4"),
						jsonData.optString("IPP_NAME5"), jsonData.optString("ENERGY5"), 
						jsonData.optString("BILL5"),jsonData.optString("RATE5"),
						jsonData.optString("IPP_NAME6"), jsonData.optString("ENERGY6"), 
						jsonData.optString("BILL6"),jsonData.optString("RATE6"),
						jsonData.optString("IPP_NAME7"), jsonData.optString("ENERGY7"), 
						jsonData.optString("BILL7"),jsonData.optString("RATE7"),
						jsonData.optString("IPP_NAME8"), jsonData.optString("ENERGY8"), 
						jsonData.optString("BILL8"),jsonData.optString("RATE8"),
						jsonData.optString("IPP_NAME9"), jsonData.optString("ENERGY9"), 
						jsonData.optString("BILL9"),jsonData.optString("RATE9"),
						jsonData.optString("IPP_NAME10"), jsonData.optString("ENERGY10"), 
						jsonData.optString("BILL10"),jsonData.optString("RATE10"),
						"",jsonData.optString("ENERGYTOT"), jsonData.optString("BILLTOT"), 
						jsonData.optString("RATETOT")			
						));
			}
		}
		return dpdSector;
	}
}
