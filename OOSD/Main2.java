/*
 * package OOSD;
 * 
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 * class Vehicle {
 * private String id;
 * private boolean isRented;
 * private boolean isDamaged;
 * 
 * public Vehicle(String id) {
 * this.id = id;
 * this.isRented = false;
 * this.isDamaged = false;
 * }
 * 
 * public String getId() {
 * return id;
 * }
 * 
 * public boolean isRented() {
 * return isRented;
 * }
 * 
 * public boolean isDamaged() {
 * return isDamaged;
 * }
 * 
 * public void rent() {
 * isRented = true;
 * }
 * 
 * public void returnVehicle() {
 * isRented = false;
 * }
 * 
 * public void reportDamage() {
 * isDamaged = true;
 * }
 * 
 * public void repair() {
 * isDamaged = false;
 * }
 * }
 * 
 * class RentalSystem {
 * private List<Vehicle> vehicles;
 * private PaymentSystem paymentSystem;
 * private RefundSystem refundSystem;
 * private VehicleMaintenanceSystem maintenanceSystem;
 * 
 * public RentalSystem(PaymentSystem paymentSystem, RefundSystem refundSystem,
 * VehicleMaintenanceSystem maintenanceSystem) {
 * vehicles = new ArrayList<>();
 * this.paymentSystem = paymentSystem;
 * this.refundSystem = refundSystem;
 * this.maintenanceSystem = maintenanceSystem;
 * }
 * 
 * public void addVehicle(String id) {
 * vehicles.add(new Vehicle(id));
 * }
 * 
 * public void rentVehicle(String id, String customerId) {
 * for (Vehicle vehicle : vehicles) {
 * if (vehicle.getId().equals(id) && !vehicle.isRented() &&
 * !vehicle.isDamaged()) {
 * vehicle.rent();
 * System.out.println("เช่ารถ " + id + " เรียบร้อยแล้ว");
 * paymentSystem.makePayment(customerId, 10); // ตัวอย่างการเสียค่าเช่า 10 บาท
 * return;
 * }
 * }
 * System.out.println("ไม่สามารถเช่ารถ " + id + " ได้");
 * }
 * 
 * public void returnVehicle(String id, String customerId) {
 * for (Vehicle vehicle : vehicles) {
 * if (vehicle.getId().equals(id) && vehicle.isRented()) {
 * vehicle.returnVehicle();
 * System.out.println("คืนรถ " + id + " เรียบร้อยแล้ว");
 * refundSystem.refund(customerId, 5); // ตัวอย่างการคืนค่าเช่า 5 บาท
 * return;
 * }
 * }
 * System.out.println("ไม่สามารถคืนรถ " + id + " ได้");
 * }
 * 
 * public void reportDamage(String id) {
 * for (Vehicle vehicle : vehicles) {
 * if (vehicle.getId().equals(id) && vehicle.isRented()) {
 * vehicle.reportDamage();
 * maintenanceSystem.scheduleRepair(id);
 * System.out.println("รถ " + id +
 * " ถูกรายงานว่าเสียหายและได้ถูกนัดหมายซ่อมบำรุง");
 * return;
 * }
 * }
 * System.out.println("ไม่สามารถรายงานว่ารถ " + id + " เสียหายได้");
 * }
 * }
 * 
 * class PaymentSystem {
 * public void makePayment(String customerId, double amount) {
 * // ในที่นี้จะเสมือนว่าการชำระเงินเสมือนจริง
 * System.out.println("ชำระเงินจำนวน " + amount + " บาท สำเร็จ");
 * }
 * }
 * 
 * class RefundSystem {
 * public void refund(String customerId, double amount) {
 * // ในที่นี้จะเสมือนว่าการคืนเงินเสมือนจริง
 * System.out.println("คืนเงินจำนวน " + amount + " บาท สำเร็จ");
 * }
 * }
 * 
 * class VehicleMaintenanceSystem {
 * public void scheduleRepair(String vehicleId) {
 * // ตัวอย่างการนัดหมายซ่อมบำรุง
 * System.out.println("นัดหมายซ่อมบำรุงรถ " + vehicleId);
 * }
 * }
 * 
 * public class Main2 {
 * public static void main(String[] args) {
 * PaymentSystem paymentSystem = new PaymentSystem();
 * RefundSystem refundSystem = new RefundSystem();
 * VehicleMaintenanceSystem maintenanceSystem = new VehicleMaintenanceSystem();
 * RentalSystem rentalSystem = new RentalSystem(paymentSystem, refundSystem,
 * maintenanceSystem);
 * 
 * // เพิ่มรถเข้าสู่ระบบ
 * rentalSystem.addVehicle("Bike1");
 * rentalSystem.addVehicle("Scooter1");
 * 
 * // เช่ารถ
 * rentalSystem.rentVehicle("Bike1", "customer1");
 * 
 * // รายงานรถเสียหาย
 * rentalSystem.reportDamage("Bike1");
 * 
 * // คืนรถ
 * rentalSystem.returnVehicle("Bike1", "customer1");
 * }
 * }
 */
