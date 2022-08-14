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
import org.springframework.web.bind.annotation.PostMapping;

import oracle.jdbc.OracleTypes;

@Controller
public class ReportController {

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

	SimpleJdbcCall getAllStatesJdbcCall600;
	SimpleJdbcCall getAllStatesJdbcCall601;
	SimpleJdbcCall getAllStatesJdbcCall602;
	SimpleJdbcCall getAllStatesJdbcCall603;
	SimpleJdbcCall getAllStatesJdbcCall604;
	SimpleJdbcCall getAllStatesJdbcCall605;
	SimpleJdbcCall getAllStatesJdbcCall606;
	SimpleJdbcCall getAllStatesJdbcCall607;
	SimpleJdbcCall getAllStatesJdbcCall608;
	SimpleJdbcCall getAllStatesJdbcCall609;
	SimpleJdbcCall getAllStatesJdbcCall610;
	SimpleJdbcCall getAllStatesJdbcCall611;
	SimpleJdbcCall getAllStatesJdbcCall612;
	SimpleJdbcCall getAllStatesJdbcCall613;
	SimpleJdbcCall getAllStatesJdbcCall614;
	SimpleJdbcCall getAllStatesJdbcCall615;
	SimpleJdbcCall getAllStatesJdbcCall617;

	public ReportController(DataSource dataSource) {

		this.getAllStatesJdbcCall600 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall601 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall602 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall603 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall604 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall605 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall606 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall607 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall608 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall609 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall610 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall611 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall612 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall613 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall614 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall615 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall617 = new SimpleJdbcCall(dataSource);

	}

	@GetMapping("/IC_ES_IND")
	public String IC_ES_IND(Model model) {
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		List<ReportIndex> reportIndexs = rowSqlDao.listReportIndex();
		model.addAttribute("reportIndexs", reportIndexs);
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		return "IC_ES_IND";
	}

