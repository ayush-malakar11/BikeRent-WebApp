/*
 * package com.amstech.bikerent.servlet;
 * 
 * import java.io.IOException; import java.util.List; import
 * com.amstech.bikerent.dao.CustomerDAO; import
 * com.amstech.bikerent.dto.CustomerDTO; import
 * com.amstech.bikerent.service.CustomerService; import
 * com.amstech.bikerent.util.DBUtil;
 * 
 * public class CustomerServletMain { private DBUtil dbUtil; private CustomerDAO
 * customerDAO; private CustomerService customerservice;
 * 
 * public CustomerServletMain() { System.out.println("Object Creared");
 * this.dbUtil = new DBUtil(); this.customerDAO = new CustomerDAO(dbUtil);
 * this.customerservice = new CustomerService(customerDAO); }
 * 
 * public static void main(String[] args) throws IOException {
 * CustomerServletMain main = new CustomerServletMain(); // main.save(); //
 * main.update(); // main.delete(); // main.findById(); //
 * main.findByMobileNumber(); main.findByEmailMobilePassword(); //
 * main.findAll(); }
 * 
 * public void save() throws IOException {
 * 
 * try {
 * 
 * CustomerDTO customerDTO = new CustomerDTO();
 * customerDTO.setFirstname("Monika"); customerDTO.setLastname("Birla");
 * customerDTO.setEmail("moni@gmail.com");
 * customerDTO.setMobilenumber("6262162291");
 * customerDTO.setAddress("vishnupuri"); customerDTO.setCityId(1);
 * customerDTO.setLicencenumber("M129742B36A23"); int count =
 * customerservice.save(customerDTO); if (count > 0) {
 * System.out.println("user created successfully.");
 * 
 * } else { System.out.println("failed to create user");
 * 
 * } } catch (Exception e) { e.printStackTrace();
 * 
 * } }
 * 
 * public void update() { try { CustomerDTO customerDTO = new CustomerDTO();
 * customerDTO.setFirstname("Shree"); customerDTO.setLastname("chouhan");
 * customerDTO.setAddress("bhawarkua"); customerDTO.setId(1);
 * 
 * int count = customerservice.update(customerDTO); if (count > 0) {
 * System.out.println("user updated successfully."); } else {
 * System.out.println("failed to update user"); } } catch (Exception e) {
 * e.printStackTrace(); } }
 * 
 * public void findById() { try { int id = 2; CustomerDTO customerDTO =
 * customerservice.findById(id); if (customerDTO != null) {
 * System.out.println("User found successfully");
 * System.out.println("FirstName: " + customerDTO.getFirstname());
 * System.out.println("LastName: " + customerDTO.getLastname()); } else {
 * System.out.println("failed to find user"); } } catch (Exception e) {
 * e.printStackTrace(); } }
 * 
 * public void findByMobileNumber() { try { String mobile_number = "9343930277";
 * CustomerDTO customerDTO = customerservice.findByMobileNumber(mobile_number);
 * if (customerDTO != null) { System.out.println("User found successfully");
 * System.out.println("FirstName: " + customerDTO.getFirstname());
 * System.out.println("LastName: " + customerDTO.getLastname()); } else {
 * System.out.println("failed to find user"); } } catch (Exception e) {
 * e.printStackTrace(); } }
 * 
 * public void findByEmailMobilePassword() { try { String username =
 * "shri@gmail.com"; String password = "s1h1r1i"; CustomerDTO customerDTO =
 * customerservice.findByEmailMobilePassword(username, password); if
 * (customerDTO != null) { System.out.println("User found successfully");
 * System.out.println("FirstName: " + customerDTO.getFirstname());
 * System.out.println("LastName: " + customerDTO.getLastname()); } else {
 * System.out.println("failed to find user"); } } catch (Exception e) {
 * e.printStackTrace(); } }
 * 
 * public void findAll() { try { List<CustomerDTO> customerDTOList =
 * customerservice.findAll(); if (!customerDTOList.isEmpty()) {
 * System.out.println("User found successfully");
 * System.out.println("customerDTO List size: " + customerDTOList.size()); for
 * (CustomerDTO customerDTO : customerDTOList) {
 * System.out.println("FirstName: " + customerDTO.getFirstname());
 * System.out.println("LastName: " + customerDTO.getLastname()); } } else {
 * System.out.println("failed to find user"); } } catch (Exception e) {
 * e.printStackTrace(); } }
 * 
 * public void delete() { try { int id = 4;
 * 
 * int count = customerservice.delete(id); if (count > 0) {
 * System.out.println("user delete successfully."); } else {
 * System.out.println("failed to delete user"); } } catch (Exception e) {
 * e.printStackTrace(); } }
 * 
 * }
 */