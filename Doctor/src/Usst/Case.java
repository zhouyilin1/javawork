package Usst;

import java.io.Serializable;
import java.util.HashMap;

public class Case implements Serializable {
	   private Patient_info Pi;//���˵���Ϣ
	   public Patient_info getPi() {
		return Pi;
	}
	public void setPi(Patient_info pi) {
		Pi = pi;
	}
	public Appointment getApp() {
		return App;
	}
	public void setApp(Appointment app) {
		App = app;
	}
	public HashMap getDrug_ha() {
		return Drug_ha;
	}
	public void setDrug_ha(HashMap drug_ha) {
		Drug_ha = drug_ha;
	}
	public Charge_info getCharge() {
		return Charge;
	}
	public void setCharge(Charge_info charge) {
		Charge = charge;
	}
	private Appointment App;//ԤԼ����Ϣ
	   private HashMap Drug_ha;//ҩƷ�����Լ�����
	   private Charge_info Charge;//�շ���Ϣ
	}
