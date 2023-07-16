/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra03gym.services;

import extra03gym.entities.Activity;
import java.util.ArrayList;

/**
 *
 * @author blue_
 */
public class ActivityService {

    private final ArrayList<Activity> _activityList = new ArrayList<>();
    private static int _activityCount = 0;

    public Activity createActivity(String type, int duration, String diffLevel, String description) {
        Activity newActivity = new Activity(type, duration, diffLevel, description);
        _activityList.add(newActivity);
        _activityCount++;
        return newActivity;
    }

    public ArrayList<Activity> getAllActivities() {
        return _activityList;
    }

    public int getActivityCount() {
        return _activityCount;
    }

    private int getActivityIdx(int activityId) {
        for (Activity a : _activityList) {
            if (a.getId() == activityId) {
                return _activityList.indexOf(a);
            }
        }
        return -1;
    }

    public void updateActivity(int activityId, String type, int duration, String diffLevel, String description) {
        int activityIdx = getActivityIdx(activityId);
        if (activityIdx == -1) {
            System.out.println("Invalid Activity ID: " + activityId);
        } else {
            Activity targetActivity = _activityList.get(activityIdx);
            if (type != null && !(type.equalsIgnoreCase(targetActivity.getActivityType()))) {
                targetActivity.setActivityType(type);
            }
            if (duration != targetActivity.getDuration() && duration > 0) {
                targetActivity.setDuration(duration);
            }
            if (diffLevel != null && !(diffLevel.equalsIgnoreCase(targetActivity.getDiffLevel()))) {
                targetActivity.setDiffLevel(diffLevel);
            }
            if (description != null && !(description.equalsIgnoreCase(targetActivity.getDescription()))) {
                targetActivity.setDescription(description);
            }
            System.out.println("Activity has been successfully updated!\n"+targetActivity);
        }
    }

    public void deleteActivityById(int activityId) {
        int activityIdx = getActivityIdx(activityId);
        if (activityIdx == -1) {
            System.out.println("Invalid Activity ID: " + activityId);
        } else {
            Activity targetActivity = _activityList.remove(activityId);
            _activityCount--;
            System.out.println("Activity has been successfully deleted:\n" + targetActivity);
        }
    }

}
