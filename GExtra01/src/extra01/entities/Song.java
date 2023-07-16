/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01.entities;

/**
 *
 * @author blue_
 */
public class Song {

    private String _title;
    private String _authro;

    public Song() {
    }

    public Song(String _title, String _authro) {
        this._title = _title;
        this._authro = _authro;
    }

    public String getTitle() {
        return _title;
    }

    public String getAuthro() {
        return _authro;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public void setAuthro(String _authro) {
        this._authro = _authro;
    }

    @Override
    public String toString() {
        return "Song{" + "_title=" + _title + ", _authro=" + _authro + '}';
    }

}
