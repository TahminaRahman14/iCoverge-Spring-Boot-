package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import oracle.jdbc.OracleTypes;

@Controller
public class MainControllerIC {
	@Resource
	ICDao icDao;
	@Resource
	IConvDao i;
	@Resource
	ICONVDaoRafi iconvDaoRafi;
	@Resource
	IConvergeDaoSurovi convergeDaoSurovi;
	@Resource
	RowSqlDao rowSqlDao;

	public static String dynamicMenu = "";
	public static String yearCode = "";
	public static String zoneCode = "";
	public static String circleCode = "";
	public static String zoneName = "";
	public static String circleName = "";
	public static String officeCode = "";
	public static String user_name = "";

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
	SimpleJdbcCall getAllStatesJdbcCall101;
	SimpleJdbcCall getAllStatesJdbcCall102;
	SimpleJdbcCall getAllStatesJdbcCall103;
	SimpleJdbcCall getAllStatesJdbcCall104;
	SimpleJdbcCall getAllStatesJdbcCall105;
	SimpleJdbcCall getAllStatesJdbcCall106;
	SimpleJdbcCall getAllStatesJdbcCall107;
	SimpleJdbcCall getAllStatesJdbcCall108;
	SimpleJdbcCall getAllStatesJdbcCall109;
	SimpleJdbcCall getAllStatesJdbcCall110;

	SimpleJdbcCall getAllStatesJdbcCall111;
	SimpleJdbcCall getAllStatesJdbcCall112;
	SimpleJdbcCall getAllStatesJdbcCall113;
	SimpleJdbcCall getAllStatesJdbcCall114;
	SimpleJdbcCall getAllStatesJdbcCall115;
	SimpleJdbcCall getAllStatesJdbcCall116;
	SimpleJdbcCall getAllStatesJdbcCall117;
	SimpleJdbcCall getAllStatesJdbcCall118;
	SimpleJdbcCall getAllStatesJdbcCall119;
	SimpleJdbcCall getAllStatesJdbcCall120;

	SimpleJdbcCall getAllStatesJdbcCall121;
	SimpleJdbcCall getAllStatesJdbcCall122;
	SimpleJdbcCall getAllStatesJdbcCall123;
	SimpleJdbcCall getAllStatesJdbcCall124;
	SimpleJdbcCall getAllStatesJdbcCall125;
	SimpleJdbcCall getAllStatesJdbcCall126;

	SimpleJdbcCall getAllStatesJdbcCall217;
	SimpleJdbcCall getAllStatesJdbcCall219;
	SimpleJdbcCall getAllStatesJdbcCall220;

	SimpleJdbcCall getAllStatesJdbcCall300;
	SimpleJdbcCall getAllStatesJdbcCall301;
	SimpleJdbcCall getAllStatesJdbcCall302;

	SimpleJdbcCall getAllStatesJdbcCall400;
	SimpleJdbcCall getAllStatesJdbcCall401;
	SimpleJdbcCall getAllStatesJdbcCall402;
	SimpleJdbcCall getAllStatesJdbcCall403;
	SimpleJdbcCall getAllStatesJdbcCall404;
	SimpleJdbcCall getAllStatesJdbcCall405;
	SimpleJdbcCall getAllStatesJdbcCall406;
	SimpleJdbcCall getAllStatesJdbcCall407;
	SimpleJdbcCall getAllStatesJdbcCall408;
	SimpleJdbcCall getAllStatesJdbcCall409;
	SimpleJdbcCall getAllStatesJdbcCall410;
	SimpleJdbcCall getAllStatesJdbcCall411;
	SimpleJdbcCall getAllStatesJdbcCall412;
	SimpleJdbcCall getAllStatesJdbcCall413;
	SimpleJdbcCall getAllStatesJdbcCall414;
	SimpleJdbcCall getAllStatesJdbcCall415;
	SimpleJdbcCall getAllStatesJdbcCall416;

	SimpleJdbcCall getAllStatesJdbcCall517;
	SimpleJdbcCall getAllStatesJdbcCall518;

	SimpleJdbcCall getAllStatesJdbcCall1000;

	public MainControllerIC(DataSource dataSource) {
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
		this.getAllStatesJdbcCall101 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall102 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall103 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall104 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall105 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall106 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall107 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall108 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall109 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall110 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall111 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall112 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall113 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall114 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall115 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall116 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall117 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall118 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall119 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall120 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall121 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall122 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall123 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall124 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall125 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall126 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall217 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall219 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall220 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall300 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall301 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall302 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall400 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall401 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall402 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall403 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall404 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall405 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall406 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall407 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall408 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall409 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall410 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall411 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall412 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall413 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall414 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall415 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall416 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall517 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall518 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall1000 = new SimpleJdbcCall(dataSource);

	}

	@GetMapping("/")
	public String Login(Model model) {
		LoginModel login = new LoginModel();
		model.addAttribute("login", login);

		return "login";
	}

	@GetMapping("/logout")
	public String LogOut(Model model) {
		dynamicMenu = "";
		LoginModel login = new LoginModel();
		model.addAttribute("login", login);

		return "login";
	}

	@PostMapping("/")
	public String loginUser(Model model, LoginModel user) {
		LoginModel user1 = icDao.getLogin(user.getP_User_Id(), user.getP_Password());

//		System.out.println(user);
		if (user1 != null) {
			if (user1.getP_User_Id().equals(user.getP_User_Id())
					&& user1.getP_Password().equals(user.getP_Password())) {
				dynamicMenu = icDao.getDynamicMenu();
				user_name = user1.getP_User_Id();
				officeCode = user1.getOfficeCode();

				return "redirect:/Home";
			} else {
				return "redirect:/";
			}

		} else {

			LoginModel login = new LoginModel();
			model.addAttribute("login", login);

			String msg = "User Id Password Missmatch! Login Failed";
			model.addAttribute("msg", msg);
			return "login";
		}

	}

	@GetMapping("/Home")
	public String Home(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "Home";
	}

	@GetMapping("/IC_YEAR_MST")
	public String IC_YEAR_MST(Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */

		String flag = "0";

		IC_YEAR_MST ic_YEAR_MST = new IC_YEAR_MST();

		ArrayList<IC_YEAR_MST> listIC_YEAR_MST = icDao.listIC_YEAR_MST();
		model.addAttribute("ic_YEAR_MST", ic_YEAR_MST);
		model.addAttribute("listIC_YEAR_MST", listIC_YEAR_MST);
		model.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_YEAR_MST";
	}

	@GetMapping("/IC_YEAR_MST/{id}")
	public String IC_YEAR_MST_single(@PathVariable("id") int id, Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */
		String flag = "1";

		IC_YEAR_MST ic_YEAR_MST = icDao.singleIC_YEAR_MST(id);

		ArrayList<IC_YEAR_MST> listIC_YEAR_MST = icDao.listIC_YEAR_MST();
		model.addAttribute("ic_YEAR_MST", ic_YEAR_MST);
		model.addAttribute("listIC_YEAR_MST", listIC_YEAR_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_YEAR_MST";
	}

	@PostMapping("/IC_YEAR_MST")
	public String IC_YEAR_MST_save(IC_YEAR_MST ic_YEAR_MST) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		String out = icDao.insertIC_YEAR_MST(ic_YEAR_MST);

		if (out.equals("1")) {
			return "redirect:/IC_YEAR_MST";
		} else {
			return null;
		}

	}

	@PostMapping("/IC_YEAR_MST/{id}")
	public String IC_YEAR_MST_edit(@PathVariable("id") String id, Model model, IC_YEAR_MST ic_YEAR_MST) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		ic_YEAR_MST.setYR_ID(id);

		String out = icDao.editIC_YEAR_MST(ic_YEAR_MST);

		if (out.equals("1")) {
			return "redirect:/IC_YEAR_MST";
		} else {
			return null;
		}
	}

	@PostMapping("/IC_YEAR_MST_delete/{id}")
	public String IC_YEAR_MST_delete(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		String out = icDao.deleteIC_YEAR_MST(id);

		if (out.equals("1")) {
			return "redirect:/IC_YEAR_MST";
		} else {
			return null;
		}
	}

	@PostMapping("/IC_YEAR_MST_clear/{id}")
	public String IC_YEAR_TYPE_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		return "redirect:/IC_YEAR_MST";
	}

	@GetMapping("/IC_YR_TARGET")
	public String IC_YR_TARGET(Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */

		ArrayList<IC_YEAR_MST> listIC_YEAR_MST = icDao.listIC_YEAR_MST();
		model.addAttribute("listIC_YEAR_MST", listIC_YEAR_MST);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_YR_TARGET";
	}

	@GetMapping("/IC_BPDB_TARGET/{id}")
	public String IC_BPDB_TARGET(@PathVariable("id") String id, Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */
		yearCode = id;
		String flag = "0";

		IC_BPDB_TARGET ic_bpdb_target = new IC_BPDB_TARGET();

		ArrayList<IC_BPDB_TARGET> listIC_BPDB_TARGET = icDao.listIC_BPDB_TARGET(yearCode);
		model.addAttribute("IC_BPDB_TARGET", ic_bpdb_target);
		model.addAttribute("listIC_BPDB_TARGET", listIC_BPDB_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_BPDB_TARGET";
	}

	@GetMapping("/IC_BPDB_TARGET_S/{id}")
	public String IC_BPDB_TARGET_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_BPDB_TARGET ic_bpdb_target = icDao.singleIC_BPDB_TARGET(id);

		ArrayList<IC_BPDB_TARGET> listIC_BPDB_TARGET = icDao.listIC_BPDB_TARGET(yearCode);
		model.addAttribute("IC_BPDB_TARGET", ic_bpdb_target);
		model.addAttribute("listIC_BPDB_TARGET", listIC_BPDB_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_BPDB_TARGET";
	}

	@PostMapping("/IC_BPDB_TARGET")
	public String IC_BPDB_TARGET_save(IC_BPDB_TARGET ic_BPDB_TARGET) {

		String out = icDao.insertIC_BPDB_TARGET(ic_BPDB_TARGET);
		String ss = "redirect:/IC_BPDB_TARGET/" + ic_BPDB_TARGET.getYEAR_CODE();
		if (out.equals("1")) {
			return ss;
		} else {
			return null;
		}

	}

	@PostMapping("/IC_BPDB_TARGET/{id}")
	public String IC_BPDB_TARGET_edit(@PathVariable("id") int id, Model model, IC_BPDB_TARGET ic_BPDB_TARGET) {

		ic_BPDB_TARGET.setBPDB_TARGET_ID(id);

		String out = icDao.updateIC_BPDB_TARGET(ic_BPDB_TARGET);
		if (out.equals("1")) {
			return "redirect:/IC_BPDB_TARGET/" + ic_BPDB_TARGET.getYEAR_CODE();
		} else {
			return null;
		}

	}

	@PostMapping("/IC_BPDB_TARGET_delete/{id}")
	public String IC_BPDB_TARGET_delete(@PathVariable("id") int id, Model model, IC_BPDB_TARGET ic_BPDB_TARGET) {
		ic_BPDB_TARGET.setBPDB_TARGET_ID(id);
		String out = icDao.deleteIC_BPDB_TARGET(id);

		if (out.equals("1")) {
			return "redirect:/IC_BPDB_TARGET/" + ic_BPDB_TARGET.getYEAR_CODE();
		} else {
			return null;
		}
	}

	@PostMapping("/IC_BPDB_MST_clear/{id}")
	public String IC_YEAR_TYPE_clear(@PathVariable("id") int id, Model model, IC_BPDB_TARGET ic_BPDB_TARGET) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		return "redirect:/IC_BPDB_TARGET/" + ic_BPDB_TARGET.getYEAR_CODE();
	}

	@GetMapping("/IC_ZONE_TARGET/{id}")
	public String IC_ZONE_TARGET(@PathVariable("id") String id, Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */

		String flag = "0";

		IC_ZONE_TARGET ic_bpdb_target = new IC_ZONE_TARGET();

		ArrayList<IC_ZONE_TARGET> listIC_ZONE_TARGET = icDao.listIC_ZONE_TARGET(yearCode);
		model.addAttribute("IC_ZONE_TARGET", ic_bpdb_target);
		model.addAttribute("listIC_ZONE_TARGET", listIC_ZONE_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_ZONE_MST> ic_ZONE_MSTs = icDao.listIC_ZONE_MST();
		model.addAttribute("ic_ZONE_MSTs", ic_ZONE_MSTs);
		return "IC_ZONE_TARGET";
	}

	@GetMapping("/IC_ZONE_TARGET_S/{id}")
	public String IC_ZONE_TARGET_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_ZONE_TARGET ic_ZONE_target = icDao.singleIC_ZONE_TARGET(id);
		zoneName = ic_ZONE_target.ZONE_NAME;
		yearCode = ic_ZONE_target.YEAR_CODE;
		ArrayList<IC_ZONE_TARGET> listIC_ZONE_TARGET = icDao.listIC_ZONE_TARGET(yearCode);

		model.addAttribute("IC_ZONE_TARGET", ic_ZONE_target);
		model.addAttribute("listIC_ZONE_TARGET", listIC_ZONE_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_ZONE_MST> ic_ZONE_MSTs = icDao.listIC_ZONE_MST();
		model.addAttribute("ic_ZONE_MSTs", ic_ZONE_MSTs);
		return "IC_ZONE_TARGET";
	}

	@PostMapping("/IC_ZONE_TARGET")
	public String IC_ZONE_TARGET_save(IC_ZONE_TARGET ic_ZONE_TARGET) {

		String out = icDao.insertIC_ZONE_TARGET(ic_ZONE_TARGET);
		String ss = "redirect:/IC_ZONE_TARGET/" + ic_ZONE_TARGET.getYEAR_CODE();
		if (out.equals("1")) {
			return ss;
		} else {
			return ss;
		}

	}

	@PostMapping("/IC_ZONE_TARGET/{id}")
	public String IC_ZONE_TARGET_edit(@PathVariable("id") int id, Model model, IC_ZONE_TARGET ic_ZONE_TARGET) {

		ic_ZONE_TARGET.setZONE_TARGET_ID(id);

		String out = icDao.updateIC_ZONE_TARGET(ic_ZONE_TARGET);
		if (out.equals("1")) {
			return "redirect:/IC_ZONE_TARGET/" + ic_ZONE_TARGET.getYEAR_CODE();
		} else {
			return null;
		}

	}

	@PostMapping("/IC_ZONE_TARGET_delete/{id}")
	public String IC_ZONE_TARGET_delete(@PathVariable("id") int id, Model model, IC_ZONE_TARGET ic_ZONE_TARGET) {
		ic_ZONE_TARGET.setZONE_TARGET_ID(id);
		String out = icDao.deleteIC_ZONE_TARGET(id);

		if (out.equals("1")) {
			return "redirect:/IC_ZONE_TARGET/" + ic_ZONE_TARGET.getYEAR_CODE();
		} else {
			return null;
		}
	}

	@PostMapping("/IC_ZONE_TARGET_clear/{id}")
	public String IC_IC_ZONE_TARGET_clear(@PathVariable("id") int id, Model model, IC_ZONE_TARGET ic_ZONE_TARGET) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		return "redirect:/IC_ZONE_TARGET/" + ic_ZONE_TARGET.getYEAR_CODE();
	}

	@GetMapping("/IC_CIRCLE_TARGET/{id}")
	public String IC_CIRCLE_TARGET(@PathVariable("id") String id, Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */
		zoneCode = id;
		String flag = "0";

		IC_CIRCLE_TARGET ic_bpdb_target = new IC_CIRCLE_TARGET();

		ArrayList<IC_CIRCLE_TARGET> listIC_CIRCLE_TARGET = icDao.listIC_CIRCLE_TARGET(yearCode, zoneCode);

		model.addAttribute("IC_CIRCLE_TARGET", ic_bpdb_target);
		model.addAttribute("listIC_CIRCLE_TARGET", listIC_CIRCLE_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		model.addAttribute("zoneCode", zoneCode);
		model.addAttribute("zoneName", zoneName);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_CIRCLE_MST> ic_CIRCLE_MSTs = icDao.listIC_CIRCLE_MST(zoneCode);
		model.addAttribute("ic_CIRCLE_MSTs", ic_CIRCLE_MSTs);
		return "IC_CIRCLE_TARGET";
	}

	@GetMapping("/IC_CIRCLE_TARGET_S/{id}")
	public String IC_CIRCLE_TARGET_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_CIRCLE_TARGET ic_CIRCLE_target = icDao.singleIC_CIRCLE_TARGET(id);
		circleName = ic_CIRCLE_target.CIRCLE_NAME;
		ArrayList<IC_CIRCLE_TARGET> listIC_CIRCLE_TARGET = icDao.listIC_CIRCLE_TARGET(yearCode, zoneCode);

		model.addAttribute("IC_CIRCLE_TARGET", ic_CIRCLE_target);
		model.addAttribute("listIC_CIRCLE_TARGET", listIC_CIRCLE_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		model.addAttribute("zoneCode", zoneCode);
		model.addAttribute("zoneName", zoneName);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_CIRCLE_MST> ic_CIRCLE_MSTs = icDao.listIC_CIRCLE_MST(zoneCode);
		model.addAttribute("ic_CIRCLE_MSTs", ic_CIRCLE_MSTs);
		return "IC_CIRCLE_TARGET";
	}

	@PostMapping("/IC_CIRCLE_TARGET")
	public String IC_CIRCLE_TARGET_save(IC_CIRCLE_TARGET ic_CIRCLE_TARGET) {

		String out = icDao.insertIC_CIRCLE_TARGET(ic_CIRCLE_TARGET);
		String ss = "redirect:/IC_CIRCLE_TARGET/" + ic_CIRCLE_TARGET.getYEAR_CODE();
		if (out.equals("1")) {
			return ss;
		} else {
			return ss;
		}

	}

	@PostMapping("/IC_CIRCLE_TARGET/{id}")
	public String IC_CIRCLE_TARGET_edit(@PathVariable("id") int id, Model model, IC_CIRCLE_TARGET ic_CIRCLE_TARGET) {

		ic_CIRCLE_TARGET.setCIRCLE_TARGET_ID(id);

		String out = icDao.updateIC_CIRCLE_TARGET(ic_CIRCLE_TARGET);
		if (out.equals("1")) {
			return "redirect:/IC_CIRCLE_TARGET/" + ic_CIRCLE_TARGET.getYEAR_CODE();
		} else {
			return null;
		}

	}

	@PostMapping("/IC_CIRCLE_TARGET_delete/{id}")
	public String IC_CIRCLE_TARGET_delete(@PathVariable("id") int id, Model model, IC_CIRCLE_TARGET ic_CIRCLE_TARGET) {
		ic_CIRCLE_TARGET.setCIRCLE_TARGET_ID(id);
		String out = icDao.deleteIC_CIRCLE_TARGET(id);

		if (out.equals("1")) {
			return "redirect:/IC_CIRCLE_TARGET/" + ic_CIRCLE_TARGET.getYEAR_CODE();
		} else {
			return null;
		}
	}

	@PostMapping("/IC_CIRCLE_TARGET_clear/{id}")
	public String IC_IC_CIRCLE_TARGET_clear(@PathVariable("id") int id, Model model,
			IC_CIRCLE_TARGET ic_CIRCLE_TARGET) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		return "redirect:/IC_CIRCLE_TARGET/" + ic_CIRCLE_TARGET.getYEAR_CODE();
	}

	@GetMapping("/IC_LOC_TARGET/{id}")
	public String IC_LOC_TARGET(@PathVariable("id") String id, Model model) {
		/*
		 * if (dynamicMenu.equals("")) { return "redirect:/"; }
		 */
		circleCode = id;
		String flag = "0";

		IC_LOC_TARGET ic_bpdb_target = new IC_LOC_TARGET();

		ArrayList<IC_LOC_TARGET> listIC_LOC_TARGET = icDao.listIC_LOC_TARGET(yearCode, circleCode);

		model.addAttribute("IC_LOC_TARGET", ic_bpdb_target);
		model.addAttribute("listIC_LOC_TARGET", listIC_LOC_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		model.addAttribute("zoneCode", zoneCode);
		model.addAttribute("zoneName", zoneName);
		model.addAttribute("circleCode", circleCode);
		model.addAttribute("circleName", circleName);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_LOCATION_MASTER> ic_LOCATION_MASTERs = icDao.listIC_LOCATION_MASTER(circleCode);
		model.addAttribute("ic_LOCATION_MASTERs", ic_LOCATION_MASTERs);
		return "IC_LOC_TARGET";
	}

	@GetMapping("/IC_LOC_TARGET_S/{id}")
	public String IC_LOC_TARGET_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_LOC_TARGET ic_LOC_target = icDao.singleIC_LOC_TARGET(id);

		ArrayList<IC_LOC_TARGET> listIC_LOC_TARGET = icDao.listIC_LOC_TARGET(yearCode, circleCode);
		model.addAttribute("IC_LOC_TARGET", ic_LOC_target);
		model.addAttribute("listIC_LOC_TARGET", listIC_LOC_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("yearCode", yearCode);
		model.addAttribute("zoneCode", zoneCode);
		model.addAttribute("zoneName", zoneName);
		model.addAttribute("circleCode", circleCode);
		model.addAttribute("circleName", circleName);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_LOCATION_MASTER> ic_LOCATION_MASTERs = icDao.listIC_LOCATION_MASTER(circleCode);
		model.addAttribute("ic_LOCATION_MASTERs", ic_LOCATION_MASTERs);
		return "IC_LOC_TARGET";
	}

	@PostMapping("/IC_LOC_TARGET")
	public String IC_LOC_TARGET_save(IC_LOC_TARGET ic_LOC_TARGET) {

		String out = icDao.insertIC_LOC_TARGET(ic_LOC_TARGET);
		String ss = "redirect:/IC_LOC_TARGET/" + circleCode;
		if (out.equals("1")) {
			return ss;
		} else {
			return ss;
		}

	}

	@PostMapping("/IC_LOC_TARGET/{id}")
	public String IC_LOC_TARGET_edit(@PathVariable("id") int id, Model model, IC_LOC_TARGET ic_LOC_TARGET) {

		ic_LOC_TARGET.setLOC_TARGET_ID(id);

		String out = icDao.updateIC_LOC_TARGET(ic_LOC_TARGET);
		if (out.equals("1")) {
			return "redirect:/IC_LOC_TARGET/" + circleCode;
		} else {
			return null;
		}

	}

	@PostMapping("/IC_LOC_TARGET_delete/{id}")
	public String IC_LOC_TARGET_delete(@PathVariable("id") int id, Model model, IC_LOC_TARGET ic_LOC_TARGET) {
		ic_LOC_TARGET.setLOC_TARGET_ID(id);
		String out = icDao.deleteIC_LOC_TARGET(id);

		if (out.equals("1")) {
			return "redirect:/IC_LOC_TARGET/" + circleCode;
		} else {
			return null;
		}
	}

	@PostMapping("/IC_LOC_TARGET_clear/{id}")
	public String IC_IC_LOC_TARGET_clear(@PathVariable("id") int id, Model model, IC_LOC_TARGET ic_LOC_TARGET) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		return "redirect:/IC_LOC_TARGET/" + circleCode;
	}

	@GetMapping("/IC_DC_OF_ILLIGAL_USE_ST")
	public String IC_DC_OF_ILLIGAL_USE_ST(Model model) {
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		String flag = "0";
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		IC_DC_OF_ILLIGAL_USE_ST ic_DC_OF_ILLIGAL_USE_ST = new IC_DC_OF_ILLIGAL_USE_ST();
		List<IC_DC_OF_ILLIGAL_USE_ST> listIC_DC_OF_ILLIGAL_USE_ST = rowSqlDao.listIC_DC_OF_ILLIGAL_USE_ST();
		model.addAttribute("ic_DC_OF_ILLIGAL_USE_ST", ic_DC_OF_ILLIGAL_USE_ST);
		model.addAttribute("listIC_DC_OF_ILLIGAL_USE_STE", listIC_DC_OF_ILLIGAL_USE_ST);
		model.addAttribute("flag", flag);

		return "IC_DC_OF_ILLIGAL_USE_ST";
	}

	@GetMapping("/IC_DC_OF_ILLIGAL_USE_ST/{id}")
	public String IC_DC_OF_ILLIGAL_USE_ST_S(@PathVariable("id") int id, Model model) {
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		String flag = "1";
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		IC_DC_OF_ILLIGAL_USE_ST ic_DC_OF_ILLIGAL_USE_ST = rowSqlDao.listIC_DC_OF_ILLIGAL_USE_ST_S(id);
		List<IC_DC_OF_ILLIGAL_USE_ST> listIC_DC_OF_ILLIGAL_USE_ST = rowSqlDao.listIC_DC_OF_ILLIGAL_USE_ST();
		model.addAttribute("ic_DC_OF_ILLIGAL_USE_ST", ic_DC_OF_ILLIGAL_USE_ST);
		model.addAttribute("listIC_DC_OF_ILLIGAL_USE_STE", listIC_DC_OF_ILLIGAL_USE_ST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		return "IC_DC_OF_ILLIGAL_USE_ST";
	}

	@PostMapping("/IC_DC_OF_ILLIGAL_USE_ST")
	public String IC_DC_OF_ILLIGAL_USE_ST_save(IC_DC_OF_ILLIGAL_USE_ST dc_OF_ILLIGAL_USE_ST) {

		rowSqlDao.insertIC_DC_OF_ILLIGAL_USE_ST(dc_OF_ILLIGAL_USE_ST);

		return "redirect:/IC_DC_OF_ILLIGAL_USE_ST";
	}

	@PostMapping("/IC_DC_OF_ILLIGAL_USE_ST/{id}")
	public String IC_DC_OF_ILLIGAL_USE_ST_edit(@PathVariable("id") String id, Model model,
			IC_DC_OF_ILLIGAL_USE_ST dc_OF_ILLIGAL_USE_ST) {

		dc_OF_ILLIGAL_USE_ST.setILL_DC_ID(id);

		rowSqlDao.IC_DC_OF_ILLIGAL_USE_ST_edit(dc_OF_ILLIGAL_USE_ST);

		return "redirect:/IC_DC_OF_ILLIGAL_USE_ST";
	}

	@PostMapping("/IC_DC_OF_ILLIGAL_USE_ST_delete/{id}")
	public String IC_DC_OF_ILLIGAL_USE_ST_delete(@PathVariable("id") int id) {

		rowSqlDao.IC_DC_OF_ILLIGAL_USE_ST_delete(id);

		return "redirect:/IC_DC_OF_ILLIGAL_USE_ST";
	}

	@PostMapping("/IC_DC_OF_ILLIGAL_USE_ST_clear/{id}")
	public String IC_DC_OF_ILLIGAL_USE_ST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_DC_OF_ILLIGAL_USE_ST";
	}

	//////////////////////// Start Revenue Report

	@GetMapping("/IC_REV_TOP_SHEET")
	public String IC_REV_TOP_SHEET(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_REV_TOP_SHEET";
	}

	@GetMapping("/IC_REV_PER_ZONE")
	public String IC_REV_PER_ZONE(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_REV_PER_ZONE";
	}

	@PostMapping("/IC_REV_PER_ZONE")
	public String IC_REV_PER_ZONE_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		ArrayList<IC_REV_PER_ZONE> ic_REV_PER_ZONEs = i.listIC_REV_PER_ZONE(officeCode, rm.one, rm.two);
		model.addAttribute("ic_REV_PER_ZONEs", ic_REV_PER_ZONEs);

		String zoneName = ic_REV_PER_ZONEs.get(0).getZoneName();
		model.addAttribute("zoneName", zoneName);

		String prvYear = ic_REV_PER_ZONEs.get(0).getPrevYear();
		model.addAttribute("prvYear", prvYear);

		String currYear = ic_REV_PER_ZONEs.get(0).getCurrYear();
		model.addAttribute("currYear", currYear);

		String PREV_YR_MON = ic_REV_PER_ZONEs.get(0).getDateone();
		model.addAttribute("PREV_YR_MON", PREV_YR_MON);

		String CURR_YR_MON = ic_REV_PER_ZONEs.get(0).getDatetwo();
		model.addAttribute("CURR_YR_MON", CURR_YR_MON);

		String PREV_FIN_LAST_MONTH = ic_REV_PER_ZONEs.get(0).getDatethree();
		model.addAttribute("PREV_FIN_LAST_MONTH", PREV_FIN_LAST_MONTH);

		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_REV_PER_ZONE";
	}

	@GetMapping("/IC_REV_PER_CIRCLE")
	public String IC_REV_PER_CIRCLE(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "IC_REV_PER_CIRCLE";
	}

	@PostMapping("/IC_REV_PER_CIRCLE")
	public String IC_REV_PER_CIRCLE_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);

		ArrayList<IC_REV_PER_ZONE> ic_REV_PER_ZONEs = i.listIC_REV_PER_CIRCLE(officeCode, rm.two, rm.three);
		model.addAttribute("ic_REV_PER_ZONEs", ic_REV_PER_ZONEs);
		String zoneName = ic_REV_PER_ZONEs.get(0).getZoneName();
		model.addAttribute("zoneName", zoneName);

		String prvYear = ic_REV_PER_ZONEs.get(0).getPrevYear();
		model.addAttribute("prvYear", prvYear);

		String currYear = ic_REV_PER_ZONEs.get(0).getCurrYear();
		model.addAttribute("currYear", currYear);

		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_REV_PER_CIRCLE";
	}

	@GetMapping("/IC_REV_PER_DIV")
	public String IC_REV_PER_DIV(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "IC_REV_PER_DIV";
	}

	@PostMapping("/IC_REV_PER_DIV")
	public String IC_REV_PER_DIV_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		ArrayList<IC_REV_PER_DIV_MODEL> iC_REV_PER_DIV_MODEL = i.listIC_REV_PER_DIV(officeCode, rm.two, rm.three);
		model.addAttribute("iC_REV_PER_DIV_MODEL", iC_REV_PER_DIV_MODEL);
		String zone = iC_REV_PER_DIV_MODEL.get(0).getCircleName();
		model.addAttribute("zone", zone);

		return "IC_REV_PER_DIV";
	}

	@GetMapping("/IC_REV_CAT_ACC_REC")
	public String IC_REV_CAT_ACC_REC(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "IC_REV_CAT_ACC_REC";
	}

	@PostMapping("/IC_REV_CAT_ACC_REC")
	public String IC_REV_CAT_ACC_REC_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		ArrayList<IC_REV_CAT_ACC_REC_MODEL> iC_REV_CAT_ACC_REC_MODEL = i.listIC_REV_CAT_ACC_REC_MODEL(officeCode,
				rm.two, rm.three);
		model.addAttribute("iC_REV_CAT_ACC_REC_MODEL", iC_REV_CAT_ACC_REC_MODEL);

		String name = iC_REV_CAT_ACC_REC_MODEL.get(0).getCircleName();
		model.addAttribute("name", name);

		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "IC_REV_CAT_ACC_REC";
	}

	@GetMapping("/END_SHEET")
	public String END_SHEET(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "END_SHEET";
	}

	/////////////////////// End Revenue Report

	////////////////////// Start khondokar
	@GetMapping("/IC_USAGE_CATEGORY_CODE")
	public String usage_cat_code(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		// insert into IC_USAGE_CAT_CODE table
		UsageCatCode usageCatCode = new UsageCatCode();
		model.addAttribute("usageCatCode", usageCatCode);

		ArrayList<UsagArea> areaList = i.showAreaName();
		model.addAttribute("areaList", areaList);

		ArrayList<LineType> areaList1 = i.showLine();
		model.addAttribute("areaList1", areaList1);

		ArrayList<ShowUsage> usageData = i.showUsage();
		model.addAttribute("usageData", usageData);

		String x = "This";
		model.addAttribute("x", x);

		model.addAttribute("dataHtml", dynamicMenu);

		return "usage";
	}

	@PostMapping("/IC_USAGE_CATEGORY_CODE")
	public String inset_cat_code(Model model, UsageCatCode usageCatCode) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		int result = i.insert_usage_cat_code(usageCatCode);

		System.out.println(result);
		System.out.println(usageCatCode);

		if (result == 0)
			return "IC_USAGE_CATEGORY_CODE";
		else
			return "redirect:/IC_USAGE_CATEGORY_CODE";
	}

	@GetMapping("/usageDelete/{id}")
	public String delete_location1(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("id", id);
		int result = i.deleteUsage(id);
		if (result == 0)
			return "/IC_USAGE_CATEGORY_CODE";
		else
			return "redirect:/IC_USAGE_CATEGORY_CODE";
	}

	@GetMapping("/usageEdit/{id}")
	public String usage_cat_code_edit(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("id", id);
		UsageCatCode usageCatCode = new UsageCatCode();
		model.addAttribute("usageCatCode", usageCatCode);

		ArrayList<UsagArea> areaList = i.showAreaName();
		model.addAttribute("areaList", areaList);

		ArrayList<LineType> areaList1 = i.showLine();
		model.addAttribute("areaList1", areaList1);

		ArrayList<ShowUsage> usageData = i.showUsage();
		model.addAttribute("usageData", usageData);

		ArrayList<EditUsage> usageDataEdit = i.editUsage(id);
		model.addAttribute("usageDataEdit", usageDataEdit);

		String usageCtName = usageDataEdit.get(0).getUsageCatName();
		model.addAttribute("usageCtName", usageCtName);

		String catCode = usageDataEdit.get(0).getUsageCatCode();
		model.addAttribute("catCode", catCode);

		String usageTy = usageDataEdit.get(0).getUsageTypeCode();
		model.addAttribute("usageTy", usageTy);

		String name = usageDataEdit.get(0).getAreaName();
		model.addAttribute("name", name);

		String userType = usageDataEdit.get(0).getUsageType();
		model.addAttribute("userType", userType);

		System.out.println("This is the isage type" + usageDataEdit);

		String lineType = usageDataEdit.get(0).getLineTypeName();
		model.addAttribute("lineType", lineType);

		String lineId = usageDataEdit.get(0).getUsageLineCode();
		model.addAttribute("lineId", lineId);

		String typeId = usageDataEdit.get(0).getUsageTypeCode();
		model.addAttribute("typeId", typeId);

		model.addAttribute("dataHtml", dynamicMenu);

		return "usageedit";
	}

	@PostMapping("/usageEdit/{id}")
	public String usage_cat_code_update(@PathVariable("id") int id, Model model, UsageCatCode usageCatCode) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("id", id);
		int check = i.update_usage_cat_code(usageCatCode, id);

		System.out.println(check);

		return "redirect:/IC_USAGE_CATEGORY_CODE";
	}

