package com.ty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adhaarcard {
	@Id
        private int aid;
        private String address;
        private int pinno;
		public int getAid() {
			return aid;
		}
		public void setAid(int aid) {
			this.aid = aid;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getPinno() {
			return pinno;
		}
		public void setPinno(int pinno) {
			this.pinno = pinno;
		}
        
}