	@GetMapping("/IC_ES_IND_ALL")
	public String IC_ES_IND_ALL(Model model) {
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		List<ReportIndex> reportIndexs = rowSqlDao.listReportIndex();
		model.addAttribute("reportIndexs", reportIndexs);
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.mm(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_IND_ALL";
	}

	@PostMapping("/IC_ES_IND_ALL")
	public String IC_ES_INDP(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.mm(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		List<ReportIndex> reportIndexs = rowSqlDao.listReportIndex();
		model.addAttribute("reportIndexs", reportIndexs);

		/// IC_ES_YR_MON_GEN_SALES_LOSS
		ArrayList<Dpd_Year> Dpd_Year_gen = i.Dpd_Year_Gen_sale(rm.one);
		model.addAttribute("Dpd_Year_gen", Dpd_Year_gen);
		if (Dpd_Year_gen.isEmpty()) {
			model.addAttribute("Year_gen", "");
		} else {
			model.addAttribute("Year_gen", Dpd_Year_gen.get(0).getpYEAR_CODE());
		}

		ArrayList<Dpd_Month> Dpd_Month_gen = i.Dpd_Month_Gen_sale(rm.one);
		model.addAttribute("Dpd_Month_gen", Dpd_Month_gen);
		//// IC_ES_YR_MON_SALES_UT_AND_TRANS_LOSS
		ArrayList<DPD_MON_SALE_LOSS_MODEL> dPD_MON_SALE_LOSS_MODEL = i.IC_ES_YR_MON_SALES_two(rm.one);
		model.addAttribute("dPD_MON_SALE_LOSS_MODEL", dPD_MON_SALE_LOSS_MODEL);
		ArrayList<DPD_MON_SALE_LOSS_MODEL> dPD_MON_SALE_LOSS_MODEL2 = i.IC_ES_YR_MON_SALES_one(rm.one);
		model.addAttribute("dPD_MON_SALE_LOSS_MODEL2", dPD_MON_SALE_LOSS_MODEL2);

		////////////// IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON
		int index = 0;
		for (int i = 0; i < billList.size(); i++) {
			if (billList.get(i).getBILL_CYCLE_CODE().equals(rm.one)) {
				index = i;
			}
		}
		model.addAttribute("month", billList.get(index).getBILL_CYCLE_DESC());
		ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> c_COM_OPR_STAT_BPDB_CR_MONs = null;
		try {
			c_COM_OPR_STAT_BPDB_CR_MONs = i
					.listIC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON(MainControllerIC.officeCode, rm.one);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("c_COM_OPR_STAT_BPDB_CR_MONs", c_COM_OPR_STAT_BPDB_CR_MONs);

		////////// IC_ES_Z_C_COM_OPR_STAT_BPDB_FY
		int index3 = 0;
		for (int i = 0; i < billList.size(); i++) {
			if (billList.get(i).getBILL_CYCLE_CODE().equals(rm.one)) {
				index3 = i;
			}
		}
		model.addAttribute("month", billList.get(index3).getBILL_CYCLE_DESC());
		ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> IC_ES_Z_C_COM_OPR_STAT_BPDB_FYs = null;
		try {
		IC_ES_Z_C_COM_OPR_STAT_BPDB_FYs = i
				.listIC_ES_Z_C_COM_OPR_STAT_BPDB_FY(MainControllerIC.officeCode, rm.one);
		}catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("IC_ES_Z_C_COM_OPR_STAT_BPDB_FYs", IC_ES_Z_C_COM_OPR_STAT_BPDB_FYs);

		//////////////// IC_ES_PP_GEN
		ArrayList<Dpd_pp_wise_gen> Dpd_pp_gen = i.IC_ES_GEN(rm.one);
		model.addAttribute("Dpd_pp_gen", Dpd_pp_gen);
		if (!Dpd_pp_gen.isEmpty()) {
			model.addAttribute("cmonth", Dpd_pp_gen.get(0).getCURR_MONTH());
			model.addAttribute("umonth", Dpd_pp_gen.get(0).getUPTO_MONTH());
		}

		//////////////// IC_ES_COM_OPR_STAT_REB
		int index1 = 0;
		for (int i = 0; i < billList.size(); i++) {
			if (billList.get(i).getBILL_CYCLE_CODE().equals(rm.one)) {
				index1 = i;
			}
		}
		model.addAttribute("billMon", billList.get(index1).getBILL_CYCLE_DESC());
		model.addAttribute("billMon1", billList.get(index1+1).getBILL_CYCLE_DESC());

		ArrayList<DpdBrebStatementDetail> dpdBrebStatementDetail = i.listIC_ES_COM_OPR_STAT_REB(rm.one);
		model.addAttribute("dpdBrebStatementDetail", dpdBrebStatementDetail);

		ArrayList<BrebStatementSummary> brebStatementSummary = i.listIC_ES_COM_OPR_STAT_REB_two(rm.one);
		model.addAttribute("brebStatementSummary", brebStatementSummary);

		/////////// IC_ES_SECT_ACC_REC_SUM
		ArrayList<Month> month = icDao.listMONTH(rm.one);
		model.addAttribute("month", month);

		ArrayList<DpdSector> dpdSector = icDao.listDpdSectors(rm.one);
		model.addAttribute("dpdSector", dpdSector);

		ArrayList<DpdSector> dpdSector1 = new ArrayList<DpdSector>();
		dpdSector1.add(dpdSector.get(0));
		model.addAttribute("dpdSector1", dpdSector1);

		ArrayList<DpdSector> dpdSector2 = new ArrayList<DpdSector>();
		dpdSector2.add(dpdSector.get(1));
		model.addAttribute("dpdSector2", dpdSector2);

		ArrayList<DpdSector> dpdSector3 = new ArrayList<DpdSector>();
		dpdSector3.add(dpdSector.get(2));
		model.addAttribute("dpdSector3", dpdSector3);

		ArrayList<DpdSector> dpdSector4 = new ArrayList<DpdSector>();
		dpdSector4.add(dpdSector.get(3));
		model.addAttribute("dpdSector4", dpdSector4);

		ArrayList<DpdSector> dpdSectorwise = icDao.listDpdSectorwise(rm.one);
		model.addAttribute("dpdSectorwise", dpdSectorwise);

		System.out.println("jhhg");
		System.out.println(dpdSectorwise);

		ArrayList<DpdSector> dpdSector5 = new ArrayList<DpdSector>();
		dpdSector5.add(dpdSectorwise.get(0));
		model.addAttribute("dpdSector5", dpdSector5);

		ArrayList<DpdSector> dpdSectorUtwise = icDao.listDpdSectorUt(rm.one);
		model.addAttribute("dpdSectorUtwise", dpdSectorUtwise);

		ArrayList<DpdSector> dpdSector6 = new ArrayList<DpdSector>();
		dpdSector6.add(dpdSectorUtwise.get(0));
		model.addAttribute("dpdSector6", dpdSector6);

		ArrayList<DpdSector> dpdSector7 = new ArrayList<DpdSector>();
		dpdSector7.add(dpdSectorUtwise.get(1));
		model.addAttribute("dpdSector7", dpdSector7);

		ArrayList<DpdSector> dpdSector8 = new ArrayList<DpdSector>();
		dpdSector8.add(dpdSectorUtwise.get(2));
		model.addAttribute("dpdSector8", dpdSector8);

		ArrayList<DpdSector> dpdSector9 = new ArrayList<DpdSector>();
		dpdSector9.add(dpdSectorUtwise.get(3));
		model.addAttribute("dpdSector9", dpdSector9);

//		ArrayList<DpdSector> dpdSector10 = new ArrayList<DpdSector>();
//		dpdSector10.add(dpdSectorUtwise.get(3));
//		model.addAttribute("dpdSector10", dpdSector10);

		ArrayList<DpdSector> dpdSectorGrantot = icDao.listDpdSectorGrantot(rm.one);
		model.addAttribute("dpdSectorGrantot", dpdSectorGrantot);

		ArrayList<DpdSector> dpdSector11 = new ArrayList<DpdSector>();
		dpdSector11.add(dpdSectorGrantot.get(0));
		model.addAttribute("dpdSector11", dpdSector11);

		String aa = "Bulk Consumer";
		model.addAttribute("a", aa);
		//////////////// IC_ES_STAT_BILL_COLL_REC_DPDC
		int index2 = 0;
		for (int i = 0; i < billList.size(); i++) {
			if (billList.get(i).getBILL_CYCLE_CODE().equals(rm.one)) {
				index2 = i;
			}
		}
		model.addAttribute("billMonb", billList.get(index2).getBILL_CYCLE_DESC());
		ArrayList<IC_ES_STAT_BILL_COLL_REC_DPDC> bill_COLL_REC_DPDCs = icDao.listIC_ES_STAT_BILL_COLL_REC_DPDC(rm.one);
		model.addAttribute("bill_COLL_REC_DPDCs", bill_COLL_REC_DPDCs);

		///////// IC_ES_CAT_ACC_REC
		ArrayList<IC_ES_CAT_ACC_REC_ONE> acc_REC_ONEs = icDao.listIC_ES_CAT_ACC_REC(rm.one);
		model.addAttribute("acc_REC_ONEs", acc_REC_ONEs);
		ArrayList<IC_ES_CAT_ACC_REC_TWO> acc_REC_TWOs = icDao.listIC_ES_CAT_ACC_REC2(rm.one);
		model.addAttribute("acc_REC_TWOs", acc_REC_TWOs);
		////////////// IC_ES_CAT_NUM_OF_CONS
		ArrayList<IC_ES_CAT_NUM_OF_CONS_ONE> cons_ONEs = icDao.listIC_ES_CAT_NUM_OF_CONS(rm.one);
		model.addAttribute("cons_ONEs", cons_ONEs);
		ArrayList<IC_ES_CAT_NUM_OF_CONS_TWO> cons_TWOs = icDao.listIC_ES_CAT_NUM_OF_CONS2(rm.one);
		model.addAttribute("cons_TWOs", cons_TWOs);

		////////// IC_ES_CAT_SALE_ENERGY
		ArrayList<IC_ES_CAT_SALE_ENERGY_ONE> energy_ONEs = icDao.listIC_ES_CAT_SALE_ENERGY(rm.one);
		model.addAttribute("energy_ONEs", energy_ONEs);
		ArrayList<IC_ES_CAT_SALE_ENERGY_TWO> energy_TWOs = icDao.listIC_ES_CAT_SALE_ENERGY2(rm.one);
		model.addAttribute("energy_TWOs", energy_TWOs);

		//////// IC_ES_MON_PER_MAG_COURT
		ArrayList<IC_ES_MON_PER_MAG_COURT> courts = icDao.listIC_ES_MON_PER_MAG_COURT(rm.one);
		model.addAttribute("courts", courts);

		///////// IC_ES_CAT_BILL_ISSUE
		ArrayList<IC_ES_CAT_ACC_REC_K> acc_REC_ONEsc = i.listIC_ES_CAT_ACC_REC(rm.one);
		model.addAttribute("acc_REC_ONEsc", acc_REC_ONEsc);
		ArrayList<IC_ES_CAT_ACC_REC_KK> acc_REC_TWOsc = i.listIC_ES_CAT_ACC_REC2(rm.one);
		model.addAttribute("acc_REC_TWOsc", acc_REC_TWOsc);

		///////// IC_ES_CAT_BILL_AMT
		ArrayList<IC_ES_CAT_ACC_REC_K> acc_REC_ONEsa = i.listIC_ES_CAT_BILL_AMT(rm.one);
		model.addAttribute("acc_REC_ONEsa", acc_REC_ONEsa);
		ArrayList<IC_ES_CAT_ACC_REC_KK> acc_REC_TWOsa = i.listIC_ES_CAT_BILL_AMT2(rm.one);
		model.addAttribute("acc_REC_TWOsa", acc_REC_TWOsa);

		/////////// IC_ES_CAT_BILL_RATE
		ArrayList<IC_ES_CAT_ACC_REC_K> acc_REC_ONEsb = i.listIC_ES_CAT_BILL_RATE(rm.one);
		model.addAttribute("acc_REC_ONEsb", acc_REC_ONEsb);
		ArrayList<IC_ES_CAT_ACC_REC_KK> acc_REC_TWOsb = i.listIC_ES_CAT_BILL_RATE2(rm.one);
		model.addAttribute("acc_REC_TWOsb", acc_REC_TWOsb);

		//////////// IC_ES_ENRG_PUR_PAID_IPP
		ArrayList<EnergyPurAndPaidIpp> andPaidIppsa = icDao.IC_ES_ENRG_PUR_PAID_IPPa(rm.one);
		model.addAttribute("andPaidIppsa", andPaidIppsa);
		model.addAttribute("andPaidIppsaNa", andPaidIppsa.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppsaNb", andPaidIppsa.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppsaNc", andPaidIppsa.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppsaNd", andPaidIppsa.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppsaNe", andPaidIppsa.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppsaNf", andPaidIppsa.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppsaNg", andPaidIppsa.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppsaNh", andPaidIppsa.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppsaNi", andPaidIppsa.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppsaNj", andPaidIppsa.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppsaNk", andPaidIppsa.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppsb = icDao.IC_ES_ENRG_PUR_PAID_IPPb(rm.one);
		model.addAttribute("andPaidIppsb", andPaidIppsb);
		model.addAttribute("andPaidIppsbNa", andPaidIppsb.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppsbNb", andPaidIppsb.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppsbNc", andPaidIppsb.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppsbNd", andPaidIppsb.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppsbNe", andPaidIppsb.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppsbNf", andPaidIppsb.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppsbNg", andPaidIppsb.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppsbNh", andPaidIppsb.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppsbNi", andPaidIppsb.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppsbNj", andPaidIppsb.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppsbNk", andPaidIppsb.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppsc = icDao.IC_ES_ENRG_PUR_PAID_IPPc(rm.one);
		model.addAttribute("andPaidIppsc", andPaidIppsc);
		model.addAttribute("andPaidIppscNa", andPaidIppsc.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppscNb", andPaidIppsc.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppscNc", andPaidIppsc.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppscNd", andPaidIppsc.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppscNe", andPaidIppsc.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppscNf", andPaidIppsc.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppscNg", andPaidIppsc.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppscNh", andPaidIppsc.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppscNi", andPaidIppsc.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppscNj", andPaidIppsc.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppscNk", andPaidIppsc.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppsd = icDao.IC_ES_ENRG_PUR_PAID_IPPd(rm.one);
		model.addAttribute("andPaidIppsd", andPaidIppsd);
		model.addAttribute("andPaidIppsdNa", andPaidIppsd.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppsdNb", andPaidIppsd.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppsdNc", andPaidIppsd.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppsdNd", andPaidIppsd.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppsdNe", andPaidIppsd.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppsdNf", andPaidIppsd.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppsdNg", andPaidIppsd.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppsdNh", andPaidIppsd.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppsdNi", andPaidIppsd.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppsdNj", andPaidIppsd.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppsdNk", andPaidIppsd.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppse = icDao.IC_ES_ENRG_PUR_PAID_IPPe(rm.one);
		model.addAttribute("andPaidIppse", andPaidIppse);
		model.addAttribute("andPaidIppseNa", andPaidIppse.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppseNb", andPaidIppse.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppseNc", andPaidIppse.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppseNd", andPaidIppse.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppseNe", andPaidIppse.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppseNf", andPaidIppse.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppseNg", andPaidIppse.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppseNh", andPaidIppse.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppseNi", andPaidIppse.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppseNj", andPaidIppse.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppseNk", andPaidIppse.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppsf = icDao.IC_ES_ENRG_PUR_PAID_IPPf(rm.one);
		model.addAttribute("andPaidIppsf", andPaidIppsf);
		model.addAttribute("andPaidIppsfNa", andPaidIppsf.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppsfNb", andPaidIppsf.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppsfNc", andPaidIppsf.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppsfNd", andPaidIppsf.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppsfNe", andPaidIppsf.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppsfNf", andPaidIppsf.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppsfNg", andPaidIppsf.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppsfNh", andPaidIppsf.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppsfNi", andPaidIppsf.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppsfNj", andPaidIppsf.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppsfNk", andPaidIppsf.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppsg = icDao.IC_ES_ENRG_PUR_PAID_IPPg(rm.one);
		model.addAttribute("andPaidIppsg", andPaidIppsg);
		model.addAttribute("andPaidIppsgNa", andPaidIppsg.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppsgNb", andPaidIppsg.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppsgNc", andPaidIppsg.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppsgNd", andPaidIppsg.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppsgNe", andPaidIppsg.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppsgNf", andPaidIppsg.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppsgNg", andPaidIppsg.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppsgNh", andPaidIppsg.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppsgNi", andPaidIppsg.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppsgNj", andPaidIppsg.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppsgNk", andPaidIppsg.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppsh = icDao.IC_ES_ENRG_PUR_PAID_IPPh(rm.one);
		model.addAttribute("andPaidIppsh", andPaidIppsh);
		model.addAttribute("andPaidIppshNa", andPaidIppsh.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppshNb", andPaidIppsh.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppshNc", andPaidIppsh.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppshNd", andPaidIppsh.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppshNe", andPaidIppsh.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppshNf", andPaidIppsh.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppshNg", andPaidIppsh.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppshNh", andPaidIppsh.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppshNi", andPaidIppsh.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppshNj", andPaidIppsh.get(0).IPP_NAME10);

		////////////// IC_ES_ENRG_PUR_PAID_NEIG
		ArrayList<IC_ES_ENRG_PUR_PAID_NEIG> IC_ES_ENRG_PUR_PAID_NEIG = icDao.IC_ES_ENRG_PUR_PAID_NEIG(rm.one);
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIG", IC_ES_ENRG_PUR_PAID_NEIG);
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGa", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME1());
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGb", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME2());
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGc", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME3());
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGd", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME4());
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGe", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME5());
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGf", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME6());
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGg", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME7());

		///////////// IC_ES_STATE_DISC_OF_ILLE_USER
		ArrayList<Dpd_Illigal_Use> Dpd_State_Illigal_Use = i.IC_ES_ILLE_USER(rm.one);
		model.addAttribute("Dpd_State_Illigal_Use", Dpd_State_Illigal_Use);

		///////////// IC_ES_STATE_DISC_DFLT_CONS
		ArrayList<Dpd_Rc_Dc_St> Dpd_Dc_St = i.IC_DISC_OF_ILLE_USER(rm.one);
		model.addAttribute("Dpd_Dc_St", Dpd_Dc_St);

		////////// IC_ES_CAT_REV_COLL_NET
		ArrayList<IC_ES_CAT_REV_COLL_NET_ONE> coll_ONEs = icDao.listIC_ES_CAT_REV_COLL_NET(rm.one);
		model.addAttribute("coll_ONEs", coll_ONEs);
		ArrayList<IC_ES_CAT_REV_COLL_NET_TWO> coll_TWOs = icDao.listIC_ES_CAT_REV_COLL_NET2(rm.one);
		model.addAttribute("coll_TWOs", coll_TWOs);

		////////// IC_ES_STAT_BILL_COLL_REC_DESCO
		ArrayList<IC_ES_STAT_BILL_COLL_REC_DESCO> rec_desco = icDao.listIC_ES_STAT_BILL_COLL_REC_DESCO(rm.one);
		model.addAttribute("rec_desco", rec_desco);

		///////// IC_ES_STAT_BILL_COLL_REC_WZPDCL
		ArrayList<IC_ES_STAT_BILL_COLL_REC_WZPDCL> wzpdcl_desco = icDao.listIC_ES_STAT_BILL_COLL_REC_WZPDCL(rm.one);
		model.addAttribute("wzpdcl_desco", wzpdcl_desco);

		/////////// IC_ES_STAT_BILL_COLL_REC_NESCO
		ArrayList<IC_ES_STAT_BILL_COLL_REC_NESCO> nesco = icDao.listIC_ES_STAT_BILL_COLL_REC_NESCO(rm.one);
		model.addAttribute("nesco", nesco);

		//////////// IC_ES_FORWARDING
		try {
		String hdr20 = "";
		String hdr21 = "";
		String hdr22 = "";
		String hdr23 = "";
		String hdr24 = "";
		String hdr25 = "";
		String hdr26 = "";
		String hdr27 = "";
		String hdr28 = "";
		String hdr29 = "";
		String hdr30 = "";
		String hdr31 = "";
		String hdr32 = "";
		String hdr33 = "";
		String hdr34 = "";
		String hdr35 = "";

		String a = rm.getOne();

//	dpd_Curr_mon_net_gen_fuel_gr start

		Map<String, Object> result20 = getAllStatesJdbcCall600.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_Curr_mon_net_gen_fuel_gr")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//	System.out.println("result20"+"test");	
//	System.out.println(result20);	    	
		JSONObject json20 = new JSONObject(result20);
		String fjfhdj20 = json20.get("CUR_DATA").toString();
		JSONArray jsonArray20 = new JSONArray(fjfhdj20);
//    System.out.println(jsonArray1);	

		Map<String, Double> graphData20 = new TreeMap<>();
		for (int i = 0; i < jsonArray20.length(); i++) {
			JSONObject jsonData20 = jsonArray20.getJSONObject(i);

			hdr20 = jsonData20.optString("MONTH_YR");
			graphData20.put(jsonData20.optString("FUEL_NAME"), Double.valueOf(jsonData20.optString("NET_TOTAL")));
		}

//    System.out.println(hdr20);
//    System.out.println(graphData20+"graph");
		model.addAttribute("hdr20_graph", hdr20);
		model.addAttribute("chartData20", graphData20);

//	dpd_Curr_mon_net_gen_fuel_gr end

//	dpd_Curr_yr_ut_net_gen_fuel_gr start

		Map<String, Object> result21 = getAllStatesJdbcCall601.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_Curr_yr_ut_net_gen_fuel_gr")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//	System.out.println("result21"+"test");	
//	System.out.println(result21);	    	
		JSONObject json21 = new JSONObject(result21);
		String fjfhdj21 = json21.get("CUR_DATA").toString();
		JSONArray jsonArray21 = new JSONArray(fjfhdj21);
//    System.out.println(jsonArray1);	

		Map<String, Double> graphData21 = new TreeMap<>();
		for (int i = 0; i < jsonArray21.length(); i++) {
			JSONObject jsonData21 = jsonArray21.getJSONObject(i);

			hdr21 = jsonData21.optString("MONTH_YR");
			graphData21.put(jsonData21.optString("FUEL_NAME"), Double.valueOf(jsonData21.optString("NET_TOTAL")));
		}

//	System.out.println("result21 "+"test21");	
//	System.out.println(result21);	
		model.addAttribute("hdr21_graph", hdr21);
		model.addAttribute("chartData21", graphData21);

//	dpd_Curr_yr_ut_net_gen_fuel_gr end

//	dpd_prev_yr_net_gen_fuel_gr start

		Map<String, Object> result22 = getAllStatesJdbcCall602.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_prev_yr_net_gen_fuel_gr")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);

//	System.out.println("result22"+"test");	
//	System.out.println(result22);	
//	
		JSONObject json22 = new JSONObject(result22);
		String fjfhdj22 = json22.get("CUR_DATA").toString();
		JSONArray jsonArray22 = new JSONArray(fjfhdj22);
//    System.out.println(jsonArray1);	

		Map<String, Double> graphData22 = new TreeMap<>();
		for (int i = 0; i < jsonArray22.length(); i++) {
			JSONObject jsonData22 = jsonArray22.getJSONObject(i);

			hdr22 = jsonData22.optString("MONTH_YR");
			graphData22.put(jsonData22.optString("FUEL_NAME"), Double.valueOf(jsonData22.optString("NET_TOTAL")));
		}

//	System.out.println("result22 "+"test22");	
//	System.out.println(result22);	
		model.addAttribute("hdr22_graph", hdr22);
		model.addAttribute("chartData22", graphData22);

//	dpd_prev_yr_net_gen_fuel_gr end

//	dpd_Curr_mon_net_gen_ot_gr start

		Map<String, Object> result23 = getAllStatesJdbcCall603.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_Curr_mon_net_gen_ot_gr")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);

//	System.out.println("result23"+"test23");	
//	System.out.println(result23);	

		JSONObject json23 = new JSONObject(result23);
		String fjfhdj23 = json23.get("CUR_DATA").toString();
		JSONArray jsonArray23 = new JSONArray(fjfhdj23);
//    System.out.println(jsonArray1);	

		Map<String, Double> graphData23 = new TreeMap<>();
		for (int i = 0; i < jsonArray23.length(); i++) {
			JSONObject jsonData23 = jsonArray23.getJSONObject(i);

			hdr23 = jsonData23.optString("MONTH_YR");
			graphData23.put(jsonData23.optString("OWNER_TYPE"), Double.valueOf(jsonData23.optString("NET_TOTAL")));
		}

//	System.out.println("result23 "+"test23");	
//	System.out.println(result23);	
		model.addAttribute("hdr23_graph", hdr23);
		model.addAttribute("chartData23", graphData23);

//	dpd_Curr_mon_net_gen_ot_gr end

//	dpd_Curr_yr_ut_net_gen_ot_gr start

		Map<String, Object> result24 = getAllStatesJdbcCall604.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_Curr_yr_ut_net_gen_ot_gr")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//	
//	System.out.println("result24"+"test24");	
//	System.out.println(result24);	
//	
		JSONObject json24 = new JSONObject(result24);
		String fjfhdj24 = json24.get("CUR_DATA").toString();
		JSONArray jsonArray24 = new JSONArray(fjfhdj24);
//    System.out.println(jsonArray1);	

		Map<String, Double> graphData24 = new TreeMap<>();
		for (int i = 0; i < jsonArray24.length(); i++) {
			JSONObject jsonData24 = jsonArray24.getJSONObject(i);

			hdr24 = jsonData24.optString("MONTH_YR");
			graphData24.put(jsonData24.optString("OWNER_TYPE"), Double.valueOf(jsonData24.optString("NET_TOTAL")));
		}

//	System.out.println("result23 "+"test23");	
//	System.out.println(result23);	
		model.addAttribute("hdr24_graph", hdr24);
		model.addAttribute("chartData24", graphData24);

//	dpd_Curr_yr_ut_net_gen_ot_gr end

//	dpd_yr_month_sales_coll  (2019-2020)start

		Map<String, Object> result25 = getAllStatesJdbcCall605.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_yr_month_sales_coll")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//	
		System.out.println("result25" + "test25");
		System.out.println(result25);
//	
		JSONObject json25 = new JSONObject(result25);
		String fjfhdj25 = json25.get("CUR_DATA").toString();
		JSONArray jsonArray25 = new JSONArray(fjfhdj25);
//    System.out.println(jsonArray25);	

		Map<String, Double> graphData25 = new TreeMap<>();
		for (int i = 0; i < jsonArray25.length(); i++) {
			JSONObject jsonData25 = jsonArray25.getJSONObject(i);

			hdr25 = jsonData25.optString("TP");
			graphData25.put(jsonData25.optString("UC_TYPE"), Double.valueOf(!jsonData25.optString("PREV_YR_CB").equals("")?jsonData25.optString("PREV_YR_CB"):"0.0"));
		}

//    
//	System.out.println("result25 "+"data25");	
//	System.out.println(result25);	
		model.addAttribute("hdr25_graph", hdr25);
		model.addAttribute("chartData25", graphData25);
//	

//	dpd_yr_month_sales_coll (2019-2020) end

//	dpd_yr_month_sales_coll (2020-2021 upto) start
//	
		Map<String, Object> result26 = getAllStatesJdbcCall606.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_yr_month_sales_coll")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//	
//	System.out.println("result26"+"test26");	
//	System.out.println(result26);	
//	
		JSONObject json26 = new JSONObject(result26);
		String fjfhdj26 = json26.get("CUR_DATA").toString();
		JSONArray jsonArray26 = new JSONArray(fjfhdj26);
//    System.out.println(jsonArray26);	

		Map<String, Double> graphData26 = new TreeMap<>();
		for (int i = 0; i < jsonArray26.length(); i++) {
			JSONObject jsonData26 = jsonArray26.getJSONObject(i);

			hdr26 = jsonData26.optString("TP");
			graphData26.put(jsonData26.optString("UC_TYPE"),
					Double.valueOf(!jsonData26.optString("CURR_YR_UPTO_CB").equals("")?jsonData26.optString("CURR_YR_UPTO_CB"):"0.0"));
		}

//	System.out.println("result26 "+"data26");	
//	System.out.println(result26);	
		model.addAttribute("hdr26_graph", hdr26);
		model.addAttribute("chartData26", graphData26);
//	
//	
//	
//	
//	
////	dpd_yr_month_sales_coll (2020-2021 upto) end
//	
//	
//	
//	
//	
////	dpd_yr_month_sales_coll (2020-2021 sept 20) start
//	
		Map<String, Object> result27 = getAllStatesJdbcCall607.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_yr_month_sales_coll")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//	
//	System.out.println("result26"+"test26");	
//	System.out.println(result26);	
//	
		JSONObject json27 = new JSONObject(result27);
		String fjfhdj27 = json27.get("CUR_DATA").toString();
		JSONArray jsonArray27 = new JSONArray(fjfhdj27);
//    System.out.println(jsonArray26);	

		Map<String, Double> graphData27 = new TreeMap<>();
		for (int i = 0; i < jsonArray27.length(); i++) {
			JSONObject jsonData27 = jsonArray27.getJSONObject(i);

			hdr27 = jsonData27.optString("TP");
			graphData27.put(jsonData27.optString("UC_TYPE"),
			Double.valueOf(!jsonData27.optString("CURR_MONTH_CB").equals("")?jsonData27.optString("CURR_MONTH_CB"):"0.0"));
		}

//	System.out.println("result27 "+"data27");	
//	System.out.println(result27);	
		model.addAttribute("hdr27_graph", hdr27);
		model.addAttribute("chartData27", graphData27);
//	
//	
//	

//	dpd_yr_month_sales_coll (2020-2021 sept 20) end

//	dpd_yr_month_sales_coll (2020-2021 FY:2019-20) start

		Map<String, Object> result28 = getAllStatesJdbcCall608.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_yr_month_sales")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//	
//	System.out.println("result26"+"test26");	
//	System.out.println(result26);	
//	
		JSONObject json28 = new JSONObject(result28);
		String fjfhdj28 = json28.get("CUR_DATA").toString();
		JSONArray jsonArray28 = new JSONArray(fjfhdj28);
//    System.out.println(jsonArray26);	

		Map<String, Double> graphData28 = new TreeMap<>();
		for (int i = 0; i < jsonArray28.length(); i++) {
			JSONObject jsonData28 = jsonArray28.getJSONObject(i);

			hdr28 = jsonData28.optString("TP");
			graphData28.put(jsonData28.optString("UC_TYPE"), Double.valueOf(!jsonData28.optString("PREV_YR_SALES").equals("")?jsonData28.optString("PREV_YR_SALES"):"0.0"));
		}

//	System.out.println("result27 "+"data27");	
//	System.out.println(result27);	
		model.addAttribute("hdr28_graph", hdr28);
		model.addAttribute("chartData28", graphData28);
//	

//	dpd_yr_month_sales_coll (2020-2021  FY:2019-20 ) end

//	dpd_yr_month_sales_coll (2020-2021  FY:2020-21 ) start

		Map<String, Object> result29 = getAllStatesJdbcCall609.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_yr_month_sales")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//	
//	System.out.println("result26"+"test26");	
//	System.out.println(result26);	
//	
		JSONObject json29 = new JSONObject(result29);
		String fjfhdj29 = json29.get("CUR_DATA").toString();
		JSONArray jsonArray29 = new JSONArray(fjfhdj29);
//    System.out.println(jsonArray26);	

		Map<String, Double> graphData29 = new TreeMap<>();
		for (int i = 0; i < jsonArray29.length(); i++) {
			JSONObject jsonData29 = jsonArray29.getJSONObject(i);

			hdr29 = jsonData29.optString("TP");
			graphData29.put(jsonData29.optString("UC_TYPE"),
					Double.valueOf(!jsonData29.optString("CURR_YR_UPTO_SALES").equals("")?jsonData29.optString("CURR_YR_UPTO_SALES"):"0.0"));
		}

//	System.out.println("result27 "+"data27");	
//	System.out.println(result27);	
		model.addAttribute("hdr29_graph", hdr29);
		model.addAttribute("chartData29", graphData29);

//	dpd_yr_month_sales_coll (2020-2021  FY:2020-21 ) end

//	dpd_yr_month_sales_coll (2020-2021 FY:2019-20) start

		Map<String, Object> result30 = getAllStatesJdbcCall610.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_yr_month_sales")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//	
//	System.out.println("result26"+"test26");	
//	System.out.println(result26);	
//	
		JSONObject json30 = new JSONObject(result30);
		String fjfhdj30 = json30.get("CUR_DATA").toString();
		JSONArray jsonArray30 = new JSONArray(fjfhdj30);
//    System.out.println(jsonArray26);	

		Map<String, Double> graphData30 = new TreeMap<>();
		for (int i = 0; i < jsonArray30.length(); i++) {
			JSONObject jsonData30 = jsonArray30.getJSONObject(i);

			hdr30 = jsonData30.optString("TP");
			graphData30.put(jsonData30.optString("UC_TYPE"),
					Double.valueOf(!jsonData30.optString("CURR_MONTH_SALES").equals("")?jsonData30.optString("CURR_MONTH_SALES"):"0.0"));
		}

//	System.out.println("result27 "+"data27");	
//	System.out.println(result27);	
		model.addAttribute("hdr30_graph", hdr30);
		model.addAttribute("chartData30", graphData30);

//	dpd_yr_month_sales_coll (2020-2021  FY:2019-20 ) end

//		dpd_perf_bpdb_dist_graph_yr (sys loss) start

		Map<String, Object> result31 = getAllStatesJdbcCall611.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_perf_bpdb_dist_graph_yr")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//	
//	System.out.println("result26"+"test26");	
//	System.out.println(result26);	
//	
		JSONObject json31 = new JSONObject(result31);
		String fjfhdj31 = json31.get("CUR_DATA").toString();
		JSONArray jsonArray31 = new JSONArray(fjfhdj31);
//    System.out.println(jsonArray26);	

		Map<String, Double> graphData31 = new TreeMap<>();
		for (int i = 0; i < jsonArray31.length(); i++) {
			JSONObject jsonData31 = jsonArray31.getJSONObject(i);

			hdr31 = jsonData31.optString("YEAR_CODE");
			graphData31.put(jsonData31.optString("YEAR_CODE"),
					Double.valueOf(!jsonData31.optString("DIST_SYS_LOSS").equals("")?jsonData31.optString("DIST_SYS_LOSS"):"0.0"));
		}

//	System.out.println("result27 "+"data27");	
//	System.out.println(result27);	
		model.addAttribute("hdr31_graph", hdr31);
		model.addAttribute("chartData31", graphData31);

//	dpd_perf_bpdb_dist_graph_yr (sys loss) end

//	dpd_perf_bpdb_dist_graph_yr (CI_RATIO ) start

		Map<String, Object> result32 = getAllStatesJdbcCall612.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_perf_bpdb_dist_graph_yr")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//
//System.out.println("result26"+"test26");	
//System.out.println(result26);	
//
		JSONObject json32 = new JSONObject(result32);
		String fjfhdj32 = json32.get("CUR_DATA").toString();
		JSONArray jsonArray32 = new JSONArray(fjfhdj32);
//System.out.println(jsonArray26);	

		Map<String, Double> graphData32 = new TreeMap<>();
		for (int i = 0; i < jsonArray32.length(); i++) {
			JSONObject jsonData32 = jsonArray32.getJSONObject(i);

			hdr32 = jsonData32.optString("YEAR_CODE");
			graphData32.put(jsonData32.optString("YEAR_CODE"), Double.valueOf(!jsonData32.optString("CI_RATIO").equals("")?jsonData32.optString("CI_RATIO"):"0.0"));
		}

//System.out.println("result27 "+"data27");	
//System.out.println(result27);	
		model.addAttribute("hdr32_graph", hdr32);
		model.addAttribute("chartData32", graphData32);

//dpd_perf_bpdb_dist_graph_yr (CI_RATIO ) end
		
//		dpd_perf_trans_loss_graph_yr start

			Map<String, Object> result17 = getAllStatesJdbcCall617.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_perf_trans_loss_graph_yr")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//	
//	System.out.println("result26"+"test26");	
//	System.out.println(result26);	
//	
			JSONObject json17 = new JSONObject(result17);
			String fjfhdj17 = json17.get("CUR_DATA").toString();
			JSONArray jsonArray17 = new JSONArray(fjfhdj17);
//   System.out.println(jsonArray26);	

			Map<String, Double> graphData17 = new TreeMap<>();
			for (int i = 0; i < jsonArray17.length(); i++) {
				JSONObject jsonData17 = jsonArray17.getJSONObject(i);

				String ept=jsonData17.optString("TRANS_LOSS_PER");
				if(ept.equals("")) {
					ept="0.0";
				}
				graphData17.put(jsonData17.optString("YEAR_CODE"), Double.valueOf(ept));
			}

//	System.out.println("result27 "+"data27");	
//	System.out.println(result27);	
			//model.addAttribute("hdr17_graph", hdr17);
			model.addAttribute("chartData17", graphData17);

//	dpd_perf_trans_loss_graph_yr end

//dpd_perf_trans_loss_graph_yr  start

		Map<String, Object> result33 = getAllStatesJdbcCall613.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_perf_trans_loss_graph_yr")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//
//System.out.println("result26"+"test26");	
//System.out.println(result26);	
//
		JSONObject json33 = new JSONObject(result33);
		String fjfhdj33 = json33.get("CUR_DATA").toString();
		JSONArray jsonArray33 = new JSONArray(fjfhdj33);
//System.out.println(jsonArray26);	

		Map<String, Double> graphData33 = new TreeMap<>();
		for (int i = 0; i < jsonArray33.length(); i++) {
			JSONObject jsonData33 = jsonArray33.getJSONObject(i);

			hdr33 = jsonData33.optString("YEAR_CODE");
			graphData33.put(jsonData33.optString("YEAR_CODE"), jsonData33.optDouble("TRANS_LOSS_PER"));
		}

//System.out.println("result27 "+"data27");	
//System.out.println(result27);	
		model.addAttribute("hdr33_graph", hdr33);
		model.addAttribute("chartData33", graphData33);

//dpd_perf_trans_loss_graph_yr  end

//dpd_perf_bpdb_dist_graph_mon (1ST GRAPH ) start

		Map<String, Object> result34 = getAllStatesJdbcCall614.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_perf_bpdb_dist_graph_mon")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//
//System.out.println("result26"+"test26");	
//System.out.println(result26);	
//
		JSONObject json34 = new JSONObject(result34);
		String fjfhdj34 = json34.get("CUR_DATA").toString();
		JSONArray jsonArray34 = new JSONArray(fjfhdj34);
//System.out.println(jsonArray26);	

		Map<String, Double> graphData34 = new TreeMap<>();
		for (int i = 0; i < jsonArray34.length(); i++) {
			JSONObject jsonData34 = jsonArray34.getJSONObject(i);

			hdr34 = jsonData34.optString("MONTH_DESC");
			graphData34.put(jsonData34.optString("MONTH_DESC"),
					Double.valueOf(!jsonData34.optString("DIST_SYS_LOSS").equals("")?jsonData34.optString("DIST_SYS_LOSS"):"0.0"));
		}

//System.out.println("result34 "+"data34");	
//System.out.println(result34);	
		model.addAttribute("hdr34_graph", hdr34);
		model.addAttribute("chartData34", graphData34);

//dpd_perf_bpdb_dist_graph_mon (1ST GRAPH ) end

//dpd_perf_bpdb_dist_graph_mon (2nd GRAPH ) start

		Map<String, Object> result35 = getAllStatesJdbcCall615.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_perf_bpdb_dist_graph_mon")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(MainControllerIC.officeCode, a);
//
//System.out.println("result26"+"test26");	
//System.out.println(result26);	
//
		JSONObject json35 = new JSONObject(result35);
		String fjfhdj35 = json35.get("CUR_DATA").toString();
		JSONArray jsonArray35 = new JSONArray(fjfhdj35);
//System.out.println(jsonArray26);	

		Map<String, Double> graphData35 = new TreeMap<>();
		for (int i = 0; i < jsonArray35.length(); i++) {
			JSONObject jsonData35 = jsonArray35.getJSONObject(i);

			hdr35 = jsonData35.optString("MONTH_DESC");
			graphData35.put(jsonData35.optString("MONTH_DESC"), Double.valueOf(!jsonData35.optString("CI_RATIO").equals("")?jsonData35.optString("CI_RATIO"):"0.0"));
		}

//
//System.out.println("result35 "+"data35");	
//System.out.println(result35);	
		model.addAttribute("hdr35_graph", hdr35);
		model.addAttribute("chartData35", graphData35);

//dpd_perf_bpdb_dist_graph_mon (2nd GRAPH ) end		

		ArrayList<IC_ES_FORWARDING> iC_ES_FORWARDING = iconvDaoRafi
				.listIC_ES_FORWARDING(MainControllerIC.officeCode, a);
		model.addAttribute("iC_ES_FORWARDING", iC_ES_FORWARDING);

		ArrayList<IC_ES_FORWARDING1_1> IC_ES_FORWARDING1_1 = iconvDaoRafi
				.listIC_ES_FORWARDING1_1(MainControllerIC.officeCode, a);
		model.addAttribute("IC_ES_FORWARDING", IC_ES_FORWARDING1_1);

		ArrayList<IC_ES_FORWARDING1_3> IC_ES_FORWARDING1_3 = iconvDaoRafi
				.listIC_ES_FORWARDING1_3(MainControllerIC.officeCode, a);
		model.addAttribute("IC_ES_FORWARDING1", IC_ES_FORWARDING1_3);

		ArrayList<IC_ES_FORWARDING2_1> IC_ES_FORWARDING2_1 = iconvDaoRafi
				.listIC_ES_FORWARDING2_1(MainControllerIC.officeCode, a);
		model.addAttribute("IC_ES_FORWARDING2", IC_ES_FORWARDING2_1);

		ArrayList<IC_ES_FORWARDING3_1> IC_ES_FORWARDING3_1 = iconvDaoRafi
				.listIC_ES_FORWARDING3_1(MainControllerIC.officeCode, a);
		model.addAttribute("IC_ES_FORWARDING3", IC_ES_FORWARDING3_1);

		ArrayList<IC_ES_FORWARDING3_1_1> IC_ES_FORWARDING3_1_1 = iconvDaoRafi
				.listIC_ES_FORWARDING3_1_1(MainControllerIC.officeCode, a);
		model.addAttribute("IC_ES_FORWARDING4", IC_ES_FORWARDING3_1_1);

		ArrayList<IC_ES_FORWARDING2_2> IC_ES_FORWARDING2_2 = iconvDaoRafi
				.listIC_ES_FORWARDING2_2(MainControllerIC.officeCode, a);
		model.addAttribute("IC_ES_FORWARDING5", IC_ES_FORWARDING2_2);

		ArrayList<IC_ES_FORWARDING4_1> IC_ES_FORWARDING4_1 = iconvDaoRafi
				.listIC_ES_FORWARDING4_1(MainControllerIC.officeCode, a);
		model.addAttribute("IC_ES_FORWARDING6", IC_ES_FORWARDING4_1);
		}catch (Exception e) {
			e.printStackTrace();
		}
		//// Menu
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);

		return "IC_ES_IND_ALL";
	}

	@GetMapping("/IC_ES_YR_MON_GEN_SALES_LOSS")
	public String IC_ES_YR_MON_GEN_SALES_LOSS(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_YR_MON_GEN_SALES_LOSS";
	}

	@PostMapping("/IC_ES_YR_MON_GEN_SALES_LOSS")
	public String IC_ES_YR_MON_GEN(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		ArrayList<Dpd_Year> Dpd_Year_gen = i.Dpd_Year_Gen_sale(rm.one);
		model.addAttribute("Dpd_Year_gen", Dpd_Year_gen);
		if (Dpd_Year_gen.isEmpty()) {
			model.addAttribute("Year_gen", "");
		} else {
			model.addAttribute("Year_gen", Dpd_Year_gen.get(0).getpYEAR_CODE());
		}

		ArrayList<Dpd_Month> Dpd_Month_gen = i.Dpd_Month_Gen_sale(rm.one);
		model.addAttribute("Dpd_Month_gen", Dpd_Month_gen);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);

		model.addAttribute("reportModel", reportModel);
		return "IC_ES_YR_MON_GEN_SALES_LOSS";
	}

	@GetMapping("/IC_ES_YR_MON_SALES_UT_AND_TRANS_LOSS")
	public String IC_ES_YR_MON_SALES_UT_AND_TRANS_LOSS(Model model) {
		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);
//
//		ArrayList<IC_PERIOD_MST1> billList = i.d(officeCode);
//		model.addAttribute("billList", billList);

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.mm(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		return "IC_ES_YR_MON_SALES_UT_AND_TRANS_LOSS";
	}

	@PostMapping("/IC_ES_YR_MON_SALES_UT_AND_TRANS_LOSS")
	public String IC_ES_YR_MON_SALES_UT_AND_TRANS_LOSS_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.mm(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		ArrayList<DPD_MON_SALE_LOSS_MODEL> dPD_MON_SALE_LOSS_MODEL = i.IC_ES_YR_MON_SALES_two(rm.two);
		model.addAttribute("dPD_MON_SALE_LOSS_MODEL", dPD_MON_SALE_LOSS_MODEL);

		ArrayList<DPD_MON_SALE_LOSS_MODEL> dPD_MON_SALE_LOSS_MODEL2 = i.IC_ES_YR_MON_SALES_one(rm.two);
		model.addAttribute("dPD_MON_SALE_LOSS_MODEL2", dPD_MON_SALE_LOSS_MODEL2);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		return "IC_ES_YR_MON_SALES_UT_AND_TRANS_LOSS";
	}

	@GetMapping("/IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON")
	public String IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON";
	}

	@PostMapping("/IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON")
	public String IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		int index = 0;
		for (int i = 0; i < billList.size(); i++) {
			if (billList.get(i).getBILL_CYCLE_CODE().equals(rm.two)) {
				index = i;
			}
		}
		model.addAttribute("month", billList.get(index).getBILL_CYCLE_DESC());

		ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> c_COM_OPR_STAT_BPDB_CR_MONs = i
				.listIC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON(MainControllerIC.officeCode, rm.two);
		model.addAttribute("c_COM_OPR_STAT_BPDB_CR_MONs", c_COM_OPR_STAT_BPDB_CR_MONs);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON";
	}

	@GetMapping("/IC_ES_Z_C_COM_OPR_STAT_BPDB_FY")
	public String IC_ES_Z_C_COM_OPR_STAT_BPDB_FY(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_Z_C_COM_OPR_STAT_BPDB_FY";
	}

	@PostMapping("/IC_ES_Z_C_COM_OPR_STAT_BPDB_FY")
	public String IC_ES_Z_C_COM_OPR_STAT_BPDB_FY_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		int index = 0;
		for (int i = 0; i < billList.size(); i++) {
			if (billList.get(i).getBILL_CYCLE_CODE().equals(rm.two)) {
				index = i;
			}
		}
		model.addAttribute("month", billList.get(index).getBILL_CYCLE_DESC());

		ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> c_COM_OPR_STAT_BPDB_CR_MONs = i
				.listIC_ES_Z_C_COM_OPR_STAT_BPDB_FY(MainControllerIC.officeCode, rm.two);
		model.addAttribute("c_COM_OPR_STAT_BPDB_CR_MONs", c_COM_OPR_STAT_BPDB_CR_MONs);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_Z_C_COM_OPR_STAT_BPDB_FY";
	}

	@GetMapping("/IC_ES_PP_GEN")
	public String IC_ES_PP_GEN(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		return "IC_ES_PP_GEN";
	}

	@PostMapping("/IC_ES_PP_GEN")
	public String IC_PP_GEN(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		ArrayList<Dpd_pp_wise_gen> Dpd_pp_gen = i.IC_ES_GEN(rm.one);
		model.addAttribute("Dpd_pp_gen", Dpd_pp_gen);
		if (!Dpd_pp_gen.isEmpty()) {
			model.addAttribute("cmonth", Dpd_pp_gen.get(0).getCURR_MONTH());
			model.addAttribute("umonth", Dpd_pp_gen.get(0).getUPTO_MONTH());
		}

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_PP_GEN";
	}

	@GetMapping("/IC_ES_COM_OPR_STAT_REB")
	public String IC_ES_COM_OPR_STAT_REB(Model model) {
		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		if (MainControllerIC.dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		return "IC_ES_COM_OPR_STAT_REB";
	}

	@PostMapping("/IC_ES_COM_OPR_STAT_REB")
	public String IC_ES_COM_OPR_STAT_REB_one(ReportModel rm, Model model) {

		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);

		ArrayList<Month_Dropdown> billList = i.months(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		int index = 0;
		for (int i = 0; i < billList.size(); i++) {
			if (billList.get(i).getBILL_CYCLE_CODE().equals(rm.one)) {
				index = i;
			}
		}
		model.addAttribute("billMon", billList.get(index).getBILL_CYCLE_DESC());
		model.addAttribute("billMon1", billList.get(index+1).getBILL_CYCLE_DESC());

		ArrayList<DpdBrebStatementDetail> dpdBrebStatementDetail = i.listIC_ES_COM_OPR_STAT_REB(rm.one);
		model.addAttribute("dpdBrebStatementDetail", dpdBrebStatementDetail);

		ArrayList<BrebStatementSummary> brebStatementSummary = i.listIC_ES_COM_OPR_STAT_REB_two(rm.one);
		model.addAttribute("brebStatementSummary", brebStatementSummary);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		return "IC_ES_COM_OPR_STAT_REB";
	}

	@GetMapping("/IC_ES_SECT_ACC_REC_SUM")
	public String IC_ES_SECT_ACC_REC_SUM(Model model) {

		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		return "IC_ES_SECT_ACC_REC_SUM";
	}

	@PostMapping("/IC_ES_SECT_ACC_REC_SUM")
	public String IC_ES_SECT_ACC_REC_SUM_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		ArrayList<Month> month = icDao.listMONTH(rm.one);
		model.addAttribute("month", month);

		ArrayList<DpdSector> dpdSector = icDao.listDpdSectors(rm.one);
		model.addAttribute("dpdSector", dpdSector);

		ArrayList<DpdSector> dpdSector1 = new ArrayList<DpdSector>();
		dpdSector1.add(dpdSector.get(0));
		model.addAttribute("dpdSector1", dpdSector1);

		ArrayList<DpdSector> dpdSector2 = new ArrayList<DpdSector>();
		dpdSector2.add(dpdSector.get(1));
		model.addAttribute("dpdSector2", dpdSector2);

		ArrayList<DpdSector> dpdSector3 = new ArrayList<DpdSector>();
		dpdSector3.add(dpdSector.get(2));
		model.addAttribute("dpdSector3", dpdSector3);

		ArrayList<DpdSector> dpdSector4 = new ArrayList<DpdSector>();
		dpdSector4.add(dpdSector.get(3));
		model.addAttribute("dpdSector4", dpdSector4);

		ArrayList<DpdSector> dpdSectorwise = icDao.listDpdSectorwise(rm.one);
		model.addAttribute("dpdSectorwise", dpdSectorwise);

		System.out.println("jhhg");
		System.out.println(dpdSectorwise);

		ArrayList<DpdSector> dpdSector5 = new ArrayList<DpdSector>();
		dpdSector5.add(dpdSectorwise.get(0));
		model.addAttribute("dpdSector5", dpdSector5);

		ArrayList<DpdSector> dpdSectorUtwise = icDao.listDpdSectorUt(rm.one);
		model.addAttribute("dpdSectorUtwise", dpdSectorUtwise);

		ArrayList<DpdSector> dpdSector6 = new ArrayList<DpdSector>();
		dpdSector6.add(dpdSectorUtwise.get(0));
		model.addAttribute("dpdSector6", dpdSector6);

		ArrayList<DpdSector> dpdSector7 = new ArrayList<DpdSector>();
		dpdSector7.add(dpdSectorUtwise.get(1));
		model.addAttribute("dpdSector7", dpdSector7);

		ArrayList<DpdSector> dpdSector8 = new ArrayList<DpdSector>();
		dpdSector8.add(dpdSectorUtwise.get(2));
		model.addAttribute("dpdSector8", dpdSector8);

		ArrayList<DpdSector> dpdSector9 = new ArrayList<DpdSector>();
		dpdSector9.add(dpdSectorUtwise.get(3));
		model.addAttribute("dpdSector9", dpdSector9);

//		ArrayList<DpdSector> dpdSector10 = new ArrayList<DpdSector>();
//		dpdSector10.add(dpdSectorUtwise.get(3));
//		model.addAttribute("dpdSector10", dpdSector10);

		ArrayList<DpdSector> dpdSectorGrantot = icDao.listDpdSectorGrantot(rm.one);
		model.addAttribute("dpdSectorGrantot", dpdSectorGrantot);

		ArrayList<DpdSector> dpdSector11 = new ArrayList<DpdSector>();
		dpdSector11.add(dpdSectorGrantot.get(0));
		model.addAttribute("dpdSector11", dpdSector11);

		String a = "Bulk Consumer";
		model.addAttribute("a", a);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_SECT_ACC_REC_SUM";
	}

	@GetMapping("/IC_ES_STAT_BILL_COLL_REC_DPDC")
	public String IC_ES_STAT_BILL_COLL_REC_DPDC(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_STAT_BILL_COLL_REC_DPDC";
	}

	@PostMapping("/IC_ES_STAT_BILL_COLL_REC_DPDC")
	public String IC_ES_STAT_BILL_COLL_REC_DPDC_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		int index = 0;
		for (int i = 0; i < billList.size(); i++) {
			if (billList.get(i).getBILL_CYCLE_CODE().equals(rm.one)) {
				index = i;
			}
		}
		model.addAttribute("billMon", billList.get(index).getBILL_CYCLE_DESC());
		ArrayList<IC_ES_STAT_BILL_COLL_REC_DPDC> bill_COLL_REC_DPDCs = icDao.listIC_ES_STAT_BILL_COLL_REC_DPDC(rm.one);
		model.addAttribute("bill_COLL_REC_DPDCs", bill_COLL_REC_DPDCs);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_STAT_BILL_COLL_REC_DPDC";
	}

	@GetMapping("/IC_ES_CAT_ACC_REC")
	public String IC_ES_CAT_ACC_REC(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_CAT_ACC_REC";
	}

	@PostMapping("/IC_ES_CAT_ACC_REC")
	public String IC_ES_CAT_ACC_REC_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ES_CAT_ACC_REC_ONE> acc_REC_ONEs = icDao.listIC_ES_CAT_ACC_REC(rm.one);
		model.addAttribute("acc_REC_ONEs", acc_REC_ONEs);
		ArrayList<IC_ES_CAT_ACC_REC_TWO> acc_REC_TWOs = icDao.listIC_ES_CAT_ACC_REC2(rm.one);
		model.addAttribute("acc_REC_TWOs", acc_REC_TWOs);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_CAT_ACC_REC";
	}

	@GetMapping("/IC_ES_CAT_NUM_OF_CONS")
	public String IC_ES_CAT_NUM_OF_CONS(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_CAT_NUM_OF_CONS";
	}

	@PostMapping("/IC_ES_CAT_NUM_OF_CONS")
	public String IC_ES_CAT_NUM_OF_CONS_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ES_CAT_NUM_OF_CONS_ONE> cons_ONEs = icDao.listIC_ES_CAT_NUM_OF_CONS(rm.one);
		model.addAttribute("cons_ONEs", cons_ONEs);
		ArrayList<IC_ES_CAT_NUM_OF_CONS_TWO> cons_TWOs = icDao.listIC_ES_CAT_NUM_OF_CONS2(rm.one);
		model.addAttribute("cons_TWOs", cons_TWOs);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_CAT_NUM_OF_CONS";
	}

	/////////////
	@GetMapping("/IC_ES_CAT_SALE_ENERGY")
	public String IC_ES_CAT_SALE_ENERGY(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_CAT_SALE_ENERGY";
	}

	@PostMapping("/IC_ES_CAT_SALE_ENERGY")
	public String IC_ES_CAT_SALE_ENERGY_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ES_CAT_SALE_ENERGY_ONE> energy_ONEs = icDao.listIC_ES_CAT_SALE_ENERGY(rm.one);
		model.addAttribute("energy_ONEs", energy_ONEs);
		ArrayList<IC_ES_CAT_SALE_ENERGY_TWO> energy_TWOs = icDao.listIC_ES_CAT_SALE_ENERGY2(rm.one);
		model.addAttribute("energy_TWOs", energy_TWOs);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_CAT_SALE_ENERGY";
	}

	@GetMapping("/IC_ES_MON_PER_MAG_COURT")
	public String IC_ES_MON_PER_MAG_COURT(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_MON_PER_MAG_COURT";
	}

	@PostMapping("/IC_ES_MON_PER_MAG_COURT")
	public String IC_ES_MON_PER_MAG_COURT_o(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		ArrayList<IC_ES_MON_PER_MAG_COURT> courts = icDao.listIC_ES_MON_PER_MAG_COURT(rm.two);
		model.addAttribute("courts", courts);
		return "IC_ES_MON_PER_MAG_COURT";
	}

	@GetMapping("/IC_ES_CAT_BILL_ISSUE")
	public String IC_ES_CAT_BILL_ISSUE(Model model) {
		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);

		ArrayList<Month_Dropdown> billList = i.months(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);

		return "IC_ES_CAT_BILL_ISSUE";
	}

	@PostMapping("/IC_ES_CAT_BILL_ISSUE")
	public String IC_ES_CAT_BILL_ISSUE_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);

