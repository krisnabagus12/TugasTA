package Controller;
import Entity.View;
import Model.Viewmodel;

import java.util.ArrayList;

public class Viewcontroller {
    public ArrayList<View> getView(){
        return new Viewmodel().getView();
    }
}
