package com.example.demo;

public class UnirmodEdit {
	private String ppUnitCode;
	private String ppUnitName;
	private int engrGen;
	private int engrConsSelf;
	private int fuelUsed;
	private int ppUnitModId;
	public String getPpUnitCode() {
		return ppUnitCode;
	}
	public void setPpUnitCode(String ppUnitCode) {
		this.ppUnitCode = ppUnitCode;
	}
	public String getPpUnitName() {
		return ppUnitName;
	}
	public void setPpUnitName(String ppUnitName) {
		this.ppUnitName = ppUnitName;
	}
	public int getEngrGen() {
		return engrGen;
	}
	public void setEngrGen(int engrGen) {
		this.engrGen = engrGen;
	}
	public int getEngrConsSelf() {
		return engrConsSelf;
	}
	public void setEngrConsSelf(int engrConsSelf) {
		this.engrConsSelf = engrConsSelf;
	}
	public int getFuelUsed() {
		return fuelUsed;
	}
	public void setFuelUsed(int fuelUsed) {
		this.fuelUsed = fuelUsed;
	}
	public int getPpUnitModId() {
		return ppUnitModId;
	}
	public void setPpUnitModId(int ppUnitModId) {
		this.ppUnitModId = ppUnitModId;
	}
	@Override
	public String toString() {
		return "UnirmodEdit [ppUnitCode=" + ppUnitCode + ", ppUnitName=" + ppUnitName + ", engrGen=" + engrGen
				+ ", engrConsSelf=" + engrConsSelf + ", fuelUsed=" + fuelUsed + ", ppUnitModId=" + ppUnitModId + "]";
	}
	public UnirmodEdit(String ppUnitCode, String ppUnitName, int engrGen, int engrConsSelf, int fuelUsed,
			int ppUnitModId) {
		super();
		this.ppUnitCode = ppUnitCode;
		this.ppUnitName = ppUnitName;
		this.engrGen = engrGen;
		this.engrConsSelf = engrConsSelf;
		this.fuelUsed = fuelUsed;
		this.ppUnitModId = ppUnitModId;
	}
	public UnirmodEdit() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
