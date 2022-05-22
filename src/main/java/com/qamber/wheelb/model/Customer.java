package com.qamber.wheelb.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Customer {

		@Id
		String id;
		
		String name;
		String phone;
		Date date;
		
		public Customer(String id, String name, String phone, Date date) {
			super();
			this.id = id;
			this.name = name;
			this.phone = phone;
			this.date = date;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public Customer() {
			
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "Customer [id= " + id + ", name= " + name + ", phone= " + phone + ", date= " + date + "]";
		}


	

}
