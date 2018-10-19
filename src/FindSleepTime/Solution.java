package FindSleepTime;

public class Solution {

    boolean[] timeLine = new boolean[10080];

    public int solution(String input){
        String[] meeting = input.split("\n");
        for (int i = 0; i<timeLine.length;i++){
            timeLine[i] = false;
        }
        for (int i = 0; i< meeting.length; i++){
            fillLine(meeting[i]);
        }
        int maxTime = 0;
        int temp = 0;
        for (int i = 0; i<timeLine.length;i++){
            if (timeLine[i] == false){
                temp++;
            }else {
                maxTime = Math.max(maxTime,temp);
                temp=0;
            }
        }
        maxTime = Math.max(maxTime,temp);

        return maxTime;
    }


    public void fillLine(String meeting){
        String day = meeting.split(" ")[0];
        String period = meeting.split(" ")[1];
        int startLocation = 0;

        switch (day.toLowerCase()){
            case "mon":
                startLocation += 0;
                break;
            case "tue":
                startLocation += 1440;
                break;
            case "wed":
                startLocation += 1440*2;
                break;
            case "thu":
                startLocation += 1440*3;
                break;
            case "fri":
                startLocation += 1440*4;
                break;
            case "sat":
                startLocation += 1440*5;
                break;
            case "sun":
                startLocation += 1440*6;
                break;
        }
        int startTimeHr = Integer.parseInt(period.split("-")[0].split(":")[0]);
        int startTimeMin = Integer.parseInt(period.split("-")[0].split(":")[1]);
        int endTimeHr = Integer.parseInt(period.split("-")[1].split(":")[0]);
        int endTimeMin = Integer.parseInt(period.split("-")[1].split(":")[1]);
        startLocation = startLocation + startTimeHr*60 + startTimeMin;
        int duration = (endTimeHr-startTimeHr)*60 + (endTimeMin-startTimeMin);
        for (int i = 0; i < duration;i++){
            timeLine[startLocation+i] = true;
        }
    }


    public static void main(String[] args) {
//        String input = "Sun 10:00-20:00\n" +
//                "Fri 05:00-10:00\n" +
//                "Fri 16:30-23:50\n" +
//                "Sat 10:00-24:00\n" +
//                "Sun 01:00-04:00\n" +
//                "Sat 02:00-06:00\n" +
//                "Tue 03:30-18:15\n" +
//                "Tue 19:00-20:00\n" +
//                "Wed 04:25-15:14\n" +
//                "Wed 15:14-22:40\n" +
//                "Thu 00:00-23:59\n" +
//                "Mon 05:00-13:00\n" +
//                "Mon 15:00-21:00";


        String input = "Mon 01:00-23:00\n" +
                "Tue 01:00-23:00\n" +
                "Wed 01:00-23:00\n" +
                "Thu 01:00-23:00\n" +
                "Fri 01:00-23:00\n" +
                "Sat 01:00-23:00\n" +
                "Sun 01:00-21:00";
        Solution solution = new Solution();
        System.out.println(solution.solution(input));
    }
}