//Updated Location
	@GetMapping("/IC_LOCATION_MASTER_STATUS")
	public String locationNew(Model model) {
		ArrayList<OfficeDrop> officeDrop = i.officeDropdown();
		model.addAttribute("officeDrop", officeDrop);

		ArrayList<OfficeDrop> comDrop = i.comDropdown();
		model.addAttribute("comDrop", comDrop);

		ArrayList<LocationListModel> locationListModel = i.locationList();
		model.addAttribute("locationListModel", locationListModel);

		InsLocation insLocation = new InsLocation();
		model.addAttribute("insLocation", insLocation);

		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = i.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "locationNew";
	}

	@PostMapping("/locationNew")
	public String locationPosts(Model model, InsLocation insLocation) {
		i.insertLocations(insLocation);

		return "redirect:/IC_LOCATION_MASTER_STATUS";
	}

	String aZone;
	String bCircle;
	String cDiv;
	String dComCen;
	String eOffCode;

	@GetMapping("/locationNew/{id}")
	public String locationNewEdit(@PathVariable("id") int id, Model model) {
		ArrayList<OfficeDrop> officeDrop = i.officeDropdown();
		model.addAttribute("officeDrop", officeDrop);

		InsLocation insLocations = new InsLocation();
		model.addAttribute("insLocations", insLocations);

		ArrayList<OfficeDrop> comDrop = i.comDropdown();
		model.addAttribute("comDrop", comDrop);

		ArrayList<LocationListModel> locationListModel = i.locationList();
		model.addAttribute("locationListModel", locationListModel);

		ArrayList<LocationEditM> locationEditM = i.locationEdits(id);
		model.addAttribute("locationEditM", locationEditM);

		String Code = locationEditM.get(0).getpLOCATION_CODE();
		model.addAttribute("Code", Code);

		String name = locationEditM.get(0).getpLOCATION_NAME();
		model.addAttribute("name", name);

		String zone = locationEditM.get(0).getpZONE_DESC();
		model.addAttribute("zone", zone);

		String circle = locationEditM.get(0).getpCIRCLE_DESC();
		model.addAttribute("circle", circle);

		String subDiv = locationEditM.get(0).getpSUB_DIV_CODE();
		model.addAttribute("subDiv", subDiv);

		String comCen = locationEditM.get(0).getpCOMP_CNTR_NAME();
		model.addAttribute("comCen", comCen);

		String div = locationEditM.get(0).getpDIV_DESC();
		model.addAttribute("div", div);

		aZone = locationEditM.get(0).getpZONE_CODE();
		bCircle = locationEditM.get(0).getpCIRCLE_CODE();
		cDiv = locationEditM.get(0).getpDIV_CODE();
		dComCen = locationEditM.get(0).getpCOMP_CNTR_CODE();
		eOffCode = locationEditM.get(0).getpOFFICE_CODE();

		String ss = "S&D Bhairab";
		model.addAttribute("ss", ss);

		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = i.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "locationnewedit";
	}

	@PostMapping("/locationNew/{id}")
	public String locationNewUpdate(@PathVariable("id") int id, Model model, InsLocation insLocations) {
		ArrayList<OfficeDrop> officeDrop = i.officeDropdown();
		model.addAttribute("officeDrop", officeDrop);

		i.updateLocations(insLocations, aZone, bCircle, cDiv, dComCen, eOffCode, id);

		ArrayList<OfficeDrop> comDrop = i.comDropdown();
		model.addAttribute("comDrop", comDrop);

		ArrayList<LocationListModel> locationListModel = i.locationList();
		model.addAttribute("locationListModel", locationListModel);

		ArrayList<LocationEditM> locationEditM = i.locationEdits(id);
		model.addAttribute("locationEditM", locationEditM);

		String ss = "S&D Bhairab";
		model.addAttribute("ss", ss);

		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = i.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "redirect:/IC_LOCATION_MASTER_STATUS";
	}

	/*
	 * @GetMapping("/IC_LOCATION_MASTER_STATUS") public String location(Model model)
	 * { if (dynamicMenu.equals("")) { return "redirect:/"; }
	 * ArrayList<LocationShow> locationShow = i.locationShow();
	 * model.addAttribute("locationShow", locationShow);
	 * 
	 * LocationInsert locationInsert = new LocationInsert();
	 * model.addAttribute("locationInsert", locationInsert);
	 * 
	 * model.addAttribute("dataHtml", dynamicMenu);
	 * 
	 * return "location"; }
	 * 
	 * @PostMapping("/IC_LOCATION_MASTER_STATUS") public String locationPost(Model
	 * model, LocationInsert locationInsert) { if (dynamicMenu.equals("")) { return
	 * "redirect:/"; }
	 * 
	 * i.insert_location_master(locationInsert);
	 * 
	 * return "redirect:/IC_LOCATION_MASTER_STATUS"; }
	 */

	@GetMapping("/locationDelete/{id}")
	public String delete_location(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		int result = i.deleteLocation(id);
		System.out.println(result);
		return "redirect:/IC_LOCATION_MASTER_STATUS";
	}

	@GetMapping("/IC_LOCATION_MASTER_EDIT/{id}")
	public String locationEdit(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ArrayList<LocationShow> locationShow = i.locationShow();
		model.addAttribute("locationShow", locationShow);

		ArrayList<LocationInsert> locationEdit = i.locationEdit(id);
		model.addAttribute("locationEdit", locationEdit);

		String locName = locationEdit.get(0).getLocationName();
		model.addAttribute("locName", locName);

		String locCode = locationEdit.get(0).getLocationCode();
		model.addAttribute("locCode", locCode);

		LocationInsert locationInsert = new LocationInsert();
		model.addAttribute("locationInsert", locationInsert);

		model.addAttribute("dataHtml", dynamicMenu);

		return "locationEdit";
	}

	@PostMapping("/IC_LOCATION_MASTER_EDIT/{id}")
	public String locationUpdate(@PathVariable("id") int id, Model model, LocationInsert locationInsert) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		i.location_update(locationInsert, id);

		return "redirect:/IC_LOCATION_MASTER_STATUS";
	}

	@GetMapping("/IC_GEN_AREA")
	public String area(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ArrayList<Area> areas = i.areaShow();
		model.addAttribute("areas", areas);

		LocationInsert locationInsert = new LocationInsert();
		model.addAttribute("locationInsert", locationInsert);

		model.addAttribute("dataHtml", dynamicMenu);

		return "area";
	}

	@PostMapping("/IC_GEN_AREA")
	public String area_post(Model model, LocationInsert locationInsert) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		i.insert_area(locationInsert);
		return "redirect:/IC_GEN_AREA";
	}

	@GetMapping("/IC_GEN_AREA_DELETE/{id}")
	public String delete_area(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		i.deleteArea(id);
		return "redirect:/IC_GEN_AREA";
	}

	@GetMapping("/IC_GEN_AREA_EDIT/{id}")
	public String areaEdit(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ArrayList<Area> areas = i.areaShow();
		model.addAttribute("areas", areas);

		ArrayList<LocationInsert> editList = i.areaEdit(id);
		model.addAttribute("editList", editList);

		String arCode = editList.get(0).getLocationCode();
		model.addAttribute("arCode", arCode);
		String arName = editList.get(0).getLocationName();
		model.addAttribute("arName", arName);

		LocationInsert locationInsert = new LocationInsert();
		model.addAttribute("locationInsert", locationInsert);

		model.addAttribute("dataHtml", dynamicMenu);
		return "areaEdit";
	}

	@PostMapping("/IC_GEN_AREA_EDIT/{id}")
	public String areaPost(@PathVariable("id") int id, Model model, LocationInsert locationInsert) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		i.areaUpdate(locationInsert, id);

		return "redirect:/IC_GEN_AREA";
	}
	
	// IC_POWER_PLANT starts

	@GetMapping("/IC_POWER_PLANT")
	public String ic_power_plantm(Model model) {

		String flag = "0";

		IC_POWER_PLANT ic_power_plantm = new IC_POWER_PLANT();

		ArrayList<IC_POWER_PLANTmain> listIC_POWER_PLANT = convergeDaoSurovi.listIC_POWER_PLANT();
		model.addAttribute("listIC_POWER_PLANT", listIC_POWER_PLANT);

		ArrayList<GenArea> genArea = i.genAreaLists();
		model.addAttribute("genArea", genArea);

		ArrayList<PPOwnerList> pPOwnerList = i.ppOwnerLists();
		model.addAttribute("pPOwnerList", pPOwnerList);

		ArrayList<GridList> gridList = i.gridLists();
		model.addAttribute("gridList", gridList);

		model.addAttribute("ic_power_plantm", ic_power_plantm);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_POWER_PLANT";
	}

//	@PostMapping("/IC_POWER_PLANT")
//	public String ic_power_plant_save(IC_POWER_PLANTmain ic_power_plant) {
//
//		convergeDaoSurovi.insertICPowerPlant(ic_power_plant);
//
//		return "redirect:/IC_POWER_PLANT";
//	}
//
//	@GetMapping("/IC_POWER_PLANT/{id}")
//	public String ic_power_plant_single(@PathVariable("id") int id, Model model) {
//
//		String flag = "1";
//
//		IC_POWER_PLANTmain ic_power_plant = convergeDaoSurovi.singleIC_POWER_PLANT(id);
//
//		ArrayList<IC_POWER_PLANTmain> listIC_POWER_PLANT = convergeDaoSurovi.listIC_POWER_PLANT();
//
//		ArrayList<GenArea> genArea = i.genAreaLists();
//		model.addAttribute("genArea", genArea);
//
//		ArrayList<PPOwnerList> pPOwnerList = i.ppOwnerLists();
//		model.addAttribute("pPOwnerList", pPOwnerList);
//
//		ArrayList<GridList> gridList = i.gridLists();
//		model.addAttribute("gridList", gridList);
//
//		model.addAttribute("ic_power_plant", ic_power_plant);
//		model.addAttribute("listIC_POWER_PLANT", listIC_POWER_PLANT);
//		model.addAttribute("flag", flag);
//		model.addAttribute("id", id);
//		String dynamicMenu = icDao.getDynamicMenu();
//		model.addAttribute("dataHtml", dynamicMenu);
//
//		return "IC_POWER_PLANT";
//	}
//
//	@PostMapping("/IC_POWER_PLANT/{id}")
//	public String ic_power_plant_edit(@PathVariable("id") int id, Model model, IC_POWER_PLANTmain ic_power_plant) {
//
//		ic_power_plant.setPpId(id);
//
//		convergeDaoSurovi.editICPPowerPlant(ic_power_plant);
//
//		return "redirect:/IC_POWER_PLANT";
//	}
//
//	@PostMapping("/IC_POWER_PLANT_delete/{id}")
//	public String IC_POWER_PLANT_delete(@PathVariable("id") int id) {
//
//		convergeDaoSurovi.deleteICPowerPlant(id);
//
//		return "redirect:/IC_POWER_PLANT";
//	}
//
////		CLEAR IC_POWER_PLANT START
//	@PostMapping("/IC_POWER_PLANT_clear/{id}")
//	public String IC_POWER_PLANT_clear(@PathVariable("id") int id) {
//
//		return "redirect:/IC_POWER_PLANT";
//	}

//	@GetMapping("/IC_POWER_PLANT")
//	public String power_plant(Model model) {
//		if (dynamicMenu.equals("")) {
//			return "redirect:/";
//		}
//		ArrayList<IC_POWER_PLANTmain> powerPlantList = i.powerPlantShow();
//		model.addAttribute("powerPlantList", powerPlantList);
//
//		ArrayList<GenArea> genArea = i.genAreaLists();
//		model.addAttribute("genArea", genArea);
//
//		ArrayList<PPOwnerList> pPOwnerList = i.ppOwnerLists();
//		model.addAttribute("pPOwnerList", pPOwnerList);
//
//		ArrayList<GridList> gridList = i.gridLists();
//		model.addAttribute("gridList", gridList);
//
//		PowerPlantInsert powerPlantInsert = new PowerPlantInsert();
//		model.addAttribute("powerPlantInsert", powerPlantInsert);
//		model.addAttribute("dataHtml", dynamicMenu);
//		return "powerplant";
//	}
//
//	@PostMapping("/IC_POWER_PLANT")
//	public String power_plant_insert(Model model, PowerPlantInsert powerPlantInsert) {
//		i.insert_power_plant(powerPlantInsert);
//
//		return "redirect:/IC_POWER_PLANT";
//	}
//
//	String gridCode;
//	String genACode;
//	String OwnerCode;
//
//	@GetMapping("/IC_POWER_PLANT_EDIT/{id}")
//	public String power_plant_edits(@PathVariable("id") String id, Model model) {
//		if (dynamicMenu.equals("")) {
//			return "redirect:/";
//		}
//		ArrayList<IC_POWER_PLANTmain> powerPlantList = i.powerPlantShow();
//		model.addAttribute("powerPlantList", powerPlantList);
//
//		ArrayList<GenArea> genArea = i.genAreaLists();
//		model.addAttribute("genArea", genArea);
//
//		ArrayList<PPOwnerList> pPOwnerList = i.ppOwnerLists();
//		model.addAttribute("pPOwnerList", pPOwnerList);
//
//		ArrayList<GridList> gridList = i.gridLists();
//		model.addAttribute("gridList", gridList);
//
//		ArrayList<IC_POWER_PLANTmain> powerPlantListEdit = i.powerPlantEdits(id);
//		model.addAttribute("powerPlantListEdit", powerPlantListEdit);
//		if (powerPlantListEdit.size() == 0) {
//			System.out.println("error occurred!");
//		}
//		String pp_code = powerPlantListEdit.get(0).getPpCode();
//		model.addAttribute("pp_code", pp_code);
//
//		String pp_name = powerPlantListEdit.get(0).getPpName();
//		model.addAttribute("pp_name", pp_name);
//
//		double on_of_unit = powerPlantListEdit.get(0).getNoOfUnit();
//		model.addAttribute("on_of_unit", on_of_unit);
//
//		double install_capacity = powerPlantListEdit.get(0).getInstalledCapacity();
//		model.addAttribute("install_capacity", install_capacity);
//
//		double max_capacity = powerPlantListEdit.get(0).getMaxCapacity();
//		model.addAttribute("max_capacity", max_capacity);
//
//		String short_name = powerPlantListEdit.get(0).getShortName();
//		model.addAttribute("short_name", short_name);
//
//		String gen_area = powerPlantListEdit.get(0).getGenAreaName();
//		model.addAttribute("gen_area", gen_area);
//
//		String gen_area_code = powerPlantListEdit.get(0).getGenAreaCode();
//		model.addAttribute("gen_area_code", gen_area_code);
//
//		genACode = gen_area_code;
//
//		String owner_name = powerPlantListEdit.get(0).getOwnerName();
//		model.addAttribute("owner_name", owner_name);
//
//		String owner_code = powerPlantListEdit.get(0).getOwnerCode();
//		model.addAttribute("owner_code", owner_code);
//
//		OwnerCode = owner_code;
//
//		String grid_name = powerPlantListEdit.get(0).getGridDesc();
//		model.addAttribute("grid_name", grid_name);
//
//		String grid_code = powerPlantListEdit.get(0).getGridCode();
//		model.addAttribute("grid_code", grid_code);
//
//		gridCode = grid_code;
//
//		PowerPlantInsert powerPlantInsert = new PowerPlantInsert();
//		model.addAttribute("powerPlantInsert", powerPlantInsert);
//		model.addAttribute("dataHtml", dynamicMenu);
//		return "powerplantedit";
//	}
//
//	@PostMapping("/IC_POWER_PLANT_EDIT/{id}")
//	public String power_plant_update(@PathVariable("id") String id, Model model, PowerPlantInsert powerPlantInsert) {
//		i.update_power_plant(powerPlantInsert, id, genACode, OwnerCode, gridCode);
//		System.out.println("This is the update" + powerPlantInsert);
//
//		return "redirect:/IC_POWER_PLANT";
//	}
//
//	@GetMapping("/powerPointDelete/{id}")
//	public String delete_power_point(@PathVariable("id") String id, Model model) {
//		i.deletePowerPoint(id);
//
//		return "redirect:/IC_POWER_PLANT";
//	}

	@GetMapping("/IC_DEMAND_PHASE_MST")
	public String demandPhaseMst(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ArrayList<DemandPhaseList> demandPhaseList = i.demandPhaseLists();
		model.addAttribute("demandPhaseList", demandPhaseList);

		DemandPhaseInsert demandPhaseInsert = new DemandPhaseInsert();
		model.addAttribute("demandPhaseInsert", demandPhaseInsert);
		model.addAttribute("dataHtml", dynamicMenu);
		return "demandphase";
	}

	@PostMapping("/IC_DEMAND_PHASE_MST")
	public String demandPhaseMstInsert(Model model, DemandPhaseInsert demandPhaseInsert) {
		i.demandPhaseInsert(demandPhaseInsert);

		return "redirect:/IC_DEMAND_PHASE_MST";
	}

	@GetMapping("/IC_DEMAND_PHASE_MST_EDIT/{id}")
	public String demandPhaseMstEdit(Model model, @PathVariable("id") String id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ArrayList<DemandPhaseList> demandPhaseList = i.demandPhaseLists();
		model.addAttribute("demandPhaseList", demandPhaseList);

		ArrayList<DemandPhaseList> demandPhaseEditList = i.demandPhaseEdit(id);
		model.addAttribute("demandPhaseEditList", demandPhaseEditList);

		String dpCode = demandPhaseEditList.get(0).getDpCode();
		model.addAttribute("dpCode", dpCode);

		String dpDescr = demandPhaseEditList.get(0).getDemandPhase();
		model.addAttribute("dpDescr", dpDescr);

		int srNumber = demandPhaseEditList.get(0).getSrlNo();
		model.addAttribute("srNumber", srNumber);

		DemandPhaseInsert demandPhaseInsert = new DemandPhaseInsert();
		model.addAttribute("demandPhaseInsert", demandPhaseInsert);
		model.addAttribute("dataHtml", dynamicMenu);
		return "demandphaseedit";
	}

	@PostMapping("/IC_DEMAND_PHASE_MST_EDIT/{id}")
	public String demandPhaseMstUpdate(Model model, @PathVariable("id") String id,
			DemandPhaseInsert demandPhaseInsert) {
		i.demandPhaseUpdate(demandPhaseInsert);

		return "redirect:/IC_DEMAND_PHASE_MST";
	}

	@GetMapping("/IC_DEMAND_PHASE_MST_DELETE/{id}")
	public String delete_demandPhase(@PathVariable("id") String id, Model model) {
		i.deleteDemandPhase(id);

		return "redirect:/IC_DEMAND_PHASE_MST";
	}

	@GetMapping("/IC_ACTIVITY_MST")
	public String activityList(Model model) {
		ArrayList<ActivityList> activityList = i.activityListShow();
		model.addAttribute("activityList", activityList);

		ActivityInsert activityInsert = new ActivityInsert();
		model.addAttribute("activityInsert", activityInsert);
		model.addAttribute("dataHtml", dynamicMenu);
		return "activitylist";
	}

	@PostMapping("/IC_ACTIVITY_MST")
	public String activityListInsert(Model model, ActivityInsert activityInsert) {
		i.insert_activity(activityInsert);

		return "redirect:/IC_ACTIVITY_MST";
	}

	@GetMapping("/IC_ACTIVITY_MST_EDIT/{id}")
	public String activityList(@PathVariable("id") int id, Model model) {
		ArrayList<ActivityList> activityList = i.activityListShow();
		model.addAttribute("activityList", activityList);

		ArrayList<ActivityInsert> activityIns = i.activityedit(id);
		model.addAttribute("activityIns", activityIns);

		String acCode = activityIns.get(0).getActivityCode();
		model.addAttribute("acCode", acCode);

		String acName = activityIns.get(0).getActivityName();
		model.addAttribute("acName", acName);

		ActivityInsert activityInsert = new ActivityInsert();
		model.addAttribute("activityInsert", activityInsert);
		model.addAttribute("dataHtml", dynamicMenu);
		return "activitylistedit";
	}

	@PostMapping("/IC_ACTIVITY_MST_EDIT/{id}")
	public String activityListUpdate(@PathVariable("id") int id, Model model, ActivityInsert activityInsert) {
		i.updateActivity(activityInsert, id);

		return "redirect:/IC_ACTIVITY_MST";
	}

	@GetMapping("/IC_ACTIVITY_MST_DELETE/{id}")
	public String activity_delete(Model model, @PathVariable("id") int id) {
		i.deleteActivity(id);

		return "redirect:/IC_ACTIVITY_MST";
	}

	@GetMapping("/IC_GEN_MOD_APP")
	public String perionList(Model model) {
		ArrayList<PeriodList> periodList = i.periodListShow();
		model.addAttribute("periodList", periodList);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "periodlist";
	}

	String pathvar;

	@GetMapping("/IC_PP_MOD/{id}")
	public String modtList(@PathVariable("id") String id, Model model) {
		pathvar = id;
		model.addAttribute("id", id);
		ArrayList<PpModList> ppModList = i.ppModListListShow(id);
		model.addAttribute("ppModList", ppModList);

		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.pppDropdown(id);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);

		InsertPpMod insertPpMod = new InsertPpMod();
		model.addAttribute("insertPpMod", insertPpMod);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "icppmode";
	}

	@PostMapping("/IC_PP_MOD/{id}")
	public String modPost(@PathVariable("id") String id, InsertPpMod insertPpMod) {
		i.insertPpMod(insertPpMod);

		return "redirect:/IC_PP_MOD/" + pathvar;
	}

	String pp_code;
	String pp_names;

	@GetMapping("/IC_PP_MOD_EDIT/{id}")
	public String modtListEdit(@PathVariable("id") int id, Model model) {
		model.addAttribute("pathvar", pathvar);
		ArrayList<PpModList> ppModList = i.ppModListListShow(pathvar);
		model.addAttribute("ppModList", ppModList);

		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.pppDropdown(pathvar);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);

		ArrayList<PpModEdit> ppModEdit = i.ppModEdit(id);
		model.addAttribute("ppModEdit", ppModEdit);

		String pp_name = ppModEdit.get(0).getPpName();
		model.addAttribute("pp_name", pp_name);

		pp_names = pp_name;
		pp_code = ppModEdit.get(0).getPpCode();
		model.addAttribute("pp_code", pp_code);

		InsertPpMod insertPpMod = new InsertPpMod();
		model.addAttribute("insertPpMod", insertPpMod);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "icppmodedit";
	}

	@PostMapping("/IC_PP_MOD_EDIT/{id}")
	public String modtListUpdate(@PathVariable("id") int id, Model model, InsertPpMod insertPpMod) {
		i.updatePpMod(insertPpMod, pp_code, id);

		return "redirect:/IC_PP_MOD/" + pathvar;
	}

	String paymentData;

	@GetMapping("/IC_IPP_PAYMENT/{id}")
	public String icPpPaymentList(@PathVariable("id") String id, Model model) {
		paymentData = id;
		model.addAttribute("id", id);
		ArrayList<IppPaymentList> ippPaymentList = i.ippPaymentList(id, pp_code);
		model.addAttribute("ippPaymentList", ippPaymentList);

		model.addAttribute("pp_code", pp_code);
		model.addAttribute("pp_names", pp_names);

		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.ppDropdown(id);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);

		InsertIppPayment insertIppPayment = new InsertIppPayment();
		model.addAttribute("insertIppPayment", insertIppPayment);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "icpppayment";
	}

	@PostMapping("/IC_IPP_PAYMENT/{id}")
	public String icPpPaymentInsert(@PathVariable("id") String id, Model model, InsertIppPayment insertIppPayment) {
		i.insertPppPayment(insertIppPayment);

		return "redirect:/IC_IPP_PAYMENT/" + id;
	}

	@GetMapping("/IC_IPP_PAYMENT_DELETE/{id}")
	public String ic_ipp_payment_delete(Model model, @PathVariable("id") int id) {
		i.deleteIcPpPayment(id);

		return "redirect:/IC_IPP_PAYMENT/" + paymentData;
	}

	@GetMapping("/IC_IPP_PAYMENT_EDIT/{id}")
	public String icPpPaymentEdit(@PathVariable("id") int id, Model model) {
		ArrayList<IppPaymentList> ippPaymentList = i.ippPaymentList(paymentData, pp_code);
		model.addAttribute("ippPaymentList", ippPaymentList);

		ArrayList<IcPpPaymentEdit> icPpPaymentEdit = i.icPaymentEdit(id);
		model.addAttribute("icPpPaymentEdit", icPpPaymentEdit);

		String billCycle = icPpPaymentEdit.get(0).getBillCycleCode();
		model.addAttribute("billCycle", billCycle);

		String powerPlantName = icPpPaymentEdit.get(0).getPpName();
		model.addAttribute("powerPlantName", powerPlantName);

		String e = icPpPaymentEdit.get(0).getEnrgPuchansed();
		model.addAttribute("e", e);

		int p = icPpPaymentEdit.get(0).getPayAmount();
		model.addAttribute("p", p);

		InsertIppPayment insertIppPayment = new InsertIppPayment();
		model.addAttribute("insertIppPayment", insertIppPayment);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "icpppaymentedit";
	}

	@PostMapping("/IC_IPP_PAYMENT_EDIT/{id}")
	public String icPpPaymentUpdate(@PathVariable("id") int id, Model model, IcPpPaymentEdit icPpPaymentEdit) {
		i.updatePayment(icPpPaymentEdit, id);
		return "redirect:/IC_IPP_PAYMENT/" + paymentData;
	}

	String bcyclecode;

	@GetMapping("/IC_PP_UNIT_MOD/{id}")
	public String icPpUnitModList(@PathVariable("id") String id, Model model) {
		model.addAttribute("id", id);
		bcyclecode = id;

		ArrayList<UnitModList> unitModList = i.UnitModShow(id, pp_code);
		model.addAttribute("unitModList", unitModList);

		model.addAttribute("pp_code", pp_code);
		model.addAttribute("pp_names", pp_names);

		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.ppDropdown(id);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);

		ArrayList<PpUnitDtlDrop> ppUnitDtlDrop = i.ppUnitDropdown(pp_code);
		model.addAttribute("ppUnitDtlDrop", ppUnitDtlDrop);

		UnitModInset unitModInset = new UnitModInset();
		model.addAttribute("unitModInset", unitModInset);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "icunitmod";
	}

	@PostMapping("/IC_PP_UNIT_MOD/{id}")
	public String icPpUnitModPost(@PathVariable("id") String id, Model model, UnitModInset unitModInset) {
		i.insertUnitMod(unitModInset);

		return "redirect:/IC_PP_UNIT_MOD/" + id;
	}

	String ppUnitCode;

	@GetMapping("/IC_PP_UNIT_MOD_EDIT/{id}")
	public String icPpUnitModedit(@PathVariable("id") int id, Model model) {
		model.addAttribute("bcyclecode", bcyclecode);

		ArrayList<UnitModList> unitModList = i.UnitModShow(bcyclecode, pp_code);
		model.addAttribute("unitModList", unitModList);

		model.addAttribute("pp_code", pp_code);
		model.addAttribute("pp_names", pp_names);

		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.ppDropdown(bcyclecode);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);

		ArrayList<UnirmodEdit> unirmodEdit = i.ppUnitEdit(id);
		model.addAttribute("unirmodEdit", unirmodEdit);

		ppUnitCode = unirmodEdit.get(0).getPpUnitCode();

		String ppName = unirmodEdit.get(0).getPpUnitName();
		model.addAttribute("ppName", ppName);

		int enrg_gen = unirmodEdit.get(0).getEngrGen();
		model.addAttribute("enrg_gen", enrg_gen);

		int enrg_cons_self = unirmodEdit.get(0).getEngrConsSelf();
		model.addAttribute("enrg_cons_self", enrg_cons_self);

		int fuel_used = unirmodEdit.get(0).getFuelUsed();
		model.addAttribute("fuel_used", fuel_used);

		ArrayList<PpUnitDtlDrop> ppUnitDtlDrop = i.ppUnitDropdown(pp_code);
		model.addAttribute("ppUnitDtlDrop", ppUnitDtlDrop);

		UnitModInset unitModInset = new UnitModInset();
		model.addAttribute("unitModInset", unitModInset);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "icunitmodedit";
	}

	@PostMapping("/IC_PP_UNIT_MOD_EDIT/{id}")
	public String icPpUnitModUpdate(@PathVariable("id") int id, Model model, UnitModInset unitModInset) {
		i.updatePpModUnit(unitModInset, ppUnitCode, id);

		return "redirect:/IC_PP_UNIT_MOD/" + bcyclecode;
	}

	///////////////////// End khondokar
	/////////////////// Start rafi
	@GetMapping("/IC_MISC_BILL_TYPE")
	public String ic_misc_bill_type(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_MISC_BILL_TYPE ic_misc_bill_type = new IC_MISC_BILL_TYPE();

		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = iconvDaoRafi.listIC_MISC_BILL_TYPE();
		model.addAttribute("ic_misc_bill_type", ic_misc_bill_type);
		model.addAttribute("listIC_MISC_BILL_TYPE", listIC_MISC_BILL_TYPE);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MISC_BILL_TYPE";
	}

	@PostMapping("/IC_MISC_BILL_TYPE")
	public String ic_misc_bill_type_save(IC_MISC_BILL_TYPE ic_misc_bill_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		iconvDaoRafi.insertICMiscBillType(ic_misc_bill_type);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_MISC_BILL_TYPE";
	}

	@GetMapping("/IC_MISC_BILL_TYPE/{id}")
	public String ic_misc_bill_type_single(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		String flag = "1";

		IC_MISC_BILL_TYPE ic_misc_bill_type = iconvDaoRafi.singleIC_MISC_BILL_TYPE(id);

//		System.out.println(ic_misc_bill_type);

		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = iconvDaoRafi.listIC_MISC_BILL_TYPE();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_misc_bill_type", ic_misc_bill_type);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_MISC_BILL_TYPE", listIC_MISC_BILL_TYPE);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MISC_BILL_TYPE";
	}

	@PostMapping("/IC_MISC_BILL_TYPE/{id}")
	public String ic_misc_bill_type_edit(@PathVariable("id") String id, Model model,
			IC_MISC_BILL_TYPE ic_misc_bill_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		ic_misc_bill_type.setMSC_BILL_TYPE_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICMiscBillType(ic_misc_bill_type);

		return "redirect:/IC_MISC_BILL_TYPE";
	}

	@PostMapping("/IC_MISC_BILL_TYPE_delete/{id}")
	public String IC_MISC_BILL_TYPE_delete(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		iconvDaoRafi.deleteICMiscBillType(id);

		return "redirect:/IC_MISC_BILL_TYPE";
	}

