package OOSD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// คลาส Appointment แทนข้อมูลของรายการนัดหมาย
class Appointment {
    private String title;
    private String date;

    public Appointment(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Date: " + date;
    }
}

// คลาส AppointmentManager จัดการรายการนัดหมายและมี Iterator
class AppointmentManager implements Iterable<Appointment> {
    private List<Appointment> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    @Override
    public Iterator<Appointment> iterator() {
        return new AppointmentIterator();
    }

    private class AppointmentIterator implements Iterator<Appointment> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < appointments.size();
        }

        @Override
        public Appointment next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return appointments.get(currentIndex++);
        }

        @Override
        public void remove() {
            // ไม่ต้องการให้รองรับการลบรายการนัดหมายในตัวอย่างนี้
            throw new UnsupportedOperationException();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AppointmentManager appointmentManager = new AppointmentManager();

        // เพิ่มรายการนัดหมาย
        appointmentManager.addAppointment(new Appointment("ไปสวนสัตว์กับขวัญ", "2566-10-10"));
        appointmentManager.addAppointment(new Appointment("นัดดูหนังกับบีม", "2566-10-15"));
        appointmentManager.addAppointment(new Appointment("นัดทานข้าวกับออมสิน", "2566-10-20"));

        // ใช้ Iterator เพื่อแสดงรายการนัดหมาย
        System.out.println("Appointments:");
        for (Appointment appointment : appointmentManager) {
            System.out.println(appointment);
        }
    }
}
