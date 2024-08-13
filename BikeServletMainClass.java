/*
 * package com.amstech.bikerent.servlet;
 * 
 * import java.util.List;
 * 
 * import com.amstech.bikerent.dao.BikedetailsDAO; import
 * com.amstech.bikerent.dto.BikedetailsDTO; import
 * com.amstech.bikerent.service.BikeService; import
 * com.amstech.bikerent.util.DBUtil;
 * 
 * public class BikeServletMainClass { // Temp Class private DBUtil dbUtil;
 * private BikedetailsDAO bikeDAO; private BikeService bikeservice;
 * 
 * public BikeServletMainClass() { this.dbUtil = new DBUtil(); this.bikeDAO =
 * new BikedetailsDAO(dbUtil); this.bikeservice = new BikeService(bikeDAO);
 * 
 * }
 * 
 * public static void main(String[] args) { BikeServletMainClass main = new
 * BikeServletMainClass();
 * 
 * // main.save(); // main.update(); // main.findById(); //
 * main.findByMobileNumber(); // main.findByRegistrationNumber(); //
 * main.findAll(); main.deleteById();
 * 
 * }
 * 
 * public void save() { try {
 * 
 * BikedetailsDTO bikeDTO = new BikedetailsDTO();
 * bikeDTO.setBike_model_name("Royal Enfield");
 * bikeDTO.setBike_registration_number("RL 40 R 3294"); bikeDTO.setCityId(1);
 * 
 * int count = bikeservice.save(bikeDTO); if (count > 0)
 * System.out.println("Bike Added successfully"); else
 * System.out.println("Failed to create bike data.."); } catch (Exception e) {
 * e.printStackTrace(); }
 * 
 * }
 * 
 * public void update() { try { BikedetailsDTO BikeDTO = new BikedetailsDTO();
 * BikeDTO.setBike_model_name("Pulse");
 * BikeDTO.setBike_registration_number("425325"); BikeDTO.setCityId(1);
 * BikeDTO.setId(2); int count = bikeservice.update(BikeDTO); if (count > 0) {
 * System.out.println("Bike updated successfullly..."); } else {
 * System.out.println("Failed to updated bike..."); } } catch (Exception e) {
 * e.printStackTrace(); } }
 * 
 * public void findById() { try { int id = 2; BikedetailsDTO BikeDTO =
 * bikeservice.findById(id); if (BikeDTO != null) {
 * System.out.println("User found successfully");
 * System.out.println("Model Name:" + BikeDTO.getBike_model_name());
 * System.out.println("Registration Number:" +
 * BikeDTO.getBike_registration_number());
 * 
 * } else { System.out.println("Failed to find bike."); } } catch (Exception e)
 * { e.printStackTrace(); } }
 * 
 * public void findByRegistrationNumber() { try { String registrationnum =
 * "KL 39 M 2834"; BikedetailsDTO BikeDTO =
 * bikeservice.findByRegistrationNumber(registrationnum); if (BikeDTO != null) {
 * System.out.println("User found successfully");
 * System.out.println("Model Name:" + BikeDTO.getBike_model_name());
 * System.out.println("Registration number:" +
 * BikeDTO.getBike_registration_number()); } else {
 * System.out.println("Failed to find bike"); } } catch (Exception e) {
 * e.printStackTrace(); } }
 * 
 * public void findAll() { try {
 * 
 * List<BikedetailsDTO> BikeDTOList = bikeservice.findAll(); if
 * (!BikeDTOList.isEmpty()) { System.out.println("Bike found successfully");
 * System.out.println("BikeDTO List size: " + BikeDTOList.size());
 * 
 * for (BikedetailsDTO BikeDTO : BikeDTOList) {
 * System.out.println("model name: " + BikeDTO.getBike_model_name());
 * System.out.println("Registration num: " +
 * BikeDTO.getBike_registration_number()); }
 * 
 * } else { System.out.println("failed to find bike."); }
 * 
 * } catch (Exception e) { e.printStackTrace(); } }
 * 
 * public void deleteById() { try { int id = 1; int count =
 * bikeservice.deleteById(id); if (count > 0) {
 * System.out.println("Bike deleted successfullly..."); } else {
 * System.out.println("Failed to delete bike..."); } } catch (Exception e) {
 * e.printStackTrace(); } } }
 */