//	CLEAR CLEAR IC_MISC_BILL_TYPE START
	@PostMapping("/IC_MISC_BILL_TYPE_clear/{id}")
	public String IC_MISC_BILL_TYPE_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		return "redirect:/IC_MISC_BILL_TYPE";
	}
//	CLEAR IC_MISC_BILL_TYPE END

	@GetMapping("/IC_FUEL_TYPE")
	public String ic_fuel_type(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		String flag = "0";

		IC_FUEL_TYPE ic_fuel_type = new IC_FUEL_TYPE();

		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = iconvDaoRafi.listIC_FUEL_TYPE();
		model.addAttribute("ic_fuel_type", ic_fuel_type);
		model.addAttribute("listIC_FUEL_TYPE", listIC_FUEL_TYPE);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_FUEL_TYPE";
	}

	@PostMapping("/IC_FUEL_TYPE")
	public String ic_fuel_type_save(IC_FUEL_TYPE ic_fuel_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		iconvDaoRafi.insertICFuelType(ic_fuel_type);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_FUEL_TYPE";
	}

	@GetMapping("/IC_FUEL_TYPE/{id}")
	public String ic_fuel_type_single(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_FUEL_TYPE ic_fuel_type = iconvDaoRafi.singleIC_FUEL_TYPE(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = iconvDaoRafi.listIC_FUEL_TYPE();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_fuel_type", ic_fuel_type);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_FUEL_TYPE", listIC_FUEL_TYPE);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_FUEL_TYPE";
	}

	@PostMapping("/IC_FUEL_TYPE/{id}")
	public String ic_fuel_type_edit(@PathVariable("id") String id, Model model, IC_FUEL_TYPE ic_fuel_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ic_fuel_type.setFUEL_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICFuelType(ic_fuel_type);

		return "redirect:/IC_FUEL_TYPE";
	}

	@PostMapping("/IC_FUEL_TYPE_delete/{id}")
	public String IC_FUEL_TYPE_delete(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.deleteICFuelType(id);

		return "redirect:/IC_FUEL_TYPE";
	}

//	CLEAR IC_FUEL_TYPE START
	@PostMapping("/IC_FUEL_TYPE_clear/{id}")
	public String IC_FUEL_TYPE_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "redirect:/IC_FUEL_TYPE";
	}
//	CLEAR IC_FUEL_TYPE END

	@GetMapping("/IC_PP_OWNER_TYPE")
	public String ic_pp_owner_type(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_PP_OWNER_TYPE ic_pp_owner_type = new IC_PP_OWNER_TYPE();

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.listIC_PP_OWNER_TYPE();
		model.addAttribute("ic_pp_owner_type", ic_pp_owner_type);
		model.addAttribute("listIC_PP_OWNER_TYPE", listIC_PP_OWNER_TYPE);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_OWNER_TYPE";
	}

	@PostMapping("/IC_PP_OWNER_TYPE")
	public String ic_pp_owner_type_save(IC_PP_OWNER_TYPE ic_pp_owner_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.insertICPPOwnerType(ic_pp_owner_type);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_PP_OWNER_TYPE";
	}

	@GetMapping("/IC_PP_OWNER_TYPE/{id}")
	public String ic_pp_owner_type_single(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_PP_OWNER_TYPE ic_pp_owner_type = iconvDaoRafi.singleIC_PP_OWNER_TYPE(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.listIC_PP_OWNER_TYPE();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_pp_owner_type", ic_pp_owner_type);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_PP_OWNER_TYPE", listIC_PP_OWNER_TYPE);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_OWNER_TYPE";
	}

	@PostMapping("/IC_PP_OWNER_TYPE/{id}")
	public String ic_pp_owner_type_edit(@PathVariable("id") String id, Model model, IC_PP_OWNER_TYPE ic_pp_owner_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ic_pp_owner_type.setOWNER_TYPE_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICPPOwnerType(ic_pp_owner_type);

		return "redirect:/IC_PP_OWNER_TYPE";
	}

	@PostMapping("/IC_PP_OWNER_TYPE_delete/{id}")
	public String IC_PP_OWNER_TYPE_delete(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.deleteICPPOwnerType(id);

		return "redirect:/IC_PP_OWNER_TYPE";
	}

//	CLEAR IC_FUEL_TYPE START
	@PostMapping("/IC_PP_OWNER_TYPE_clear/{id}")
	public String IC_PP_OWNER_TYPE_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "redirect:/IC_PP_OWNER_TYPE";
	}
//	CLEAR IC_FUEL_TYPE END

	@GetMapping("/IC_PP_OWNER")
	public String ic_pp_owner(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_PP_OWNER ic_pp_owner = new IC_PP_OWNER();

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.listIC_PP_OWNER_TYPE();
		ArrayList<IC_PP_OWNER> listIC_PP_OWNER = iconvDaoRafi.listIC_PP_OWNER();

		model.addAttribute("ic_pp_owner", ic_pp_owner);
		model.addAttribute("listIC_PP_OWNER_TYPE", listIC_PP_OWNER_TYPE);
		model.addAttribute("listIC_PP_OWNER", listIC_PP_OWNER);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_OWNER";
	}

	@PostMapping("/IC_PP_OWNER")
	public String ic_pp_owner_save(IC_PP_OWNER ic_pp_owner) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.insertICPPOwner(ic_pp_owner);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_PP_OWNER";
	}

	@GetMapping("/IC_PP_OWNER/{id}")
	public String ic_pp_owner(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_PP_OWNER ic_pp_owner = iconvDaoRafi.singleIC_PP_OWNER(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.listIC_PP_OWNER_TYPE();

		ArrayList<IC_PP_OWNER> listIC_PP_OWNER = iconvDaoRafi.listIC_PP_OWNER();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_pp_owner", ic_pp_owner);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_PP_OWNER_TYPE", listIC_PP_OWNER_TYPE);
		model.addAttribute("listIC_PP_OWNER", listIC_PP_OWNER);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_OWNER";

	}

	@PostMapping("/IC_PP_OWNER/{id}")
	public String ic_pp_owner_edit(@PathVariable("id") String id, Model model, IC_PP_OWNER ic_pp_owner) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ic_pp_owner.setPP_OWNER_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICPPOwner(ic_pp_owner);

		return "redirect:/IC_PP_OWNER";
	}

	@PostMapping("/IC_PP_OWNER_delete/{id}")
	public String IC_PP_OWNER(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.deleteICPPOwner(id);

		return "redirect:/IC_PP_OWNER";
	}

//	CLEAR IC_PP_OWNER START
	@PostMapping("/IC_PP_OWNER_clear/{id}")
	public String IC_PP_OWNER_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "redirect:/IC_PP_OWNER";
	}
//	CLEAR IC_PP_OWNER END

	@GetMapping("/IC_LINE_TYPE")
	public String ic_line_type(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_LINE_TYPE ic_line_type = new IC_LINE_TYPE();

		ArrayList<IC_LINE_TYPE> listIC_LINE_TYPE = iconvDaoRafi.listIC_LINE_TYPE();
		model.addAttribute("ic_line_type", ic_line_type);
		model.addAttribute("listIC_LINE_TYPE", listIC_LINE_TYPE);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_LINE_TYPE";
	}

	@PostMapping("/IC_LINE_TYPE")
	public String ic_line_type_save(IC_LINE_TYPE ic_line_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.insertICLineType(ic_line_type);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_LINE_TYPE";
	}

	@GetMapping("/IC_LINE_TYPE/{id}")
	public String ic_line_type_single(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_LINE_TYPE ic_line_type = iconvDaoRafi.singleIC_LINE_TYPE(id);

//		System.out.println(ic_misc_bill_type);

		ArrayList<IC_LINE_TYPE> listIC_LINE_TYPE = iconvDaoRafi.listIC_LINE_TYPE();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_line_type", ic_line_type);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_LINE_TYPE", listIC_LINE_TYPE);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_LINE_TYPE";
	}

	@PostMapping("/IC_LINE_TYPE/{id}")
	public String ic_pp_owner_edit(@PathVariable("id") String id, Model model, IC_LINE_TYPE ic_line_type) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ic_line_type.setLINE_TYPE_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICLineType(ic_line_type);

		return "redirect:/IC_LINE_TYPE";
	}

	@PostMapping("/IC_LINE_TYPE_delete/{id}")
	public String IC_LINE_TYPE(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		iconvDaoRafi.deleteICLineType(id);

		return "redirect:/IC_LINE_TYPE";
	}

//	CLEAR IC_PP_OWNER START
	@PostMapping("/IC_LINE_TYPE_clear/{id}")
	public String IC_LINE_TYPE_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "redirect:/IC_LINE_TYPE";
	}

//	CLEAR IC_PP_OWNER END

//	IC_PERIOD_MST table list start

	@GetMapping("/IC_LOC_MOD")
	public String ic_period_mst(Model model) {

		String flag = "0";

		IC_PERIOD_MST ic_period_mst = new IC_PERIOD_MST();

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		model.addAttribute("ic_period_mst", ic_period_mst);
		model.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		model.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_PERIOD_MST";
	}

//	IC_PERIOD_MST table list end

//	IC_LOCATION_MASTER  table  list start

	@GetMapping("/IC_LOCATION_MASTER")
	public String ic_location_master(Model model) {

		String flag = "0";

		IC_LOCATION_MASTER ic_location_master = new IC_LOCATION_MASTER();

		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		model.addAttribute("ic_location_master", ic_location_master);
		model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		model.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_LOCATION_MASTER";
	}

//	IC_LOCATION_MASTER  list table end

//	IC_LOC_MOD table list start 
	@GetMapping("/IC_LOC_MOD/{b}")
	public String ic_loc_mod(@PathVariable("b") int i, Model m) {

//		System.out.println(i);
		String flag = "0";

		IC_LOC_MOD ic_loc_mod = new IC_LOC_MOD();

		ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);

//		System.out.println(b);
		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();

//		

		System.out.println("fhh");
		System.out.println(b);
		m.addAttribute("id", i);
		m.addAttribute("ic_loc_mod", ic_loc_mod);
		m.addAttribute("s", b);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);

		m.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_LOC_MOD.html";

	}
//	IC_LOC_MOD table list end 

//	IC_LOC_MOD table insert start
	@PostMapping("/IC_LOC_MOD/{b}")
	public String ic_loc_mod_save(@PathVariable("b") String i, IC_LOC_MOD ic_loc_mod) {

		ic_loc_mod.setLOC_MOD_ID(i);

		iconvDaoRafi.insertICLocMod(ic_loc_mod);

		System.out.println("vdf");
		System.out.println(ic_loc_mod);

		return "redirect:/IC_LOC_MOD/" + i;

	}
//	IC_LOC_MOD table insert end 

//	IC_LOC_MOD table single start 
	@GetMapping("/IC_LOC_MOD/{b}/{c}")
	public String ic_loc_mod_single(@PathVariable("b") int i, @PathVariable("c") int j, Model m) {

//
//		System.out.println(i);
//		System.out.println(j);

		String flag = "1";

		IC_LOC_MOD ic_loc_mod = iconvDaoRafi.singleIC_LOC_MOD(j);

//		System.out.println(pkg_rate_mst);

//		System.out.println(pkg_rate_mst);
		ArrayList<IC_LOC_MOD> listIC_LOC_MOD = iconvDaoRafi.a(i);

		ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();

		m.addAttribute("ic_loc_mod", ic_loc_mod);
		m.addAttribute("listIC_LOC_MOD", listIC_LOC_MOD);
		m.addAttribute("flag", flag);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("id", i);
		m.addAttribute("s", b);
		m.addAttribute("i", j);
		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_LOC_MOD";

	}
//	IC_LOC_MOD table single end

//	IC_LOC_MOD table update start
	@PostMapping("/IC_LOC_MOD/{b}/{id}")
	public String ic_loc_mod_edit(@PathVariable("b") String i, @PathVariable("id") String id, Model model,
			IC_LOC_MOD ic_loc_mod) {

		ic_loc_mod.setBILL_CYCLE_CODE(i);
		ic_loc_mod.setLOC_MOD_ID(id);

//		System.out.println("test");
//		System.out.println(pkg_rate_mst);
//		

//		System.out.println("Controller:");
//		System.out.println(pkg_type);
		iconvDaoRafi.editICLocMod(ic_loc_mod);

		return "redirect:/IC_LOC_MOD/" + i;
	}

//	IC_LOC_MOD table update end

//	IC_LOC_MOD table delete start
	@PostMapping("/IC_LOC_MOD_delete/{b}/{id}")
	public String ic_loc_mod_delete(@PathVariable("b") String i, @PathVariable("id") int id) {

		iconvDaoRafi.deleteICLocMod(id);

		return "redirect:/IC_LOC_MOD/" + i;
	}
//	IC_LOC_MOD table delete end

//	CLEAR IC_LOC_MOD  START
	@PostMapping("/IC_LOC_MOD_clear/{id}")
	public String IC_LOC_MOD_clear(@PathVariable("id") int id) {

		return "redirect:/IC_LOC_MOD/" + id;
	}
//	CLEAR IC_LOC_MOD  END

//	IC_SECT_WISE_MOD  table  list start

	@GetMapping("/IC_SECTOR_MST")
	public String ic_sector_mst_mod(Model model) {

		String flag = "0";

		IC_SECTOR_MST ic_sector_mst = new IC_SECTOR_MST();

		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		model.addAttribute("ic_sector_mst", ic_sector_mst);
		model.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		model.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_SECTOR_MST";
	}

//	IC_SECT_WISE_MOD  list table end

//	IC_LOC_MOD table list start 
	@GetMapping("/IC_SECT_WISE_MOD/{b}/{l}")
	public String ic_sect_wise_mod(@PathVariable("b") String i, @PathVariable("l") String p, Model m) {

//		System.out.println(i);
		String flag = "0";

		IC_SECT_WISE_MOD ic_sect_wise_mod = new IC_SECT_WISE_MOD();

//		 ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);
		ArrayList<IC_SECT_WISE_MOD> r = iconvDaoRafi.g(i, p);

//		System.out.println(b);
		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();

//		

//		System.out.println("fhh");
//		System.out.println(b);
		m.addAttribute("id", i);
		m.addAttribute("lo", p);
		m.addAttribute("ic_sect_wise_mod", ic_sect_wise_mod);
//		m.addAttribute("m", b);
		m.addAttribute("s", r);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);

		m.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_SECT_WISE_MOD.html";

	}
//	IC_SECT_WISE_MOD table list end 

//	IC_SECT_WISE_MOD table insert start
	@PostMapping("/IC_SECT_WISE_MOD/{b}/{l}")
	public String ic_sect_wise_mod_save(@PathVariable("b") String i, @PathVariable("l") String p,
			IC_SECT_WISE_MOD ic_sect_wise_mod) {

		ic_sect_wise_mod.setSECT_MOD_ID(i);

		iconvDaoRafi.insertICSectWiseMod(ic_sect_wise_mod);

//		System.out.println("vdf");
//		System.out.println(ic_sect_wise_mod);
//		
		return "redirect:/IC_SECT_WISE_MOD/" + i + "/" + p;

	}

//	IC_SECT_WISE_MOD table insert end 

//	IC_SECT_WISE_MOD table single start 
	@GetMapping("/IC_SECT_WISE_MOD/{b}/{l}/{c}")
	public String ic_sect_wise_mod_single(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") int j, Model m) {

//
//		System.out.println(i);
//		System.out.println(j);

		String flag = "1";

//	 IC_LOC_MOD ic_loc_mod = iconvDaoRafi.singleIC_LOC_MOD(j);

		IC_SECT_WISE_MOD ic_sect_wise_mod = iconvDaoRafi.singleIC_SECT_WISE_MOD(j);

//		System.out.println(pkg_rate_mst);

//		System.out.println(pkg_rate_mst);
//		ArrayList<IC_LOC_MOD> listIC_LOC_MOD = iconvDaoRafi.a(i);

		ArrayList<IC_SECT_WISE_MOD> r = iconvDaoRafi.g(i, p);

//		ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();

		m.addAttribute("ic_sect_wise_mod", ic_sect_wise_mod);
//		m.addAttribute("listIC_LOC_MOD",listIC_LOC_MOD);
		m.addAttribute("flag", flag);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("id", i);
		m.addAttribute("s", r);
		m.addAttribute("i", j);
		m.addAttribute("lo", p);
		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_SECT_WISE_MOD";

	}
//	IC_SECT_WISE_MOD table single end

//	IC_SECT_WISE_MOD table update start
	@PostMapping("/IC_SECT_WISE_MOD/{b}/{l}/{c}")
	public String ic_sect_wise_mod_edit(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") String id, Model model, IC_SECT_WISE_MOD ic_sect_wise_mod) {

		ic_sect_wise_mod.setBILL_CYCLE_CODE(i);
		ic_sect_wise_mod.setLOCATION_CODE(p);
		ic_sect_wise_mod.setSECT_MOD_ID(id);

//		System.out.println("test");
//		System.out.println(pkg_rate_mst);
//		

//		System.out.println("Controller:");
//		System.out.println(pkg_type);
		iconvDaoRafi.editICSectWiseMod(ic_sect_wise_mod);

		return "redirect:/IC_SECT_WISE_MOD/" + i + "/" + p;
	}

//	IC_SECT_WISE_MOD table update end

//	IC_LOC_MOD table delete start
	@PostMapping("/IC_SECT_WISE_MOD_delete/{b}/{l}/{c}")
	public String ic_sect_wise_mod_delete(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") int id) {

		iconvDaoRafi.deleteICSectWiseMod(id);

		return "redirect:/IC_SECT_WISE_MOD/" + i + "/" + p;
	}
//	IC_SECT_WISE_MOD table delete end

//	CLEAR IC_SECT_WISE_MOD  START
	@PostMapping("/IC_SECT_WISE_MOD_clear/{b}/{l}")
	public String IC_SECT_WISE_MOD_clear(@PathVariable("b") String id, @PathVariable("l") String p) {

		return "redirect:/IC_SECT_WISE_MOD/" + id + "/" + p;
	}
//	CLEAR IC_SECT_WISE_MOD  END

//	IC_MISC_MOD table list start 
	@GetMapping("/IC_MISC_MOD/{b}/{l}")

	public String ic_misc_mod(@PathVariable("b") String i, @PathVariable("l") String p, Model m) {

//		System.out.println(i);
		String flag = "0";

		IC_MISC_MOD ic_misc_mod = new IC_MISC_MOD();

//		 ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);
		ArrayList<IC_MISC_MOD> r = iconvDaoRafi.d(i, p);

//		System.out.println(b);
		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = iconvDaoRafi.listIC_MISC_BILL_TYPE();

//		

//		System.out.println("fhh");
//		System.out.println(b);
		m.addAttribute("id", i);
		m.addAttribute("lo", p);
		m.addAttribute("ic_misc_mod", ic_misc_mod);
//		m.addAttribute("m", b);
		m.addAttribute("s", r);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("listIC_MISC_BILL_TYPE", listIC_MISC_BILL_TYPE);

		m.addAttribute("flag", flag);

		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_MISC_MOD.html";

	}
