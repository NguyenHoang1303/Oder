package assignment;

import assignment.entity.Oder;
import assignment.model.OderModelImplement;
import assignment.view.OderView;
import assignment.view.OderViewImplement;

import java.time.LocalDate;
import java.util.*;

public class AssignmentMain {
    public String name;
    public static void main(String[] args) {
        OderViewImplement oder = new OderViewImplement();
        oder.Menu();

    }
}
