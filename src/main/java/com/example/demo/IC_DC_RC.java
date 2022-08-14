package com.example.demo;

public class IC_DC_RC {

	private String pBILL_CYCLE_CODE;
	private String pNO_OF_DC_LINE;
	private String pCOLL_AGAINST_DC;
	private String pNO_OF_RC_LINE;
	private String pCOLL_AGAINST_RC;
	private String pRC_DC_ID;
	private String pSTATUS;
	public String getpBILL_CYCLE_CODE() {
		return pBILL_CYCLE_CODE;
	}
	public void setpBILL_CYCLE_CODE(String pBILL_CYCLE_CODE) {
		this.pBILL_CYCLE_CODE = pBILL_CYCLE_CODE;
	}
	public String getpNO_OF_DC_LINE() {
		return pNO_OF_DC_LINE;
	}
	public void setpNO_OF_DC_LINE(String pNO_OF_DC_LINE) {
		this.pNO_OF_DC_LINE = pNO_OF_DC_LINE;
	}
	public String getpCOLL_AGAINST_DC() {
		return pCOLL_AGAINST_DC;
	}
	public void setpCOLL_AGAINST_DC(String pCOLL_AGAINST_DC) {
		this.pCOLL_AGAINST_DC = pCOLL_AGAINST_DC;
	}
	public String getpNO_OF_RC_LINE() {
		return pNO_OF_RC_LINE;
	}
	public void setpNO_OF_RC_LINE(String pNO_OF_RC_LINE) {
		this.pNO_OF_RC_LINE = pNO_OF_RC_LINE;
	}
	public String getpCOLL_AGAINST_RC() {
		return pCOLL_AGAINST_RC;
	}
	public void setpCOLL_AGAINST_RC(String pCOLL_AGAINST_RC) {
		this.pCOLL_AGAINST_RC = pCOLL_AGAINST_RC;
	}
	public String getpRC_DC_ID() {
		return pRC_DC_ID;
	}
	public void setpRC_DC_ID(String pRC_DC_ID) {
		this.pRC_DC_ID = pRC_DC_ID;
	}
	public String getpSTATUS() {
		return pSTATUS;
	}
	public void setpSTATUS(String pSTATUS) {
		this.pSTATUS = pSTATUS;
	}
	@Override
	public String toString() {
		return "IC_DC_RC [pBILL_CYCLE_CODE=" + pBILL_CYCLE_CODE + ", pNO_OF_DC_LINE=" + pNO_OF_DC_LINE
				+ ", pCOLL_AGAINST_DC=" + pCOLL_AGAINST_DC + ", pNO_OF_RC_LINE=" + pNO_OF_RC_LINE
				+ ", pCOLL_AGAINST_RC=" + pCOLL_AGAINST_RC + ", pRC_DC_ID=" + pRC_DC_ID + ", pSTATUS=" + pSTATUS + "]";
	}
	public IC_DC_RC(String pBILL_CYCLE_CODE, String pNO_OF_DC_LINE, String pCOLL_AGAINST_DC, String pNO_OF_RC_LINE,
			String pCOLL_AGAINST_RC, String pRC_DC_ID, String pSTATUS) {
		super();
		this.pBILL_CYCLE_CODE = pBILL_CYCLE_CODE;
		this.pNO_OF_DC_LINE = pNO_OF_DC_LINE;
		this.pCOLL_AGAINST_DC = pCOLL_AGAINST_DC;
		this.pNO_OF_RC_LINE = pNO_OF_RC_LINE;
		this.pCOLL_AGAINST_RC = pCOLL_AGAINST_RC;
		this.pRC_DC_ID = pRC_DC_ID;
		this.pSTATUS = pSTATUS;
	}
	public IC_DC_RC() {
		super();
		// TODO Auto-generated constructor stub
	}

}