		ArrayList<Month_Dropdown> billList = i.months(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		ArrayList<IC_ES_CAT_ACC_REC_K> acc_REC_ONEs = i.listIC_ES_CAT_ACC_REC(rm.one);
		model.addAttribute("acc_REC_ONEs", acc_REC_ONEs);
		ArrayList<IC_ES_CAT_ACC_REC_KK> acc_REC_TWOs = i.listIC_ES_CAT_ACC_REC2(rm.one);
		model.addAttribute("acc_REC_TWOs", acc_REC_TWOs);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		return "IC_ES_CAT_BILL_ISSUE";
	}

	@GetMapping("/IC_ES_CAT_BILL_AMT")
	public String IC_ES_CAT_BILL_AMT(Model model) {
		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);

		ArrayList<Month_Dropdown> billList = i.months(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);

		return "IC_ES_CAT_BILL_AMT";
	}

	@PostMapping("/IC_ES_CAT_BILL_AMT")
	public String IC_ES_CAT_BILL_AMT_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);

		ArrayList<Month_Dropdown> billList = i.months(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		ArrayList<IC_ES_CAT_ACC_REC_K> acc_REC_ONEs = i.listIC_ES_CAT_BILL_AMT(rm.one);
		model.addAttribute("acc_REC_ONEs", acc_REC_ONEs);
		ArrayList<IC_ES_CAT_ACC_REC_KK> acc_REC_TWOs = i.listIC_ES_CAT_BILL_AMT2(rm.one);
		model.addAttribute("acc_REC_TWOs", acc_REC_TWOs);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		return "IC_ES_CAT_BILL_AMT";
	}

	@GetMapping("/IC_ES_CAT_BILL_RATE")
	public String IC_ES_CAT_BILL_RATE(Model model) {

		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);

		ArrayList<Month_Dropdown> billList = i.months(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);

		return "IC_ES_CAT_BILL_RATE";
	}

	@PostMapping("/IC_ES_CAT_BILL_RATE")
	public String IC_ES_CAT_BILL_RATE_one(ReportModel rm, Model model) {

		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);

		ArrayList<Month_Dropdown> billList = i.months(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		ArrayList<IC_ES_CAT_ACC_REC_K> acc_REC_ONEs = i.listIC_ES_CAT_BILL_RATE(rm.one);
		model.addAttribute("acc_REC_ONEs", acc_REC_ONEs);
		ArrayList<IC_ES_CAT_ACC_REC_KK> acc_REC_TWOs = i.listIC_ES_CAT_BILL_RATE2(rm.one);
		model.addAttribute("acc_REC_TWOs", acc_REC_TWOs);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		return "IC_ES_CAT_BILL_RATE";
	}

	@GetMapping("/IC_ES_ENRG_PUR_PAID_IPP")
	public String IC_ES_ENRG_PUR_PAID_IPP(Model model) {
		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);

		ArrayList<Month_Dropdown> billList = i.months(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		return "IC_ES_ENRG_PUR_PAID_IPP";
	}

	@PostMapping("/IC_ES_ENRG_PUR_PAID_IPP")
	public String IC_ES_ENRG_PUR_PAID_IPPa(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		model.addAttribute("reportModel", reportModel);

		ArrayList<Month_Dropdown> billList = i.months(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppsa = icDao.IC_ES_ENRG_PUR_PAID_IPPa(rm.one);
		model.addAttribute("andPaidIppsa", andPaidIppsa);
		model.addAttribute("andPaidIppsaNa", andPaidIppsa.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppsaNb", andPaidIppsa.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppsaNc", andPaidIppsa.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppsaNd", andPaidIppsa.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppsaNe", andPaidIppsa.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppsaNf", andPaidIppsa.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppsaNg", andPaidIppsa.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppsaNh", andPaidIppsa.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppsaNi", andPaidIppsa.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppsaNj", andPaidIppsa.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppsaNk", andPaidIppsa.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppsb = icDao.IC_ES_ENRG_PUR_PAID_IPPb(rm.one);
		model.addAttribute("andPaidIppsb", andPaidIppsb);
		model.addAttribute("andPaidIppsbNa", andPaidIppsb.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppsbNb", andPaidIppsb.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppsbNc", andPaidIppsb.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppsbNd", andPaidIppsb.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppsbNe", andPaidIppsb.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppsbNf", andPaidIppsb.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppsbNg", andPaidIppsb.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppsbNh", andPaidIppsb.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppsbNi", andPaidIppsb.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppsbNj", andPaidIppsb.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppsbNk", andPaidIppsb.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppsc = icDao.IC_ES_ENRG_PUR_PAID_IPPc(rm.one);
		model.addAttribute("andPaidIppsc", andPaidIppsc);
		model.addAttribute("andPaidIppscNa", andPaidIppsc.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppscNb", andPaidIppsc.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppscNc", andPaidIppsc.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppscNd", andPaidIppsc.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppscNe", andPaidIppsc.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppscNf", andPaidIppsc.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppscNg", andPaidIppsc.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppscNh", andPaidIppsc.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppscNi", andPaidIppsc.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppscNj", andPaidIppsc.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppscNk", andPaidIppsc.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppsd = icDao.IC_ES_ENRG_PUR_PAID_IPPd(rm.one);
		model.addAttribute("andPaidIppsd", andPaidIppsd);
		model.addAttribute("andPaidIppsdNa", andPaidIppsd.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppsdNb", andPaidIppsd.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppsdNc", andPaidIppsd.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppsdNd", andPaidIppsd.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppsdNe", andPaidIppsd.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppsdNf", andPaidIppsd.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppsdNg", andPaidIppsd.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppsdNh", andPaidIppsd.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppsdNi", andPaidIppsd.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppsdNj", andPaidIppsd.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppsdNk", andPaidIppsd.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppse = icDao.IC_ES_ENRG_PUR_PAID_IPPe(rm.one);
		model.addAttribute("andPaidIppse", andPaidIppse);
		model.addAttribute("andPaidIppseNa", andPaidIppse.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppseNb", andPaidIppse.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppseNc", andPaidIppse.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppseNd", andPaidIppse.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppseNe", andPaidIppse.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppseNf", andPaidIppse.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppseNg", andPaidIppse.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppseNh", andPaidIppse.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppseNi", andPaidIppse.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppseNj", andPaidIppse.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppseNk", andPaidIppse.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppsf = icDao.IC_ES_ENRG_PUR_PAID_IPPf(rm.one);
		model.addAttribute("andPaidIppsf", andPaidIppsf);
		model.addAttribute("andPaidIppsfNa", andPaidIppsf.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppsfNb", andPaidIppsf.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppsfNc", andPaidIppsf.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppsfNd", andPaidIppsf.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppsfNe", andPaidIppsf.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppsfNf", andPaidIppsf.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppsfNg", andPaidIppsf.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppsfNh", andPaidIppsf.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppsfNi", andPaidIppsf.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppsfNj", andPaidIppsf.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppsfNk", andPaidIppsf.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppsg = icDao.IC_ES_ENRG_PUR_PAID_IPPg(rm.one);
		model.addAttribute("andPaidIppsg", andPaidIppsg);
		model.addAttribute("andPaidIppsgNa", andPaidIppsg.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppsgNb", andPaidIppsg.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppsgNc", andPaidIppsg.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppsgNd", andPaidIppsg.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppsgNe", andPaidIppsg.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppsgNf", andPaidIppsg.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppsgNg", andPaidIppsg.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppsgNh", andPaidIppsg.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppsgNi", andPaidIppsg.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppsgNj", andPaidIppsg.get(0).IPP_NAME10);
		model.addAttribute("andPaidIppsgNk", andPaidIppsg.get(0).IPP_NAME11);

		ArrayList<EnergyPurAndPaidIpp> andPaidIppsh = icDao.IC_ES_ENRG_PUR_PAID_IPPh(rm.one);
		model.addAttribute("andPaidIppsh", andPaidIppsh);
		model.addAttribute("andPaidIppshNa", andPaidIppsh.get(0).IPP_NAME1);
		model.addAttribute("andPaidIppshNb", andPaidIppsh.get(0).IPP_NAME2);
		model.addAttribute("andPaidIppshNc", andPaidIppsh.get(0).IPP_NAME3);
		model.addAttribute("andPaidIppshNd", andPaidIppsh.get(0).IPP_NAME4);
		model.addAttribute("andPaidIppshNe", andPaidIppsh.get(0).IPP_NAME5);
		model.addAttribute("andPaidIppshNf", andPaidIppsh.get(0).IPP_NAME6);
		model.addAttribute("andPaidIppshNg", andPaidIppsh.get(0).IPP_NAME7);
		model.addAttribute("andPaidIppshNh", andPaidIppsh.get(0).IPP_NAME8);
		model.addAttribute("andPaidIppshNi", andPaidIppsh.get(0).IPP_NAME9);
		model.addAttribute("andPaidIppshNj", andPaidIppsh.get(0).IPP_NAME10);
		// model.addAttribute("andPaidIppshNk", andPaidIppsh.get(0).IPP_NAME11);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		return "IC_ES_ENRG_PUR_PAID_IPP";
	}

//	report 22 start
	@GetMapping("/IC_ES_ENRG_PUR_PAID_NEIG")
	public String IC_ES_ENRG_PUR_PAID_NEIG(Model model) {

		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.mm(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		return "IC_ES_ENRG_PUR_PAID_NEIG";
	}

	@PostMapping("/IC_ES_ENRG_PUR_PAID_NEIG")
	public String IC_ES_ENRG_PUR_PAID_NEIG(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.mm(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		ArrayList<IC_ES_ENRG_PUR_PAID_NEIG> IC_ES_ENRG_PUR_PAID_NEIG = icDao.IC_ES_ENRG_PUR_PAID_NEIG(rm.one);
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIG", IC_ES_ENRG_PUR_PAID_NEIG);
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGa", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME1());
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGb", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME2());
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGc", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME3());
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGd", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME4());
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGe", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME5());
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGf", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME6());
		model.addAttribute("IC_ES_ENRG_PUR_PAID_NEIGg", IC_ES_ENRG_PUR_PAID_NEIG.get(0).getEIFNC_NAME7());

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_ENRG_PUR_PAID_NEIG";
	}

//	report 22 end 

//	report 23 start
	@GetMapping("/IC_ES_STATE_DISC_OF_ILLE_USER")
	public String IC_ES_STATE_DISC_OF_ILLE_USER(Model model) {

		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.mm(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		return "IC_ES_STATE_DISC_OF_ILLE_USER";
	}

	@PostMapping("/IC_ES_STATE_DISC_OF_ILLE_USER")
	public String IC_ES_STATE_ILLE_USER(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.mm(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		ArrayList<Dpd_Illigal_Use> Dpd_State_Illigal_Use = i.IC_ES_ILLE_USER(rm.one);
		model.addAttribute("Dpd_State_Illigal_Use", Dpd_State_Illigal_Use);
		// model.addAttribute("Year_gen", Dpd_Year_gen.get(0).getpYEAR_CODE());

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_STATE_DISC_OF_ILLE_USER";
	}

//	report 23 end 

//	report 24 start
	@GetMapping("/IC_ES_STATE_DISC_DFLT_CONS")
	public String IC_ES_STATE_DISC_DFLT_CONS(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		return "IC_ES_STATE_DISC_DFLT_CONS";
	}

	@PostMapping("/IC_ES_STATE_DISC_DFLT_CONS")
	public String IC_ES_STATE_DISC_USER(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		ArrayList<Dpd_Rc_Dc_St> Dpd_Dc_St = i.IC_DISC_OF_ILLE_USER(rm.one);
		model.addAttribute("Dpd_Dc_St", Dpd_Dc_St);
		// model.addAttribute("Year_gen", Dpd_Year_gen.get(0).getpYEAR_CODE());

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_STATE_DISC_DFLT_CONS";
	}

//	report 24 end
	@GetMapping("/IC_EFF_TARIFF")
	public String IC_EFF_TARIFF(Model model) {
		if (MainControllerIC.dynamicMenu.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		return "IC_EFF_TARIFF";
	}

	@GetMapping("/IC_ES_CAT_REV_COLL_NET")
	public String IC_ES_CAT_REV_COLL_NET(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_CAT_REV_COLL_NET";
	}

	@PostMapping("/IC_ES_CAT_REV_COLL_NET")
	public String IC_ES_CAT_REV_COLL_NET_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ES_CAT_REV_COLL_NET_ONE> coll_ONEs = icDao.listIC_ES_CAT_REV_COLL_NET(rm.one);
		model.addAttribute("coll_ONEs", coll_ONEs);
		ArrayList<IC_ES_CAT_REV_COLL_NET_TWO> coll_TWOs = icDao.listIC_ES_CAT_REV_COLL_NET2(rm.one);
		model.addAttribute("coll_TWOs", coll_TWOs);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_CAT_REV_COLL_NET";
	}

	///////////////////////////

	@GetMapping("/IC_ES_STAT_BILL_COLL_REC_DESCO")
	public String IC_ES_STAT_BILL_COLL_REC_DESCO(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_STAT_BILL_COLL_REC_DESCO";
	}

	@PostMapping("/IC_ES_STAT_BILL_COLL_REC_DESCO")
	public String IC_ES_STAT_BILL_COLL_REC_DESCO_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ES_STAT_BILL_COLL_REC_DESCO> rec_desco = icDao.listIC_ES_STAT_BILL_COLL_REC_DESCO(rm.one);
		model.addAttribute("rec_desco", rec_desco);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_STAT_BILL_COLL_REC_DESCO";
	}

	/////////////////

	@GetMapping("/IC_ES_STAT_BILL_COLL_REC_WZPDCL")
	public String IC_ES_STAT_BILL_COLL_REC_WZPDCL(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_STAT_BILL_COLL_REC_WZPDCL";
	}

	@PostMapping("/IC_ES_STAT_BILL_COLL_REC_WZPDCL")
	public String IC_ES_STAT_BILL_COLL_REC_WZPDCL_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ES_STAT_BILL_COLL_REC_WZPDCL> wzpdcl_desco = icDao.listIC_ES_STAT_BILL_COLL_REC_WZPDCL(rm.one);
		model.addAttribute("wzpdcl_desco", wzpdcl_desco);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_STAT_BILL_COLL_REC_WZPDCL";
	}

	//////////////////

	@GetMapping("/IC_ES_STAT_BILL_COLL_REC_NESCO")
	public String IC_ES_STAT_BILL_COLL_REC_NESCO(Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_STAT_BILL_COLL_REC_NESCO";
	}

	@PostMapping("/IC_ES_STAT_BILL_COLL_REC_NESCO")
	public String IC_ES_STAT_BILL_COLL_REC_NESCO_one(ReportModel rm, Model model) {
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ES_STAT_BILL_COLL_REC_NESCO> nesco = icDao.listIC_ES_STAT_BILL_COLL_REC_NESCO(rm.one);
		model.addAttribute("nesco", nesco);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_STAT_BILL_COLL_REC_NESCO";
	}

	@GetMapping("/IC_ES_FORWARDING")
	public String IC_ES_FORWARDING(Model model) {

		ReportModel reportModel = new ReportModel();
		ArrayList<IC_PERIOD_MST1> billList = iconvDaoRafi.d(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);

		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_FORWARDING";
	}

	@PostMapping("/IC_ES_FORWARDING")
	public String IC_ES_FORWARDING_one(Model model, ReportModel rm) {
		
			String hdr20 = "";
			String hdr21 = "";
			String hdr22 = "";
			String hdr23 = "";
			String hdr24 = "";
			String hdr25 = "";
			String hdr26 = "";
			String hdr27 = "";
			String hdr28 = "";
			String hdr29 = "";
			String hdr30 = "";
			String hdr31 = "";
			String hdr32 = "";
			String hdr33 = "";
			String hdr34 = "";
			String hdr35 = "";

			String a = rm.getTwo();

//		dpd_Curr_mon_net_gen_fuel_gr start

			Map<String, Object> result20 = getAllStatesJdbcCall600.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_Curr_mon_net_gen_fuel_gr")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//		System.out.println("result20"+"test");	
//		System.out.println(result20);	    	
			JSONObject json20 = new JSONObject(result20);
			String fjfhdj20 = json20.get("CUR_DATA").toString();
			JSONArray jsonArray20 = new JSONArray(fjfhdj20);
//	    System.out.println(jsonArray1);	

			Map<String, Double> graphData20 = new TreeMap<>();
			for (int i = 0; i < jsonArray20.length(); i++) {
				JSONObject jsonData20 = jsonArray20.getJSONObject(i);

				hdr20 = jsonData20.optString("MONTH_YR");
				graphData20.put(jsonData20.optString("FUEL_NAME"), Double.valueOf(jsonData20.optString("NET_TOTAL")));
			}

//	    System.out.println(hdr20);
//	    System.out.println(graphData20+"graph");
			model.addAttribute("hdr20_graph", hdr20);
			model.addAttribute("chartData20", graphData20);

//		dpd_Curr_mon_net_gen_fuel_gr end

//		dpd_Curr_yr_ut_net_gen_fuel_gr start

			Map<String, Object> result21 = getAllStatesJdbcCall601.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_Curr_yr_ut_net_gen_fuel_gr")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//		System.out.println("result21"+"test");	
//		System.out.println(result21);	    	
			JSONObject json21 = new JSONObject(result21);
			String fjfhdj21 = json21.get("CUR_DATA").toString();
			JSONArray jsonArray21 = new JSONArray(fjfhdj21);
//	    System.out.println(jsonArray1);	

			Map<String, Double> graphData21 = new TreeMap<>();
			for (int i = 0; i < jsonArray21.length(); i++) {
				JSONObject jsonData21 = jsonArray21.getJSONObject(i);

				hdr21 = jsonData21.optString("MONTH_YR");
				graphData21.put(jsonData21.optString("FUEL_NAME"), Double.valueOf(jsonData21.optString("NET_TOTAL")));
			}

//		System.out.println("result21 "+"test21");	
//		System.out.println(result21);	
			model.addAttribute("hdr21_graph", hdr21);
			model.addAttribute("chartData21", graphData21);

//		dpd_Curr_yr_ut_net_gen_fuel_gr end

//		dpd_prev_yr_net_gen_fuel_gr start

			Map<String, Object> result22 = getAllStatesJdbcCall602.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_prev_yr_net_gen_fuel_gr")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);

//		System.out.println("result22"+"test");	
//		System.out.println(result22);	
//		
			JSONObject json22 = new JSONObject(result22);
			String fjfhdj22 = json22.get("CUR_DATA").toString();
			JSONArray jsonArray22 = new JSONArray(fjfhdj22);
//	    System.out.println(jsonArray1);	

			Map<String, Double> graphData22 = new TreeMap<>();
			for (int i = 0; i < jsonArray22.length(); i++) {
				JSONObject jsonData22 = jsonArray22.getJSONObject(i);

				hdr22 = jsonData22.optString("MONTH_YR");
				graphData22.put(jsonData22.optString("FUEL_NAME"), Double.valueOf(jsonData22.optString("NET_TOTAL")));
			}

//		System.out.println("result22 "+"test22");	
//		System.out.println(result22);	
			model.addAttribute("hdr22_graph", hdr22);
			model.addAttribute("chartData22", graphData22);

//		dpd_prev_yr_net_gen_fuel_gr end

//		dpd_Curr_mon_net_gen_ot_gr start

			Map<String, Object> result23 = getAllStatesJdbcCall603.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_Curr_mon_net_gen_ot_gr")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);

//		System.out.println("result23"+"test23");	
//		System.out.println(result23);	

			JSONObject json23 = new JSONObject(result23);
			String fjfhdj23 = json23.get("CUR_DATA").toString();
			JSONArray jsonArray23 = new JSONArray(fjfhdj23);
//	    System.out.println(jsonArray1);	

			Map<String, Double> graphData23 = new TreeMap<>();
			for (int i = 0; i < jsonArray23.length(); i++) {
				JSONObject jsonData23 = jsonArray23.getJSONObject(i);

				hdr23 = jsonData23.optString("MONTH_YR");
				graphData23.put(jsonData23.optString("OWNER_TYPE"), Double.valueOf(jsonData23.optString("NET_TOTAL")));
			}

//		System.out.println("result23 "+"test23");	
//		System.out.println(result23);	
			model.addAttribute("hdr23_graph", hdr23);
			model.addAttribute("chartData23", graphData23);

//		dpd_Curr_mon_net_gen_ot_gr end

//		dpd_Curr_yr_ut_net_gen_ot_gr start

			Map<String, Object> result24 = getAllStatesJdbcCall604.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_Curr_yr_ut_net_gen_ot_gr")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//		
//		System.out.println("result24"+"test24");	
//		System.out.println(result24);	
//		
			JSONObject json24 = new JSONObject(result24);
			String fjfhdj24 = json24.get("CUR_DATA").toString();
			JSONArray jsonArray24 = new JSONArray(fjfhdj24);
//	    System.out.println(jsonArray1);	

			Map<String, Double> graphData24 = new TreeMap<>();
			for (int i = 0; i < jsonArray24.length(); i++) {
				JSONObject jsonData24 = jsonArray24.getJSONObject(i);

				hdr24 = jsonData24.optString("MONTH_YR");
				graphData24.put(jsonData24.optString("OWNER_TYPE"), Double.valueOf(jsonData24.optString("NET_TOTAL")));
			}

//		System.out.println("result23 "+"test23");	
//		System.out.println(result23);	
			model.addAttribute("hdr24_graph", hdr24);
			model.addAttribute("chartData24", graphData24);

//		dpd_Curr_yr_ut_net_gen_ot_gr end

//		dpd_yr_month_sales_coll  (2019-2020)start

			Map<String, Object> result25 = getAllStatesJdbcCall605.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_yr_month_sales_coll")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//		
			System.out.println("result25" + "test25");
			System.out.println(result25);
//		
			JSONObject json25 = new JSONObject(result25);
			String fjfhdj25 = json25.get("CUR_DATA").toString();
			JSONArray jsonArray25 = new JSONArray(fjfhdj25);
//	    System.out.println(jsonArray25);	

			Map<String, Double> graphData25 = new TreeMap<>();
			for (int i = 0; i < jsonArray25.length(); i++) {
				JSONObject jsonData25 = jsonArray25.getJSONObject(i);

				hdr25 = jsonData25.optString("TP");
				graphData25.put(jsonData25.optString("UC_TYPE"), Double.valueOf(jsonData25.optString("PREV_YR_CB")));
			}

//	    
//		System.out.println("result25 "+"data25");	
//		System.out.println(result25);	
			model.addAttribute("hdr25_graph", hdr25);
			model.addAttribute("chartData25", graphData25);
//		

//		dpd_yr_month_sales_coll (2019-2020) end

//		dpd_yr_month_sales_coll (2020-2021 upto) start
//		
			Map<String, Object> result26 = getAllStatesJdbcCall606.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_yr_month_sales_coll")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//		
//		System.out.println("result26"+"test26");	
//		System.out.println(result26);	
//		
			JSONObject json26 = new JSONObject(result26);
			String fjfhdj26 = json26.get("CUR_DATA").toString();
			JSONArray jsonArray26 = new JSONArray(fjfhdj26);
//	    System.out.println(jsonArray26);	

			Map<String, Double> graphData26 = new TreeMap<>();
			for (int i = 0; i < jsonArray26.length(); i++) {
				JSONObject jsonData26 = jsonArray26.getJSONObject(i);

				hdr26 = jsonData26.optString("TP");
				graphData26.put(jsonData26.optString("UC_TYPE"),
						Double.valueOf(jsonData26.optString("CURR_YR_UPTO_CB")));
			}

//		System.out.println("result26 "+"data26");	
//		System.out.println(result26);	
			model.addAttribute("hdr26_graph", hdr26);
			model.addAttribute("chartData26", graphData26);
//		
//		
//		
//		
//		
////		dpd_yr_month_sales_coll (2020-2021 upto) end
//		
//		
//		
//		
//		
////		dpd_yr_month_sales_coll (2020-2021 sept 20) start
//		
			Map<String, Object> result27 = getAllStatesJdbcCall607.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_yr_month_sales_coll")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//		
//		System.out.println("result26"+"test26");	
//		System.out.println(result26);	
//		
			JSONObject json27 = new JSONObject(result27);
			String fjfhdj27 = json27.get("CUR_DATA").toString();
			JSONArray jsonArray27 = new JSONArray(fjfhdj27);
//	    System.out.println(jsonArray26);	

			Map<String, Double> graphData27 = new TreeMap<>();
			for (int i = 0; i < jsonArray27.length(); i++) {
				JSONObject jsonData27 = jsonArray27.getJSONObject(i);

				hdr27 = jsonData27.optString("TP");
				graphData27.put(jsonData27.optString("UC_TYPE"),
						Double.valueOf(jsonData27.optString("CURR_MONTH_CB")));
			}

//		System.out.println("result27 "+"data27");	
//		System.out.println(result27);	
			model.addAttribute("hdr27_graph", hdr27);
			model.addAttribute("chartData27", graphData27);
//		
//		
//		

//		dpd_yr_month_sales_coll (2020-2021 sept 20) end

//		dpd_yr_month_sales_coll (2020-2021 FY:2019-20) start

			Map<String, Object> result28 = getAllStatesJdbcCall608.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_yr_month_sales")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//		
//		System.out.println("result26"+"test26");	
//		System.out.println(result26);	
//		
			JSONObject json28 = new JSONObject(result28);
			String fjfhdj28 = json28.get("CUR_DATA").toString();
			JSONArray jsonArray28 = new JSONArray(fjfhdj28);
//	    System.out.println(jsonArray26);	

			Map<String, Double> graphData28 = new TreeMap<>();
			for (int i = 0; i < jsonArray28.length(); i++) {
				JSONObject jsonData28 = jsonArray28.getJSONObject(i);

				hdr28 = jsonData28.optString("TP");
				graphData28.put(jsonData28.optString("UC_TYPE"), Double.valueOf(jsonData28.optString("PREV_YR_SALES")));
			}

//		System.out.println("result27 "+"data27");	
//		System.out.println(result27);	
			model.addAttribute("hdr28_graph", hdr28);
			model.addAttribute("chartData28", graphData28);
//		

//		dpd_yr_month_sales_coll (2020-2021  FY:2019-20 ) end

//		dpd_yr_month_sales_coll (2020-2021  FY:2020-21 ) start

			Map<String, Object> result29 = getAllStatesJdbcCall609.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_yr_month_sales")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//		
//		System.out.println("result26"+"test26");	
//		System.out.println(result26);	
//		
			JSONObject json29 = new JSONObject(result29);
			String fjfhdj29 = json29.get("CUR_DATA").toString();
			JSONArray jsonArray29 = new JSONArray(fjfhdj29);
//	    System.out.println(jsonArray26);	

			Map<String, Double> graphData29 = new TreeMap<>();
			for (int i = 0; i < jsonArray29.length(); i++) {
				JSONObject jsonData29 = jsonArray29.getJSONObject(i);

				hdr29 = jsonData29.optString("TP");
				graphData29.put(jsonData29.optString("UC_TYPE"),
						Double.valueOf(jsonData29.optString("CURR_YR_UPTO_SALES")));
			}

//		System.out.println("result27 "+"data27");	
//		System.out.println(result27);	
			model.addAttribute("hdr29_graph", hdr29);
			model.addAttribute("chartData29", graphData29);

//		dpd_yr_month_sales_coll (2020-2021  FY:2020-21 ) end

//		dpd_yr_month_sales_coll (2020-2021 FY:2019-20) start

			Map<String, Object> result30 = getAllStatesJdbcCall610.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_yr_month_sales")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//		
//		System.out.println("result26"+"test26");	
//		System.out.println(result26);	
//		
			JSONObject json30 = new JSONObject(result30);
			String fjfhdj30 = json30.get("CUR_DATA").toString();
			JSONArray jsonArray30 = new JSONArray(fjfhdj30);
//	    System.out.println(jsonArray26);	

			Map<String, Double> graphData30 = new TreeMap<>();
			for (int i = 0; i < jsonArray30.length(); i++) {
				JSONObject jsonData30 = jsonArray30.getJSONObject(i);

				hdr30 = jsonData30.optString("TP");
				graphData30.put(jsonData30.optString("UC_TYPE"),
						Double.valueOf(jsonData30.optString("CURR_MONTH_SALES")));
			}

//		System.out.println("result27 "+"data27");	
//		System.out.println(result27);	
			model.addAttribute("hdr30_graph", hdr30);
			model.addAttribute("chartData30", graphData30);

//		dpd_yr_month_sales_coll (2020-2021  FY:2019-20 ) end

//			dpd_perf_bpdb_dist_graph_yr (sys loss) start

			Map<String, Object> result31 = getAllStatesJdbcCall611.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_perf_bpdb_dist_graph_yr")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//		
//		System.out.println("result26"+"test26");	
//		System.out.println(result26);	
//		
			JSONObject json31 = new JSONObject(result31);
			String fjfhdj31 = json31.get("CUR_DATA").toString();
			JSONArray jsonArray31 = new JSONArray(fjfhdj31);
//	    System.out.println(jsonArray26);	

			Map<String, Double> graphData31 = new TreeMap<>();
			for (int i = 0; i < jsonArray31.length(); i++) {
				JSONObject jsonData31 = jsonArray31.getJSONObject(i);

				hdr31 = jsonData31.optString("YEAR_CODE");
				graphData31.put(jsonData31.optString("YEAR_CODE"),
						Double.valueOf(jsonData31.optString("DIST_SYS_LOSS")));
			}

//		System.out.println("result27 "+"data27");	
//		System.out.println(result27);	
			model.addAttribute("hdr31_graph", hdr31);
			model.addAttribute("chartData31", graphData31);

//		dpd_perf_bpdb_dist_graph_yr (sys loss) end

//		dpd_perf_bpdb_dist_graph_yr (CI_RATIO ) start

			Map<String, Object> result32 = getAllStatesJdbcCall612.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_perf_bpdb_dist_graph_yr")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//	
//	System.out.println("result26"+"test26");	
//	System.out.println(result26);	
//	
			JSONObject json32 = new JSONObject(result32);
			String fjfhdj32 = json32.get("CUR_DATA").toString();
			JSONArray jsonArray32 = new JSONArray(fjfhdj32);
//   System.out.println(jsonArray26);	

			Map<String, Double> graphData32 = new TreeMap<>();
			for (int i = 0; i < jsonArray32.length(); i++) {
				JSONObject jsonData32 = jsonArray32.getJSONObject(i);

				hdr32 = jsonData32.optString("YEAR_CODE");
				graphData32.put(jsonData32.optString("YEAR_CODE"), Double.valueOf(jsonData32.optString("CI_RATIO")));
			}

//	System.out.println("result27 "+"data27");	
//	System.out.println(result27);	
			model.addAttribute("hdr32_graph", hdr32);
			model.addAttribute("chartData32", graphData32);

//	dpd_perf_bpdb_dist_graph_yr (CI_RATIO ) end
			
//			dpd_perf_trans_loss_graph_yr start

				Map<String, Object> result17 = getAllStatesJdbcCall617.withCatalogName("pkg_ES_forwarding")
						.withProcedureName("dpd_perf_trans_loss_graph_yr")
						.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
						.execute(MainControllerIC.officeCode, a);
	//	
//		System.out.println("result26"+"test26");	
//		System.out.println(result26);	
	//	
				JSONObject json17 = new JSONObject(result17);
				String fjfhdj17 = json17.get("CUR_DATA").toString();
				JSONArray jsonArray17 = new JSONArray(fjfhdj17);
	//   System.out.println(jsonArray26);	

				Map<String, Double> graphData17 = new TreeMap<>();
				for (int i = 0; i < jsonArray17.length(); i++) {
					JSONObject jsonData17 = jsonArray17.getJSONObject(i);

					String ept=jsonData17.optString("TRANS_LOSS_PER");
					if(ept.equals("")) {
						ept="0.0";
					}
					graphData17.put(jsonData17.optString("YEAR_CODE"), Double.valueOf(ept));
				}

//		System.out.println("result27 "+"data27");	
//		System.out.println(result27);	
				//model.addAttribute("hdr17_graph", hdr17);
				model.addAttribute("chartData17", graphData17);

//		dpd_perf_trans_loss_graph_yr end

//	dpd_perf_trans_loss_graph_yr  start

			Map<String, Object> result33 = getAllStatesJdbcCall613.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_perf_trans_loss_graph_yr")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//
//System.out.println("result26"+"test26");	
//System.out.println(result26);	
//
			JSONObject json33 = new JSONObject(result33);
			String fjfhdj33 = json33.get("CUR_DATA").toString();
			JSONArray jsonArray33 = new JSONArray(fjfhdj33);
//System.out.println(jsonArray26);	

			Map<String, Double> graphData33 = new TreeMap<>();
			for (int i = 0; i < jsonArray33.length(); i++) {
				JSONObject jsonData33 = jsonArray33.getJSONObject(i);

				hdr33 = jsonData33.optString("YEAR_CODE");
				graphData33.put(jsonData33.optString("YEAR_CODE"), jsonData33.optDouble("TRANS_LOSS_PER"));
			}

//System.out.println("result27 "+"data27");	
//System.out.println(result27);	
			model.addAttribute("hdr33_graph", hdr33);
			model.addAttribute("chartData33", graphData33);

//dpd_perf_trans_loss_graph_yr  end

//	dpd_perf_bpdb_dist_graph_mon (1ST GRAPH ) start

			Map<String, Object> result34 = getAllStatesJdbcCall614.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_perf_bpdb_dist_graph_mon")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//
//System.out.println("result26"+"test26");	
//System.out.println(result26);	
//
			JSONObject json34 = new JSONObject(result34);
			String fjfhdj34 = json34.get("CUR_DATA").toString();
			JSONArray jsonArray34 = new JSONArray(fjfhdj34);
//System.out.println(jsonArray26);	

			Map<String, Double> graphData34 = new TreeMap<>();
			for (int i = 0; i < jsonArray34.length(); i++) {
				JSONObject jsonData34 = jsonArray34.getJSONObject(i);

				hdr34 = jsonData34.optString("MONTH_DESC");
				graphData34.put(jsonData34.optString("MONTH_DESC"),
						Double.valueOf(jsonData34.optString("DIST_SYS_LOSS")));
			}

//System.out.println("result34 "+"data34");	
//System.out.println(result34);	
			model.addAttribute("hdr34_graph", hdr34);
			model.addAttribute("chartData34", graphData34);

//dpd_perf_bpdb_dist_graph_mon (1ST GRAPH ) end

//dpd_perf_bpdb_dist_graph_mon (2nd GRAPH ) start

			Map<String, Object> result35 = getAllStatesJdbcCall615.withCatalogName("pkg_ES_forwarding")
					.withProcedureName("dpd_perf_bpdb_dist_graph_mon")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(MainControllerIC.officeCode, a);
//
//System.out.println("result26"+"test26");	
//System.out.println(result26);	
//
			JSONObject json35 = new JSONObject(result35);
			String fjfhdj35 = json35.get("CUR_DATA").toString();
			JSONArray jsonArray35 = new JSONArray(fjfhdj35);
//System.out.println(jsonArray26);	

			Map<String, Double> graphData35 = new TreeMap<>();
			for (int i = 0; i < jsonArray35.length(); i++) {
				JSONObject jsonData35 = jsonArray35.getJSONObject(i);

				hdr35 = jsonData35.optString("MONTH_DESC");
				graphData35.put(jsonData35.optString("MONTH_DESC"), Double.valueOf(jsonData35.optString("CI_RATIO")));
			}

//
//System.out.println("result35 "+"data35");	
//System.out.println(result35);	
			model.addAttribute("hdr35_graph", hdr35);
			model.addAttribute("chartData35", graphData35);

//dpd_perf_bpdb_dist_graph_mon (2nd GRAPH ) end		

			ArrayList<IC_ES_FORWARDING> iC_ES_FORWARDING = iconvDaoRafi
					.listIC_ES_FORWARDING(MainControllerIC.officeCode, rm.two);
			model.addAttribute("iC_ES_FORWARDING", iC_ES_FORWARDING);

			ArrayList<IC_ES_FORWARDING1_1> IC_ES_FORWARDING1_1 = iconvDaoRafi
					.listIC_ES_FORWARDING1_1(MainControllerIC.officeCode, rm.two);
			model.addAttribute("IC_ES_FORWARDING", IC_ES_FORWARDING1_1);

			ArrayList<IC_ES_FORWARDING1_3> IC_ES_FORWARDING1_3 = iconvDaoRafi
					.listIC_ES_FORWARDING1_3(MainControllerIC.officeCode, rm.two);
			model.addAttribute("IC_ES_FORWARDING1", IC_ES_FORWARDING1_3);

			ArrayList<IC_ES_FORWARDING2_1> IC_ES_FORWARDING2_1 = iconvDaoRafi
					.listIC_ES_FORWARDING2_1(MainControllerIC.officeCode, rm.two);
			model.addAttribute("IC_ES_FORWARDING2", IC_ES_FORWARDING2_1);

			ArrayList<IC_ES_FORWARDING3_1> IC_ES_FORWARDING3_1 = iconvDaoRafi
					.listIC_ES_FORWARDING3_1(MainControllerIC.officeCode, rm.two);
			model.addAttribute("IC_ES_FORWARDING3", IC_ES_FORWARDING3_1);

			ArrayList<IC_ES_FORWARDING3_1_1> IC_ES_FORWARDING3_1_1 = iconvDaoRafi
					.listIC_ES_FORWARDING3_1_1(MainControllerIC.officeCode, rm.two);
			model.addAttribute("IC_ES_FORWARDING4", IC_ES_FORWARDING3_1_1);

			ArrayList<IC_ES_FORWARDING2_2> IC_ES_FORWARDING2_2 = iconvDaoRafi
					.listIC_ES_FORWARDING2_2(MainControllerIC.officeCode, rm.two);
			model.addAttribute("IC_ES_FORWARDING5", IC_ES_FORWARDING2_2);

			ArrayList<IC_ES_FORWARDING4_1> IC_ES_FORWARDING4_1 = iconvDaoRafi
					.listIC_ES_FORWARDING4_1(MainControllerIC.officeCode, rm.two);
			model.addAttribute("IC_ES_FORWARDING6", IC_ES_FORWARDING4_1);

//		System.out.println("iC_ES_FORWARDING"+iC_ES_FORWARDING);

		
		ReportModel reportModel = new ReportModel();
		ArrayList<IC_PERIOD_MST1> billList = iconvDaoRafi.d(MainControllerIC.officeCode);
		model.addAttribute("billList", billList);
		MainControllerIC.dynamicMenu = icDao.getDynamicMenu();
		model.addAttribute("dataHtml", MainControllerIC.dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_FORWARDING";
	}

}
