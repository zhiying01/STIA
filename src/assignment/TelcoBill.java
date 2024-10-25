package assignment;

public class TelcoBill {
    private String billNo;
    private String custIC;
    private String custName;
    private String custPhone;
    private char telcoPackage;
    private int plan;
    private int dataUsage;
    private int callUsage;
    private double totalPayment;

    public TelcoBill(String billNo, String custIC, String custName, String custPhone, char telcoPackage,
                     int plan, int dataUsage, int callUsage) {
        this.billNo = billNo;
        this.custIC = custIC;
        this.custName = custName;
        this.custPhone = custPhone;
        this.telcoPackage = telcoPackage;
        this.plan = plan;
        this.dataUsage = dataUsage;
        this.callUsage = callUsage;
        this.totalPayment = 0.0;
    }

    public void calculateHomeWifi() {
        double dataCost;
        double callCost;

        if (plan == 1) { // Premium Plan
            if (dataUsage <= 5) {
                dataCost = 0.0;
            } else {
                dataCost = (dataUsage - 5) * 15.0;
            }
            if (callUsage <= 20) {
                callCost = 0.0;
            } else {
                callCost = (callUsage - 20) * 0.5;
            }
        } else { // Regular Plan
            if (dataUsage <= 5) {
                dataCost = 0.0;
            } else {
                dataCost = (dataUsage - 5) * 10.0;
            }
            if (callUsage <= 20) {
                callCost = 0.0;
            } else {
                callCost = (callUsage - 20) * 0.5;
            }
        }

        totalPayment = dataCost + callCost;
    }

    public void calculatePostpaidMobile() {
        double dataCost;
        double callCost;

        if (plan == 1) { // Premium Plan
            if (dataUsage <= 3) {
                dataCost = 0.0;
            } else {
                dataCost = (dataUsage - 3) * 10.0;
            }
            if (callUsage <= 20) {
                callCost = 0.0;
            } else {
                callCost = (callUsage - 20) * 0.3;
            }
        } else { // Regular Plan
            if (dataUsage <= 3) {
                dataCost = 0.0;
            } else {
                dataCost = (dataUsage - 3) * 5.0;
            }
            if (callUsage <= 20) {
                callCost = 0.0;
            } else {
                callCost = (callUsage - 20) * 0.2;
            }
        }

        totalPayment = dataCost + callCost;
    }

    @Override
    public String toString() {
        String packageType;
        String planType;

        if (telcoPackage == 'A') {
            packageType = "Celcomis Home Wi-Fi and landline phone";
            planType = (plan == 1) ? "Premium" : "Regular";
        } else {
            packageType = "Celcomis Postpaid Mobile";
            planType = (plan == 1) ? "Premium" : "Regular";
        }

        return "Bill Number: " + billNo +
                "\nCustomer IC: " + custIC +
                "\nCustomer Name: " + custName +
                "\nCustomer Phone: " + custPhone +
                "\nTelco Package: " + packageType +
                "\nPlan: " + planType +
                "\nData Usage: " + dataUsage + " GB" +
                "\nCall Usage: " + callUsage + " minutes" +
                "\nTotal Payment: RM " + totalPayment;
    }

    // Getters and Setters

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getCustIC() {
        return custIC;
    }

    public void setCustIC(String custIC) {
        this.custIC = custIC;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public char getTelcoPackage() {
        return telcoPackage;
    }

    public void setTelcoPackage(char telcoPackage) {
        this.telcoPackage = telcoPackage;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public int getDataUsage() {
        return dataUsage;
    }

    public void setDataUsage(int dataUsage) {
        this.dataUsage = dataUsage;
    }

    public int getCallUsage() {
        return callUsage;
    }

    public void setCallUsage(int callUsage) {
        this.callUsage = callUsage;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }
}
