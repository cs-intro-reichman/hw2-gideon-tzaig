public class TimeCalc {
    public static void main(String[] args) {
        // Recieving current time and minutes to add, then calculating the addition
        String currentTime = args[0];
        int currentHour = Integer.parseInt(currentTime.split(":")[0]);
        int currentMinute = Integer.parseInt(currentTime.split(":")[1]);
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = (currentHour * 60) + currentMinute + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHour = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
		if (newHour < 10) {
			if (newMinutes < 10) {
				System.out.print("0" + newHour + ":0" + newMinutes);
			}
			else {
				System.out.print("0" + newHour + ":" + newMinutes);
			}
		}
        else if (newMinutes < 10) {
            System.out.print(newHour + ":0" + newMinutes);
        }
		else {
			System.out.print(newHour + ":" + newMinutes);
		}
    }
}

