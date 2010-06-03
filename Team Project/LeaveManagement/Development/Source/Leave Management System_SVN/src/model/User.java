package model;

import java.sql.Date;

public class User {
		private int id_user;
		private String username;
		private String password;
		private String status;
		private String position_name;
		public int getId_user() {
			return id_user;
		}
		public String getPosition_name() {
			return position_name;
		}
		public void setPosition_name(String positionName) {
			position_name = positionName;
		}
		public void setId_user(int idUser) {
			id_user = idUser;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
	}
		
		public String getFullname() {
			return fullname;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		public Date getBirthday() {
			return birthday;
		}
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getStart() {
			return start;
		}
		public void setStart(String start) {
			this.start = start;
		}
		public int getId_position() {
			return id_position;
		}
		public void setId_position(int idPosition) {
			id_position = idPosition;
		}
		private String fullname;
		private Date birthday;
		private String address;
		private String gender;
		private String phone;
		private String email;
		private String start;
		private int id_position;

}
