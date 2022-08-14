package com.example.demo;

public class UnitModInset {
	private String billCycleCode;
	private String ppUnitCode;
	private int enrgGen;
	private int enrgConsSelf;
	private String status;
	private int fuelUsed;
	private String ppCode;
	public String getBillCycleCode() {
		return billCycleCode;
	}
	public void setBillCycleCode(String billCycleCode) {
		this.billCycleCode = billCycleCode;
	}
	public String getPpUnitCode() {
		return ppUnitCode;
	}
	public void setPpUnitCode(String ppUnitCode) {
		this.ppUnitCode = ppUnitCode;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getFuelUsed() {
		return fuelUsed;
	}
	public void setFuelUsed(int fuelUsed) {
		this.fuelUsed = fuelUsed;
	}
	public String getPpCode() {
		return ppCode;
	}
	public void setPpCode(String ppCode) {
		this.ppCode = ppCode;
	}
	@Override
	public String toString() {
		return "UnitModInset [billCycleCode=" + billCycleCode + ", ppUnitCode=" + ppUnitCode + ", enrgGen=" + enrgGen
				+ ", enrgConsSelf=" + enrgConsSelf + ", status=" + status + ", fuelUsed=" + fuelUsed + ", ppCode="
				+ ppCode + "]";
	}
	public UnitModInset(String billCycleCode, String ppUnitCode, int enrgGen, int enrgConsSelf, String status,
			int fuelUsed, String ppCode) {
		super();
		this.billCycleCode = billCycleCode;
		this.ppUnitCode = ppUnitCode;
		this.enrgGen = enrgGen;
		this.enrgConsSelf = enrgConsSelf;
		this.status = status;
		this.fuelUsed = fuelUsed;
		this.ppCode = ppCode;
	}
	public UnitModInset() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
