/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra03gym.entities;


/**
 *
 * @author blue_
 */
public class Activity {

    private static int _lastId = 0;

    private final int generateId() {
        int id = _lastId++;
        return id;
    }

    private int _id;
    private String _activityType;
    private int _duration;
    private String _diffLevel;
    private String _description;

    public Activity() {
        this._id = generateId();
    }

    public Activity(String _activityType, int _duration, String _diffLevel, String _description) {
        this._id = generateId();
        this._activityType = _activityType;
        this._duration = _duration;
        this._diffLevel = _diffLevel;
        this._description = _description;
    }

    public int getId() {
        return _id;
    }

    public String getActivityType() {
        return _activityType;
    }

    public int getDuration() {
        return _duration;
    }

    public String getDiffLevel() {
        return _diffLevel;
    }

    public String getDescription() {
        return _description;
    }

    public void setActivityType(String _activityType) {
        this._activityType = _activityType;
    }

    public void setDuration(int _duration) {
        this._duration = _duration;
    }

    public void setDiffLevel(String _diffLevel) {
        this._diffLevel = _diffLevel;
    }

    public void setDescription(String _description) {
        this._description = _description;
    }

    @Override
    public String toString() {
        return "Activity{" + "_id=" + _id + ", _activityType=" + _activityType + ", _duration=" + _duration + ", _diffLevel=" + _diffLevel + ", _description=" + _description + '}';
    }

}
