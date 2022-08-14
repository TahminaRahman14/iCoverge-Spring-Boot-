package com.example.demo;

public class UnitModList {
	private String billCycleCode;
	private String ppCode;
	private String ppName;
	private String ppUnitCode;
	private String ppUnitName;
	private int enrgGen;
	private int enrgConsSelf;
	private int fuelUsed;
	private int ppUnitModId;
	public String getBillCycleCode() {
		return billCycleCode;
	}
	public void setBillCycleCode(String billCycleCode) {
		this.billCycleCode = billCycleCode;
	}
	public String getPpCode() {
		return ppCode;
	}
	public void setPpCode(String ppCode) {
		this.ppCode = ppCode;
	}
	public String getPpName() {
		return ppName;
	}
	public void setPpName(String ppName) {
		this.ppName = ppName;
	}
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
	public int getEnrgGen() {
		return enrgGen;
	}
	public void setEnrgGen(int enrgGen) {
		this.enrgGen = enrgGen;
	}
	public int getEnrgConsSelf() {
		return enrgConsSelf;
	}
	public void setEnrgConsSelf(int enrgConsSelf) {
		this.enrgConsSelf = enrgConsSelf;
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
		return "UnitModList [billCycleCode=" + billCycleCode + ", ppCode=" + ppCode + ", ppName=" + ppName
				+ ", ppUnitCode=" + ppUnitCode + ", ppUnitName=" + ppUnitName + ", enrgGen=" + enrgGen
				+ ", enrgConsSelf=" + enrgConsSelf + ", fuelUsed=" + fuelUsed + ", ppUnitModId=" + ppUnitModId + "]";
	}
	public UnitModList(String billCycleCode, String ppCode, String ppName, String ppUnitCode, String ppUnitName,
			int enrgGen, int enrgConsSelf, int fuelUsed, int ppUnitModId) {
		super();
		this.billCycleCode = billCycleCode;
		this.ppCode = ppCode;
		this.ppName = ppName;
		this.ppUnitCode = ppUnitCode;
		this.ppUnitName = ppUnitName;
		this.enrgGen = enrgGen;
		this.enrgConsSelf = enrgConsSelf;
		this.fuelUsed = fuelUsed;
		this.ppUnitModId = ppUnitModId;
	}
	public UnitModList() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
