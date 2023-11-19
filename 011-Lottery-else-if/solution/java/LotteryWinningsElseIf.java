public class LotteryWinningsElseIf {
    public static void main(String[] args) {
        int lotteryWinnings = 25000;
        int loanRepayment = 5000;
        int electricityBill = 341;
        int taxes = 448;
        int foundTicket = 50;

        int carPrice = 18000;
        int backupSensorPrice = 450;
        int alloyWheelsPrice = 900;
        int carWithOptions = carPrice + alloyWheelsPrice + backupSensorPrice;

        int availableMoney = lotteryWinnings - loanRepayment - electricityBill - taxes + foundTicket;

        if (availableMoney >= carWithOptions) {
            System.out.println("Yes, I can buy the car and I will have " + (availableMoney - carWithOptions) + " dollars left!");
        } else if (availableMoney >= carPrice) {
            System.out.println("I can buy the car but I am short of " + (carWithOptions - availableMoney) + " dollars for the options!");
        } else {
            System.out.println("I can't buy the car. I am short of " + (carPrice - availableMoney) + " dollars.");
        }
    }
}