//	IC_MISC_MOD table list end 

//	IC_MISC_MOD table insert start
	@PostMapping("/IC_MISC_MOD/{b}/{l}")
	public String ic_misc_mod_save(@PathVariable("b") String i, @PathVariable("l") String p, IC_MISC_MOD ic_misc_mod) {

		ic_misc_mod.setMSC_MOD_ID(i);

		iconvDaoRafi.insertICMiscMod(ic_misc_mod);

		System.out.println("cmf");
		System.out.println(ic_misc_mod);
//		
		return "redirect:/IC_MISC_MOD/" + i + "/" + p;

	}

//	IC_MISC_MOD table insert end 

//	IC_MISC_MOD table single start 
	@GetMapping("/IC_MISC_MOD/{b}/{l}/{c}")
	public String ic_misc_mod_single(@PathVariable("b") String i, @PathVariable("l") String p, @PathVariable("c") int j,
			Model m) {

//
//		System.out.println(i);
//		System.out.println(j);

		String flag = "1";

//	 IC_LOC_MOD ic_loc_mod = iconvDao.singleIC_LOC_MOD(j);

		IC_MISC_MOD ic_misc_mod = iconvDaoRafi.singleIC_MISC_MOD(j);

//		System.out.println(pkg_rate_mst);

//		System.out.println(pkg_rate_mst);
//		ArrayList<IC_LOC_MOD> listIC_LOC_MOD = iconvDao.a(i);

		ArrayList<IC_MISC_MOD> r = iconvDaoRafi.d(i, p);

//		ArrayList<IC_LOC_MOD> b = iconvDao.a(i);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = iconvDaoRafi.listIC_MISC_BILL_TYPE();

		m.addAttribute("ic_misc_mod", ic_misc_mod);
//		m.addAttribute("listIC_LOC_MOD",listIC_LOC_MOD);
		m.addAttribute("flag", flag);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("listIC_MISC_BILL_TYPE", listIC_MISC_BILL_TYPE);
		m.addAttribute("id", i);
		m.addAttribute("s", r);
		m.addAttribute("i", j);
		m.addAttribute("lo", p);
		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_MISC_MOD";

	}
//	IC_MISC_MOD table single end

//	IC_MISC_MOD table update start
	@PostMapping("/IC_MISC_MOD/{b}/{l}/{c}")
	public String ic_misc_mod_edit(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") String id, Model model, IC_MISC_MOD ic_misc_mod) {

		ic_misc_mod.setBILL_CYCLE_CODE(i);
		ic_misc_mod.setLOCATION_CODE(p);
		ic_misc_mod.setMSC_MOD_ID(id);

//		System.out.println("test");
//		System.out.println(pkg_rate_mst);
//		

//		System.out.println("Controller:");
//		System.out.println(pkg_type);
		iconvDaoRafi.editICMiscMod(ic_misc_mod);

		return "redirect:/IC_MISC_MOD/" + i + "/" + p;
	}

//	IC_MISC_MOD table update end

//	IC_MISC_MOD table delete start
	@PostMapping("/IC_MISC_MOD_delete/{b}/{l}/{c}")
	public String ic_misc_mod_delete(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") int id) {

		iconvDaoRafi.deleteICMiscMod(id);

		return "redirect:/IC_MISC_MOD/" + i + "/" + p;
	}
//	IC_MISC_MOD table delete end

//	CLEAR IC_MISC_MOD  START
	@PostMapping("/IC_MISC_MOD_clear/{b}/{l}")
	public String IC_MISC_MOD_clear(@PathVariable("b") String id, @PathVariable("l") String p) {

		return "redirect:/IC_MISC_MOD/" + id + "/" + p;
	}
//	CLEAR IC_MISC_MOD  END

//	IC_USAGE_CAT_CODE  table  list start

	@GetMapping("/IC_USAGE_CAT_CODE")
	public String ic_usage_cad_code(Model model) {

		String flag = "0";

		IC_USAGE_CAT_CODE ic_usage_cad_code = new IC_USAGE_CAT_CODE();

		ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CAT_CODE = iconvDaoRafi.listIC_USAGE_CAT_CODE();
		model.addAttribute("ic_usage_cad_code", ic_usage_cad_code);
		model.addAttribute("listIC_USAGE_CAT_CODE", listIC_USAGE_CAT_CODE);
		model.addAttribute("flag", flag);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_USAGE_CAT_CODE";
	}

//	IC_USAGE_CAT_CODE  list table end

//	IC_CAT_WISE_MOD table list start 
	@GetMapping("/IC_CAT_WISE_MOD/{b}/{l}")

	public String ic_cat_wise_mod(@PathVariable("b") String i, @PathVariable("l") String p, Model m) {

//		System.out.println(i);
		String flag = "0";
		IC_MISC_MOD ic_misc_mod = new IC_MISC_MOD();

		IC_CAT_WISE_MOD ic_cat_wise_mod = new IC_CAT_WISE_MOD();

//		 ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);
		ArrayList<IC_CAT_WISE_MOD> b = iconvDaoRafi.w(i, p);

//		System.out.println(b);
		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CAT_CODE = iconvDaoRafi.listIC_USAGE_CAT_CODE();

//		

//		System.out.println("fhh");
//		System.out.println(b);
		m.addAttribute("id", i);
		m.addAttribute("lo", p);
		m.addAttribute("ic_cat_wise_mod", ic_cat_wise_mod);
//		m.addAttribute("m", b);
		m.addAttribute("s", b);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("listIC_USAGE_CAT_CODE", listIC_USAGE_CAT_CODE);

		m.addAttribute("flag", flag);

		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);
		return "IC_CAT_WISE_MOD.html";

	}
//	IC_CAT_WISE_MOD table list end 

//	IC_CAT_WISE_MOD table insert start
	@PostMapping("/IC_CAT_WISE_MOD/{b}/{l}")
	public String ic_cat_wise_mod_save(@PathVariable("b") String i, @PathVariable("l") String p,
			IC_CAT_WISE_MOD ic_cat_wise_mod) {

		ic_cat_wise_mod.setCAT_MOD_ID(i);

		iconvDaoRafi.insertICCatWiseMod(ic_cat_wise_mod);

		System.out.println("hp");
		System.out.println(ic_cat_wise_mod);
//		
		return "redirect:/IC_CAT_WISE_MOD/" + i + "/" + p;

	}

//	IC_CAT_WISE_MOD table insert end 

//	IC_CAT_WISE_MOD table single start 
	@GetMapping("/IC_CAT_WISE_MOD/{b}/{l}/{c}")
	public String ic_cat_wise_mod_single(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") int j, Model m) {

//
//		System.out.println(i);
//		System.out.println(j);

		String flag = "1";

//	 IC_LOC_MOD ic_loc_mod = iconvDaoRafi.singleIC_LOC_MOD(j);

		IC_CAT_WISE_MOD ic_cat_wise_mod = iconvDaoRafi.singleIC_CAT_WISE_MOD(j);

//		System.out.println(pkg_rate_mst);

//		System.out.println(pkg_rate_mst);
//		ArrayList<IC_LOC_MOD> listIC_LOC_MOD = iconvDaoRafi.a(i);

		ArrayList<IC_CAT_WISE_MOD> r = iconvDaoRafi.w(i, p);

//		ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CAT_CODE = iconvDaoRafi.listIC_USAGE_CAT_CODE();

		m.addAttribute("ic_cat_wise_mod", ic_cat_wise_mod);
//		m.addAttribute("listIC_LOC_MOD",listIC_LOC_MOD);
		m.addAttribute("flag", flag);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("listIC_USAGE_CAT_CODE", listIC_USAGE_CAT_CODE);
		m.addAttribute("id", i);
		m.addAttribute("s", r);
		m.addAttribute("i", j);
		m.addAttribute("lo", p);
		dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_CAT_WISE_MOD";

	}
//	IC_CAT_WISE_MOD table single end

//	IC_CAT_WISE_MOD table update start
	@PostMapping("/IC_CAT_WISE_MOD/{b}/{l}/{c}")
	public String ic_cat_wise_mod_edit(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") String id, Model model, IC_CAT_WISE_MOD ic_cat_wise_mod) {

		ic_cat_wise_mod.setBILL_CYCLE_CODE(i);
		ic_cat_wise_mod.setLOCATION_CODE(p);
		ic_cat_wise_mod.setCAT_MOD_ID(id);

//		System.out.println("test");
//		System.out.println(pkg_rate_mst);
//		

//		System.out.println("Controller:");
//		System.out.println(pkg_type);
		iconvDaoRafi.editICCatWiseMod(ic_cat_wise_mod);

		return "redirect:/IC_CAT_WISE_MOD/" + i + "/" + p;
	}

//	IC_CAT_WISE_MOD table update end

//	IC_CAT_WISE_MOD table delete start
	@PostMapping("/IC_CAT_WISE_MOD_delete/{b}/{l}/{c}")
	public String ic_cat_wise_mod_delete(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") int id) {

		iconvDaoRafi.deleteICCatWiseMod(id);

		return "redirect:/IC_CAT_WISE_MOD/" + i + "/" + p;
	}
//	IC_CAT_WISE_MOD table delete end

//	CLEAR IC_CAT_WISE_MOD  START
	@PostMapping("/IC_CAT_WISE_MOD_clear/{b}/{l}")
	public String IC_CAT_WISE_MOD_clear(@PathVariable("b") String id, @PathVariable("l") String p) {

		return "redirect:/IC_CAT_WISE_MOD/" + id + "/" + p;
	}
//	CLEAR IC_CAT_WISE_MOD  END

	/////////////////////// end rafi
	////////////////////// start surovi
	@GetMapping("/ic_sector_mst")
	public String ic_sector_mst(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_SECTOR_MST ic_sector_mst = new IC_SECTOR_MST();

		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = convergeDaoSurovi.listIC_SECTOR_MST();
		model.addAttribute("ic_sector_mst", ic_sector_mst);
		model.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);
		return "ic_sector_mst";
	}

	@PostMapping("/ic_sector_mst")
	public String misc_bill_type_save(IC_SECTOR_MST ic_sector_mst) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		convergeDaoSurovi.insertIcSectorMst(ic_sector_mst);

//		System.out.println(misc_bill_type);
		return "redirect:/ic_sector_mst";
	}

	@GetMapping("/ic_sector_mst/{id}")
	public String ic_sector_mst_single(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_SECTOR_MST ic_sector_mst = convergeDaoSurovi.singleIC_SECTOR_MST(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = convergeDaoSurovi.listIC_SECTOR_MST();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_sector_mst", ic_sector_mst);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);
		return "ic_sector_mst";
	}

	@PostMapping("/ic_sector_mst/{id}")
	public String ic_sector_mst_edit(@PathVariable("id") String id, Model model, IC_SECTOR_MST ic_sector_mst) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ic_sector_mst.setSECT_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		convergeDaoSurovi.editIcSectorMst(ic_sector_mst);

		return "redirect:/ic_sector_mst";
	}

//	
	@PostMapping("/ic_sector_mst_delete/{id}")
	public String ic_sector_mst_delete(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		convergeDaoSurovi.deleteIcSectorMst(id);

		return "redirect:/ic_sector_mst";
	}

	@GetMapping("/IC_USAGE_AREA")
	public String ic_usage_area(Model model) {

		String flag = "0";

		IC_USAGE_AREA ic_usage_area = new IC_USAGE_AREA();

		ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA = convergeDaoSurovi.listIC_USAGE_AREA();
		model.addAttribute("ic_usage_area", ic_usage_area);
		model.addAttribute("listIC_USAGE_AREA", listIC_USAGE_AREA);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USAGE_AREA";
	}

	@PostMapping("/IC_USAGE_AREA")
	public String ic_fuel_type_save(IC_USAGE_AREA ic_usage_area) {

		convergeDaoSurovi.insertICUsageArea(ic_usage_area);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_USAGE_AREA";
	}

	@GetMapping("/IC_USAGE_AREA/{id}")
	public String ic_usage_area_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_USAGE_AREA ic_usage_area = convergeDaoSurovi.singleIC_USAGE_AREA(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA = convergeDaoSurovi.listIC_USAGE_AREA();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_usage_area", ic_usage_area);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_USAGE_AREA", listIC_USAGE_AREA);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USAGE_AREA";
	}

	@PostMapping("/IC_USAGE_AREA/{id}")
	public String ic_usage_area_edit(@PathVariable("id") String id, Model model, IC_USAGE_AREA ic_usage_area) {

		ic_usage_area.setAREA_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		convergeDaoSurovi.editICUsageArea(ic_usage_area);

		return "redirect:/IC_USAGE_AREA";
	}

	@PostMapping("/IC_USAGE_AREA_delete/{id}")
	public String IC_USAGE_AREA_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICUsageArea(id);

		return "redirect:/IC_USAGE_AREA";
	}

//	CLEAR IC_USAGE_AREA START
	@PostMapping("/IC_USAGE_AREA_clear/{id}")
	public String IC_USAGE_AREA_clear(@PathVariable("id") int id) {

		return "redirect:/IC_USAGE_AREA";
	}
	// IC_FORWARD_HEADER_MST Start

	@GetMapping("/IC_FORWARD_HEADER_MST")
	public String ic_forward_header_mst(Model model) {

		String flag = "0";

		IC_FORWARD_HEADER_MST ic_forward_header_mst = new IC_FORWARD_HEADER_MST();

		ArrayList<IC_FORWARD_HEADER_MST> listIC_FORWARD_HEADER_MST = convergeDaoSurovi.listIC_FORWARD_HEADER_MST();
		model.addAttribute("ic_forward_header_mst", ic_forward_header_mst);
		model.addAttribute("listIC_FORWARD_HEADER_MST", listIC_FORWARD_HEADER_MST);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_FORWARD_HEADER_MST";
	}

	@PostMapping("/IC_FORWARD_HEADER_MST")
	public String ic_forward_header_mst_save(IC_FORWARD_HEADER_MST ic_forward_header_mst) {

		convergeDaoSurovi.insertICForwardHeaderMst(ic_forward_header_mst);

//			System.out.println(misc_bill_type);
		return "redirect:/IC_FORWARD_HEADER_MST";
	}

	@GetMapping("/IC_FORWARD_HEADER_MST/{id}")
	public String ic_forward_header_mst_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_FORWARD_HEADER_MST ic_forward_header_mst = convergeDaoSurovi.singleIC_FORWARD_HEADER_MST(id);

		ArrayList<IC_FORWARD_HEADER_MST> listIC_FORWARD_HEADER_MST = convergeDaoSurovi.listIC_FORWARD_HEADER_MST();

//			ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_forward_header_mst", ic_forward_header_mst);
//			model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_FORWARD_HEADER_MST", listIC_FORWARD_HEADER_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_FORWARD_HEADER_MST";
	}

	@PostMapping("/IC_FORWARD_HEADER_MST/{id}")
	public String ic_forward_header_mst_edit(@PathVariable("id") String id, Model model,
			IC_FORWARD_HEADER_MST ic_forward_header_mst) {

		ic_forward_header_mst.setFRD_HDR_ID(id);

//			System.out.println("Controller:");
//			System.out.println(pkg_mst);
		convergeDaoSurovi.editICForwardHeaderMst(ic_forward_header_mst);

		return "redirect:/IC_FORWARD_HEADER_MST";
	}

	@PostMapping("/IC_FORWARD_HEADER_MST_delete/{id}")
	public String IC_FORWARD_HEADER_MST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICForwardHeaderMst(id);

		return "redirect:/IC_FORWARD_HEADER_MST";
	}

//		CLEAR IC_USAGE_AREA START
	@PostMapping("/IC_FORWARD_HEADER_MST_clear/{id}")
	public String IC_FORWARD_HEADER_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_FORWARD_HEADER_MST";
	}

	// IC USER MST starts

	@GetMapping("/IC_USER_MST")
	public String ic_user_mst(Model model) {

		String flag = "0";

		IC_USER_MST ic_user_mst = new IC_USER_MST();

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);

		ArrayList<IC_GROUP_INFO> groupDorpdownList = convergeDaoSurovi.listIC_GROUP_INFO();
		model.addAttribute("groupDorpdownList", groupDorpdownList);

		ArrayList<IC_USER_MST> listIC_USER_MST = convergeDaoSurovi.listIC_USER_MST();
		model.addAttribute("ic_user_mst", ic_user_mst);
		model.addAttribute("listIC_USER_MST", listIC_USER_MST);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_MST";
	}

	@PostMapping("/IC_USER_MST")
	public String ic_user_mst_save(IC_USER_MST ic_user_mst) {

		convergeDaoSurovi.insertICUserMst(ic_user_mst);

		return "redirect:/IC_USER_MST";
	}

	@GetMapping("/IC_USER_MST/{id}")
	public String ic_user_mst_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_USER_MST ic_user_mst = convergeDaoSurovi.singleIC_USER_MST(id);

		ArrayList<IC_USER_MST> listIC_USER_MST = convergeDaoSurovi.listIC_USER_MST();

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);

		ArrayList<IC_GROUP_INFO> groupDorpdownList = convergeDaoSurovi.listIC_GROUP_INFO();
		model.addAttribute("groupDorpdownList", groupDorpdownList);

		model.addAttribute("ic_user_mst", ic_user_mst);
		model.addAttribute("listIC_USER_MST", listIC_USER_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_MST";
	}

	@PostMapping("/IC_USER_MST/{id}")
	public String ic_user_mst_edit(@PathVariable("id") String id, Model model, IC_USER_MST ic_user_mst) {

		ic_user_mst.setUSER_ID(id);

		convergeDaoSurovi.editICUserMst(ic_user_mst);

		return "redirect:/IC_USER_MST";
	}

	@PostMapping("/IC_USER_MST_delete/{id}")
	public String IC_USER_MST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICUserMst(id);

		return "redirect:/IC_USER_MST";
	}

//		CLEAR IC_USER_MST START
	@PostMapping("/IC_USER_MST_clear/{id}")
	public String IC_USER_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_USER_MST";
	}

	// IC_USER_ACCESS starts

	@GetMapping("/IC_USER_ACCESS/{userName}/{grpC}")
	public String ic_user_access(@PathVariable("userName") String uName, @PathVariable("grpC") String grpC,
			Model model) {

		String flag = "0";

		IC_USER_ACCESS ic_user_access = new IC_USER_ACCESS();

		ArrayList<IC_USER_MST> listIC_USER_MST = convergeDaoSurovi.listIC_USER_MST();
		model.addAttribute("listIC_USER_MST", listIC_USER_MST);

		ArrayList<IC_GROUP_ACCESS> groupAccessModDropdown = convergeDaoSurovi.groupAccessModDropdown(grpC);
		model.addAttribute("groupAccessModDropdown", groupAccessModDropdown);

		ArrayList<ActivityDrop> activityDropDown = convergeDaoSurovi.activityDropDown();
		model.addAttribute("activityDropDown", activityDropDown);

		ArrayList<IC_GROUP_INFO> groupDorpdownList = convergeDaoSurovi.listIC_GROUP_INFO();
		model.addAttribute("groupDorpdownList", groupDorpdownList);

		ArrayList<IC_USER_ACCESS> listIC_USER_ACCESS = convergeDaoSurovi.listIC_USER_ACCESS(uName, grpC);
		model.addAttribute("ic_user_access", ic_user_access);
		model.addAttribute("listIC_USER_ACCESS", listIC_USER_ACCESS);
		model.addAttribute("flag", flag);
		model.addAttribute("uName", uName);
		model.addAttribute("grpC", grpC);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_ACCESS";
	}

	@PostMapping("/IC_USER_ACCESS/{userName}/{grpC}")
	public String ic_user_access_save(@PathVariable("userName") String uName, @PathVariable("grpC") String grpC,
			IC_USER_ACCESS ic_user_access) {

		ic_user_access.setUSER_NAME(uName);
		ic_user_access.setGRP_CODE(grpC);

		convergeDaoSurovi.insertICUserAccess(ic_user_access);

		return "redirect:/IC_USER_ACCESS/" + uName + "/" + grpC;

	}

	@GetMapping("/IC_USER_ACCESS/{userName}/{grpC}/{userAccId}")
	public String ic_user_access_single(@PathVariable("userName") String uName, @PathVariable("grpC") String grpC,
			@PathVariable("userAccId") int userAccId, Model model) {

		String flag = "1";

		IC_USER_ACCESS ic_user_access = convergeDaoSurovi.singleIC_USER_ACCESS(userAccId);

		model.addAttribute("selected", ic_user_access.getACTIVITY_CODE());

		ArrayList<IC_USER_ACCESS> listIC_USER_ACCESS = convergeDaoSurovi.listIC_USER_ACCESS(uName, grpC);

		ArrayList<IC_USER_MST> listIC_USER_MST = convergeDaoSurovi.listIC_USER_MST();
		model.addAttribute("listIC_USER_MST", listIC_USER_MST);

		ArrayList<IC_GROUP_ACCESS> groupAccessModDropdown = convergeDaoSurovi.groupAccessModDropdown(grpC);
		model.addAttribute("groupAccessModDropdown", groupAccessModDropdown);

		ArrayList<ActivityDrop> activityDropDown = convergeDaoSurovi.activityDropDown();
		model.addAttribute("activityDropDown", activityDropDown);

		ArrayList<IC_GROUP_INFO> groupDorpdownList = convergeDaoSurovi.listIC_GROUP_INFO();
		model.addAttribute("groupDorpdownList", groupDorpdownList);

		model.addAttribute("ic_user_access", ic_user_access);
		model.addAttribute("listIC_USER_ACCESS", listIC_USER_ACCESS);
		model.addAttribute("flag", flag);
		model.addAttribute("uName", uName);
		model.addAttribute("grpC", grpC);
		model.addAttribute("userAccId", userAccId);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_ACCESS";
	}

	@PostMapping("/IC_USER_ACCESS/{userName}/{grpC}/{userAccId}")
	public String ic_user_access_edit(@PathVariable("userName") String uName, @PathVariable("grpC") String grpC,
			@PathVariable("userAccId") int userAccId, Model model, IC_USER_ACCESS ic_user_access) {

		ic_user_access.setUSER_ACS_ID(userAccId);
		ic_user_access.setGRP_CODE(grpC);
		ic_user_access.setUSER_NAME(uName);

		convergeDaoSurovi.editICUserAccess(ic_user_access);

		return "redirect:/IC_USER_ACCESS/" + uName + "/" + grpC;
	}

	@PostMapping("/IC_USER_ACCESS_delete/{userName}/{grpC}/{userAccId}")
	public String ic_user_access_delete(@PathVariable("userName") String uName, @PathVariable("grpC") String grpC,
			@PathVariable("userAccId") int userAccId) {

		convergeDaoSurovi.deleteICUserAccess(userAccId);

		return "redirect:/IC_USER_ACCESS/" + uName + "/" + grpC;
	}

//		CLEAR IC_USER_ACCESS START
	@PostMapping("/IC_USER_ACCESS_clear/{userAccId}")
	public String IC_USER_ACCESS_clear(@PathVariable("userAccId") int userAccId) {

		return "redirect:/IC_USER_ACCESS";
	}

	// IC_USER_TYPE_MST starts

	@GetMapping("/IC_USER_TYPE_MST")
	public String ic_user_type_mst(Model model) {

		String flag = "0";

		IC_USER_TYPE_MST ic_user_type_mst = new IC_USER_TYPE_MST();

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();
		model.addAttribute("ic_user_type_mst", ic_user_type_mst);
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_TYPE_MST";
	}

	@PostMapping("/IC_USER_TYPE_MST")
	public String ic_user_type_mst_save(IC_USER_TYPE_MST ic_user_type_mst) {

		convergeDaoSurovi.insertICUserTypeMst(ic_user_type_mst);

		return "redirect:/IC_USER_TYPE_MST";
	}

	@GetMapping("/IC_USER_TYPE_MST/{id}")
	public String ic_user_type_mst_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_USER_TYPE_MST ic_user_type_mst = convergeDaoSurovi.singleIC_USER_TYPE_MST(id);

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();

		model.addAttribute("ic_user_type_mst", ic_user_type_mst);
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_TYPE_MST";
	}

	@PostMapping("/IC_USER_TYPE_MST/{id}")
	public String ic_user__type_mst_edit(@PathVariable("id") String id, Model model,
			IC_USER_TYPE_MST ic_user_type_mst) {

		ic_user_type_mst.setUSER_TYPE_ID(id);

		convergeDaoSurovi.editICUserTypeMst(ic_user_type_mst);

		return "redirect:/IC_USER_TYPE_MST";
	}

	@PostMapping("/IC_USER_TYPE_MST_delete/{id}")
	public String IC_USER_TYPE_MST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICUserTypeMst(id);

		return "redirect:/IC_USER_TYPE_MST";
	}

//		CLEAR IC_USER_MST START
	@PostMapping("/IC_USER_TYPE_MST_clear/{id}")
	public String IC_USER_TYPE_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_USER_TYPE_MST";
	}
	///////////////////// end surovi

	///////////////////// start graph

//	graph start 
	@GetMapping("/IC_DASHBOARD_DIST")
	public String ic_modules_list(Model model) {

		String hdr1 = "";
		String hdr2 = "";
		String hdr3 = "";
		String hdr4 = "";
		String hdr5 = "";
		String hdr6 = "";
		String hdr7 = "";
		String hdr8 = "";
		String hdr9 = "";
		String hdr10 = "";
		String hdr11 = "";
		String hdr12 = "";

		String hdr13 = "";

		String hdr14 = "";

		String hdr40 = "";
		String hdr41 = "";

		String hdr42 = "";
		String hdr43 = "";

		String hdr44 = "";
		String hdr45 = "";

		String hdr46 = "";
		String hdr47 = "";

		String hdr48 = "";
		String hdr49 = "";
		String hdr50 = "";
		String hdr51 = "";
		String hdr52 = "";
		String hdr53 = "";

		String listlast_month_date = iconvDaoRafi.listlast_month_date();

//		 System.out.println("LAST DATE");
//		System.out.println(listlast_month_date);

//		String string = listlast_month_date;
//		String[] parts = string.split("-");
//		String part1 = parts[0]; // 004
//		String part2 = parts[1]; // 034556
//		
//		String part = part1 + part2;

		String date = listlast_month_date; // 034556

//		System.out.println(date);

		String a = date;
		String b = null;
		String c = null;
		String g = null;
		String d = null;
		String e = "000000";
		String f = "1";

		Map<String, Object> result = getAllStatesJdbcCall101.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph");	
//		System.out.println(result);		
		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);
//	    System.out.println(jsonArray);	

		Map<String, Double> graphData = new TreeMap<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);

			hdr1 = jsonData.getString("HDR");
			graphData.put(jsonData.getString("LINEX"), Double.valueOf(jsonData.getString("SYS_LOSS")));
		}

//	    System.out.println(hdr1);
//	    System.out.println(graphData);
		model.addAttribute("hdr1_graph", hdr1);
		model.addAttribute("chartData", graphData);

		Map<String, Object> result1 = getAllStatesJdbcCall102.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph1");	
//		System.out.println(result1);		
		JSONObject json1 = new JSONObject(result1);
		String fjfhdj1 = json1.get("CUR_DATA").toString();
		JSONArray jsonArray1 = new JSONArray(fjfhdj1);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData1 = new TreeMap<>();
		for (int i = 0; i < jsonArray1.length(); i++) {
			JSONObject jsonData1 = jsonArray1.getJSONObject(i);

			hdr2 = jsonData1.getString("HDR");
			graphData1.put(jsonData1.getString("LINEX"), Double.valueOf(jsonData1.getString("SYS_LOSS")));
		}

//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
		model.addAttribute("hdr2_graph", hdr2);
		model.addAttribute("chartData1", graphData1);

		Map<String, Object> result2 = getAllStatesJdbcCall103.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph2");	
//		System.out.println(result2);	    	
		JSONObject json2 = new JSONObject(result2);
		String fjfhdj2 = json2.get("CUR_DATA").toString();
		JSONArray jsonArray2 = new JSONArray(fjfhdj2);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData2 = new TreeMap<>();
		for (int i = 0; i < jsonArray2.length(); i++) {
			JSONObject jsonData2 = jsonArray2.getJSONObject(i);

			hdr3 = jsonData2.getString("HDR");
			graphData2.put(jsonData2.getString("LINEX"), Double.valueOf(jsonData2.getString("CI_RATIO")));
		}

