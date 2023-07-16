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
public class Client {

    private static int _lastId = 0;

    public final int generateId() {
        int id = _lastId++;
        return id;
    }

    private int _id;
    private String _name;
    private int _age;
    private double _height;
    private double _weight;
    private String _target;

    public Client() {
        this._id = generateId();

    }

    public Client(String _name, int _age, double _height, double _weight, String _target) {
        this._id = generateId();
        this._name = _name;
        this._age = _age;
        this._height = _height;
        this._weight = _weight;
        this._target = _target;

    }

    public int getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

    public int getAge() {
        return _age;
    }

    public double getHeight() {
        return _height;
    }

    public double getWeight() {
        return _weight;
    }

    public String getTarget() {
        return _target;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setAge(int _age) {
        this._age = _age;
    }

    public void setHeight(double _height) {
        this._height = _height;
    }

    public void setWeight(double _weight) {
        this._weight = _weight;
    }

    public void setTarget(String _target) {
        this._target = _target;
    }

    @Override
    public String toString() {
        return "Client{" + "_id=" + _id + ", _name=" + _name + ", _age=" + _age + ", _height=" + _height + ", _weight=" + _weight + ", _target=" + _target + '}';
    }

}
