package BusReservation;

public class Bus {
    private int busno;
    private boolean ac;
    private int capacity;
	public Object date;
	public Object busNo;

    public Bus(int busno, boolean ac, int capacity) {
        this.busno = busno;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getBusno() {
        return busno;
    }

//    public void setBusno(int busno) {
//        this.busno = busno;
//    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }	

    public boolean isAC() {
        return ac;
    }

    public void setAC(boolean ac) {
        this.ac = ac;
    }
    public void displayBusinfo() {
    	System.out.println("Bus no    :"+busno +"     "+"Ac     :"+ ac +"     "+ "No of Passengers can be seated    :"+capacity  );
    }
}