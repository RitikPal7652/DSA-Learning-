package DSA.Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class maximum_Meetings_InA_Room {
    public static class Meeting{
        Integer startTime;
        Integer finishTime;
        Integer meetingNumber;

        public String toString() {
            return startTime+" "+finishTime;
        }

    }
    public static class MeetingComparator implements Comparator<Meeting> {
        //sorting is based on finish time.
        public int compare(Meeting m1,Meeting m2){
            if(m1.finishTime>m2.finishTime) return 1;
            else if(m2.finishTime>m1.finishTime)    return -1;
            else return 0;
        }
    }

    public static void main(String[] args) {
        List<Integer> start= List.of(1,3,0,5,8,5);
        List<Integer> finish=List.of(2,4,6,7,9,9);
        List<Meeting> meetings=new ArrayList<>();

        for(int i=0;i<start.size();i++){
            Meeting meeting=new Meeting();//Making an object

            meeting.startTime=start.get(i);
            meeting.finishTime= finish.get(i);
            meeting.meetingNumber=i+1;
            //Add it into meetings arraylist.
            meetings.add(meeting);
        }
        meetings.sort(new MeetingComparator()); //We need to create an instance of class.
        System.out.println(meetings);

        //Make new ArrayList
        List<Integer> result=new ArrayList<>();
        result.add(meetings.get(0).meetingNumber);
        Meeting previousMeeting= meetings.get(0);

        for(int i=0;i<meetings.size();i++){
            Meeting currMeeting=meetings.get(i);

            if(currMeeting.startTime>previousMeeting.finishTime){
                result.add(currMeeting.meetingNumber);
                previousMeeting=currMeeting;
            }
        }
        System.out.println(result);
    }
}
