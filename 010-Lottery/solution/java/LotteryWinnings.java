public class LotteryWinnings {
    public static void main(String[] args) {
        int lotteryWinnings = 25000;
        int loanRepayment = 5000;
        int electricityBill = 341;
        int carPrice = 18000;
        int backupSensorPrice = 450;
        int rimPrice = 900;
        int total = lotteryWinnings - loanRepayment - electricityBill - (carPrice + rimPrice + backupSensorPrice);
        if (total >= 0) {
            System.out.println("Yes, I can buy my car and I will have " + total + " dollars left!");
        }
        else {
            System.out.println("I can't buy the car. I am short " + (-total) + " dollars.");
        }
    }
}
