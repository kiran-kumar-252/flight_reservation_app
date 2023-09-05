package com.flight_reservation_app.dto;

public class ReservationReqeust {		//This is a dto class

		private long flightId;
		private String firstName;
		private String lastName;
		private String middelName;
		private String email;
		private String phone;
		private String nameOnTheCard;
		private String cardNumber;
		private String CVV;
		private String expiryDate;
		private String amount;
		
		public long getFlightId() {
			return flightId;
		}
		public void setFlightId(long flightId) {
			this.flightId = flightId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getMiddelName() {
			return middelName;
		}
		public void setMiddelName(String middelName) {
			this.middelName = middelName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getNameOnTheCard() {
			return nameOnTheCard;
		}
		public void setNameOnTheCard(String nameOnTheCard) {
			this.nameOnTheCard = nameOnTheCard;
		}
		public String getCardNumber() {
			return cardNumber;
		}
		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}
		public String getCVV() {
			return CVV;
		}
		public void setCVV(String cVV) {
			CVV = cVV;
		}
		public String getExpiryDate() {
			return expiryDate;
		}
		public void setExpiryDate(String expiryDate) {
			this.expiryDate = expiryDate;
		}
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
}