//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
		model.addAttribute("hdr3_graph", hdr3);
		model.addAttribute("chartData2", graphData2);

		Map<String, Object> result3 = getAllStatesJdbcCall104.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json3 = new JSONObject(result3);
		String fjfhdj3 = json3.get("CUR_DATA").toString();
		JSONArray jsonArray3 = new JSONArray(fjfhdj3);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData3 = new TreeMap<>();
		for (int i = 0; i < jsonArray3.length(); i++) {
			JSONObject jsonData3 = jsonArray3.getJSONObject(i);

			hdr4 = jsonData3.getString("HDR");
			graphData3.put(jsonData3.getString("LINEX"), Double.valueOf(jsonData3.getString("CI_RATIO")));
		}

//	    System.out.println(hdr4);
//	    System.out.println(graphData3);
		model.addAttribute("hdr4_graph", hdr4);
		model.addAttribute("chartData3", graphData3);

		Map<String, Object> result4 = getAllStatesJdbcCall105.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json4 = new JSONObject(result4);
		String fjfhdj4 = json4.get("CUR_DATA").toString();
		JSONArray jsonArray4 = new JSONArray(fjfhdj4);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData4 = new TreeMap<>();
		for (int i = 0; i < jsonArray4.length(); i++) {
			JSONObject jsonData4 = jsonArray4.getJSONObject(i);

			hdr5 = jsonData4.getString("HDR");
			graphData4.put(jsonData4.getString("LINEX"), Double.valueOf(jsonData4.getString("CB_RATIO")));
		}

//	    System.out.println(hdr5);
//	    System.out.println(graphData4);
		model.addAttribute("hdr5_graph", hdr5);
		model.addAttribute("chartData4", graphData4);

		Map<String, Object> result5 = getAllStatesJdbcCall106.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json5 = new JSONObject(result5);
		String fjfhdj5 = json5.get("CUR_DATA").toString();
		JSONArray jsonArray5 = new JSONArray(fjfhdj5);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData5 = new TreeMap<>();
		for (int i = 0; i < jsonArray5.length(); i++) {
			JSONObject jsonData5 = jsonArray5.getJSONObject(i);

			hdr6 = jsonData5.getString("HDR");
			graphData5.put(jsonData5.getString("LINEX"), Double.valueOf(jsonData5.getString("CB_RATIO")));
		}

//	    System.out.println(hdr6);
//	    System.out.println(graphData5);
		model.addAttribute("hdr6_graph", hdr6);
		model.addAttribute("chartData5", graphData5);

		Map<String, Object> result6 = getAllStatesJdbcCall107.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json6 = new JSONObject(result6);
		String fjfhdj6 = json6.get("CUR_DATA").toString();
		JSONArray jsonArray6 = new JSONArray(fjfhdj6);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData6 = new TreeMap<>();
		for (int i = 0; i < jsonArray6.length(); i++) {
			JSONObject jsonData6 = jsonArray6.getJSONObject(i);

			hdr7 = jsonData6.getString("HDR");
			graphData6.put(jsonData6.getString("LINEX"), Double.valueOf(jsonData6.getString("EQ_MONTH")));
		}

//	    System.out.println(hdr7);
//	    System.out.println(graphData6);
		model.addAttribute("hdr7_graph", hdr7);
		model.addAttribute("chartData6", graphData6);

		Map<String, Object> result7 = getAllStatesJdbcCall108.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_cm")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json7 = new JSONObject(result7);
		String fjfhdj7 = json7.get("CUR_DATA").toString();
		JSONArray jsonArray7 = new JSONArray(fjfhdj7);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData7 = new TreeMap<>();
		for (int i = 0; i < jsonArray7.length(); i++) {
			JSONObject jsonData7 = jsonArray7.getJSONObject(i);

			hdr8 = jsonData7.getString("HDR");
			graphData7.put(jsonData7.getString("LINEX"), Double.valueOf(jsonData7.getString("BILLED_UNIT")));
		}

//	    System.out.println(hdr8);
//	    System.out.println(graphData7);
		model.addAttribute("hdr8_graph", hdr8);
		model.addAttribute("chartData7", graphData7);

		Map<String, Object> result8 = getAllStatesJdbcCall109.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json8 = new JSONObject(result8);
		String fjfhdj8 = json8.get("CUR_DATA").toString();
		JSONArray jsonArray8 = new JSONArray(fjfhdj8);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData8 = new TreeMap<>();
		for (int i = 0; i < jsonArray8.length(); i++) {
			JSONObject jsonData8 = jsonArray8.getJSONObject(i);

			hdr8 = jsonData8.getString("HDR");
			graphData8.put(jsonData8.getString("LINEX"), Double.valueOf(jsonData8.getString("BILLED_UNIT")));
		}

//	    System.out.println(hdr8);
//	    System.out.println(graphData8);
		model.addAttribute("hdr9_graph", hdr8);
		model.addAttribute("chartData8", graphData8);

		Map<String, Object> result10 = getAllStatesJdbcCall217.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json10 = new JSONObject(result10);
		String fjfhdj10 = json10.get("CUR_DATA").toString();
		JSONArray jsonArray10 = new JSONArray(fjfhdj10);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData10 = new TreeMap<>();
		for (int i = 0; i < jsonArray10.length(); i++) {
			JSONObject jsonData10 = jsonArray10.getJSONObject(i);

			hdr10 = jsonData10.getString("HDR");
			graphData10.put(jsonData10.getString("LINEX"), Double.valueOf(jsonData10.getString("COLL_AMT")));
		}

//	    System.out.println(hdr10);
//	    System.out.println(graphData10);
		model.addAttribute("hdr10_graph", hdr10);
		model.addAttribute("chartData10", graphData10);

		Map<String, Object> result11 = getAllStatesJdbcCall219.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json11 = new JSONObject(result11);
		String fjfhdj11 = json11.get("CUR_DATA").toString();
		JSONArray jsonArray11 = new JSONArray(fjfhdj11);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData11 = new TreeMap<>();
		for (int i = 0; i < jsonArray11.length(); i++) {
			JSONObject jsonData11 = jsonArray11.getJSONObject(i);

			hdr11 = jsonData11.getString("HDR");
			graphData11.put(jsonData11.getString("LINEX"), Double.valueOf(jsonData11.getString("COLL_AMT")));
		}

//	    System.out.println(hdr10);
//	    System.out.println(graphData10);
		model.addAttribute("hdr11_graph", hdr11);
		model.addAttribute("chartData11", graphData11);

		Map<String, Object> result12 = getAllStatesJdbcCall220.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json12 = new JSONObject(result12);
		String fjfhdj12 = json12.get("CUR_DATA").toString();
		JSONArray jsonArray12 = new JSONArray(fjfhdj12);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData12 = new TreeMap<>();
		for (int i = 0; i < jsonArray12.length(); i++) {
			JSONObject jsonData12 = jsonArray12.getJSONObject(i);

			hdr12 = jsonData12.getString("HDR");
			graphData12.put(jsonData12.getString("LINEX"), Double.valueOf(jsonData12.getString("EQ_MONTH")));
		}

//	    System.out.println(hdr8);
//	    System.out.println(graphData8);
		model.addAttribute("hdr12_graph", hdr12);
		model.addAttribute("chartData12", graphData12);

//		dpd_BILLED_amt_CM start

		Map<String, Object> result13 = getAllStatesJdbcCall517.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json13 = new JSONObject(result13);
		String fjfhdj13 = json13.get("CUR_DATA").toString();
		JSONArray jsonArray13 = new JSONArray(fjfhdj13);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData13 = new TreeMap<>();
		for (int i = 0; i < jsonArray13.length(); i++) {
			JSONObject jsonData13 = jsonArray13.getJSONObject(i);

			hdr13 = jsonData13.getString("HDR");
			graphData13.put(jsonData13.getString("LINEX"), Double.valueOf(jsonData13.getString("BILLED_AMT")));
		}

//	    System.out.println(hdr13);
//	    System.out.println(graphData13);
		model.addAttribute("hdr13_graph", hdr13);
		model.addAttribute("chartData13", graphData13);

//		dpd_BILLED_amt_CM end

//		dpd_BILLED_amt_UP start

		Map<String, Object> result14 = getAllStatesJdbcCall518.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json14 = new JSONObject(result14);
		String fjfhdj14 = json14.get("CUR_DATA").toString();
		JSONArray jsonArray14 = new JSONArray(fjfhdj14);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData14 = new TreeMap<>();
		for (int i = 0; i < jsonArray14.length(); i++) {
			JSONObject jsonData14 = jsonArray14.getJSONObject(i);

			hdr14 = jsonData14.getString("HDR");
			graphData14.put(jsonData14.getString("LINEX"), Double.valueOf(jsonData14.getString("BILLED_AMT")));
		}

//	    System.out.println(hdr14);
//	    System.out.println(graphData14);
		model.addAttribute("hdr14_graph", hdr14);
		model.addAttribute("chartData14", graphData14);

//		dpd_BILLED_amt_UP end

		// table show sys_loss current month starts

		Map<String, Object> result40 = getAllStatesJdbcCall400.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json40 = new JSONObject(result40);
		String fjfhdj40 = json40.get("CUR_DATA").toString();
		JSONArray jsonArray40 = new JSONArray(fjfhdj40);
		ArrayList<DASHBOARD_DIST> tableList = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray40.length(); i++) {
			JSONObject jsonData40 = jsonArray40.getJSONObject(i);

			hdr40 = jsonData40.getString("HDR");

			tableList.add(new DASHBOARD_DIST(jsonData40.getString("HDR"), jsonData40.getString("LINEX"),
					jsonData40.getString("SYS_LOSS"), null, null, jsonData40.getString("NET_IMPORT_KWH"), null, null,
					jsonData40.getString("BILLED_UNIT"), null, null));
		}

//				System.out.println("hdr25");
//				System.out.println(hdr25);
		model.addAttribute("hdr2_table", hdr40);
		model.addAttribute("tableList", tableList);

		// table show sys_loss current month ends

		// table show sys_loss upto month starts

		Map<String, Object> result41 = getAllStatesJdbcCall401.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json41 = new JSONObject(result41);
		String fjfhdj41 = json41.get("CUR_DATA").toString();
		JSONArray jsonArray41 = new JSONArray(fjfhdj41);
		ArrayList<DASHBOARD_DIST> tableList1 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray41.length(); i++) {
			JSONObject jsonData41 = jsonArray41.getJSONObject(i);

			hdr41 = jsonData41.getString("HDR");

			tableList1.add(new DASHBOARD_DIST(jsonData41.getString("HDR"), jsonData41.getString("LINEX"),
					jsonData41.getString("SYS_LOSS"), null, null, jsonData41.getString("NET_IMPORT_KWH"), null, null,
					jsonData41.getString("BILLED_UNIT"), null, null));
		}

