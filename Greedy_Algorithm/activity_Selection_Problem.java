package DSA.Greedy_Algorithm;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
public class activity_Selection_Problem {
    public static class Activity {
        Integer startDay;
        Integer endDay;

        public String toString() {
            return startDay + " " + endDay;
        }
    }

    //To sort on the basis of end day by using comparator
    public static class ActivityComparator implements Comparator<Activity> {
        public int compare(Activity a1, Activity a2) {
            //Sorting is done on the basis of end day of activity.
            if (a1.endDay > a2.endDay) return 1;
            else if (a1.endDay < a2.endDay) return -1;
            else return 0;
        }
    }

    public static void main(String[] args) {
//        List<Integer> start = List.of(1, 3, 2, 5);
//        List<Integer> end = List.of(2, 4, 3, 6);
        List<Integer> start = List.of(2, 1);
        List<Integer> end = List.of(2,2);

        List<Activity> activities = new ArrayList<>();

        for (int i = 0; i < start.size(); i++) {
            //Making an object of class so that we can access their attributes
            Activity activity = new Activity();
            activity.startDay = start.get(i);
            activity.endDay = end.get(i);

            activities.add(activity);
        }
        activities.sort(new ActivityComparator());
        System.out.println(activities);

        int result=1;
        Activity prevDayActivity = activities.get(0);
        //Traverse through activities list
        for (int i = 1; i < activities.size(); i++) {
            Activity currDayActivity = activities.get(i);
            if (currDayActivity.startDay > prevDayActivity.endDay) {
                result++;
                prevDayActivity=currDayActivity;
            }
        }
        System.out.println("Maximum activity can be performed by person is: "+result);
    }
}