//				System.out.println("hdr25");
//				System.out.println(hdr25);
		model.addAttribute("hdr41_table", hdr41);
		model.addAttribute("tableList1", tableList1);

		// table show sys_loss upto month ends

		// table show dpd_CI_Ratio_CM current month starts

		Map<String, Object> result42 = getAllStatesJdbcCall402.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json42 = new JSONObject(result42);
		String fjfhdj42 = json42.get("CUR_DATA").toString();
		JSONArray jsonArray42 = new JSONArray(fjfhdj42);
		ArrayList<DASHBOARD_DIST> tableList2 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray42.length(); i++) {
			JSONObject jsonData42 = jsonArray42.getJSONObject(i);

			hdr42 = jsonData42.getString("HDR");

			tableList2.add(new DASHBOARD_DIST(jsonData42.getString("HDR"), jsonData42.getString("LINEX"), null,
					jsonData42.getString("CI_RATIO"), null, jsonData42.getString("NET_IMPORT_KWH"),
					jsonData42.getString("COLL_AMT"), jsonData42.getString("BILLED_AMT"),
					jsonData42.getString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table");
//				System.out.println(hdr42);
//				System.out.println(tableList2);
		model.addAttribute("hdr42_table", hdr42);
		model.addAttribute("tableList42", tableList2);

		// table show dpd_CI_Ratio_CM current month ends

		// table show dpd_CI_Ratio_CM upto month starts

		Map<String, Object> result43 = getAllStatesJdbcCall403.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json43 = new JSONObject(result43);
		String fjfhdj43 = json43.get("CUR_DATA").toString();
		JSONArray jsonArray43 = new JSONArray(fjfhdj43);
		ArrayList<DASHBOARD_DIST> tableList3 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray43.length(); i++) {
			JSONObject jsonData43 = jsonArray43.getJSONObject(i);

			hdr43 = jsonData43.getString("HDR");

			tableList3.add(new DASHBOARD_DIST(jsonData43.getString("HDR"), jsonData43.getString("LINEX"), null,
					jsonData43.getString("CI_RATIO"), null, jsonData43.getString("NET_IMPORT_KWH"),
					jsonData43.getString("COLL_AMT"), jsonData43.getString("BILLED_AMT"),
					jsonData43.getString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table");
//				System.out.println(hdr43);
//				System.out.println(tableList3);
		model.addAttribute("hdr43_table", hdr43);
		model.addAttribute("tableList43", tableList3);

		// table show dpd_CI_Ratio_CM upto month ends

		// table show dpd_CB_Ratio_CM current month starts

		Map<String, Object> result44 = getAllStatesJdbcCall404.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json44 = new JSONObject(result44);
		String fjfhdj44 = json44.get("CUR_DATA").toString();
		JSONArray jsonArray44 = new JSONArray(fjfhdj44);
		ArrayList<DASHBOARD_DIST> tableList4 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray44.length(); i++) {
			JSONObject jsonData44 = jsonArray44.getJSONObject(i);

			hdr44 = jsonData44.getString("HDR");

			tableList4.add(new DASHBOARD_DIST(jsonData44.getString("HDR"), jsonData44.getString("LINEX"), null, null,
					jsonData44.getString("CB_RATIO"), null, jsonData44.getString("COLL_AMT"),
					jsonData44.getString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr44_table", hdr44);
		model.addAttribute("tableList44", tableList4);

		// table show dpd_CB_Ratio_CM current month ends

		// table show dpd_CB_Ratio_CM upto month starts

		Map<String, Object> result45 = getAllStatesJdbcCall405.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json45 = new JSONObject(result45);
		String fjfhdj45 = json45.get("CUR_DATA").toString();
		JSONArray jsonArray45 = new JSONArray(fjfhdj45);
		ArrayList<DASHBOARD_DIST> tableList5 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray45.length(); i++) {
			JSONObject jsonData45 = jsonArray45.getJSONObject(i);

			hdr45 = jsonData45.getString("HDR");

			tableList5.add(new DASHBOARD_DIST(jsonData45.getString("HDR"), jsonData45.getString("LINEX"), null, null,
					jsonData45.getString("CB_RATIO"), null, jsonData45.getString("COLL_AMT"),
					jsonData45.getString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr45_table", hdr45);
		model.addAttribute("tableList45", tableList5);

		// table show dpd_CB_Ratio_CM upto month ends

		// table show dpd_BILLED_UNIT_cm current month starts

		Map<String, Object> result46 = getAllStatesJdbcCall406.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_cm")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json46 = new JSONObject(result46);
		String fjfhdj46 = json46.get("CUR_DATA").toString();
		JSONArray jsonArray46 = new JSONArray(fjfhdj46);
		ArrayList<DASHBOARD_DIST> tableList6 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray46.length(); i++) {
			JSONObject jsonData46 = jsonArray46.getJSONObject(i);

			hdr46 = jsonData46.getString("HDR");

			tableList6.add(new DASHBOARD_DIST(jsonData46.getString("HDR"), jsonData46.getString("LINEX"),
					jsonData46.getString("SYS_LOSS"), null, null, jsonData46.getString("NET_IMPORT_KWH"), null, null,
					jsonData46.getString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr46_table", hdr46);
		model.addAttribute("tableList46", tableList6);

		// table show dpd_BILLED_UNIT_cm current month ends

		// table show dpd_BILLED_UNIT_UP upto month starts

		Map<String, Object> result47 = getAllStatesJdbcCall407.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json47 = new JSONObject(result47);
		String fjfhdj47 = json47.get("CUR_DATA").toString();
		JSONArray jsonArray47 = new JSONArray(fjfhdj47);
		ArrayList<DASHBOARD_DIST> tableList7 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray47.length(); i++) {
			JSONObject jsonData47 = jsonArray47.getJSONObject(i);

			hdr47 = jsonData47.getString("HDR");

			tableList7.add(new DASHBOARD_DIST(jsonData47.getString("HDR"), jsonData47.getString("LINEX"),
					jsonData47.getString("SYS_LOSS"), null, null, jsonData47.getString("NET_IMPORT_KWH"), null, null,
					jsonData47.getString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr47_table", hdr47);
		model.addAttribute("tableList47", tableList7);

		// table show dpd_BILLED_UNIT_UP upto month ends

		// table show dpd_BILLED_amt_CM current month starts

		Map<String, Object> result48 = getAllStatesJdbcCall408.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json48 = new JSONObject(result48);
		String fjfhdj48 = json48.get("CUR_DATA").toString();
		JSONArray jsonArray48 = new JSONArray(fjfhdj48);
		ArrayList<DASHBOARD_DIST> tableList8 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray48.length(); i++) {
			JSONObject jsonData48 = jsonArray48.getJSONObject(i);

			hdr48 = jsonData48.getString("HDR");

			tableList8.add(new DASHBOARD_DIST(jsonData48.getString("HDR"), jsonData48.getString("LINEX"), null, null,
					null, null, null, jsonData48.getString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr48_table", hdr48);
		model.addAttribute("tableList48", tableList8);

		// table show dpd_BILLED_amt_CM current month ends

		// table show dpd_BILLED_amt_UP upto month starts

		Map<String, Object> result49 = getAllStatesJdbcCall409.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json49 = new JSONObject(result49);
		String fjfhdj49 = json49.get("CUR_DATA").toString();
		JSONArray jsonArray49 = new JSONArray(fjfhdj49);
		ArrayList<DASHBOARD_DIST> tableList9 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray49.length(); i++) {
			JSONObject jsonData49 = jsonArray49.getJSONObject(i);

			hdr49 = jsonData49.getString("HDR");

			tableList9.add(new DASHBOARD_DIST(jsonData49.getString("HDR"), jsonData49.getString("LINEX"), null, null,
					null, null, null, jsonData49.getString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr49_table", hdr49);
		model.addAttribute("tableList49", tableList9);

		// table show dpd_BILLED_amt_UP upto month ends

		// table show dpd_COLL_amt_CM current month starts

		Map<String, Object> result50 = getAllStatesJdbcCall410.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json50 = new JSONObject(result50);
		String fjfhdj50 = json50.get("CUR_DATA").toString();
		JSONArray jsonArray50 = new JSONArray(fjfhdj50);
		ArrayList<DASHBOARD_DIST> tableList10 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray50.length(); i++) {
			JSONObject jsonData50 = jsonArray50.getJSONObject(i);

			hdr50 = jsonData50.getString("HDR");

			tableList10.add(new DASHBOARD_DIST(jsonData50.getString("HDR"), jsonData50.getString("LINEX"), null, null,
					null, null, jsonData50.getString("COLL_AMT"), null, null, null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr50_table", hdr50);
		model.addAttribute("tableList50", tableList10);

		// table show dpd_COLL_amt_CM current month ends

		// table show dpd_COLL_amt_up upto month starts

		Map<String, Object> result51 = getAllStatesJdbcCall411.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json51 = new JSONObject(result51);
		String fjfhdj51 = json51.get("CUR_DATA").toString();
		JSONArray jsonArray51 = new JSONArray(fjfhdj51);
		ArrayList<DASHBOARD_DIST> tableList11 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray51.length(); i++) {
			JSONObject jsonData51 = jsonArray51.getJSONObject(i);

			hdr51 = jsonData51.getString("HDR");

			tableList11.add(new DASHBOARD_DIST(jsonData51.getString("HDR"), jsonData51.getString("LINEX"), null, null,
					null, null, jsonData51.getString("COLL_AMT"), null, null, null, null));
		}
		System.out.println("table51");
		System.out.println(hdr51);
		System.out.println(tableList11);
		model.addAttribute("hdr51_table", hdr51);
		model.addAttribute("tableList51", tableList11);

		// table show dpd_COLL_amt_up upto month ends

		// table show dpd_EQ_MONTH_CM current month starts

		Map<String, Object> result52 = getAllStatesJdbcCall412.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json52 = new JSONObject(result52);
		String fjfhdj52 = json52.get("CUR_DATA").toString();
		JSONArray jsonArray52 = new JSONArray(fjfhdj52);
		ArrayList<DASHBOARD_DIST> tableList12 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray52.length(); i++) {
			JSONObject jsonData52 = jsonArray52.getJSONObject(i);

			hdr52 = jsonData52.getString("HDR");

			tableList12.add(new DASHBOARD_DIST(jsonData52.getString("HDR"), jsonData52.getString("LINEX"), null, null,
					null, jsonData52.getString("NET_IMPORT_KWH"), null, jsonData52.getString("BILLED_AMT"), null,
					jsonData52.getString("EQ_MONTH"), jsonData52.getString("REC_AMT")));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr52_table", hdr52);
		model.addAttribute("tableList52", tableList12);

		// table show dpd_EQ_MONTH_CM current month ends

		// table show dpd_EQ_MONTH_up upto month starts

		Map<String, Object> result53 = getAllStatesJdbcCall413.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json53 = new JSONObject(result53);
		String fjfhdj53 = json53.get("CUR_DATA").toString();
		JSONArray jsonArray53 = new JSONArray(fjfhdj53);
		ArrayList<DASHBOARD_DIST> tableList13 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray53.length(); i++) {
			JSONObject jsonData53 = jsonArray53.getJSONObject(i);

			hdr53 = jsonData53.getString("HDR");

			tableList13.add(new DASHBOARD_DIST(jsonData53.getString("HDR"), jsonData53.getString("LINEX"), null, null,
					null, jsonData53.getString("NET_IMPORT_KWH"), null, jsonData53.getString("BILLED_AMT"), null,
					jsonData53.getString("EQ_MONTH"), jsonData53.getString("REC_AMT")));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr53_table", hdr53);
		model.addAttribute("tableList53", tableList13);

		// table show dpd_EQ_MONTH_up upto month ends

//		IC_REPORT_LEVEL_MST drop-down start 
		ArrayList<IC_REPORT_LEVEL_MST> listIC_REPORT_LEVEL_MST = iconvDaoRafi.a(officeCode);
		model.addAttribute("listIC_REPORT_LEVEL_MST", listIC_REPORT_LEVEL_MST);
//		IC_REPORT_LEVEL_MST drop-down start 		

//		IC_ZONE_MST drop-down start 
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
//		IC_ZONE_MST drop-down end 

//		IC_ZONE_MST drop-down start 
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

//		IC_ZONE_MST drop-down end 	

		IC_DASHBOARD_DIST abc = new IC_DASHBOARD_DIST();
		abc.setBill(a);
		abc.setReport("1");

		model.addAttribute("xyz", abc);

		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_DASHBOARD_DIST";
	}

//	graph end 

	@PostMapping("/IC_DASHBOARD_DIST")
	public String ic_modules_list_save(IC_DASHBOARD_DIST module_list, Model model) {

		String hdr1 = "";
		String hdr2 = "";
		String hdr3 = "";
		String hdr4 = "";
		String hdr5 = "";
		String hdr6 = "";
		String hdr7 = "";
		String hdr8 = "";
		String hdr9 = "";
		String hdr10 = "";
		String hdr11 = "";
		String hdr12 = "";
		String hdr13 = "";
		String hdr14 = "";

		String hdr40 = "";
		String hdr41 = "";
		String hdr42 = "";
		String hdr43 = "";
		String hdr44 = "";
		String hdr45 = "";
		String hdr46 = "";
		String hdr47 = "";
		String hdr48 = "";
		String hdr49 = "";
		String hdr50 = "";
		String hdr51 = "";
		String hdr52 = "";
		String hdr53 = "";
		String hdr54 = "";

		String a = module_list.getBill();
		String b = module_list.getZone();
		String c = module_list.getCircle();
		String g = module_list.getDiv();

		String d = module_list.getLoc();
		String f = module_list.getReport();

//	
//		System.out.println("pera");
//		System.out.println(module_list);

		Map<String, Object> result = getAllStatesJdbcCall110.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);

//	    System.out.println("gfdg");
//		System.out.println("graph");	
//		System.out.println(result);		
		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);
//	    System.out.println(jsonArray);	

		Map<String, Double> graphData = new TreeMap<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);

			hdr1 = jsonData.getString("HDR");
			graphData.put(jsonData.getString("LINEX"), Double.valueOf(jsonData.getString("SYS_LOSS")));
		}

//	   
//	    System.out.println(hdr1);
//	    System.out.println(graphData);
		model.addAttribute("hdr1_graph", hdr1);
		model.addAttribute("chartData", graphData);

		Map<String, Object> result1 = getAllStatesJdbcCall120.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph1");	
//		System.out.println(result1);		
		JSONObject json1 = new JSONObject(result1);
		String fjfhdj1 = json1.get("CUR_DATA").toString();
		JSONArray jsonArray1 = new JSONArray(fjfhdj1);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData1 = new TreeMap<>();
		for (int i = 0; i < jsonArray1.length(); i++) {
			JSONObject jsonData1 = jsonArray1.getJSONObject(i);

			hdr2 = jsonData1.getString("HDR");
			graphData1.put(jsonData1.getString("LINEX"), Double.valueOf(jsonData1.getString("SYS_LOSS")));
		}

//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
		model.addAttribute("hdr2_graph", hdr2);
		model.addAttribute("chartData1", graphData1);

		Map<String, Object> result2 = getAllStatesJdbcCall111.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph2");	
//		System.out.println(result2);	    	
		JSONObject json2 = new JSONObject(result2);
		String fjfhdj2 = json2.get("CUR_DATA").toString();
		JSONArray jsonArray2 = new JSONArray(fjfhdj2);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData2 = new TreeMap<>();
		for (int i = 0; i < jsonArray2.length(); i++) {
			JSONObject jsonData2 = jsonArray2.getJSONObject(i);

			hdr3 = jsonData2.getString("HDR");
			graphData2.put(jsonData2.getString("LINEX"), Double.valueOf(jsonData2.getString("CI_RATIO")));
		}

//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
		model.addAttribute("hdr3_graph", hdr3);
		model.addAttribute("chartData2", graphData2);

		Map<String, Object> result3 = getAllStatesJdbcCall112.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json3 = new JSONObject(result3);
		String fjfhdj3 = json3.get("CUR_DATA").toString();
		JSONArray jsonArray3 = new JSONArray(fjfhdj3);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData3 = new TreeMap<>();
		for (int i = 0; i < jsonArray3.length(); i++) {
			JSONObject jsonData3 = jsonArray3.getJSONObject(i);

			hdr4 = jsonData3.getString("HDR");
			graphData3.put(jsonData3.getString("LINEX"), Double.valueOf(jsonData3.getString("CI_RATIO")));
		}

//	    System.out.println(hdr4);
//	    System.out.println(graphData3);
		model.addAttribute("hdr4_graph", hdr4);
		model.addAttribute("chartData3", graphData3);

		Map<String, Object> result4 = getAllStatesJdbcCall113.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json4 = new JSONObject(result4);
		String fjfhdj4 = json4.get("CUR_DATA").toString();
		JSONArray jsonArray4 = new JSONArray(fjfhdj4);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData4 = new TreeMap<>();
		for (int i = 0; i < jsonArray4.length(); i++) {
			JSONObject jsonData4 = jsonArray4.getJSONObject(i);

			hdr5 = jsonData4.getString("HDR");
			graphData4.put(jsonData4.getString("LINEX"), Double.valueOf(jsonData4.getString("CB_RATIO")));
		}

//	    System.out.println(hdr5);
//	    System.out.println(graphData4);
		model.addAttribute("hdr5_graph", hdr5);
		model.addAttribute("chartData4", graphData4);

		Map<String, Object> result5 = getAllStatesJdbcCall114.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json5 = new JSONObject(result5);
		String fjfhdj5 = json5.get("CUR_DATA").toString();
		JSONArray jsonArray5 = new JSONArray(fjfhdj5);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData5 = new TreeMap<>();
		for (int i = 0; i < jsonArray5.length(); i++) {
			JSONObject jsonData5 = jsonArray5.getJSONObject(i);

			hdr6 = jsonData5.getString("HDR");
			graphData5.put(jsonData5.getString("LINEX"), Double.valueOf(jsonData5.getString("CB_RATIO")));
		}

//	    System.out.println(hdr6);
//	    System.out.println(graphData5);
		model.addAttribute("hdr6_graph", hdr6);
		model.addAttribute("chartData5", graphData5);

		Map<String, Object> result6 = getAllStatesJdbcCall115.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json6 = new JSONObject(result6);
		String fjfhdj6 = json6.get("CUR_DATA").toString();
		JSONArray jsonArray6 = new JSONArray(fjfhdj6);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData6 = new TreeMap<>();
		for (int i = 0; i < jsonArray6.length(); i++) {
			JSONObject jsonData6 = jsonArray6.getJSONObject(i);

			hdr7 = jsonData6.getString("HDR");
			graphData6.put(jsonData6.getString("LINEX"), Double.valueOf(jsonData6.getString("EQ_MONTH")));
		}

//	    System.out.println(hdr7);
//	    System.out.println(graphData6);
		model.addAttribute("hdr7_graph", hdr7);
		model.addAttribute("chartData6", graphData6);

		Map<String, Object> result7 = getAllStatesJdbcCall116.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_cm")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json7 = new JSONObject(result7);
		String fjfhdj7 = json7.get("CUR_DATA").toString();
		JSONArray jsonArray7 = new JSONArray(fjfhdj7);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData7 = new TreeMap<>();
		for (int i = 0; i < jsonArray7.length(); i++) {
			JSONObject jsonData7 = jsonArray7.getJSONObject(i);

			hdr8 = jsonData7.getString("HDR");
			graphData7.put(jsonData7.getString("LINEX"), Double.valueOf(jsonData7.getString("BILLED_UNIT")));
		}

//	    System.out.println(hdr8);
//	    System.out.println(graphData7);
		model.addAttribute("hdr8_graph", hdr8);
		model.addAttribute("chartData7", graphData7);

		Map<String, Object> result8 = getAllStatesJdbcCall117.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json8 = new JSONObject(result8);
		String fjfhdj8 = json8.get("CUR_DATA").toString();
		JSONArray jsonArray8 = new JSONArray(fjfhdj8);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData8 = new TreeMap<>();
		for (int i = 0; i < jsonArray8.length(); i++) {
			JSONObject jsonData8 = jsonArray8.getJSONObject(i);

			hdr8 = jsonData8.getString("HDR");
			graphData8.put(jsonData8.getString("LINEX"), Double.valueOf(jsonData8.getString("BILLED_UNIT")));
		}

//	    System.out.println(hdr8);
//	    System.out.println(graphData8);
		model.addAttribute("hdr9_graph", hdr8);
		model.addAttribute("chartData8", graphData8);

		Map<String, Object> result10 = getAllStatesJdbcCall217.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json10 = new JSONObject(result10);
		String fjfhdj10 = json10.get("CUR_DATA").toString();
		JSONArray jsonArray10 = new JSONArray(fjfhdj10);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData10 = new TreeMap<>();
		for (int i = 0; i < jsonArray10.length(); i++) {
			JSONObject jsonData10 = jsonArray10.getJSONObject(i);

			hdr10 = jsonData10.getString("HDR");
			graphData10.put(jsonData10.getString("LINEX"), Double.valueOf(jsonData10.getString("COLL_AMT")));
		}

//	    System.out.println("jaan");
//	    System.out.println(hdr10);
//	    System.out.println(graphData10);
		model.addAttribute("hdr10_graph", hdr10);
		model.addAttribute("chartData10", graphData10);

		Map<String, Object> result11 = getAllStatesJdbcCall219.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json11 = new JSONObject(result11);
		String fjfhdj11 = json11.get("CUR_DATA").toString();
		JSONArray jsonArray11 = new JSONArray(fjfhdj11);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData11 = new TreeMap<>();
		for (int i = 0; i < jsonArray11.length(); i++) {
			JSONObject jsonData11 = jsonArray11.getJSONObject(i);

			hdr11 = jsonData11.getString("HDR");
			graphData11.put(jsonData11.getString("LINEX"), Double.valueOf(jsonData11.getString("COLL_AMT")));
		}

//	    System.out.println(hdr10);
//	    System.out.println(graphData10);
		model.addAttribute("hdr11_graph", hdr11);
		model.addAttribute("chartData11", graphData11);

		Map<String, Object> result12 = getAllStatesJdbcCall220.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json12 = new JSONObject(result12);
		String fjfhdj12 = json12.get("CUR_DATA").toString();
		JSONArray jsonArray12 = new JSONArray(fjfhdj12);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData12 = new TreeMap<>();
		for (int i = 0; i < jsonArray12.length(); i++) {
			JSONObject jsonData12 = jsonArray12.getJSONObject(i);

			hdr12 = jsonData12.getString("HDR");
			graphData12.put(jsonData12.getString("LINEX"), Double.valueOf(jsonData12.getString("EQ_MONTH")));
		}

//	    System.out.println(hdr8);
//	    System.out.println(graphData8);
		model.addAttribute("hdr12_graph", hdr12);
		model.addAttribute("chartData12", graphData12);

//		dpd_BILLED_amt_CM start

		Map<String, Object> result13 = getAllStatesJdbcCall517.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json13 = new JSONObject(result13);
		String fjfhdj13 = json13.get("CUR_DATA").toString();
		JSONArray jsonArray13 = new JSONArray(fjfhdj13);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData13 = new TreeMap<>();
		for (int i = 0; i < jsonArray13.length(); i++) {
			JSONObject jsonData13 = jsonArray13.getJSONObject(i);

			hdr13 = jsonData13.getString("HDR");
			graphData13.put(jsonData13.getString("LINEX"), Double.valueOf(jsonData13.getString("BILLED_AMT")));
		}

//	    System.out.println(hdr13);
//	    System.out.println(graphData13);
		model.addAttribute("hdr13_graph", hdr13);
		model.addAttribute("chartData13", graphData13);

//		dpd_BILLED_amt_CM end

//		dpd_BILLED_amt_UP start

		Map<String, Object> result14 = getAllStatesJdbcCall518.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json14 = new JSONObject(result14);
		String fjfhdj14 = json14.get("CUR_DATA").toString();
		JSONArray jsonArray14 = new JSONArray(fjfhdj14);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData14 = new TreeMap<>();
		for (int i = 0; i < jsonArray14.length(); i++) {
			JSONObject jsonData14 = jsonArray14.getJSONObject(i);

			hdr14 = jsonData14.getString("HDR");
			graphData14.put(jsonData14.getString("LINEX"), Double.valueOf(jsonData14.getString("BILLED_AMT")));
		}

//	    System.out.println(hdr14);
//	    System.out.println(graphData14);
		model.addAttribute("hdr14_graph", hdr14);
		model.addAttribute("chartData14", graphData14);

//		dpd_BILLED_amt_UP end

		// table show sys_loss current month starts

		Map<String, Object> result40 = getAllStatesJdbcCall400.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json40 = new JSONObject(result40);
		String fjfhdj40 = json40.get("CUR_DATA").toString();
		JSONArray jsonArray40 = new JSONArray(fjfhdj40);
		ArrayList<DASHBOARD_DIST> tableList = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray40.length(); i++) {
			JSONObject jsonData40 = jsonArray40.getJSONObject(i);

			hdr40 = jsonData40.getString("HDR");

			tableList.add(new DASHBOARD_DIST(jsonData40.getString("HDR"), jsonData40.getString("LINEX"),
					jsonData40.getString("SYS_LOSS"), null, null, jsonData40.getString("NET_IMPORT_KWH"), null, null,
					jsonData40.getString("BILLED_UNIT"), null, null));
		}

//				System.out.println("hdr25");
//				System.out.println(hdr25);
		model.addAttribute("hdr2_table", hdr40);
		model.addAttribute("tableList", tableList);

		// table show sys_loss current month ends

		// table show sys_loss upto month starts

		Map<String, Object> result41 = getAllStatesJdbcCall401.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json41 = new JSONObject(result40);
		String fjfhdj41 = json41.get("CUR_DATA").toString();
		JSONArray jsonArray41 = new JSONArray(fjfhdj41);
		ArrayList<DASHBOARD_DIST> tableList1 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray41.length(); i++) {
			JSONObject jsonData41 = jsonArray41.getJSONObject(i);

			hdr41 = jsonData41.getString("HDR");

			tableList1.add(new DASHBOARD_DIST(jsonData41.getString("HDR"), jsonData41.getString("LINEX"),
					jsonData41.getString("SYS_LOSS"), null, null, jsonData41.getString("NET_IMPORT_KWH"), null, null,
					jsonData41.getString("BILLED_UNIT"), null, null));
		}

//				System.out.println("hdr25");
//				System.out.println(hdr25);
		model.addAttribute("hdr41_table", hdr41);
		model.addAttribute("tableList1", tableList1);

		// table show sys_loss upto month ends

		// table show dpd_CI_Ratio_CM current month starts

		Map<String, Object> result42 = getAllStatesJdbcCall402.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json42 = new JSONObject(result42);
		String fjfhdj42 = json42.get("CUR_DATA").toString();
		JSONArray jsonArray42 = new JSONArray(fjfhdj42);
		ArrayList<DASHBOARD_DIST> tableList2 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray42.length(); i++) {
			JSONObject jsonData42 = jsonArray42.getJSONObject(i);

			hdr42 = jsonData42.getString("HDR");

			tableList2.add(new DASHBOARD_DIST(jsonData42.getString("HDR"), jsonData42.getString("LINEX"), null,
					jsonData42.getString("CI_RATIO"), null, jsonData42.getString("NET_IMPORT_KWH"),
					jsonData42.getString("COLL_AMT"), jsonData42.getString("BILLED_AMT"),
					jsonData42.getString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table");
//				System.out.println(hdr42);
//				System.out.println(tableList2);
		model.addAttribute("hdr42_table", hdr42);
		model.addAttribute("tableList42", tableList2);

		// table show dpd_CI_Ratio_CM current month ends

		// table show dpd_CI_Ratio_CM upto month starts

		Map<String, Object> result43 = getAllStatesJdbcCall403.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json43 = new JSONObject(result43);
		String fjfhdj43 = json43.get("CUR_DATA").toString();
		JSONArray jsonArray43 = new JSONArray(fjfhdj43);
		ArrayList<DASHBOARD_DIST> tableList3 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray43.length(); i++) {
			JSONObject jsonData43 = jsonArray43.getJSONObject(i);

			hdr43 = jsonData43.getString("HDR");

			tableList3.add(new DASHBOARD_DIST(jsonData43.getString("HDR"), jsonData43.getString("LINEX"), null,
					jsonData43.getString("CI_RATIO"), null, jsonData43.getString("NET_IMPORT_KWH"),
					jsonData43.getString("COLL_AMT"), jsonData43.getString("BILLED_AMT"),
					jsonData43.getString("BILLED_UNIT"), null, null));
		}
		System.out.println("table");
		System.out.println(hdr43);
		System.out.println(tableList3);
		model.addAttribute("hdr43_table", hdr43);
		model.addAttribute("tableList43", tableList3);

		// table show dpd_CI_Ratio_CM upto month ends

		// table show dpd_CB_Ratio_CM current month starts

		Map<String, Object> result44 = getAllStatesJdbcCall404.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json44 = new JSONObject(result44);
		String fjfhdj44 = json44.get("CUR_DATA").toString();
		JSONArray jsonArray44 = new JSONArray(fjfhdj44);
		ArrayList<DASHBOARD_DIST> tableList4 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray44.length(); i++) {
			JSONObject jsonData44 = jsonArray44.getJSONObject(i);

			hdr44 = jsonData44.getString("HDR");

			tableList4.add(new DASHBOARD_DIST(jsonData44.getString("HDR"), jsonData44.getString("LINEX"), null, null,
					jsonData44.getString("CB_RATIO"), null, jsonData44.getString("COLL_AMT"),
					jsonData44.getString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr44_table", hdr44);
		model.addAttribute("tableList44", tableList4);

		// table show dpd_CB_Ratio_CM current month ends

		// table show dpd_CB_Ratio_CM upto month starts

		Map<String, Object> result45 = getAllStatesJdbcCall405.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json45 = new JSONObject(result45);
		String fjfhdj45 = json45.get("CUR_DATA").toString();
		JSONArray jsonArray45 = new JSONArray(fjfhdj45);
		ArrayList<DASHBOARD_DIST> tableList5 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray45.length(); i++) {
			JSONObject jsonData45 = jsonArray45.getJSONObject(i);

			hdr45 = jsonData45.getString("HDR");

			tableList5.add(new DASHBOARD_DIST(jsonData45.getString("HDR"), jsonData45.getString("LINEX"), null, null,
					jsonData45.getString("CB_RATIO"), null, jsonData45.getString("COLL_AMT"),
					jsonData45.getString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr45_table", hdr45);
		model.addAttribute("tableList45", tableList5);

		// table show dpd_CB_Ratio_CM upto month ends

		// table show dpd_BILLED_UNIT_cm current month starts

		Map<String, Object> result46 = getAllStatesJdbcCall406.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_cm")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json46 = new JSONObject(result46);
		String fjfhdj46 = json46.get("CUR_DATA").toString();
		JSONArray jsonArray46 = new JSONArray(fjfhdj46);
		ArrayList<DASHBOARD_DIST> tableList6 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray46.length(); i++) {
			JSONObject jsonData46 = jsonArray46.getJSONObject(i);

			hdr46 = jsonData46.getString("HDR");

			tableList6.add(new DASHBOARD_DIST(jsonData46.getString("HDR"), jsonData46.getString("LINEX"),
					jsonData46.getString("SYS_LOSS"), null, null, jsonData46.getString("NET_IMPORT_KWH"), null, null,
					jsonData46.getString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr46_table", hdr46);
		model.addAttribute("tableList46", tableList6);

		// table show dpd_BILLED_UNIT_cm current month ends

		// table show dpd_BILLED_UNIT_UP upto month starts

		Map<String, Object> result47 = getAllStatesJdbcCall407.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json47 = new JSONObject(result47);
		String fjfhdj47 = json47.get("CUR_DATA").toString();
		JSONArray jsonArray47 = new JSONArray(fjfhdj47);
		ArrayList<DASHBOARD_DIST> tableList7 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray47.length(); i++) {
			JSONObject jsonData47 = jsonArray47.getJSONObject(i);

			hdr47 = jsonData47.getString("HDR");

			tableList7.add(new DASHBOARD_DIST(jsonData47.getString("HDR"), jsonData47.getString("LINEX"),
					jsonData47.getString("SYS_LOSS"), null, null, jsonData47.getString("NET_IMPORT_KWH"), null, null,
					jsonData47.getString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr47_table", hdr47);
		model.addAttribute("tableList47", tableList7);

		// table show dpd_BILLED_UNIT_UP upto month ends

		// table show dpd_BILLED_amt_CM current month starts

		Map<String, Object> result48 = getAllStatesJdbcCall408.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json48 = new JSONObject(result48);
		String fjfhdj48 = json48.get("CUR_DATA").toString();
		JSONArray jsonArray48 = new JSONArray(fjfhdj48);
		ArrayList<DASHBOARD_DIST> tableList8 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray48.length(); i++) {
			JSONObject jsonData48 = jsonArray48.getJSONObject(i);

			hdr48 = jsonData48.getString("HDR");

			tableList8.add(new DASHBOARD_DIST(jsonData48.getString("HDR"), jsonData48.getString("LINEX"), null, null,
					null, null, null, jsonData48.getString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr48_table", hdr48);
		model.addAttribute("tableList48", tableList8);

		// table show dpd_BILLED_amt_CM current month ends

		// table show dpd_BILLED_amt_UP upto month starts

		Map<String, Object> result49 = getAllStatesJdbcCall409.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json49 = new JSONObject(result49);
		String fjfhdj49 = json49.get("CUR_DATA").toString();
		JSONArray jsonArray49 = new JSONArray(fjfhdj49);
		ArrayList<DASHBOARD_DIST> tableList9 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray49.length(); i++) {
			JSONObject jsonData49 = jsonArray49.getJSONObject(i);

			hdr49 = jsonData49.getString("HDR");

			tableList9.add(new DASHBOARD_DIST(jsonData49.getString("HDR"), jsonData49.getString("LINEX"), null, null,
					null, null, null, jsonData49.getString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr49_table", hdr49);
		model.addAttribute("tableList49", tableList9);

		// table show dpd_BILLED_amt_UP upto month ends

		// table show dpd_COLL_amt_CM current month starts

		Map<String, Object> result50 = getAllStatesJdbcCall410.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json50 = new JSONObject(result50);
		String fjfhdj50 = json50.get("CUR_DATA").toString();
		JSONArray jsonArray50 = new JSONArray(fjfhdj50);
		ArrayList<DASHBOARD_DIST> tableList10 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray50.length(); i++) {
			JSONObject jsonData50 = jsonArray50.getJSONObject(i);

			hdr50 = jsonData50.getString("HDR");

			tableList10.add(new DASHBOARD_DIST(jsonData50.getString("HDR"), jsonData50.getString("LINEX"), null, null,
					null, null, jsonData50.getString("COLL_AMT"), null, null, null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr50_table", hdr50);
		model.addAttribute("tableList50", tableList10);

		// table show dpd_COLL_amt_CM current month ends

		// table show dpd_COLL_amt_up upto month starts

		Map<String, Object> result51 = getAllStatesJdbcCall411.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json51 = new JSONObject(result51);
		String fjfhdj51 = json51.get("CUR_DATA").toString();
		JSONArray jsonArray51 = new JSONArray(fjfhdj51);
		ArrayList<DASHBOARD_DIST> tableList11 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray51.length(); i++) {
			JSONObject jsonData51 = jsonArray51.getJSONObject(i);

			hdr51 = jsonData51.getString("HDR");

			tableList11.add(new DASHBOARD_DIST(jsonData51.getString("HDR"), jsonData51.getString("LINEX"), null, null,
					null, null, jsonData51.getString("COLL_AMT"), null, null, null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr51_table", hdr51);
		model.addAttribute("tableList51", tableList11);

		// table show dpd_COLL_amt_up upto month ends

		// table show dpd_EQ_MONTH_CM current month starts

		Map<String, Object> result52 = getAllStatesJdbcCall412.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json52 = new JSONObject(result52);
		String fjfhdj52 = json52.get("CUR_DATA").toString();
		JSONArray jsonArray52 = new JSONArray(fjfhdj52);
		ArrayList<DASHBOARD_DIST> tableList12 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray52.length(); i++) {
			JSONObject jsonData52 = jsonArray52.getJSONObject(i);

			hdr52 = jsonData52.getString("HDR");

			tableList12.add(new DASHBOARD_DIST(jsonData52.getString("HDR"), jsonData52.getString("LINEX"), null, null,
					null, jsonData52.getString("NET_IMPORT_KWH"), null, jsonData52.getString("BILLED_AMT"), null,
					jsonData52.getString("EQ_MONTH"), jsonData52.getString("REC_AMT")));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr52_table", hdr52);
		model.addAttribute("tableList52", tableList12);

		// table show dpd_EQ_MONTH_CM current month ends

		// table show dpd_EQ_MONTH_up upto month starts

		Map<String, Object> result53 = getAllStatesJdbcCall413.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json53 = new JSONObject(result53);
		String fjfhdj53 = json53.get("CUR_DATA").toString();
		JSONArray jsonArray53 = new JSONArray(fjfhdj53);
		ArrayList<DASHBOARD_DIST> tableList13 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray53.length(); i++) {
			JSONObject jsonData53 = jsonArray53.getJSONObject(i);

			hdr53 = jsonData53.getString("HDR");

			tableList13.add(new DASHBOARD_DIST(jsonData53.getString("HDR"), jsonData53.getString("LINEX"), null, null,
					null, jsonData53.getString("NET_IMPORT_KWH"), null, jsonData53.getString("BILLED_AMT"), null,
					jsonData53.getString("EQ_MONTH"), jsonData53.getString("REC_AMT")));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr53_table", hdr53);
		model.addAttribute("tableList53", tableList13);

		// table show dpd_EQ_MONTH_up upto month ends

//		IC_REPORT_LEVEL_MST drop-down start 
		ArrayList<IC_REPORT_LEVEL_MST> listIC_REPORT_LEVEL_MST = iconvDaoRafi.a(officeCode);
		model.addAttribute("listIC_REPORT_LEVEL_MST", listIC_REPORT_LEVEL_MST);
//		IC_REPORT_LEVEL_MST drop-down start 		

//		IC_ZONE_MST drop-down start 
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
//		IC_ZONE_MST drop-down end 

//		Month_Dropdown drop-down start 
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

//		Month_Dropdown drop-down end 	

//		circle drop-down start 
		ArrayList<IC_CIRCLE_MST_R> circleList = new ArrayList<>();
		circleList = iconvDaoRafi.getCircleList(MainControllerIC.officeCode, module_list.getZone());
		model.addAttribute("circleList", circleList);
//		circle drop-down end 

//		div drop-down start
		ArrayList<IC_DIST_DIV_MST> divList = new ArrayList<>();
		divList = iconvDaoRafi.getdivList(MainControllerIC.officeCode, module_list.getCircle());
		model.addAttribute("divList", divList);
//		div drop-down end

//		loc drop-down start	
		ArrayList<IC_LOCATION_MASTER> locList = new ArrayList<>();
		locList = iconvDaoRafi.getlocList(MainControllerIC.officeCode, module_list.getCircle(), module_list.getDiv());
		model.addAttribute("locList", locList);
//		loc drop-down end

		model.addAttribute("xyz", module_list);

		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_DASHBOARD_DIST";

	}

//	Generation Mod start 
	@GetMapping("/IC_DASHBOARD_GEN")
	public String ic_power_plant(Model model) {

		String hdr1 = "";
		String hdr2 = "";
		String hdr3 = "";
		String hdr4 = "";
		String hdr5 = "";

		String hdr25 = "";
		String hdr27 = "";

		String listlast_month_date = iconvDaoRafi.listlast_month_date();

//		 System.out.println("LAST DATE");
//		System.out.println(listlast_month_date);

//		String string = listlast_month_date;
//		String[] parts = string.split("-");
//		String part1 = parts[0]; // 004
//		String part2 = parts[1]; // 034556
//		
//		String part = part1 + part2;

		String date = listlast_month_date; // 034556

//		System.out.println(date);

		String a = "000000";
		String b = null;
		String c = null;
		String d = null;
		String e = null;
		String f = null;
		String g = null;
		String h = date;
		String j = "1";

		model.addAttribute("bill", h);

		Map<String, Object> result = getAllStatesJdbcCall118.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, e, f, g, h, j);
//		System.out.println("graph");	
//		System.out.println(result);		
		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);
//	    System.out.println(jsonArray);	

		Map<String, Double> graphData = new TreeMap<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);

			hdr1 = jsonData.getString("HDR");
			graphData.put(jsonData.getString("LINEX"), Double.valueOf(jsonData.getString("NET_GEN")));
		}

//	    System.out.println(hdr1);
//	    System.out.println(graphData);
		model.addAttribute("hdr1_graph", hdr1);
		model.addAttribute("chartData", graphData);

		Map<String, Object> result1 = getAllStatesJdbcCall119.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, e, f, g, h, j);
//		System.out.println("graph1");	
//		System.out.println(result1);		
		JSONObject json1 = new JSONObject(result1);
		String fjfhdj1 = json1.get("CUR_DATA").toString();
		JSONArray jsonArray1 = new JSONArray(fjfhdj1);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData1 = new TreeMap<>();
		for (int i = 0; i < jsonArray1.length(); i++) {
			JSONObject jsonData1 = jsonArray1.getJSONObject(i);

			hdr2 = jsonData1.getString("HDR");
			graphData1.put(jsonData1.getString("LINEX"), Double.valueOf(jsonData1.getString("NET_GEN")));
		}

//	    System.out.println("hh");
//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
		model.addAttribute("hdr2_graph", hdr2);
		model.addAttribute("chartData1", graphData1);

		// table show generation current month starts

		Map<String, Object> result25 = getAllStatesJdbcCall300.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, e, f, g, h, j);
		JSONObject json25 = new JSONObject(result25);
		String fjfhdj25 = json25.get("CUR_DATA").toString();
		JSONArray jsonArray25 = new JSONArray(fjfhdj25);
		ArrayList<DASHBOARD> tableList = new ArrayList<DASHBOARD>();
		for (int i = 0; i < jsonArray25.length(); i++) {
			JSONObject jsonData25 = jsonArray25.getJSONObject(i);

			hdr25 = jsonData25.getString("HDR");

			tableList.add(new DASHBOARD(jsonData25.getString("HDR"), jsonData25.getString("LINEX"),
					jsonData25.getString("NET_GEN")));
		}

//		System.out.println("hdr25");
//		System.out.println(hdr25);
		model.addAttribute("hdr2_table", hdr25);
		model.addAttribute("tableList", tableList);

		// table show generation current month ends

		// table show generation Upto month starts

		Map<String, Object> result27 = getAllStatesJdbcCall301.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, e, f, g, h, j);
		JSONObject json27 = new JSONObject(result27);
		String fjfhdj27 = json27.get("CUR_DATA").toString();
		JSONArray jsonArray27 = new JSONArray(fjfhdj27);
		ArrayList<DASHBOARD> tableList1 = new ArrayList<DASHBOARD>();
		for (int i = 0; i < jsonArray27.length(); i++) {
			JSONObject jsonData27 = jsonArray27.getJSONObject(i);

			hdr27 = jsonData27.getString("HDR");

			tableList1.add(new DASHBOARD(jsonData27.getString("HDR"), jsonData27.getString("LINEX"),
					jsonData27.getString("NET_GEN")));
		}

//		System.out.println("hdr25");
//		System.out.println(hdr25);
		model.addAttribute("hdr27_table", hdr27);
		model.addAttribute("tableList1", tableList1);

		// table show generation Upto month ends

//		IC_GEN_AREA drop-down start 
		ArrayList<IC_GEN_AREA> listIC_GEN_AREA = iconvDaoRafi.ga(officeCode);
		model.addAttribute("listIC_GEN_AREA", listIC_GEN_AREA);
//		IC_GEN_AREA drop-down end 	

//		IC_PP_OWNER_TYPE drop-down start 
		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.ow_ty(officeCode);
		model.addAttribute("owner_typeList", listIC_PP_OWNER_TYPE);
//		IC_PP_OWNER_TYPE drop-down end 	

//		IC_TRANS_GRID drop-down start 
		ArrayList<IC_TRANS_GRID> listIC_TRANS_GRID = iconvDaoRafi.tr(officeCode);
		model.addAttribute("gridList", listIC_TRANS_GRID);
//		IC_TRANS_GRID drop-down end 

//		IC_FUEL_TYPE drop-down start 
		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = iconvDaoRafi.fu(officeCode);
		model.addAttribute("listIC_FUEL_TYPE", listIC_FUEL_TYPE);
//		IC_FUEL_TYPE drop-down end 		

//		IC_POWER_PLANT drop-down start 
//		ArrayList<IC_POWER_PLANT>listIC_POWER_PLANT = iconvDao.po(officeCode,fuel,ow,grid,gen);
//		model.addAttribute("power_plantList", listIC_POWER_PLANT);
//		IC_POWER_PLANT drop-down end 

//		IC_REPORT_LEVEL_MST drop-down start 
		ArrayList<IC_REPORT_LEVEL_MST> listIC_REPORT_LEVEL_MST = iconvDaoRafi.b(officeCode);
		model.addAttribute("listIC_REPORT_LEVEL_MST_GEN", listIC_REPORT_LEVEL_MST);
//		IC_REPORT_LEVEL_MST drop-down end

//		ic_period_mst drop-down start 
		ArrayList<IC_PERIOD_MST1> billList = iconvDaoRafi.d(officeCode);
		model.addAttribute("billList_GEN", billList);

//		ic_period_mst drop-down end 

		IC_DASHBOARD_GEN abc = new IC_DASHBOARD_GEN();
		abc.setBill(h);
		abc.setReport("1");

		model.addAttribute("gen", abc);

		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_DASHBOARD_GEN";
	}

	@PostMapping("/IC_DASHBOARD_GEN")
	public String ic_dashboard_gen_save(IC_DASHBOARD_GEN ic_dashboard_gen, Model model) {

		System.out.println("gen_dash_post");

		String hdr1 = "";
		String hdr2 = "";
		String hdr3 = "";
		String hdr4 = "";
		String hdr5 = "";
		String hdr6 = "";
		String hdr7 = "";
		String hdr8 = "";
		String hdr9 = "";
		String hdr10 = "";
		String hdr11 = "";
		String hdr12 = "";
		String hdr13 = "";
		String hdr14 = "";

		String hdr25 = "";
		String hdr27 = "";

		String b = ic_dashboard_gen.getFuel();
		String c = ic_dashboard_gen.getOwner_type();
		String d = ic_dashboard_gen.getGrid();

		String e = ic_dashboard_gen.getOwner();
		String f = ic_dashboard_gen.getPower_plant();
		String g = ic_dashboard_gen.getArea();

		String h = ic_dashboard_gen.getBill();
		String j = ic_dashboard_gen.getReport();

//	
//		System.out.println("pera");
//		System.out.println(module_list);

		Map<String, Object> result = getAllStatesJdbcCall125.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(officeCode, b, c, d, e, f, g, h, j);
		System.out.println("graph");
		System.out.println(result);
		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);
//	    System.out.println(jsonArray);	

		Map<String, Double> graphData = new TreeMap<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);

			hdr1 = jsonData.getString("HDR");
			graphData.put(jsonData.getString("LINEX"), Double.valueOf(jsonData.getString("NET_GEN")));
		}

//	    System.out.println(hdr1);
//	    System.out.println(graphData);
		model.addAttribute("hdr1_graph", hdr1);
		model.addAttribute("chartData", graphData);

		Map<String, Object> result1 = getAllStatesJdbcCall121.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(officeCode, b, c, d, e, f, g, h, j);
//		System.out.println("graph1");	
//		System.out.println(result1);		
		JSONObject json1 = new JSONObject(result1);
		String fjfhdj1 = json1.get("CUR_DATA").toString();
		JSONArray jsonArray1 = new JSONArray(fjfhdj1);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData1 = new TreeMap<>();
		for (int i = 0; i < jsonArray1.length(); i++) {
			JSONObject jsonData1 = jsonArray1.getJSONObject(i);

			hdr2 = jsonData1.getString("HDR");
			graphData1.put(jsonData1.getString("LINEX"), Double.valueOf(jsonData1.getString("NET_GEN")));
		}

//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
		model.addAttribute("hdr2_graph", hdr2);
		model.addAttribute("chartData1", graphData1);

		// table show starts

		Map<String, Object> result25 = getAllStatesJdbcCall300.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(officeCode, b, c, d, e, f, g, h, j);
		JSONObject json25 = new JSONObject(result25);
		String fjfhdj25 = json25.get("CUR_DATA").toString();
		JSONArray jsonArray25 = new JSONArray(fjfhdj25);
		ArrayList<DASHBOARD> tableList = new ArrayList<DASHBOARD>();
		for (int i = 0; i < jsonArray25.length(); i++) {
			JSONObject jsonData25 = jsonArray25.getJSONObject(i);

			hdr25 = jsonData25.getString("HDR");

			tableList.add(new DASHBOARD(jsonData25.getString("HDR"), jsonData25.getString("LINEX"),
					jsonData25.getString("NET_GEN")));
		}

//		System.out.println("hdr25");
//		System.out.println(hdr25);
		model.addAttribute("hdr2_table", hdr25);
		model.addAttribute("tableList", tableList);

		// table show ends

		// table show generation Upto month starts

		Map<String, Object> result27 = getAllStatesJdbcCall301.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(officeCode, b, c, d, e, f, g, h, j);
		JSONObject json27 = new JSONObject(result27);
		String fjfhdj27 = json27.get("CUR_DATA").toString();
		JSONArray jsonArray27 = new JSONArray(fjfhdj27);
		ArrayList<DASHBOARD> tableList1 = new ArrayList<DASHBOARD>();
		for (int i = 0; i < jsonArray27.length(); i++) {
			JSONObject jsonData27 = jsonArray27.getJSONObject(i);

			hdr27 = jsonData27.getString("HDR");

			tableList1.add(new DASHBOARD(jsonData27.getString("HDR"), jsonData27.getString("LINEX"),
					jsonData27.getString("NET_GEN")));
		}

//		System.out.println("hdr25");
//		System.out.println(hdr25);
		model.addAttribute("hdr27_table", hdr27);
		model.addAttribute("tableList1", tableList1);

		// table show generation Upto month ends

//		IC_GEN_AREA drop-down start 
		ArrayList<IC_GEN_AREA> listIC_GEN_AREA = iconvDaoRafi.ga(officeCode);
		model.addAttribute("listIC_GEN_AREA", listIC_GEN_AREA);
//		IC_GEN_AREA drop-down end 	

//		IC_PP_OWNER_TYPE drop-down start 
		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.ow_ty(officeCode);
		model.addAttribute("owner_typeList", listIC_PP_OWNER_TYPE);
//		IC_PP_OWNER_TYPE drop-down end 	

//		IC_TRANS_GRID drop-down start 
		ArrayList<IC_TRANS_GRID> listIC_TRANS_GRID = iconvDaoRafi.tr(officeCode);
		model.addAttribute("gridList", listIC_TRANS_GRID);
//		IC_TRANS_GRID drop-down end 

//		IC_FUEL_TYPE drop-down start 
		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = iconvDaoRafi.fu(officeCode);
		model.addAttribute("listIC_FUEL_TYPE", listIC_FUEL_TYPE);
//		IC_FUEL_TYPE drop-down end 		

//		IC_POWER_PLANT drop-down start 
//		ArrayList<IC_POWER_PLANT>listIC_POWER_PLANT = iconvDao.po(officeCode);
//		model.addAttribute("power_plantList", listIC_POWER_PLANT);
//		IC_POWER_PLANT drop-down end 

//		IC_POWER_PLANT drop-down start
		ArrayList<IC_POWER_PLANT> listIC_POWER_PLANT = new ArrayList<>();
		listIC_POWER_PLANT = iconvDaoRafi.getIC_POWER_PLANTList(MainControllerIC.officeCode, ic_dashboard_gen.getFuel(),
				ic_dashboard_gen.getOwner_type(), ic_dashboard_gen.getOwner(), ic_dashboard_gen.getArea(),
				ic_dashboard_gen.getGrid());
		model.addAttribute("listIC_POWER_PLANT", listIC_POWER_PLANT);
//		IC_POWER_PLANT drop-down end 

//		IC_REPORT_LEVEL_MST drop-down start 
		ArrayList<IC_REPORT_LEVEL_MST> listIC_REPORT_LEVEL_MST = iconvDaoRafi.b(officeCode);
		model.addAttribute("listIC_REPORT_LEVEL_MST_GEN", listIC_REPORT_LEVEL_MST);
//		IC_REPORT_LEVEL_MST drop-down end

//		ic_period_mst drop-down start 
		ArrayList<IC_PERIOD_MST1> billList = iconvDaoRafi.d(officeCode);
		model.addAttribute("billList_GEN", billList);

//		ic_period_mst drop-down end 	

//		owner drop-down start 	
		ArrayList<IC_PP_OWNER> ownerList = new ArrayList<>();
		ownerList = iconvDaoRafi.getownerList(MainControllerIC.officeCode, ic_dashboard_gen.getOwner_type());
//		owner drop-down end 

		model.addAttribute("gen", ic_dashboard_gen);
		model.addAttribute("ownerList", ownerList);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_DASHBOARD_GEN";

	}

//	Generation Mod end 

	///////////////////// end graph



	@GetMapping("/IC_ZONE_MST")
	public String ic_zone_mst(Model model) {

		String flag = "0";

		IC_ZONE_MSTmain ic_zone_mst = new IC_ZONE_MSTmain();

		ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST = convergeDaoSurovi.listIC_ZONE_MST();
		model.addAttribute("ic_zone_mst", ic_zone_mst);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_ZONE_MST";
	}

	@PostMapping("/IC_ZONE_MST")
	public String ic_zone_mst_save(IC_ZONE_MSTmain ic_zone_mst) {

		convergeDaoSurovi.insertICZoneMst(ic_zone_mst);

		return "redirect:/IC_ZONE_MST";
	}

	@GetMapping("/IC_ZONE_MST/{id}")
	public String ic_zone_mst_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_ZONE_MSTmain ic_zone_mst = convergeDaoSurovi.singleIC_ZONE_MST(id);

		ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST = convergeDaoSurovi.listIC_ZONE_MST();

		model.addAttribute("ic_zone_mst", ic_zone_mst);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_ZONE_MST";
	}

	@PostMapping("/IC_ZONE_MST/{id}")
	public String ic_zone_mst_edit(@PathVariable("id") String id, Model model, IC_ZONE_MSTmain ic_zone_mst) {

		ic_zone_mst.setZONE_ID(id);

		convergeDaoSurovi.editICZoneMst(ic_zone_mst);

		return "redirect:/IC_ZONE_MST";
	}

	@PostMapping("/IC_ZONE_MST_delete/{id}")
	public String IC_ZONE_MST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICZoneMst(id);

		return "redirect:/IC_ZONE_MST";
	}

//	CLEAR IC_ZONE_MST START
	@PostMapping("/IC_ZONE_MST_clear/{id}")
	public String IC_ZONE_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_ZONE_MST";
	}

	// IC_CIRCLE_MST START

	@GetMapping("/IC_CIRCLE_MST/{zoneC}")
	public String ic_circle_mst(@PathVariable("zoneC") String zCode, Model model) {

		String flag = "0";

		IC_CIRCLE_MSTmain ic_circle_mst = new IC_CIRCLE_MSTmain();

		ArrayList<IC_CIRCLE_MSTmain> zoneC = convergeDaoSurovi.listIC_CIRCLE_MST(zCode);

		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST = convergeDaoSurovi.listIC_ZONE_MST();
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);

		model.addAttribute("zCode", zCode);
		model.addAttribute("ic_circle_mst", ic_circle_mst);
		model.addAttribute("listIC_CIRCLE_MST", zoneC);

		return "IC_CIRCLE_MST";

	}

	@PostMapping("/IC_CIRCLE_MST/{zoneC}")
	public String ic_circle_mst_save(@PathVariable("zoneC") String zCode, IC_CIRCLE_MSTmain ic_circle_mst) {

		ic_circle_mst.setZONE_CODE(zCode);

		convergeDaoSurovi.insertICCircleMst(ic_circle_mst);

		return "redirect:/IC_CIRCLE_MST/" + zCode;

	}

	@GetMapping("/IC_CIRCLE_MST/{zoneC}/{cirId}")
	public String ic_circle_mst_single(@PathVariable("zoneC") String zCode, @PathVariable("cirId") String cId,
			Model model) {

		String flag = "1";

		IC_CIRCLE_MSTmain ic_circle_mst = convergeDaoSurovi.singleIC_CIRCLE_MST(cId);

		ArrayList<IC_CIRCLE_MSTmain> listIC_CIRCLE_MST = convergeDaoSurovi.listIC_CIRCLE_MST(zCode);
		ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST = convergeDaoSurovi.listIC_ZONE_MST();
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);

		model.addAttribute("ic_circle_mst", ic_circle_mst);
		model.addAttribute("listIC_CIRCLE_MST", listIC_CIRCLE_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("cId", cId);
		model.addAttribute("cCode", ic_circle_mst.getCIRCLE_CODE());
		model.addAttribute("zCode", zCode);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_CIRCLE_MST";
	}

	@PostMapping("/IC_CIRCLE_MST/{zoneC}/{cirId}")
	public String ic_circle_mst_edit(@PathVariable("zoneC") String zCode, @PathVariable("cirId") String cId,
			Model model, IC_CIRCLE_MSTmain ic_circle_mst) {

		ic_circle_mst.setZONE_CODE(zCode);
		ic_circle_mst.setCIRCLE_ID(cId);

		convergeDaoSurovi.editICCircleMst(ic_circle_mst);

		return "redirect:/IC_CIRCLE_MST/" + zCode;
	}

	@PostMapping("/IC_CIRCLE_MST_delete/{zoneC}/{cirId}")
	public String ic_circle_mst_delete(@PathVariable("zoneC") String zCode, @PathVariable("cirId") int cId) {

		convergeDaoSurovi.deleteICCircleMst(cId);

		return "redirect:/IC_CIRCLE_MST/" + zCode;
	}

	// CLEAR IC_CIRCLE_MST START
	@PostMapping("/IC_CIRCLE_MST_clear/{cirId}")

	public String IC_CIRCLE_MST_clear(@PathVariable("cirId") int cId) {

		return "redirect:/IC_CIRCLE_MST";
	}

	///////////////

	// IC_DIST_DIV_MST START

	@GetMapping("/IC_DIST_DIV_MST/{zoneC}/{cCode}")
	public String ic_dist_div_mst(@PathVariable("zoneC") String zCode, @PathVariable("cCode") String circle,
			Model model) {

		String flag = "0";

		IC_DIST_DIV_MSTmain ic_dist_div_mst = new IC_DIST_DIV_MSTmain();

		ArrayList<IC_DIST_DIV_MSTmain> division = convergeDaoSurovi.listIC_DIST_DIV_MST(circle);

		ArrayList<IC_CIRCLE_MSTmain> listIC_CIRCLE_MST = convergeDaoSurovi.listIC_CIRCLE_MST(zCode);
		ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST = convergeDaoSurovi.listIC_ZONE_MST();

		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		model.addAttribute("listIC_CIRCLE_MST", listIC_CIRCLE_MST);

		model.addAttribute("ic_dist_div_mst", ic_dist_div_mst);
		model.addAttribute("listIC_DIST_DIV_MST", division);
		model.addAttribute("flag", flag);
		model.addAttribute("cCode", circle);
		model.addAttribute("zCode", zCode);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_DIST_DIV_MST";

	}

	@PostMapping("/IC_DIST_DIV_MST/{zoneC}/{cCode}")
	public String ic_dist_div_mst_save(@PathVariable("zoneC") String i, @PathVariable("cCode") String j,
			IC_DIST_DIV_MSTmain ic_dist_div_mst) {

		ic_dist_div_mst.setZONE_CODE(i);
		ic_dist_div_mst.setCIRCLE_CODE(j);

		convergeDaoSurovi.insertICDivMst(ic_dist_div_mst);

		return "redirect:/IC_DIST_DIV_MST/" + i + "/" + j;

	}

	@GetMapping("/IC_DIST_DIV_MST/{zoneC}/{cCode}/{divId}")
	public String ic_dist_div_mst_single(@PathVariable("zoneC") String zCode, @PathVariable("cCode") String cirCode,
			@PathVariable("divId") String dID, Model model) {

		String flag = "1";

		IC_DIST_DIV_MSTmain ic_dist_div_mst = convergeDaoSurovi.singleIC_DIST_DIV_MST(dID);

		ArrayList<IC_DIST_DIV_MSTmain> listIC_DIST_DIV_MST = convergeDaoSurovi.listIC_DIST_DIV_MST(cirCode);
		ArrayList<IC_CIRCLE_MSTmain> listIC_CIRCLE_MST = convergeDaoSurovi.listIC_CIRCLE_MST(zCode);
		ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST = convergeDaoSurovi.listIC_ZONE_MST();
		model.addAttribute("listIC_CIRCLE_MST", listIC_CIRCLE_MST);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		model.addAttribute("ic_dist_div_mst", ic_dist_div_mst);
		model.addAttribute("listIC_DIST_DIV_MST", listIC_DIST_DIV_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("cCode", cirCode);
		model.addAttribute("divId", dID);
		model.addAttribute("zCode", zCode);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_DIST_DIV_MST";
	}

	@PostMapping("/IC_DIST_DIV_MST/{zoneC}/{cCode}/{divId}")
	public String ic_circle_mst_edit(@PathVariable("zoneC") String zCode, @PathVariable("cCode") String cirCode,
			@PathVariable("divId") String dID, Model model, IC_DIST_DIV_MSTmain ic_dist_div_mst) {

		ic_dist_div_mst.setZONE_CODE(zCode);
		ic_dist_div_mst.setCIRCLE_CODE(cirCode);
		ic_dist_div_mst.setDIST_DIV_ID(dID);

		convergeDaoSurovi.editICDivMst(ic_dist_div_mst);

		return "redirect:/IC_DIST_DIV_MST/" + zCode + "/" + cirCode;
	}

	@PostMapping("/IC_DIST_DIV_MST_delete/{zoneC}/{cCode}/{divId}")
	public String ic_loc_mod_delete(@PathVariable("zoneC") String zCode, @PathVariable("cCode") String cirCode,
			@PathVariable("divId") int dID) {

		convergeDaoSurovi.deleteICDivMst(dID);

		return "redirect:/IC_DIST_DIV_MST/" + zCode + "/" + cirCode;
	}

	// CLEAR IC_DIST_DIV_MST START
	@PostMapping("/IC_DIST_DIV_MST_clear/{divId}")

	public String IC_DIST_DIV_MST_clear(@PathVariable("divId") int dID) {

		return "redirect:/IC_DIST_DIV_MST";
	}

//	IC_REPORT_LEVEL_MST

	@GetMapping("/IC_REPORT_LEVEL_MST")
	public String ic_report_level_mst(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		String flag = "0";

		IC_REPORT_LEVEL_MSTmain ic_report_level_mst = new IC_REPORT_LEVEL_MSTmain();

		ArrayList<IC_REPORT_LEVEL_MSTmain> listIC_REPORT_LEVEL_MST = convergeDaoSurovi.listIC_REPORT_LEVEL_MST();
		model.addAttribute("ic_report_level_mst", ic_report_level_mst);
		model.addAttribute("listIC_REPORT_LEVEL_MST", listIC_REPORT_LEVEL_MST);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_REPORT_LEVEL_MST";
	}

	@PostMapping("/IC_REPORT_LEVEL_MST")
	public String ic_report_level_mst_save(IC_REPORT_LEVEL_MSTmain ic_report_level_mst) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		convergeDaoSurovi.insertICReportLevelMst(ic_report_level_mst);

		return "redirect:/IC_REPORT_LEVEL_MST";
	}

	@GetMapping("/IC_REPORT_LEVEL_MST/{id}")
	public String ic_report_level_mst_single(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_REPORT_LEVEL_MSTmain ic_report_level_mst = convergeDaoSurovi.singleIC_REPORT_LEVEL_MST(id);

		ArrayList<IC_REPORT_LEVEL_MSTmain> listIC_REPORT_LEVEL_MST = convergeDaoSurovi.listIC_REPORT_LEVEL_MST();

		model.addAttribute("ic_report_level_mst", ic_report_level_mst);
		model.addAttribute("listIC_REPORT_LEVEL_MST", listIC_REPORT_LEVEL_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_REPORT_LEVEL_MST";
	}

	@PostMapping("/IC_REPORT_LEVEL_MST/{id}")
	public String ic_report_level_mst_edit(@PathVariable("id") String id, Model model,
			IC_REPORT_LEVEL_MSTmain ic_report_level_mst) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ic_report_level_mst.setREPORT_LV_ID(id);

		convergeDaoSurovi.editICReportLevelMst(ic_report_level_mst);

		return "redirect:/IC_REPORT_LEVEL_MST";
	}

	@PostMapping("/IC_REPORT_LEVEL_MST_delete/{id}")
	public String IC_REPORT_LEVEL_MST_delete(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		convergeDaoSurovi.deleteICReportLevelMst(id);

		return "redirect:/IC_REPORT_LEVEL_MST";
	}

//	CLEAR IC_REPORT_LEVEL_MST START
	@PostMapping("/IC_REPORT_LEVEL_MST_clear/{id}")
	public String IC_REPORT_LEVEL_MST_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "redirect:/IC_REPORT_LEVEL_MST";
	}
//	IC_GEN_REPORT_LEVEL_MST

	@GetMapping("/IC_GEN_REPORT_LEVEL_MST")
	public String ic_gen_report_level_mst(Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		String flag = "0";

		IC_GEN_REPORT_LEVEL_MSTmain ic_gen_report_level_mst = new IC_GEN_REPORT_LEVEL_MSTmain();

		ArrayList<IC_GEN_REPORT_LEVEL_MSTmain> listIC_GEN_REPORT_LEVEL_MST = convergeDaoSurovi
				.listIC_GEN_REPORT_LEVEL_MST();
		model.addAttribute("ic_gen_report_level_mst", ic_gen_report_level_mst);
		model.addAttribute("listIC_GEN_REPORT_LEVEL_MST", listIC_GEN_REPORT_LEVEL_MST);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_GEN_REPORT_LEVEL_MST";
	}

	@PostMapping("/IC_GEN_REPORT_LEVEL_MST")
	public String ic_gen_report_level_mst_save(IC_GEN_REPORT_LEVEL_MSTmain ic_gen_report_level_mst) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}

		convergeDaoSurovi.insertICGenReportLevelMst(ic_gen_report_level_mst);

		return "redirect:/IC_GEN_REPORT_LEVEL_MST";
	}

	@GetMapping("/IC_GEN_REPORT_LEVEL_MST/{id}")
	public String ic_gen_report_level_mst_single(@PathVariable("id") int id, Model model) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_GEN_REPORT_LEVEL_MSTmain ic_gen_report_level_mst = convergeDaoSurovi.singleIC_GEN_REPORT_LEVEL_MST(id);

		ArrayList<IC_GEN_REPORT_LEVEL_MSTmain> listIC_GEN_REPORT_LEVEL_MST = convergeDaoSurovi
				.listIC_GEN_REPORT_LEVEL_MST();

		model.addAttribute("ic_gen_report_level_mst", ic_gen_report_level_mst);
		model.addAttribute("listIC_GEN_REPORT_LEVEL_MST", listIC_GEN_REPORT_LEVEL_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_GEN_REPORT_LEVEL_MST";
	}

	@PostMapping("/IC_GEN_REPORT_LEVEL_MST/{id}")
	public String ic_gen_report_level_mst_edit(@PathVariable("id") String id, Model model,
			IC_GEN_REPORT_LEVEL_MSTmain ic_gen_report_level_mst) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		ic_gen_report_level_mst.setGEN_REPORT_LV_ID(id);

		convergeDaoSurovi.editICGenReportLevelMst(ic_gen_report_level_mst);

		return "redirect:/IC_GEN_REPORT_LEVEL_MST";
	}

	@PostMapping("/IC_GEN_REPORT_LEVEL_MST_delete/{id}")
	public String IC_GEN_REPORT_LEVEL_MST_delete(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		convergeDaoSurovi.deleteICGenReportLevelMst(id);

		return "redirect:/IC_GEN_REPORT_LEVEL_MST";
	}

//	CLEAR IC_GEN_REPORT_LEVEL_MST START
	@PostMapping("/IC_GEN_REPORT_LEVEL_MST_clear/{id}")
	public String IC_GEN_REPORT_LEVEL_MST_clear(@PathVariable("id") int id) {
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		return "redirect:/IC_GEN_REPORT_LEVEL_MST";
	}
//9/14/2021-Khandker

	@GetMapping("/IC_MAGIS_COURTS_ACTV_DTL")
	public String magisList(Model model) {
		ArrayList<IC_MAGIS_COURTS_MODEL> magis = i.magisList();
		model.addAttribute("magis", magis);

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

		IC_MAGIS_INSERT iC_MAGIS_INSERT = new IC_MAGIS_INSERT();
		model.addAttribute("iC_MAGIS_INSERT", iC_MAGIS_INSERT);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "magis";
	}

	@PostMapping("/IC_MAGIS_COURTS_ACTV_DTL")
	public String magisListInsert(Model model, IC_MAGIS_INSERT iC_MAGIS_INSERT) {
		i.magisListInstrt(iC_MAGIS_INSERT);

		return "redirect:/IC_MAGIS_COURTS_ACTV_DTL";
	}

	@GetMapping("/IC_MAGIS_COURTS_ACTV_DTL/{id}")
	public String magisEdit(@PathVariable("id") int id, Model model) {
		model.addAttribute("ids", id);

		ArrayList<IC_MAGIS_COURTS_MODEL> magis = i.magisList();
		model.addAttribute("magis", magis);

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

		IC_MAGIS_INSERT iC_MAGIS_INSERT = new IC_MAGIS_INSERT();
		model.addAttribute("iC_MAGIS_INSERT", iC_MAGIS_INSERT);

		ArrayList<IC_MAGIS_COURTS_MODEL> editMagis = i.magisListEdit(id);
		model.addAttribute("editMagis", editMagis);

		String CYCLE_CODE = editMagis.get(0).getpBILL_CYCLE_CODE();
		model.addAttribute("CYCLE_CODE", CYCLE_CODE);

		int PREV_MONTH = editMagis.get(0).getpBAL_OF_PREV_MONTH();
		model.addAttribute("PREV_MONTH", PREV_MONTH);

		int PDB_OFF = editMagis.get(0).getpCASES_FILED_PDB_OFF();
		model.addAttribute("PDB_OFF", PDB_OFF);

		int MOB_COURT = editMagis.get(0).getpCASES_FILED_MOB_COURT();
		model.addAttribute("MOB_COURT", MOB_COURT);

		int PER_JAILED = editMagis.get(0).getpNO_OF_PER_JAILED();
		model.addAttribute("PER_JAILED", PER_JAILED);

		int PER_FINED = editMagis.get(0).getpNO_OF_PER_FINED();
		model.addAttribute("PER_FINED", PER_FINED);

		int FINE_OR_JAIL = editMagis.get(0).getpNO_OF_PER_FINE_OR_JAIL();
		model.addAttribute("FINE_OR_JAIL", FINE_OR_JAIL);

		int OTHERS = editMagis.get(0).getpOTHERS();
		model.addAttribute("OTHERS", OTHERS);

		int REDEMPTION = editMagis.get(0).getpNO_OF_PER_REDEMPTION();
		model.addAttribute("REDEMPTION", REDEMPTION);

		int JUDGMENT = editMagis.get(0).getpNO_OF_PER_JUDGMENT();
		model.addAttribute("JUDGMENT", JUDGMENT);

		int BAL_NOS = editMagis.get(0).getpBAL_NOS();
		model.addAttribute("BAL_NOS", BAL_NOS);

		int ILLEGAL_CON = editMagis.get(0).getpDC_ILLEGAL_CON();
		model.addAttribute("ILLEGAL_CON", ILLEGAL_CON);

		int COURT_CONDU = editMagis.get(0).getpNO_OF_MOB_COURT_CONDU();
		model.addAttribute("COURT_CONDU", COURT_CONDU);

		int REALISED_TK = editMagis.get(0).getpFINES_REALISED_TK();
		model.addAttribute("REALISED_TK", REALISED_TK);

		String MONTHS = editMagis.get(0).getpMONTHS();
		model.addAttribute("MONTHS", MONTHS);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "magisedit";
	}

	@PostMapping("/IC_MAGIS_COURTS_ACTV_DTL/{id}")
	public String magisUpdate(@PathVariable("id") int id, Model model, IC_MAGIS_INSERT iC_MAGIS_INSERT) {
		i.magisListUpdate(iC_MAGIS_INSERT, id);

		return "redirect:/IC_MAGIS_COURTS_ACTV_DTL";
	}

	@GetMapping("/IC_MAGIS_COURTS_ACTV_DTL_DELETE/{id}")
	public String magiDelete(@PathVariable("id") int id, Model model) {
		i.magisListDelte(id);

		return "redirect:/IC_MAGIS_COURTS_ACTV_DTL";
	}

	// IC_LDC_MONTH_MAX_DATA starts

	@GetMapping("/IC_LDC_MONTH_MAX_DATA")
	public String ic_ldc_month_max_data(Model model) {

		String flag = "0";

		IC_LDC_MONTH_MAX_DATA ic_ldc_month_max_data = new IC_LDC_MONTH_MAX_DATA();

		ArrayList<IC_LDC_MONTH_MAX_DATA> listIC_LDC_MONTH_MAX_DATA = convergeDaoSurovi.listIC_LDC_MONTH_MAX_DATA();
		model.addAttribute("ic_ldc_month_max_data", ic_ldc_month_max_data);
		ArrayList<IC_LDC_TYPE> listIC_LDC_TYPE = convergeDaoSurovi.listIC_LDC_TYPE();
		model.addAttribute("listIC_LDC_TYPE", listIC_LDC_TYPE);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		model.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);

		model.addAttribute("listIC_LDC_MONTH_MAX_DATA", listIC_LDC_MONTH_MAX_DATA);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_LDC_MONTH_MAX_DATA";
	}

	@PostMapping("/IC_LDC_MONTH_MAX_DATA")
	public String ic_gen_report_level_mst_save(IC_LDC_MONTH_MAX_DATA ic_ldc_month_max_data) {

		convergeDaoSurovi.insertICLdcMonthMaxData(ic_ldc_month_max_data);

		return "redirect:/IC_LDC_MONTH_MAX_DATA";
	}

	@GetMapping("/IC_LDC_MONTH_MAX_DATA/{id}")
	public String ic_ldc_month_max_data_single(@PathVariable("id") int id, Model model) {
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		String flag = "1";

		IC_LDC_MONTH_MAX_DATA ic_ldc_month_max_data = convergeDaoSurovi.singleIC_LDC_MONTH_MAX_DATA(id);

		ArrayList<IC_LDC_MONTH_MAX_DATA> listIC_LDC_MONTH_MAX_DATA = convergeDaoSurovi.listIC_LDC_MONTH_MAX_DATA();

		model.addAttribute("ic_ldc_month_max_data", ic_ldc_month_max_data);
		model.addAttribute("listIC_LDC_MONTH_MAX_DATA", listIC_LDC_MONTH_MAX_DATA);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		ArrayList<IC_LDC_TYPE> listIC_LDC_TYPE = convergeDaoSurovi.listIC_LDC_TYPE();
		model.addAttribute("listIC_LDC_TYPE", listIC_LDC_TYPE);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		model.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_LDC_MONTH_MAX_DATA";
	}

	@PostMapping("/IC_LDC_MONTH_MAX_DATA/{id}")
	public String ic_ldc_month_max_data_edit(@PathVariable("id") int id, Model model,
			IC_LDC_MONTH_MAX_DATA ic_ldc_month_max_data) {
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		ic_ldc_month_max_data.setLDC_ID(id);

		convergeDaoSurovi.editICGenReportLevelMst(ic_ldc_month_max_data);

		return "redirect:/IC_LDC_MONTH_MAX_DATA";
	}

	@PostMapping("/IC_LDC_MONTH_MAX_DATA_delete/{id}")
	public String IC_LDC_MONTH_MAX_DATA_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICLdcMonthMaxData(id);

		return "redirect:/IC_LDC_MONTH_MAX_DATA";
	}

//		CLEAR IC_LDC_MONTH_MAX_DATA START
	@PostMapping("/IC_LDC_MONTH_MAX_DATA_clear/{id}")
	public String IC_LDC_MONTH_MAX_DATA_clear(@PathVariable("id") int id) {

		return "redirect:/IC_LDC_MONTH_MAX_DATA";
	}

	// IC_RC_DC_ST
	@GetMapping("/IC_RC_DC_ST")
	public String IC_RC_DC_ST_One(Model model) {
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

		ArrayList<IC_DC_RC> pIC_RC_DC = i.IC_RC_DC_one();
		model.addAttribute("pIC_RC_DC", pIC_RC_DC);

		dynamicMenu = icDao.getDynamicMenu();

		IC_DC_RC iC_DC_RC = new IC_DC_RC();
		model.addAttribute("iC_DC_RC", iC_DC_RC);

		model.addAttribute("dataHtml", dynamicMenu);
		if (dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_RC_DC_ST";
	}

	@PostMapping("/IC_RC_DC_ST")
	public String IC_RC_DC_ST_two(Model model, IC_DC_RC iC_DC_RC) {

		i.insert_DC_RC(iC_DC_RC);
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "redirect:/IC_RC_DC_ST";
	}

	@GetMapping("/IC_RC_DC_ST_Delete/{id}")
	public String delete_Rc_DC(@PathVariable("id") int id, Model model) {

		int result = i.delete_RC_DC(id);
		System.out.println(result);
		return "redirect:/IC_RC_DC_ST";
	}

	@GetMapping("/IC_RC_DC_ST_EDIT/{id}")
	public String RC_DC_EDIT(@PathVariable("id") int id, Model model) {
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

		IC_DC_RC iC_DC_RC = new IC_DC_RC();
		model.addAttribute("iC_DC_RC", iC_DC_RC);

		ArrayList<IC_DC_RC> pIC_RC_DC = i.IC_RC_DC_one();
		model.addAttribute("pIC_RC_DC", pIC_RC_DC);

		ArrayList<IC_DC_RC> IC_DC_RC_Edit = i.RC_DC_Edit(id);
		model.addAttribute("IC_DC_RC_Edit", IC_DC_RC_Edit);

		String billCycleCode = IC_DC_RC_Edit.get(0).getpBILL_CYCLE_CODE();
		model.addAttribute("billCycleCode", billCycleCode);

		String callAgDc = IC_DC_RC_Edit.get(0).getpCOLL_AGAINST_DC();
		model.addAttribute("callAgDc", callAgDc);

		String callAgRc = IC_DC_RC_Edit.get(0).getpCOLL_AGAINST_RC();
		model.addAttribute("callAgRc", callAgRc);

		String dcLine = IC_DC_RC_Edit.get(0).getpNO_OF_DC_LINE();
		model.addAttribute("dcLine", dcLine);

		String rcLine = IC_DC_RC_Edit.get(0).getpNO_OF_RC_LINE();
		model.addAttribute("rcLine", rcLine);

		String dcId = IC_DC_RC_Edit.get(0).getpRC_DC_ID();
		model.addAttribute("dcId", dcId);

		String status = IC_DC_RC_Edit.get(0).getpSTATUS();
		model.addAttribute("status", status);

		return "IC_RC_DC_Edit";
	}

	@PostMapping("/IC_RC_DC_ST_EDIT/{id}")
	public String RC_DC_UPDATE(@PathVariable("id") int id, Model model, IC_DC_RC iC_DC_RC) {
		System.out.println(iC_DC_RC + "v" + id);
		int val = i.RC_DC_update(iC_DC_RC, id);

		System.out.println(val);
		return "redirect:/IC_RC_DC_ST";
	}

	@GetMapping("/IC_GROUP_INFO")
	public String ic_group_info(Model model) {

		String flag = "0";

		IC_GROUP_INFO ic_group_info = new IC_GROUP_INFO();

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);

		ArrayList<IC_GROUP_INFO> listIC_GROUP_INFO = convergeDaoSurovi.listIC_GROUP_INFO();
		model.addAttribute("ic_group_info", ic_group_info);
		model.addAttribute("listIC_GROUP_INFO", listIC_GROUP_INFO);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_GROUP_INFO";
	}

	@PostMapping("/IC_GROUP_INFO")
	public String ic_group_info_save(IC_GROUP_INFO ic_group_info) {

		convergeDaoSurovi.insertICGroupInfo(ic_group_info);

		System.out.println("gd");
		System.out.println(ic_group_info);

		return "redirect:/IC_GROUP_INFO";
	}

	@GetMapping("/IC_GROUP_INFO/{id}")
	public String ic_group_info_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_GROUP_INFO ic_group_info = convergeDaoSurovi.singleIC_GROUP_INFO(id);

		ArrayList<IC_GROUP_INFO> listIC_GROUP_INFO = convergeDaoSurovi.listIC_GROUP_INFO();

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);

		model.addAttribute("ic_group_info", ic_group_info);
		model.addAttribute("listIC_GROUP_INFO", listIC_GROUP_INFO);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_GROUP_INFO";
	}

	@PostMapping("/IC_GROUP_INFO/{id}")
	public String ic_group_info_edit(@PathVariable("id") String id, Model model, IC_GROUP_INFO ic_group_info) {

		ic_group_info.setGRP_ID(id);

		convergeDaoSurovi.editICGroupInfo(ic_group_info);

		return "redirect:/IC_GROUP_INFO";
	}

	@PostMapping("/IC_GROUP_INFO_delete/{id}")
	public String IC_GROUP_INFO_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICGroupInfo(id);

		return "redirect:/IC_GROUP_INFO";
	}

//	CLEAR IC_GROUPINFO START
	@PostMapping("/IC_GROUP_INFO_clear/{id}")
	public String IC_GROUP_INFO_clear(@PathVariable("id") int id) {

		return "redirect:/IC_GROUP_INFO";
	}

	// IC_GROUP_ACCESS START

	@GetMapping("/IC_GROUP_ACCESS/{grpCode}")
	public String ic_group_access(@PathVariable("grpCode") String gCode, Model m) {

//		System.out.println(i);
		String flag = "0";

		IC_GROUP_ACCESS ic_group_access = new IC_GROUP_ACCESS();

		ArrayList<IC_GROUP_ACCESS> listIC_GROUP_ACCESS = convergeDaoSurovi.listIC_GROUP_ACCESS(gCode);

		m.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		m.addAttribute("dataHtml", dynamicMenu);

//		
		ArrayList<IC_GROUP_INFO> groupDorpdownList = convergeDaoSurovi.listIC_GROUP_INFO();
		m.addAttribute("groupDorpdownList", groupDorpdownList);
//		
//		System.out.println(groupDorpdownList);
//		
		ArrayList<ModuleDropdownList> moduleDropdownList = convergeDaoSurovi.moduleDropdownList();
		m.addAttribute("moduleDropdownList", moduleDropdownList);

		m.addAttribute("gCode", gCode);
		m.addAttribute("ic_group_access", ic_group_access);
		m.addAttribute("listIC_GROUP_ACCESS", listIC_GROUP_ACCESS);

		return "IC_GROUP_ACCESS.html";

	}

	@PostMapping("/IC_GROUP_ACCESS/{grpCode}")
	public String ic_group_access_save(@PathVariable("grpCode") String gCode, IC_GROUP_ACCESS ic_group_access) {

		ic_group_access.setGRP_CODE(gCode);

		convergeDaoSurovi.insertICGroupAccess(ic_group_access);

		return "redirect:/IC_GROUP_ACCESS/" + gCode;

	}

	@GetMapping("/IC_GROUP_ACCESS/{grpCode}/{gAccId}")
	public String ic_group_access_single(@PathVariable("grpCode") String gCode, @PathVariable("gAccId") int gAId,
			Model model) {

		String flag = "1";

		IC_GROUP_ACCESS ic_group_access = convergeDaoSurovi.singleIC_GROUP_ACCESS(gAId);

		System.out.println("test");
		System.out.println(ic_group_access);

		ArrayList<IC_GROUP_ACCESS> listIC_GROUP_ACCESS = convergeDaoSurovi.listIC_GROUP_ACCESS(gCode);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

//		
		ArrayList<IC_GROUP_INFO> groupDorpdownList = convergeDaoSurovi.listIC_GROUP_INFO();
		model.addAttribute("groupDorpdownList", groupDorpdownList);
//		
//		System.out.println(groupDorpdownList);
//		
		ArrayList<ModuleDropdownList> moduleDropdownList = convergeDaoSurovi.moduleDropdownList();
		model.addAttribute("moduleDropdownList", moduleDropdownList);

		model.addAttribute("gCode", gCode);
		model.addAttribute("ic_group_access", ic_group_access);
		model.addAttribute("listIC_GROUP_ACCESS", listIC_GROUP_ACCESS);
		model.addAttribute("gAId", gAId);

		return "IC_GROUP_ACCESS";
	}

	@PostMapping("/IC_GROUP_ACCESS/{grpCode}/{gAccId}")
	public String ic_group_access_edit(@PathVariable("grpCode") String gCode, @PathVariable("gAccId") int gAId,
			Model model, IC_GROUP_ACCESS ic_group_access) {

		ic_group_access.setGRP_CODE(gCode);
		ic_group_access.setGRP_ACS_ID(gAId);

		convergeDaoSurovi.editICGroupAccess(ic_group_access);

		return "redirect:/IC_GROUP_ACCESS/" + gCode;
	}

	@PostMapping("/IC_GROUP_ACCESS_delete/{grpCode}/{gAccId}")
	public String ic_group_access_delete(@PathVariable("grpCode") String gCode, @PathVariable("gAccId") int gAId) {

		convergeDaoSurovi.deleteICGroupAccess(gAId);

		return "redirect:/IC_GROUP_ACCESS/" + gCode;
	}

	// CLEAR IC_CIRCLE_MST START
	@PostMapping("/IC_GROUP_ACCESS_clear/{gAccId}")

	public String IC_GROUP_ACCESS_clear(@PathVariable("gAccId") int gAId) {

		return "redirect:/IC_GROUP_ACCESS";
	}

//	IC_LOC_MOD_DF table list start 
	@GetMapping("/IC_LOC_MOD_DF/{b}/{l}/{id}")
	public String ic_loc_mod_df(@PathVariable("b") String bill_cycle, @PathVariable("l") String l,
			@PathVariable("id") String id, Model model) {

		// table show sys_loss current month starts

		Map<String, Object> result40 = getAllStatesJdbcCall1000.withCatalogName("pkg_dist_mod_view")
				.withProcedureName("dpd_mod_view")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, bill_cycle, l);
		JSONObject json40 = new JSONObject(result40);
		String fjfhdj40 = json40.get("CUR_DATA").toString();
		JSONArray jsonArray40 = new JSONArray(fjfhdj40);
		ArrayList<DpdModView> tableList = new ArrayList<DpdModView>();
		for (int k = 0; k < jsonArray40.length(); k++) {
			JSONObject jsonData40 = jsonArray40.getJSONObject(k);

			tableList.add(new DpdModView(jsonData40.optString("SL_NO"), jsonData40.optString("ITEM_NAME"),
					jsonData40.optString("CURR_MONTH"), jsonData40.optString("UPTO_MONTH"), "", ""));
		}

		model.addAttribute("tableList", tableList);

		model.addAttribute("BILL_CYCLE_CODE", bill_cycle);
		model.addAttribute("LOCATION_CODE", l);
		model.addAttribute("LOC_MOD_ID", id);
		model.addAttribute("PP_USER", MainControllerIC.user_name);
		model.addAttribute("PP_OFFICE", MainControllerIC.officeCode);

		List<IC_LOC_MOD_DF> listIC_LOC_MOD_DF = rowSqlDao.listIC_LOC_MOD_DF(user_name);
		model.addAttribute("listIC_LOC_MOD_DF", listIC_LOC_MOD_DF);
		List<NextUserAndOffice> listbackWORD = rowSqlDao.listbackWORD(user_name, officeCode);
		model.addAttribute("listbackWORD", listbackWORD);
		if (listbackWORD.isEmpty()) {
			model.addAttribute("flag", "0");
		} else if (!user_name.equals(listbackWORD.get(0).NEXT_USER)) {
			model.addAttribute("flag", "1");
		} else {
			model.addAttribute("flag", "0");
		}

		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		IC_LOC_MOD_DF_R ic_LOC_MOD_DF_R = new IC_LOC_MOD_DF_R();
		ic_LOC_MOD_DF_R.setBILL_CYCLE_CODE(bill_cycle);
		ic_LOC_MOD_DF_R.setLOCATION_CODE(l);
		ic_LOC_MOD_DF_R.setLOC_MOD_ID(id);
		ic_LOC_MOD_DF_R.setPR_USER(MainControllerIC.user_name);
		ic_LOC_MOD_DF_R.setPR_OFFICE_CODE(MainControllerIC.officeCode);
		ic_LOC_MOD_DF_R.setREMARKS("");
		model.addAttribute("ic_LOC_MOD_DF_R", ic_LOC_MOD_DF_R);

		IC_LOC_MOD_DFF ic_LOC_MOD_DFF = new IC_LOC_MOD_DFF();
		ic_LOC_MOD_DFF.setBILL_CYCLE_CODE(bill_cycle);
		ic_LOC_MOD_DFF.setLOCATION_CODE(l);
		ic_LOC_MOD_DFF.setLOC_MOD_ID(id);
		ic_LOC_MOD_DFF.setPR_USER(MainControllerIC.user_name);
		ic_LOC_MOD_DFF.setPR_OFFICE_CODE(MainControllerIC.officeCode);
		model.addAttribute("ic_LOC_MOD_DFF", ic_LOC_MOD_DFF);

		List<NextUserAndOffice> listFORWORD = rowSqlDao.listFORWORD(user_name, officeCode);
		model.addAttribute("listFORWORD", listFORWORD);

		return "IC_LOC_MOD_DF_R.html";

	}

//	IC_LOC_MOD_DF table list end 
	@GetMapping("/IC_LOC_MOD_DF")
	public String IC_LOC_MOD_DF(Model model) {

		List<IC_LOC_MOD_DF> listIC_LOC_MOD_DF = rowSqlDao.listIC_LOC_MOD_DF(user_name);
		model.addAttribute("listIC_LOC_MOD_DF", listIC_LOC_MOD_DF);

		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_LOC_MOD_DF";
	}

	@PostMapping("/IC_LOC_MOD_DF")
	public String ic_loc_mod_df_back(IC_LOC_MOD_DF_R ic_LOC_MOD_DF_R, Model model) {

		String output = iconvDaoRafi.bacckwordModDf(ic_LOC_MOD_DF_R.getBILL_CYCLE_CODE(),
				ic_LOC_MOD_DF_R.getLOCATION_CODE(), ic_LOC_MOD_DF_R.getLOC_MOD_ID(), ic_LOC_MOD_DF_R.getPR_USER(),
				ic_LOC_MOD_DF_R.getPR_OFFICE_CODE(), ic_LOC_MOD_DF_R.getREMARKS(), ic_LOC_MOD_DF_R.getNEXT_USER());

		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "redirect:/IC_LOC_MOD_DF";
		// return "IC_LOC_MOD_DF";
	}

	@PostMapping("/IC_LOC_MOD_DFF")
	public String ic_loc_mod_df_fw(IC_LOC_MOD_DFF ic_LOC_MOD_DF_R, Model model) {

		String output = iconvDaoRafi.bacckwordModDff(ic_LOC_MOD_DF_R.getBILL_CYCLE_CODE(),
				ic_LOC_MOD_DF_R.getLOCATION_CODE(), ic_LOC_MOD_DF_R.getLOC_MOD_ID(), ic_LOC_MOD_DF_R.getPR_USER(),
				ic_LOC_MOD_DF_R.getPR_OFFICE_CODE(), ic_LOC_MOD_DF_R.getNEXT_USER());
		dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "redirect:/IC_LOC_MOD_DF";
		// return "IC_LOC_MOD_DF";
	}
	// IC_MODULES_LIST START

	@GetMapping("/IC_MODULES_LIST")
	public String ic_module_list(Model model) {

		String flag = "0";

		IC_MODULES_LIST ic_module_list = new IC_MODULES_LIST();

		ArrayList<IC_MODULES_LIST> listIC_MODULES_LIST = convergeDaoSurovi.listIC_MODULES_LIST();
		model.addAttribute("listIC_MODULES_LIST", listIC_MODULES_LIST);

		/*
		 * ArrayList<IC_MODULE_LIST> listIC_MODULE_LIST =
		 * convergeDaoSurovi.listIC_MODULE_LIST();
		 */
		model.addAttribute("ic_module_list", ic_module_list);
		/* model.addAttribute("listIC_MODULES_LIST", listIC_MODULES_LIST); */
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MODULES_LIST";
	}

	@PostMapping("/IC_MODULES_LIST")
	public String ic_module_list_save(IC_MODULES_LIST ic_module_list) {

		convergeDaoSurovi.insertICModulesList(ic_module_list);

		System.out.println(ic_module_list);

		return "redirect:/IC_MODULES_LIST";
	}

	@GetMapping("/IC_MODULES_LIST/{id}")
	public String ic_module_list_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_MODULES_LIST ic_module_list = convergeDaoSurovi.singleIC_MODULES_LIST(id);

		ArrayList<IC_MODULES_LIST> listIC_MODULES_LIST = convergeDaoSurovi.listIC_MODULES_LIST();
		model.addAttribute("listIC_MODULES_LIST", listIC_MODULES_LIST);

		model.addAttribute("ic_module_list", ic_module_list);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MODULES_LIST";
	}

	@PostMapping("/IC_MODULES_LIST/{id}")
	public String ic_module_list_edit(@PathVariable("id") int id, Model model, IC_MODULES_LIST ic_module_list) {

		ic_module_list.setMOD_ID(id);

		convergeDaoSurovi.editICModulesList(ic_module_list);

		return "redirect:/IC_MODULES_LIST";
	}

	@PostMapping("/IC_MODULES_LIST_delete/{id}")
	public String IC_MODULES_LIST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICModulesList(id);

		return "redirect:/IC_MODULES_LIST";
	}

//	CLEAR IC_MODULES_LIST START
	@PostMapping("/IC_MODULES_LIST_clear/{id}")
	public String IC_MODULES_LIST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_MODULES_LIST";
	}

// IC_MODULE_ACCESS START

	@GetMapping("/IC_MODULE_ACCESS/{modC}")
	public String ic_module_access(@PathVariable("modC") String mCode, Model model) {

		String flag = "0";

		IC_MODULE_ACCESS ic_module_access = new IC_MODULE_ACCESS();

		ArrayList<ActivityDrop> activityDropDown = convergeDaoSurovi.activityDropDown();
		model.addAttribute("activityDropDown", activityDropDown);

		ArrayList<IC_MODULES_LIST> listIC_MODULES_LIST = convergeDaoSurovi.listIC_MODULES_LIST();
		model.addAttribute("listIC_MODULES_LIST", listIC_MODULES_LIST);

		ArrayList<IC_MODULE_ACCESS> listIC_MODULE_ACCESS = convergeDaoSurovi.listIC_MODULE_ACCESS(mCode);
		model.addAttribute("ic_module_access", ic_module_access);
		model.addAttribute("listIC_MODULE_ACCESS", listIC_MODULE_ACCESS);
		model.addAttribute("flag", flag);
		model.addAttribute("mCode", mCode);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MODULE_ACCESS";
	}

	@PostMapping("/IC_MODULE_ACCESS/{modC}")
	public String ic_module_access_save(@PathVariable("modC") String mCode, IC_MODULE_ACCESS ic_module_access) {

		convergeDaoSurovi.insertICModuleAccess(ic_module_access);

		System.out.println(ic_module_access);

		return "redirect:/IC_MODULE_ACCESS/" + mCode;
	}

	@GetMapping("/IC_MODULE_ACCESS/{modC}/{mAid}")
	public String ic_module_access_single(@PathVariable("modC") String mCode, @PathVariable("mAid") int id,
			Model model) {

		String flag = "1";

		IC_MODULE_ACCESS ic_module_access = convergeDaoSurovi.singleIC_MODULE_ACCESS(id);

		ArrayList<IC_MODULE_ACCESS> listIC_MODULE_ACCESS = convergeDaoSurovi.listIC_MODULE_ACCESS(mCode);

		ArrayList<ActivityDrop> activityDropDown = convergeDaoSurovi.activityDropDown();
		model.addAttribute("activityDropDown", activityDropDown);

		ArrayList<IC_MODULES_LIST> listIC_MODULES_LIST = convergeDaoSurovi.listIC_MODULES_LIST();
		model.addAttribute("listIC_MODULES_LIST", listIC_MODULES_LIST);

		model.addAttribute("ic_module_access", ic_module_access);
		model.addAttribute("listIC_MODULE_ACCESS", listIC_MODULE_ACCESS);
		model.addAttribute("flag", flag);
		model.addAttribute("mCode", mCode);
		model.addAttribute("id", id);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MODULE_ACCESS";
	}

	@PostMapping("/IC_MODULE_ACCESS/{modC}/{mAid}")
	public String ic_module_access_edit(@PathVariable("modC") String mCode, @PathVariable("mAid") int id, Model model,
			IC_MODULE_ACCESS ic_module_access) {

		ic_module_access.setMOD_ACS_ID(id);

		convergeDaoSurovi.editICModuleAccess(ic_module_access);

		return "redirect:/IC_MODULE_ACCESS/" + mCode;
	}

	@PostMapping("/IC_MODULE_ACCESS_delete/{modC}/{mAid}")
	public String IC_MODULE_ACCESS_delete(@PathVariable("modC") String mCode, @PathVariable("mAid") int id) {

		convergeDaoSurovi.deleteICModulesAccess(id);

		return "redirect:/IC_MODULE_ACCESS/" + mCode;
	}

//CLEAR IC_MODULE_ACCESS START
	@PostMapping("/IC_MODULE_ACCESS_clear/{modC}")
	public String IC_MODULE_ACCESS_clear(@PathVariable("modC") int mCode) {

		return "redirect:/IC_MODULE_ACCESS/" + mCode;
	}

	@GetMapping("/IC_TRANS_GRID")
	public String ic_trans_grid(Model model) {

		String flag = "0";

		IC_TRANS_GRIDmain ic_trans_grid = new IC_TRANS_GRIDmain();

		ArrayList<IC_TRANS_GRIDmain> listIC_TRANS_GRID = convergeDaoSurovi.listIC_TRANS_GRID();
		model.addAttribute("ic_trans_grid", ic_trans_grid);
		
		ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA = convergeDaoSurovi.listIC_USAGE_AREA();
		model.addAttribute("listIC_USAGE_AREA", listIC_USAGE_AREA);
		
		model.addAttribute("listIC_TRANS_GRID", listIC_TRANS_GRID);
		model.addAttribute("flag", flag);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_TRANS_GRID";
	}

	@PostMapping("/IC_TRANS_GRID")
	public String ic_trans_grid_save(IC_TRANS_GRIDmain ic_trans_grid) {

		convergeDaoSurovi.insertICTransGrid(ic_trans_grid);

		return "redirect:/IC_TRANS_GRID";
	}

	@GetMapping("/IC_TRANS_GRID/{id}")
	public String ic_trans_grid_single(@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_TRANS_GRIDmain ic_trans_grid = convergeDaoSurovi.singleIC_TRANS_GRID(id);

		ArrayList<IC_TRANS_GRIDmain> listIC_TRANS_GRID = convergeDaoSurovi.listIC_TRANS_GRID();
		
		ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA = convergeDaoSurovi.listIC_USAGE_AREA();
		model.addAttribute("listIC_USAGE_AREA", listIC_USAGE_AREA);

		model.addAttribute("ic_trans_grid", ic_trans_grid);
		model.addAttribute("listIC_TRANS_GRID", listIC_TRANS_GRID);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_TRANS_GRID";
	}

	@PostMapping("/IC_TRANS_GRID/{id}")
	public String ic_zone_mst_edit(@PathVariable("id") String id, Model model, IC_TRANS_GRIDmain ic_trans_grid) {

		ic_trans_grid.setGRID_ID(id);

		convergeDaoSurovi.editICTransGrid(ic_trans_grid);

		return "redirect:/IC_TRANS_GRID";
	}

	@PostMapping("/IC_TRANS_GRID_delete/{id}")
	public String IC_TRANS_GRID_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICTransGrid(id);

		return "redirect:/IC_TRANS_GRID";
	}

//	CLEAR IC_TRANS_GRID START
	@PostMapping("/IC_TRANS_GRID_clear/{id}")
	public String IC_TRANS_GRID_clear(@PathVariable("id") int id) {

		return "redirect:/IC_TRANS_GRID";
	}
}
